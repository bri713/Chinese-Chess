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
        if(x>9 || y>8)return null;
        if(b.get(x, y).chess==null){
            System.out.println("No chess there. Try again");
            return null;
        }
        if(count!=b.get(x,y).chess.black)which(b, count);
        return b.get(x, y);
    }
    public int whereX() {
        System.out.println("please enter x-coor u want to move it");
        int x=s.nextInt();
        if(x>9){
            System.out.println("OutofBound. Try again");
            x= whereX();
        }
        return x;
    }
    public int whereY() {
        System.out.println("please enter y-coor u want to move it");
        int y=s.nextInt();
        if(y>8){
            System.out.println("OutofBound. Try again");
            y= whereY();
        }
        return y;
    }
}

