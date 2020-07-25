package com.brian;

public class car extends Chess{
    public car(int black){
        super(black);
    }
    @Override public boolean valid(Board b, spot where, int x, int y, DetermineWin w){
        Move m= new Move();
        if(where.x== x || where.y== y){
            if(m.nuumberBetween(b, where, x, y)==0){
                System.out.println("car moved");
                return true;
            }
        }
        return false;
    }
}
