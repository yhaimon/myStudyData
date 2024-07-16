package com.mhy.homeWork1;

public class DogTest {
    public static void main(String[] args){

Dog dog = new Dog(3,"拉布拉多","福贵");
        Dog dog2 = new Dog();
        dog2.setSize(2);
        dog2.setBreed("杂种");
        dog2.setName("狗杂碎");
        dog.bark();
        dog2.bark();

        //System.out.println("狗龄"+dog2.getSize()+"品种"+dog2.getBreed()+"名字"+dog2.getName());
    }
}
