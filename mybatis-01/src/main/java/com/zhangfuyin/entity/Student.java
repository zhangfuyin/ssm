package com.zhangfuyin.entity;

public class Student {

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Integer id;

    private String name;

    private  int age;

    /**
     * 班级信息
     */
    private Classes classes;

    /**
     * 班级ID
     */
    private int classesId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClassesId() {
        return classesId;
    }

    public void setClassesId(int classesId) {
        this.classesId = classesId;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classes=" + classes +
                ", classesId=" + classesId +
                '}';
    }
}
