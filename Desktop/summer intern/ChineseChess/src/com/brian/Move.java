package com.brian;

public class Move {
    public int nuumberBetween(Board b, spot where, int x, int y){
        int count= 0;
        int q= 0;
        if(x-where.x==1 || y-where.y==1 || where.x-x==1 || where.y-y==1){
            System.out.print("count");
            return 0;
        }
        if(where.y> y)q=1;
        if(where.x< x)q=2;
        if(where.y< y)q=3;
        empty e= new empty(2);
        if(q==0){System.out.println("0");
            for(int i= where.x+1; i> x; i--){
                if(b.get(i, y).equals(e))count++;
            }
        }
        if(q==1){System.out.println("1");
            for(int i= where.y+1; i> y; i--){
                if(b.get(x, i).equals(e))count++;
            }
        }
        if(q==3){System.out.println("3");
            for(int i= where.y+1; i< y; i++){
                if(b.get(x, i).equals(e))count++;
            }
        }
        if(q==2){System.out.print("2");
            for(int i= where.x+1; i< x; i++){System.out.print("h");
                if(b.get(i, y).chess.black!=2)count++;
            }
        }
        return count;
    }
    public boolean IsValid(Board b, spot where, int x, int y, DetermineWin w){
        if(x> 0 ||x<= 9|| y>0|| y<= 8){
            if(b.get(x, y).chess==null){
                if(where.chess.valid(b, where, x, y, w))
                    return true;
            }
            if(b.get(x, y).chess.black== where.chess.black){return false;}
            if(where.chess.valid(b, where, x, y, w))
            return true;
        }
        return false;
    }
    public boolean emptyspot(Board b,  int x, int y){
        if (b.get(x, y)==null){
            return true;
        }
        return false;
    }
    public void Eat(Board b, spot where, int x, int y){
        spot s= b.get(x, y);
        if(s.chess!= null) {
            s.chess.setKilled(true);
        }
        where.chess= null;
        s.x= x;
        s.y= y;
        s.chess= where.chess;
    }
    public void NoEat(Board b, spot where, int x, int y){
        spot s= b.get(x, y);
        where.chess= null;
        s.x= x;
        s.y= y;
        s.chess= where.chess;
    }
}
