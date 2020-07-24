package com.brian;

public class Scanner1 {
    java.util.Scanner s= new java.util.Scanner(System.in);
    public spot which(Board b, int count){
        if(count==0)
            System.out.println("Player 1 please enter the chess u want to move");
        else{
            System.out.println("Player 2 please enter the chess u want to move");
        }
        int x= s.nextInt();
        int y= s.nextInt();
        if(count!=b.get(x,y).chess.black)which(b, count);
        return b.get(x, y);
    }
    public int whereX() {
        System.out.println("please enter x-coor u want to move it");
        return s.nextInt();
    }
    public int whereY() {
        System.out.println("please enter y-coor u want to move it");
        return s.nextInt();
    }
}

