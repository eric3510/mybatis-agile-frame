package com.mybatiss.base.mysql.pojo;

import com.mybatiss.base.mysql.annotation.FieldName;
import com.mybatiss.base.mysql.annotation.TableName;
import com.mybatiss.base.mysql.annotation.TreeLevel;
import com.mybatiss.base.mysql.annotation.TreeParentId;
import lombok.Data;

/**
 * @author eric E-mail:
 * @version 创建时间：2018/2/2 上午11:08
 * TreeDemoDO对象
 */
@Data
@TableName("tree_demo")
public class TreeDemoDO extends BaseDO{
    /***
     * 姓名
     */
    private String name;
    /***
     * 年龄
     */
    private Integer age;
    /***
     * 父节点
     */
    @TreeParentId
    @FieldName("parent_id")
    private Long parentId;

    /***
     * 层级
     */
    @TreeLevel
    private Integer level;

    public TreeDemoDO(){}

    public TreeDemoDO(String id, String name, Integer age, Long parentId, Integer level){
        this.setId(id);
        this.name = name;
        this.age = age;
        this.parentId = parentId;
        this.level = level;
    }
}
