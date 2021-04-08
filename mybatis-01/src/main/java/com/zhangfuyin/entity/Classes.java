package com.zhangfuyin.entity;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

/**
 * 班级
 */
public class Classes {

    private Integer id;

    private String cname;

    List<Student> students;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return cname;
    }

    public void setName(String cname) {
        this.cname = cname;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", students=" + students +
                '}';
    }
}
