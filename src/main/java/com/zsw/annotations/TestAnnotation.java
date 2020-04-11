package com.zsw.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhangshaowei on 2020/4/11.
 */
//声明Test注解
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
}

/*
SOURCE：注解将被编译器丢弃（该类型的注解信息只会保留在源码里，源码经过编译后，
注解信息会被丢弃，不会保留在编译好的class文件里）

CLASS：注解在class文件中可用，但会被VM丢弃（该类型的注解信息会保留在源码里和class文件里，
在执行的时候，不会加载到虚拟机中），请注意，当注解未定义Retention值时，默认值是CLASS，如Java内置注解，@Override、@Deprecated、@SuppressWarnning等

RUNTIME：注解信息将在运行期(JVM)也保留，因此可以通过反射机制读取注解的信息
（源码、class文件和执行的时候都有注解的信息），如SpringMvc中的@Controller、@Autowired、@RequestMapping等。


*/

/*
public enum ElementType {
    */
/**标明该注解可以用于类、接口（包括注解类型）或enum声明*//*

    TYPE,

    */
/** 标明该注解可以用于字段(域)声明，包括enum实例 *//*

    FIELD,

    */
/** 标明该注解可以用于方法声明 *//*

    METHOD,

    */
/** 标明该注解可以用于参数声明 *//*

    PARAMETER,

    */
/** 标明注解可以用于构造函数声明 *//*

    CONSTRUCTOR,

    */
/** 标明注解可以用于局部变量声明 *//*

    LOCAL_VARIABLE,

    */
/** 标明注解可以用于注解声明(应用于另一个注解上)*//*

    ANNOTATION_TYPE,

    */
/** 标明注解可以用于包声明 *//*

    PACKAGE,

    */
/**
     * 标明注解可以用于类型参数声明（1.8新加入）
     * @since 1.8
     *//*

    TYPE_PARAMETER,

    */
/**
     * 类型使用声明（1.8新加入)
     * @since 1.8
     *//*

    TYPE_USE
}*/

/*
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Reference{
    boolean next() default false;
}

public @interface AnnotationElementDemo {
    //枚举类型
    enum Status {FIXED,NORMAL};

    //声明枚举
    Status status() default Status.FIXED;

    //布尔类型
    boolean showSupport() default false;

    //String类型
    String name()default "";

    //class类型
    Class<?> testCase() default Void.class;

    //注解嵌套
    Reference reference() default @Reference(next=true);

    //数组类型
    long[] value();
}*/
