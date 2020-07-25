package com.brian;

public class wiz extends Chess{
    public wiz(int black){
        super(black);
    }
    @Override public boolean valid(Board b, spot where, int x, int y ,DetermineWin w){
        if((x>2&&x<7) || (y<3&&y>5)){System.out.println("j");return false;}
        if(where.x+ 1== x&& where.y+ 1== y){return true;}
        if(where.x+ 1== x&& where.y- 1== y){return true;}
        if(where.x- 1== x&& where.y+ 1== y){return true;}
        if(where.x- 1== x&& where.y- 1== y){return true;}
        return false;
    }
}
