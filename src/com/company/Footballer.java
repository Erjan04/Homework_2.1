 package com.company;

public class Footballer extends Football{

    private String from;

    public Footballer(String name, String from) {
        super(name);
        this.from = from;
    }

    public void vsTeam(String team,String teams){
        System.out.println(team +" vs " + teams);

    }

    public final void playerTypePlaying(String play,double speedRun) {
        System.out.println(play + speedRun);
    }

    public String getFrom() {
        return from;
    }


}
