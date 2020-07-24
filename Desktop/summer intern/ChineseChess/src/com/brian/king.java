package com.brian;

public class king extends Chess{
    Move m= new Move();
    public king(int black){
        super(black);
    }
    @Override public boolean valid(Board b, spot where, int x, int y, DetermineWin w){
        if(x>2 || y<3 || y>5 || x<7)return false;
        if(where.x+ 1== x && where.y== y)return true;
        if(where.x- 1== x && where.y== y)return true;
        if(where.y+ 1== y && where.x== x)return true;
        if(where.y- 1== y && where.x== x)return true;
        if(where.y== y && m.nuumberBetween(b, where, x, y)==0){
            if(y>5){
                b.otherhas=false;
                return true;
            }
            else{
                b.blackhas=false;
                return true;
            }
        }
        return false;
    }
}


