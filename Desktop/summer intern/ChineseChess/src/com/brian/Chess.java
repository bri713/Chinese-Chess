package com.brian;

public class Chess {
    private boolean killed= false;
    String name;
    Player player;
    boolean black;
    Chess(boolean black){
        this.black= black;
    }
    public boolean isKilled(){
        return this.killed== true;
    }
    public void setKilled(boolean killed){
        this.killed= killed;
    }

}
