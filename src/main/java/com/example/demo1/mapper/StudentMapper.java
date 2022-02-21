package com.example.demo1.mapper;

import com.example.demo1.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cyp
 * @since 2022-02-21
 */
public interface StudentMapper extends BaseMapper<Student> {

    Student selectByIdMy (@Param("id") long id);
}
