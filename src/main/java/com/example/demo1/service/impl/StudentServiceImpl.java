package com.example.demo1.service.impl;

import com.example.demo1.entity.Student;
import com.example.demo1.mapper.StudentMapper;
import com.example.demo1.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cyp
 * @since 2022-02-21
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student selectById (long id) {
        return studentMapper.selectByIdMy(id);
    }
}
