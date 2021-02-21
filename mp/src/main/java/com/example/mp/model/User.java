package com.example.mp.model;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.SqlCondition;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 @Description: 用户信息表的对应实体
 @author: WXj
 @date: 2021年02月20日
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("users")
public class User extends Model<User> {

    //主键
    @TableId(type = IdType.AUTO)
    private Integer id;

    //创建人员
    @TableField(value = "creator", condition = SqlCondition.LIKE)
    private String creator;

    //创建人员id
    private Long creatorId;

    //创建时间
    private Date createTime;

    //操作人员
    private String operator;

    //更新时间
    private Date operateTime;

    //有效状态
    private int isActive;

    //备注信息
    private String remarks;

}