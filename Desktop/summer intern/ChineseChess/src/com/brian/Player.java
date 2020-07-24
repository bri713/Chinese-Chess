package com.brian;

public class Player {
    boolean BlackSide;
    int Black= 0;
    Player(boolean k){
        this.BlackSide= k;
    }
    public void turn(Board b, spot where, int x, int y, DetermineWin w, int count) {
        Move m = new Move();
        if (m.IsValid(b, where, x, y, w)) {
            if (m.emptyspot(b, x, y) != true) {
                m.Eat(b, where, x, y);
            }else{
                m.NoEat(b, where, x, y);
            }
        }else{
            System.out.println("Move not allowed. Pls try again");
        }
    }
}