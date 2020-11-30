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
 * @date 2020/11/26 16:32
 */
@Data
@ApiModel("位置")
@AllArgsConstructor
@TableName("yueyang_location")
public class Location extends BaseEntity{

    @ApiModelProperty("省")
    private String province;

    @ApiModelProperty("市")
    @TableField("city")
    private String city;

    @ApiModelProperty("区")
    private String district;

    @ApiModelProperty("区域码")
    private String code;

}
