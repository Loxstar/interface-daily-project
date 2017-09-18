package com.theIronYard;

public class MarineRecon extends Soldier implements HandToHand, Nuke {

    public MarineRecon(String name, String rank, int age) {
        super(name, rank, age);
    }

    @Override
    public String speak() {
        return "Semper Fi";
    }

    public String bJJ() {
        return "It's not Karate";
    }

    public String kravMaga() {
        return null;
    }

    public String fMA() {
        return "Poke poke";
    }

    public String grenade() {
        return null;
    }

    public String cQB() {
        return null;
    }

    public String midRange() {
        return null;
    }

    public String sniper() {
        return null;
    }

    public Bomb throwBomb(Bomb b) {
        return b;
    }
}
