package com.brian;

public class DetermineWin {
    public boolean WinNot(Board b){
        if(b.bothcontainsKing()== true)return false;
        return true;
    }
}
