package com.brian;

public abstract class Chess {
    private boolean killed= false;
    int black;
    Chess(int b){
        black= b;
    }
    public boolean isKilled(){
        return this.killed== true;
    }
    public void setKilled(boolean killed){
        this.killed= killed;
    }
    public boolean equals(Chess b) {
        return (this == b);
    }
    public abstract boolean valid(Board b, spot where, int x, int y, DetermineWin w);
}
