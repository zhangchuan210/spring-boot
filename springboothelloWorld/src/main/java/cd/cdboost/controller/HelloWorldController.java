package cd.cdboost.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @Value("${title}")
    private String title;
    @Value("${description}")
    private String description;

    @RequestMapping("/hello")
    public String index() {

        logger.info(title);
        logger.info(description);
        System.out.println("测试");
        return "Hello World";
    }

}