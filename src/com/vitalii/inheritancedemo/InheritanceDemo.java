package com.vitalii.inheritancedemo;

public class InheritanceDemo {
    public static void main(String[] args) {
        Member[] clubMember = new Member[6];

        clubMember[0] = new NormalMember("James", 1, 2010);
        clubMember[1] = new NormalMember("Andy", 2, 2011);
        clubMember[2] = new NormalMember("Bill", 3, 2011);
        clubMember[3] = new VIPMember("Carol", 4, 2012);
        clubMember[4] = new VIPMember("Evelyn", 5, 2012);
        clubMember[5] = new Member("Yvonne", 6, 2013);

        for (Member m: clubMember) {
            m.calculateAnnualFee();
            m.displayMemInfo();
        }
    }
}
