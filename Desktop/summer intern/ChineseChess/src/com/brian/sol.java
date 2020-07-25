package com.brian;

public class sol extends Chess {
    public sol(int black){
        super(black);
    }
    @Override public boolean valid(Board b, spot where, int x, int y, DetermineWin w){
        if(where.chess.black==0 && where.x<5){
            if((where.x+ 1)== x){
                System.out.println("soldier moved");
                return true;
            }
        }
        if(where.chess.black==1 && where.x>4){
            if((where.x- 1)== x){
                System.out.println("soldier moved");
                return true;
            }
        }
        if(where.chess.black==0 && where.x>=5){
            if((where.x+ 1)== x && where.y== y){
                System.out.println("soldier moved");
                return true;
            }
        }
        if(where.chess.black==1 && where.x<=4){
            if((where.x- 1)== x && where.y== y){
                System.out.println("soldier moved");
                return true;
            }
        }
        if(where.chess.black==0 && where.x>=5){
            if(((where.y+ 1)== y || (where.y- 1)== y)&& where.x== x){
                System.out.println("soldier moved");
                return true;
            }
        }
        if(where.chess.black==1 && where.x<=4){
            if(((where.y+ 1)== y || (where.y- 1)== y)&& where.x== x){
                System.out.println("soldier moved");
                return true;
            }
        }
        return false;
    }
}


