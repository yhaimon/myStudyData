package com.mhy.homeWork1;

import java.util.Scanner;

public class PipeLine {
    static int num = 0;
    static int[] allNum = null;

    public static void Num1(int n1){
        for(int i=0; i<n1; i++){
            allNum[i] = ++num;
            System.out.println(allNum[i]);
        }

    }
    public static void Num2(int n2){
        for(int i=0; i<n2; i++){
            allNum[i] = ++num;
            System.out.println(allNum[i]);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //请输入第一条流水线需要生产的数量
        //请输入第二条流水线需要生产的数量
        System.out.println("请输入第一条流水线的生产数量：");
        int n1 = sc.nextInt();
        System.out.println("请输入第一条流水线的生产数量：");
        int n2 = sc.nextInt();
        System.out.println("产品序列号：");
        Num1(n1);
        Num2(n2);

    }


    /*
    public void Num1(int n1){
        for(int i=0; i<n1; i++){
            allNum[i] = ++num;
            System.out.println(allNum[i]);
        }

    }
    public void Num2(int n2){
        for(int i=allNum.length+1; i<=n2+allNum.length; i++){
            allNum[i] = num++;
            System.out.println(allNum[i]);
        }

    }
    public void printProNum(int num1,int num2){

        Num1(num1);
        Num2(num2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //请输入第一条流水线需要生产的数量
        //请输入第二条流水线需要生产的数量
        System.out.println("请输入第一条流水线的生产数量：");
        int num1 = sc.nextInt();
        System.out.println("请输入第一条流水线的生产数量：");
        int num2 = sc.nextInt();
        System.out.println("产品序列号：");
        PipeLine p = new PipeLine();
        p.printProNum(num1,num2);
    }
   */
}
