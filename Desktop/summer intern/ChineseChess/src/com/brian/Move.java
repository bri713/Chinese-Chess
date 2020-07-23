package com.brian;

public class Move {
    public boolean IsValid(Board b, spot where, int x, int y){
        if(x> 0 ||x<= 9|| y>0|| y<= 8){
            if(b.get(x, y).chess.player.Black== where.chess.player.Black){return false;}
            return true;
        }
        return false;
    }
    public void Eat(Board b, ){}
}
