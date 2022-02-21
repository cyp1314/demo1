package com.example.demo1.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

/**
 * <p>
 * 
 * </p>
 *
 * @author cyp
 * @since 2022-02-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("student")
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("address")
    private String address;

    @TableField("sex")
    private String sex;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("create_user")
    private String createUser;

    @TableField("update_time")
    private LocalDateTime updateTime;

    @TableField("update_user")
    private LocalDateTime updateUser;

    @TableField("deleted")
    private String deleted;


}
