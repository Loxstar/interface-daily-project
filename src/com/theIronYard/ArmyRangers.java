package com.theIronYard;

public class ArmyRangers extends Soldier implements GunFighting, HandToHand {

    public ArmyRangers(String name, String rank, int age) {
        super(name, rank, age);
    }

    @Override
    public String speak() {
        return "Hooah";
    }

    @Override
    public void eat() {
        super.eat();
    }


    public String cQB() {
        return "Karate and guns";
    }

    public String midRange() {
        return null;
    }

    public String sniper() {
        return "One pew";
    }

    public String bJJ() {
        return null;
    }

    public String kravMaga() {
        return null;
    }

    public String fMA() {
        return "Sticks and Knives";
    }
}

