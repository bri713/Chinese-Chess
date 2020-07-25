package com.brian;

import java.util.HashMap;

public class Board {
    boolean blackhas= true;
    boolean otherhas= true;
    spot board[][];
    Board() {
        board= new spot[10][9];

        for(int i=0; i< 9; i++){
            board[1][i]= new spot(1, i, new empty(2));
            board[4][i]= new spot(4, i, new empty(2));
            board[5][i]= new spot(5, i, new empty(2));
            board[8][i]= new spot(8, i, new empty(2));
        }
        for(int i=2; i<7; i++){
            board[2][i]= new spot(2, i, new empty(2));
            board[7][i]= new spot(7, i, new empty(2));
        }
        board[2][0]= new spot(2, 0, new empty(2));
        board[2][8]= new spot(2, 8, new empty(2));
        board[7][0]= new spot(7, 0, new empty(2));
        board[7][8]= new spot(7, 8, new empty(2));

        for(int i=1; i<8; i=i+2){
            board[3][i]= new spot(3, i, new empty(2));
            board[6][i]= new spot(6, i, new empty(2));
        }

        board[0][0]= new spot(0, 0, new car(0));
        board[0][8]= new spot(0, 8, new car(0));
        board[0][1]= new spot(0, 1, new hor(0));
        board[0][7]= new spot(0, 7,new hor(0));
        board[0][2]= new spot(0, 2, new ele(0));
        board[0][6]= new spot(0, 6, new ele(0));
        board[0][3]= new spot(0, 3, new wiz(0));
        board[0][5]= new spot(0, 5, new wiz(0));
        board[0][4]= new spot(0, 4, new king(0));
        board[2][1]= new spot(2, 1, new gun(0));
        board[2][7]= new spot(2, 7, new gun(0));
        board[3][0]= new spot(3, 0, new sol(0));
        board[3][2]= new spot(3, 2, new sol(0));
        board[3][4]= new spot(3, 4, new sol(0));
        board[3][6]= new spot(3, 6, new sol(0));
        board[3][8]= new spot(3, 8, new sol(0));

        board[9][0]= new spot(9, 0, new car(1));
        board[9][8]= new spot(9, 8, new car(1));
        board[9][1]= new spot(9, 1, new hor(1));
        board[9][7]= new spot(9, 7,new hor(1));
        board[9][2]= new spot(9, 2, new ele(1));
        board[9][6]= new spot(9, 6, new ele(1));
        board[9][3]= new spot(9, 3, new wiz(1));
        board[9][5]= new spot(9, 5, new wiz(1));
        board[9][4]= new spot(9, 4, new king(1));
        board[7][1]= new spot(7, 1, new gun(1));
        board[7][7]= new spot(7, 7, new gun(1));
        board[6][0]= new spot(6, 0, new sol(1));
        board[6][2]= new spot(6, 2, new sol(1));
        board[6][4]= new spot(6, 4, new sol(1));
        board[6][6]= new spot(6, 6, new sol(1));
        board[6][8]= new spot(6, 8, new sol(1));
    }
    public spot get(int x, int y){
        return board[x][y];
    }
    public boolean bothcontainsKing(){
        if(this.blackhas && this.otherhas)return true;
        return false;
    }
}
