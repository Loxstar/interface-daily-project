package com.theIronYard;

public class NavySeals extends Soldier implements GunFighting, HandToHand {

    public NavySeals(String name, String rank, int age) {
        super(name, rank, age);
    }

    public String speak() {
        return "Leave no man behind";
    }

    public String bJJ() {
        return "Sleep";
    }

    public String kravMaga() {
        return "Throat Punch";
    }

    public String fMA() {
        return "Knife to face";
    }

    public String cQB() {
        return "Mk18'd";
    }

    public String midRange() {
        return "7.62 with Velocity";
    }

    public String sniper() {
        return "One shot";
    }
}
