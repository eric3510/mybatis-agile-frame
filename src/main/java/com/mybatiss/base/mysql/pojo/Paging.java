package com.mybatiss.base.mysql.pojo;

import com.mybatiss.base.mysql.annotation.Ignore;
import lombok.Data;

/**
 * @author 王强
 * @version 创建时间：2017/9/21
 * Paging
 **/
@Data
public class Paging{
    /***
     * 每页条数
     */
    @Ignore
    private Integer pageSize;

    /***
     * 所跳页
     */
    @Ignore
    private Integer toPage;

    /***
     * 排序
     */
    @Ignore
    private String order;
}
