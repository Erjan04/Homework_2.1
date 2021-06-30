package com.company;

public class Main {

    public static void main(String[] args) {

        Footballer footballer = new Footballer("ЧЕ2014","Англия");
        footballer.vsTeam("Барселона","Реал мадрид");
        System.out.println(footballer.getInfo());
        FootballGamer messi = new FootballGamer("Лионель Месси","Аргентинец",34,170,
                Player_type.SOCCER,new Team("Барселона",10));
        System.out.println(messi.getInfo());
        messi.playerTypePlaying("Тип игры:Дриблинг ",32.5);
        System.out.println("_______________");
        FootballGamer ronaldo = new FootballGamer("Криштиану Роналду","Португалец",35,185
                , Player_type.SOCCER,new Team("Реал мадрид",7));
        System.out.println(ronaldo.getInfo());
        ronaldo.playerTypePlaying("Тип игры:Разноплановый ",34.5);
        System.out.println("_______________");
        FootballGamer terStegen = new FootballGamer("Марк-Андре Тер Стеген","Немец",29,187,
                Player_type.GOALKEEPER,new Team("Барселона",1));
        System.out.println(terStegen.getInfo());
        terStegen.playerTypePlaying("Тип игры:Вратарь",33.5);
        System.out.println("_______________");
        FootballGamer ramos = new FootballGamer("Серхио Рамос","Испанец",35,185,
                Player_type.DEFENDER,new Team("Реал мадрид",4));
        System.out.println(ramos.getInfo());
        ramos.playerTypePlaying("Тип игры:Лучший защитник",35);





    }
}
