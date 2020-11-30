package com.fyf.student.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.print.PrinterGraphics;

/**
 * @author fuyufan
 * @date 2020/11/30 10:02
 */
@Data
@ApiModel("权限")
@AllArgsConstructor
@TableName("fyf_permission")
public class Permission extends BaseEntity {

    @ApiModelProperty("节点id")
    private Integer parentId;

    @ApiModelProperty("节点名")
    @TableField("res_name")
    private String name;

    @ApiModelProperty("节点类型")
    @TableField("res_type")
    private String type;

    @ApiModelProperty("权限")
    private String permission;

    @ApiModelProperty("url")
    private String url;

}
