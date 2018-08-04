package com.hand;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("请输入年月日，正确格式书写yyyy-mm-dd:");
        Scanner sc = new Scanner(System.in);
        String sDate = sc.nextLine();
        int year = Integer.parseInt(sDate.substring(0, 4));
        int month = Integer.parseInt(sDate.substring(5, 7));
        int day = Integer.parseInt(sDate.substring(8));
        int newDay = day;
        int newMonth = month;
        int newYear = year;
        if (day == 30) {
            if (month == 2) {
                System.out.println("您输入的日期不存在！");

            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                newDay = day + 1;
                newMonth = month;
                newYear = year;
                System.out.println("下一天为："+newYear + "-" + newMonth + "-" + newDay);
            } else {
                newMonth = month + 1;
                newDay = 1;
                newYear = year;
                System.out.println("下一天为："+newYear + "-" + newMonth + "-" + newDay);
            }
        } else if (day == 31) {
            if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("您输入的日期不存在！");
            } else if (year != 12) {
                newDay = 1;
                newMonth = month + 1;
                newYear = year;
                System.out.println("下一天为："+newYear + "-" + newMonth + "-" + newDay);
            } else {
                newDay = 1;
                newMonth = month + 1;
                newYear = year + 1;
                System.out.println(newYear + "-" + newMonth + "-" + newDay);
            }
        } else {

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {//闰年
                if (month == 2){
                    if (day == 29){
                        newDay = 1;
                        newMonth = month + 1;
                        newYear = year;
                        System.out.println("下一天为："+newYear + "-" + newMonth + "-" + newDay);
                    }
                }else{
                    newDay = day + 1;
                    newMonth = month;
                    newYear = year;
                    System.out.println("下一天为："+newYear + "-" + newMonth + "-" + newDay);
                }
            }else{
                if (month == 2){
                    if (day == 29){
                        System.out.println("您输入的日期不存在！");
                    }
                    if (day == 28) {
                        newDay = 1;
                        newMonth = month + 1;
                        newYear = year;
                        System.out.println(newYear + "-" + newMonth + "-" + newDay);
                    }
                }else{
                    newDay = day + 1;
                    newMonth = month;
                    newYear = year;
                    System.out.println("下一天为："+newYear + "-" + newMonth + "-" + newDay);
                }
            }




        }
    }
}
//if((year%4==0&&year%100!=0||year%400==0)