package com.fyf.student.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author fuyufan
 * @date 2020/11/27 16:15
 */
@MappedSuperclass
public class BaseEntity implements Serializable{

    private static final long serialVersionUID = 2454751577571991753L;

    /**
     *@GeneratedValue 表示主键自增
     */
    @ApiModelProperty("主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


//    @ApiModelProperty(
//            hidden = true
//    )
//    @TableField(
//            fill = FieldFill.INSERT
//    )
//    @JsonIgnore
//    private Long createBy;
//    @ApiModelProperty(
//            hidden = true
//    )
//    @TableField(
//            fill = FieldFill.INSERT
//    )
//    @JsonFormat(
//            pattern = "yyyy-MM-dd HH:mm:ss",
//            timezone = "GMT+8"
//    )
//    private Date createTime;
//    @ApiModelProperty(
//            hidden = true
//    )
//    @TableField(
//            fill = FieldFill.UPDATE
//    )
//    @JsonIgnore
//    private Long updateBy;
//    @ApiModelProperty(
//            hidden = true
//    )
//    @TableField(
//            fill = FieldFill.UPDATE
//    )
//    @JsonFormat(
//            pattern = "yyyy-MM-dd HH:mm:ss",
//            timezone = "GMT+8"
//    )
//    @Column(
//            columnDefinition = "timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'"
//    )
//    private Date updateTime;
//
//    public BaseEntity() {
//    }
//
//    public Long getId() {
//        return this.id;
//    }
//
//    public Long getCreateBy() {
//        return this.createBy;
//    }
//
//    public Date getCreateTime() {
//        return this.createTime;
//    }
//
//    public Long getUpdateBy() {
//        return this.updateBy;
//    }
//
//    public Date getUpdateTime() {
//        return this.updateTime;
//    }
//
//    public void setId(final Long id) {
//        this.id = id;
//    }
//
//    public void setCreateBy(final Long createBy) {
//        this.createBy = createBy;
//    }
//
//    public void setCreateTime(final Date createTime) {
//        this.createTime = createTime;
//    }
//
//    public void setUpdateBy(final Long updateBy) {
//        this.updateBy = updateBy;
//    }
//
//    public void setUpdateTime(final Date updateTime) {
//        this.updateTime = updateTime;
//    }
//
//    @Override
//    public boolean equals(final Object o) {
//        if (o == this) {
//            return true;
//        } else if (!(o instanceof BaseEntity)) {
//            return false;
//        } else {
//            BaseEntity other = (BaseEntity) o;
//            if (!other.canEqual(this)) {
//                return false;
//            } else {
//                label71:
//                {
//                    Object this$id = this.getId();
//                    Object other$id = other.getId();
//                    if (this$id == null) {
//                        if (other$id == null) {
//                            break label71;
//                        }
//                    } else if (this$id.equals(other$id)) {
//                        break label71;
//                    }
//
//                    return false;
//                }
//
//                Object this$createBy = this.getCreateBy();
//                Object other$createBy = other.getCreateBy();
//                if (this$createBy == null) {
//                    if (other$createBy != null) {
//                        return false;
//                    }
//                } else if (!this$createBy.equals(other$createBy)) {
//                    return false;
//                }
//
//                label57:
//                {
//                    Object this$createTime = this.getCreateTime();
//                    Object other$createTime = other.getCreateTime();
//                    if (this$createTime == null) {
//                        if (other$createTime == null) {
//                            break label57;
//                        }
//                    } else if (this$createTime.equals(other$createTime)) {
//                        break label57;
//                    }
//
//                    return false;
//                }
//
//                Object this$updateBy = this.getUpdateBy();
//                Object other$updateBy = other.getUpdateBy();
//                if (this$updateBy == null) {
//                    if (other$updateBy != null) {
//                        return false;
//                    }
//                } else if (!this$updateBy.equals(other$updateBy)) {
//                    return false;
//                }
//
//                Object this$updateTime = this.getUpdateTime();
//                Object other$updateTime = other.getUpdateTime();
//                if (this$updateTime == null) {
//                    if (other$updateTime == null) {
//                        return true;
//                    }
//                } else if (this$updateTime.equals(other$updateTime)) {
//                    return true;
//                }
//
//                return false;
//            }
//        }
//    }
//
//    protected boolean canEqual(final Object other) {
//        return other instanceof BaseEntity;
//    }
//
//    @Override
//    public int hashCode() {
//        //int PRIME = true;
//        int result = 1;
//        Object $id = this.getId();
//        result = result * 59 + ($id == null ? 43 : $id.hashCode());
//        Object $createBy = this.getCreateBy();
//        result = result * 59 + ($createBy == null ? 43 : $createBy.hashCode());
//        Object $createTime = this.getCreateTime();
//        result = result * 59 + ($createTime == null ? 43 : $createTime.hashCode());
//        Object $updateBy = this.getUpdateBy();
//        result = result * 59 + ($updateBy == null ? 43 : $updateBy.hashCode());
//        Object $updateTime = this.getUpdateTime();
//        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "BaseEntity(id=" + this.getId() + ", createBy=" + this.getCreateBy() + ", createTime=" + this.getCreateTime() + ", updateBy=" + this.getUpdateBy() + ", updateTime=" + this.getUpdateTime() + ")";
//    }

}
