package com.vitalii.interfacedemo;

// interface in Java 7

public class InterfaceDemo {
    public static void main(String[] args) {
        MyClass a = new MyClass();
        a.someMethod();
        System.out.println("The value of the constant is " + MyInterface.myInt);
    }
}

class MyClass implements MyInterface {
    @Override
    public void someMethod() {
        System.out.println("This is a method implemented in MyClass");
    }
}

interface MyInterface {
    int myInt = 5;
    void someMethod();
}