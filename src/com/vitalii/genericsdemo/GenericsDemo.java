package com.vitalii.genericsdemo;

public class GenericsDemo {
    public static void main(String[] args) {
        MyGenericsClass<Integer> g = new MyGenericsClass();

        g.setMyVar(10);
        g.printValue();
    }
}

class MyGenericsClass<T> {
    private T myVar;

    void setMyVar(T i) {
        myVar = i;
    }
    void printValue() {
        System.out.println("The value of myVar is " + myVar);
    }
}
