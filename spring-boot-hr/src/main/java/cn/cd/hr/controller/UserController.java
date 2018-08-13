package cn.cd.hr.controller;

import cn.cd.hr.entity.User;
import cn.cd.hr.mapper.UserMapper;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/mybatis")
    public String testMybatis() {
        User user = new User();
        user.setIdCardNo("123");
        user.setUserName("aaa");
        user.setTel("123");
        //userMapper.insert(user);

        User user1 = userMapper.getByIdCardNo("123");
        return "Hello World";
    }

    @RequestMapping("/add")
    public String add() {
        return "add";
    }

    @RequestMapping("/query")
    public String query() {
        return "query";
    }

    @RequestMapping("/addUser")
    public String addUser(@Valid User user, BindingResult result, Model model) {

        userMapper.insert(user);

        return "success";
    }

    @RequestMapping("/queryUsers")
    @ResponseBody
    public List<User> queryUsers(@Valid User user, BindingResult result, Model model) {
        Map<String, Object> map = new HashMap<>();
        List<User> list = userMapper.queryUsers(user);
        model.addAttribute("users", list);

        return list;
    }

    @RequestMapping("/outPut")
    public String outPut(@Valid User user) throws IOException {

        List<User> list = userMapper.queryUsers(user);

        this.downLoad(list);

        return "success";
    }

    private void downLoad(List<User> list) throws IOException {
        if(!CollectionUtils.isEmpty(list)){
            // 建立一个Excel
            Workbook book = new HSSFWorkbook();
            // 在对应的Excel中建立一个分表
            Sheet sheet1 =(Sheet) book.createSheet("表1");
            int i = 0;
            for (User user:list) {
                // 设置相应的行（初始从0开始）
                Row row =sheet1.createRow(i);

                Cell cell1 = row.createCell(0);
                cell1.setCellValue(user.getUserName());

                Cell cell2 = row.createCell(1);
                cell2.setCellValue(user.getSex());

                Cell cell3 = row.createCell(2);
                cell3.setCellValue(user.getTel());

                i++;
            }
            // 保存到计算机相应路径
            book.write( new FileOutputStream("D://员工表.xls"));

        }
    }
}