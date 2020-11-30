package com.fyf.student.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author fuyufan
 * @date 2020/11/26 10:24
 */
@Data
@ApiModel("用户实体")
@AllArgsConstructor
@TableName("fyf_user")
public class User extends BaseEntity{

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("用户真实姓名")
    @TableField("full_name")
    private String trueName;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("随机数盐")
    private String salt;

}
