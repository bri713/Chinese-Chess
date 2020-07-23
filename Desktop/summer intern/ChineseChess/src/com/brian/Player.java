package com.brian;

public class Player {
    boolean BlackSide;
    int Black= 0;
    Player(boolean k){
        this.BlackSide= k;
    }
    public static int side(Chess chess){
        if(chess.player.Black==1){
            return 1;
        } else{
            return 0;
        }
    }
    public void turn(Board b, spot where, int x, int y){
        Move m= new Move();
        m.IsValid(b, where, x, y);
    }
}