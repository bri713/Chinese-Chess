package com.brian;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        spot which;
        int whereX, whereY;
        Player p1= new Player(true);
        Player p2= new Player(false);
        Scanner1 s= new Scanner1();
        Board b= new Board();
        PrintBoard p= new PrintBoard();
        DetermineWin w= new DetermineWin();
        int count= 0;
        while(w.WinNot(b)!=true){
            p.print(b);
            which= s.which(b, count);
            whereX= s.whereX();
            whereY= s.whereY();
            if(count==0){
                p1.turn(b, which, whereX, whereY, w, count);
                count++;
            }
            else{
                //p2.turn(b, which, whereX, whereY, w, count);
                count--;
            }
        }
        w.WhoWin(b);
    }
}
