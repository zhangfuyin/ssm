package com.zhangfuyin.dao;

import com.zhangfuyin.entity.Student;

public interface StudentDao {

    Student selectById(Integer id);

    void insert(Student student);

    void insertStu(Student student);
}
