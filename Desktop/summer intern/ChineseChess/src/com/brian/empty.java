package com.brian;

public class empty extends Chess{
    public empty(int black){
        super(black);
    }
    @Override public boolean valid(Board b, spot where, int x, int y, DetermineWin w){
        return true;
    }
}
