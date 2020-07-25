package com.brian;

public class DetermineWin {
    public boolean WinNot(Board b){
        if(b.bothcontainsKing()== true)return false;
        return true;
    }
    public void WhoWin(Board b){
        if(b.otherhas)System.out.print("WHite win");
        else System.out.print("Black win");
    }
}
