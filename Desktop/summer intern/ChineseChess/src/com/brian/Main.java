package com.brian;

public class Main {

    public static void main(String[] args) {
        // write your code here
        spot which;
        int whereX, whereY;
        int count= 0;
        Player p1= new Player(true);
        Player p2= new Player(false);
        Scanner1 s= new Scanner1();
        Board b= new Board();
        DetermineWin w= new DetermineWin();
        while(w.WinNot(b)!=true){
            which= s.which(b);
            whereX= s.whereX();
            whereY= s.whereY();
            if(count==0){
                p1.turn(b, which, whereX, whereY);
                count++;
            }
            if(count==1){
                p2.turn(b, which, whereX, whereY);
                count--;
            }
        }
    }
}
