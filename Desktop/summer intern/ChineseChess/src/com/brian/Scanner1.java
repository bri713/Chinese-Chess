package com.brian;

public class Scanner1 {
    java.util.Scanner s= new java.util.Scanner(System.in);
    public spot which(Board b){
        System.out.println("please enter the chess u want to move");
        int x= s.nextInt();
        int y= s.nextInt();
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

