package com.hc;

import java.util.Vector;

public class ProductsManagementMain {
    public static void main (String[] args){
        start();
    }
    public static void start(){
        //定义输入类
        ConsoleInout con = new ConsoleInout();
        int index = 0;
        String str = "";
        double dbnum = 0.0;
        //定义书库
        ProductBookSet productBookSet = new ProductBookSet();

        while (true){
            MenuUtil.printMainMenu();
            index = ConsoleInout.inputInt("序号");
            switch (index){
                case 1:
                    productBookSet.insert();
                    break;
                case 2:
                        MenuUtil.printQueryMenu();
                        if(productBookSet.isEmpty()){
                            System.out.println("没有记录");
                        }else{
                            index = ConsoleInout.inputInt("序号");
                            switch (index){
                                case 1:
                                    int num = ConsoleInout.inputInt("输入ID号");
                                    productBookSet.findById(num);
                                    break;
                                case 2:
                                    String names = ConsoleInout.inputString("输入书名");
                                    productBookSet.findByName (names);
                                    break;
                                case 3:
                                    String names1 = ConsoleInout.inputString("输入作者");
                                    productBookSet.findByAuthor(names1);
                                    break;
                                case 4:
                                    String names3 = ConsoleInout.inputString("输入出版社");
                                    productBookSet.findByPublisher(names3);
                                    break;
                                case 5:
                                    double num1 = ConsoleInout.inputDouble("最低价格");
                                    double num2 = ConsoleInout.inputDouble("最高价格");
                                    productBookSet.findByPriceRange(num1,num2);
                                    break;
                                case 6:
                                    productBookSet.findAll();
                                    break;
                                case 7:
                                    break;
                                case 0:
                                    break;
                                default:
                                    break;
                            }
                        }

                    break;
                case 3:
                    if(productBookSet.isEmpty()){
                        System.out.println("没有书本记录");
                    }else{
                        MenuUtil.printDeleteMenu();
                        index = ConsoleInout.inputInt("序号");
                        switch (index){
                            case 1:
                                int num = ConsoleInout.inputInt("输入ID号");
                                productBookSet.deleteById(num);
                                break;
                            case 2:
                                String names = ConsoleInout.inputString("输入书名");
                                productBookSet.deletedByName(names);
                                break;
                            case 3:
                                String names1 = ConsoleInout.inputString("输入作者");
                                productBookSet.deleteByAuhor(names1);
                                break;
                            case 4:
                                String names3 = ConsoleInout.inputString("输入出版社");
                                productBookSet.deleteByPublisher(names3);
                                break;
                            case 5:
                                double num3 = ConsoleInout.inputDouble("输入价格");
                                double num4 = ConsoleInout.inputDouble("输入价格");
                                productBookSet.deleteByPrice(num3,num4);
                                break;
                            case 6:
                                productBookSet.deletaAll();
                                break;
                            case 0:
                                break;
                        }
                    }
                    break;
                case 4:
                    if(productBookSet.isEmpty()){
                        System.out.println("没有书本记录");
                    }else{
                            MenuUtil.printUpdateMenu();
                            productBookSet.findAll();
                            index = ConsoleInout.inputInt("序号");
                            if(!productBookSet.isEmpty()){
                                productBookSet.update(index);
                            }else {
                                System.out.println("空空如也");
                            }
                    }
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }
    }
}
