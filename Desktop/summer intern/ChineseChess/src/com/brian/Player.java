package com.brian;

public class Player {
    boolean BlackSide;
    int Black= 0;
    Player(boolean k){
        this.BlackSide= k;
    }
    public void turn(Board b, int count) {
        PrintBoard p= new PrintBoard();
        spot which;
        int whereX, whereY;
        Scanner1 s= new Scanner1();
        DetermineWin w= new DetermineWin();
        Move m = new Move();

        p.print(b);
        which= s.which(b, count);


        //problem not resolved
        if(which==null){System.out.println("1");
            turn(b, count);
            return;
        }System.out.println("2");






        whereX= s.whereX();
        whereY= s.whereY();

        if (m.IsValid(b, which, whereX, whereY, w)) {
            if (m.emptyspot(b, whereX, whereY) != true) {
                m.Eat(b, which, whereX, whereY);
            }else{
                m.NoEat(b, which, whereX, whereY);
            }
        }else{
            System.out.println("Move not allowed. Pls try again");
            turn(b, count);
        }
    }
}