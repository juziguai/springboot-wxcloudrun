package com.tencent.wxcloudrun.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 小张
 * @CreateTime: 2022/8/21 0:02
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
public class UserPO {
    @TableId(value = "id",type = IdType.AUTO)
    private int id;
    @TableField("name")
    private String name;
    @TableField("age")
    private int age;
}
