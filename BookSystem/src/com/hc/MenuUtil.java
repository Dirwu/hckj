package com.hc;

public class MenuUtil {
    //打印主菜单
    public static void printMainMenu(){
        System.out.println("*******************");
        System.out.println("*****欢迎访问图书管理系统******");
        System.out.println("*****1.图书信息录入******");
        System.out.println("*****2.图书信息查询******");
        System.out.println("*****3.图书信息删除******");
        System.out.println("*****4.图书信息修改******");
        System.out.println("*****0.退出******");
        System.out.println("*****c3p0******");
        System.out.println("*******************");
    }
    //打印控制台图书管理主菜单。
    public static void printQueryMenu (){
        System.out.println("*******************");
        System.out.println("*****请选择查询方式******");
        System.out.println("*****1.按图书ID查询*****");
        System.out.println("*****2.按书名查询******");
        System.out.println("*****3.按作者查询******");
        System.out.println("*****4.按出版社查询******");
        System.out.println("*****5.按价格范围查询******");
        System.out.println("*****6.查询所有图书信息******");
        System.out.println("*****7.返回上级菜单******");
        System.out.println("*****0.退出******");
    }
    public static void printDeleteMenu (){
        System.out.println("*******************");
        System.out.println("*****请选择删除方式******");
        System.out.println("*****1.按图书ID删除*****");
        System.out.println("*****2.按书名删除******");
        System.out.println("*****3.按作者删除******");
        System.out.println("*****4.按出版社删除******");
        System.out.println("*****5.按价格范围删除******");
        System.out.println("*****6.返回上级菜单******");
        System.out.println("*****0.退出******");
    }

    public static void printUpdateMenu (){
        System.out.println("*******************");
        System.out.println("*****请选择修改方式******");
        System.out.println("*****1.按图书ID修改*****");
        System.out.println("*****2.按书名修改******");
        System.out.println("*****3.按作者修改******");
        System.out.println("*****4.按出版社修改******");
        System.out.println("*****5.按价格范围修改******");
        System.out.println("*****6.返回上级菜单******");
        System.out.println("*****0.退出******");
    }
}
