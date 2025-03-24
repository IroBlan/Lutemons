package com.example.lutemon;

public abstract class Lutemon {
    protected String name;
    protected String color;
    protected int attack;
    protected int defence;
    public int health;
    protected int maxHealth;
    protected int id;
    protected int experience;
    static int idCount;

    public Lutemon(String name,String color,int attack,int defence,int health,int maxHealth,int id,int experience){
        this.name = name;
        this.color = color;
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.maxHealth = maxHealth;
        this.id = id;
        this.experience = experience;
    }

    public String getName(){
        return name;
    }
    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getId() {
        return id;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public String getColor() {
        return color;
    }
    public static int getNumberOfCreatedLutemons(){
        return idCount;
    }
    public void defense(int attack){
        health = health-attack;
        if(health>0){
            //current_lm manages to escape death
        }
        else {
            //current_lutemon gets killed
        }
    }
    public void attack(Lutemon lutemon){
        int current_attack = attack;
        lutemon.defense(current_attack);
    }
}
