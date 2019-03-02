package com.hc;

import java.util.Scanner;

public class ConsoleInout {
    public static String inputString(String s){
        System.out.println("请输入"+s);
        String str="";
        while (true){
            Scanner input = new Scanner(System.in);
             str = input.nextLine();
            if(str .equals("")){
                System.out.println("请输入一个正确的字符串");
            }else{
                break;
            }
        }
        return str;
    }
    public static int inputInt(String s){
        int num = 0;
        String str = "";
        System.out.println("请输入"+s);
        while (true){

            Scanner input = new Scanner(System.in);
            str = input.nextLine();
            if(str.matches("^[1-9]\\d*")){
                num = Integer.parseInt(str);
                break;
            }else{
                System.out.println("请输入正确的整数");
            }
        }
        return num;
    }
    public static double inputDouble(String s){
        double num = 0;
        String str = "";
        System.out.println("请输入"+s);
        while(true){
            Scanner input = new Scanner(System.in);
            str = input.nextLine();
            if(str.matches("^[0-9]{1,}\\.[0-9]{1,}$") || str.matches("^[1-9]\\d*")){
                num = Double.parseDouble(str);
                break;
            }else{
                System.out.println("请输入正确的小数");
            }
        }
        return num;
    }
}
