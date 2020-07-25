package com.brian;

public class hor extends Chess{
    public hor(int black){
        super(black);
    }
    @Override public boolean valid(Board b, spot where, int x, int y, DetermineWin w){
        if((x-where.x==2&&where.y-y==1) || (x-where.x==2&&y-where.y==1)){
            if(b.get(where.x+1, where.y).chess==null){
                System.out.println("horse moved");
                return true;
            }
        }
        if((y-where.y==2&&where.x-x==1) || (y-where.y==2&&x-where.x==1)){
            if(b.get(where.x, where.y+1).chess==null){
                System.out.println("horse moved");
                return true;
            }
        }
        if((where.x-x==2&&y-where.y==1) || (where.x-x==2&&where.y-y==1)){
            if(b.get(where.x-1, where.y).chess==null){
                System.out.println("horse moved");
                return true;
            }
        }
        if((where.y-y==2&&x-where.x==1) || (where.y-y==2&&where.x-x==1)){
            if(b.get(where.x, where.y-1).chess==null){
                System.out.println("horse moved");
                return true;
            }
        }
        return false;
    }
}

