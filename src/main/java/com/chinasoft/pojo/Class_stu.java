package com.chinasoft.pojo;

import java.util.ArrayList;
import java.util.List;

public class Class_stu {
    private int id;
    private String name;
    private String teacher;

    //
    private List<Student_u> list;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTeacher() {
        return teacher;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public List<Student_u> getList() {
        return list;
    }

    public void setList(List<Student_u> list) {
        this.list = list;
    }


    public Class_stu(int id, String name, String teacher, List<Student_u> list) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Class_stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", list=" + list +
                '}';
    }

    public Class_stu(int id, String name, String teacher) {
        super();
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }
    public Class_stu() {
        super();
        // TODO Auto-generated constructor stub
    }
}
