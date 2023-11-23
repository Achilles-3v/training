package com.vitalii.inheritancedemo;

public class NormalMember extends Member {
    public NormalMember(String pName, int pMemberID, int pMemberSince) {
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child Constructor with 3 parameters");
    }

    @Override
    public void calculateAnnualFee () {
        annualFee = (1 - 0.01 * getDiscount()) * (100 + 12 * 30);
    }
}
