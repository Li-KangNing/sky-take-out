package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 员工登录时传递的数据模型，用于封装员工登录时传递的数据，封装的数据包括用户名、密码等信息
 * 1. 创建一个类，用于封装员工登录时传递的数据
 * 2. 添加swagger的注解，给当前类添加注释
 * 3. 添加lombok的注解，给当前类添加getter和setter方法
 */
@Data
@ApiModel(description = "员工登录时传递的数据模型")
public class EmployeeLoginDTO implements Serializable {

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

}
