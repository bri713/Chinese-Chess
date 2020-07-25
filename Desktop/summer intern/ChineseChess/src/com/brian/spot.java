package com.brian;

public class spot {
    int x;
    int y;
    Chess chess;
    spot(int x, int y, Chess c){
        this.x= x;
        this.y= y;
        this.chess= c;
    }
    public void setchess(Chess c){
        this.chess= c;
    }
    public int returnx(){
        return this.x;
    }
    public int returny(){
        return this.y;
    }
}
