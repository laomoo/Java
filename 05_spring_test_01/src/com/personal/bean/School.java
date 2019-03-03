package com.personal.bean;

@SuppressWarnings("unused")
public class School {

    private Student student;
    private String schoolName;

    public void initSchool() {
        this.schoolName = "韩英中学";
        System.out.println("生命周期内初始化Bean");
    }

    public void destroySchool() {
        this.schoolName = "";
        System.out.println("生命周期内销毁Bean");
    }

    public School(Student student) {
        this.student = student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
