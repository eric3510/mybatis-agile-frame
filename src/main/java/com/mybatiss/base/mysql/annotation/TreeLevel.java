package com.mybatiss.base.mysql.annotation;

import java.lang.annotation.*;

/***
 * @author Eric Email : eric3510@foxmail.com
 * @version 创建时间：2018/2/2
 * 树结构层级标识
 */
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface TreeLevel{
    String value() default "";
}
