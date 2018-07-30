package cn.cd.hr.entity;

import java.util.Date;

public class StudyInfo {
    // id
    private Integer id;

    // 身份证号码
    private String idCardNo;

    // 入学时间
    private Date studyFrom;

    // 毕业时间
    private Date studyTo;

    // 公司名
    private String school;

    // 学历学位
    private String academicDegree;

    // 所学专业
    private String major;

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

    public Date getStudyFrom() {
        return studyFrom;
    }

    public void setStudyFrom(Date studyFrom) {
        this.studyFrom = studyFrom;
    }

    public Date getStudyTo() {
        return studyTo;
    }

    public void setStudyTo(Date studyTo) {
        this.studyTo = studyTo;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree == null ? null : academicDegree.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }
}