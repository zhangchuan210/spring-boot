package cn.cd.hr.entity;

import java.util.Date;

public class WorkInfo {
    // id
    private Integer id;

    // 身份证号码
    private String idCardNo;

    // 入职时间
    private Date workFrom;

    // 离职时间
    private Date workTo;

    // 公司名
    private String company;

    // 职称/职务
    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    public Date getWorkFrom() {
        return workFrom;
    }

    public void setWorkFrom(Date workFrom) {
        this.workFrom = workFrom;
    }

    public Date getWorkTo() {
        return workTo;
    }

    public void setWorkTo(Date workTo) {
        this.workTo = workTo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}