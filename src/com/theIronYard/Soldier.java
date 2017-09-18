package com.theIronYard;

public abstract class Soldier {
    String name;
    String rank;
    int    age;

    public Soldier (String name, String rank, int age ) {
        this.name = name;
        this.rank = rank;
        this.age = age;
    }

public void walk() {
    System.out.println("trudge");
}

public void sleep() {
    System.out.println("snore");
}

public void eat() {
    System.out.println("munch");
}

public abstract String speak();

}
