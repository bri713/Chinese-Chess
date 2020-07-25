package com.brian;

public class ele extends Chess{
    public ele(int black){
        super(black);
    }
    @Override public boolean valid(Board b, spot where, int x, int y, DetermineWin w){
        int newX= (where.x+ x)/ 2;
        int newY= (where.y +y)/ 2;
        if(b.get(newX, newY).chess!= null)return false;
        if(where.chess.black==0){
            if(x >4)return false;
        }
        if(where.chess.black==1){
            if(x <5)return false;
        }
        if(x== where.x+ 2 && y== where.y+ 2){
            System.out.println("elephant moved");
            return true;
        }
        if(x== where.x+ 2 && y== where.y- 2){
            System.out.println("elephant moved");
            return true;
        }
        if(x== where.x- 2 && y== where.y+ 2){
            System.out.println("elephant moved");
            return true;
        }
        if(x== where.x- 2 && y== where.y- 2){
            System.out.println("elephant moved");
            return true;
        }
        return false;
    }
}
