package com.mhy.homeWork1;
import java.util.Scanner;
public class Adminisrator {    //定义属性和方法:姓名、密码、显示信息
    //属性
    String name;
    String password;
    public  Adminisrator(){//String name,String password
       // System.out.println("姓名："+name+"\t密码："+password);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    //主方法：
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        //键盘输入账号密码
        System.out.println("请输入账号：");
        String myName = sc.next();
        System.out.println("请输入密码：");
        String pwd = sc.next();
        //创建对象
        Adminisrator ad = new Adminisrator();
          ad.setName("zt");
          ad.setPassword("zt123");
        //判断账号是否一致
        if(myName.equals(ad.getName())  && pwd.equals(ad.getPassword())){//如果一致，管理员的密码重新设置
            System.out.println("请重新设置您的密码");
            String newPwd = sc.next();
            System.out.println("修改成功！");
        }
        //如果不一致，提示账户密码错误。登录失败
        else{
            System.out.println("账号或密码错误！登录失败！");
        }
    }
}
