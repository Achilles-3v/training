package com.vitalii.modifierdemo;

public class ClassesInSamePackage {
    // null
}
class ClassA extends ModifierDemo {
    public void printMessages () {
        System.out.println(publicNum);
        System.out.println(protectedNum);
        System.out.println(packagePrivateNum);
    }
}