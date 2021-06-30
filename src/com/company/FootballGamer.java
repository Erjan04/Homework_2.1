package com.company;


import java.util.Arrays;

public class FootballGamer extends Footballer{

    private int age;
    private int height;
    private Player_type playerType;
    private Team team;

    public int getHeight() {
        return height;
    }

    public FootballGamer(String name, String from, int age, int height, Player_type playerType, Team team) {
        super(name, from);
        this.age = age;
        this.height = height;
        this.playerType = playerType;
        this.team = team;
    }

    public int getAge() {
        return age;
    }

    public Player_type getPlayerType() {
        return playerType;
    }

    public Team getTeam() {
        return team;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nИмя футболиста: " + getName() +
                "\nВозраст "+ age +"\nРост: " +  height + "\nНация: " + getFrom() +
                "\nРоль: " + playerType + "\nКоманда:Барселона/Реал мадрид" ;//у меня не получилось написать team,так как вместо того что бы выявить значение компилятор пишет название пакета и класса
    }
}



