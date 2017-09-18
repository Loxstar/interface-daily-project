package com.theIronYard;

public class Main {

    public static void main(String[] args) {
        ArmyRangers newRanger = new ArmyRangers("Fred", "Awesome", 19);
            newRanger.cQB();
            newRanger.bJJ();
            newRanger.speak();
            newRanger.midRange();


        NavySeals newSeal = new NavySeals("Adam", "Frogman", 30);
            newSeal.fMA();
            newSeal.speak();
            newSeal.sniper();
            newSeal.walk();


        MarineRecon newMarine = new MarineRecon("Ted", "Nice", 24);
        System.out.println(newMarine.throwBomb(new Bomb()));
        ;
}
}
