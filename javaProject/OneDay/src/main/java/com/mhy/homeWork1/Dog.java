package com.mhy.homeWork1;

public class Dog {
    private int size;//年龄
    private String breed;//品种
    private String name;//狗名
    //间接访问方式
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //无参构造方法
    public Dog(){
        //System.out.println("无参执行");
    }
    //带参构造方法
    public Dog(int size, String breed, String name){
        this.size = size;
        this.breed = breed;
        this.name = name;
    }
    public void bark(){
        System.out.println("一只"+size+"岁，品种为"+breed+"，狗名为"+name+"的狗在狂吠！");
    }

}
