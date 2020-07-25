package com.brian;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Player p1= new Player(true);
        Player p2= new Player(false);
        Board b= new Board();
        DetermineWin w= new DetermineWin();
        int count= 0;
        while(w.WinNot(b)!=true){
            if(count==0){
                p1.turn(b, count);
                count++;
            }
            else{
                p2.turn(b, count);
                count--;
            }
        }
        w.WhoWin(b);
    }
}
