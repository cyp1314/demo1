package com.example.demo1.service;

import com.example.demo1.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cyp
 * @since 2022-02-21
 */
public interface IStudentService extends IService<Student> {

    Student selectById (long l);
}
