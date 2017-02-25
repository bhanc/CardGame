package main.java;

import java.util.Random;

/**
 * Created by Bartosz Hanc on 2017-02-24.
 */
public class Card {
    private String name;
    private int attack;
    private int defens;
    private int random;
    private Random generator = new Random();

    public Card(String name){
        this.name = name;
        generateCard();
    }

    public Card(int attack, int defens){
        this.attack = attack;
        this.defens = defens;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefens() {
        return defens;
    }

    public String getName() {
        return name;
    }

    public void generateCard(){
        random = generator.nextInt(10) + 1;
        attack = random;
        random = generator.nextInt(10) + 1;
        defens = random;
    }

    @Override
    public String toString(){
        return "Nazwa: " + name + "\nAtak: " + attack + "\nObrona: " + defens;
    }
}
