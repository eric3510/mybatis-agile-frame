package com.mybatiss.demo.pojo.model;

import com.mybatiss.base.mysql.annotation.FieldName;
import com.mybatiss.base.mysql.annotation.TableName;
import lombok.Data;

/***
 * @author Eric Email :
 * @version 创建时间：2018/10/16
 * DemoDO
 */
@Data
@TableName("demo")
public class DemoDO{
    /**
     * 主键
     */
    @FieldName("id")
    private String id;

    /***
     * 姓名
     */
    @FieldName("name")
    private String name;

    /***
     * 年龄
     */
    @FieldName("age")
    private Integer age;
}
