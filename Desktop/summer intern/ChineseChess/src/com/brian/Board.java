package com.brian;

import java.util.HashMap;

public class Board {
    boolean blackhas= true;
    boolean otherhas= true;
    spot board[][];
    Board() {
        board= new spot[10][9];

        board[0][0]= new spot(0, 0, new car(true));
        board[0][8]= new spot(0, 8, new car(true));
        board[0][1]= new spot(0, 1, new hor(true);
        board[0][7]= new spot(0, 7,new hor(true);
        board[0][2]= new spot(0, 2, new ele(true));
        board[0][6]= new spot(0, 6, new ele(true));
        board[0][3]= new spot(0, 3, new wiz(true));
        board[0][5]= new spot(0, 5, new wiz(true));
        board[0][4]= new spot(0, 4, new king(true));
        board[2][1]= new spot(2, 1, new gun(true));
        board[2][7]= new spot(2, 7, new gun(true));
        board[4][0]= new spot(4, 0, new sol(true));
        board[4][2]= new spot(4, 2, new sol(true));
        board[4][4]= new spot(4, 4, new sol(true));
        board[4][6]= new spot(4, 6, new sol(true));
        board[4][8]= new spot(4, 8, new sol(true));

        board[5][0]= new spot(5, 0, new car(false));
        board[5][8]= new spot(5, 8, new car(false));
        board[5][1]= new spot(5, 1, new hor(false);
        board[5][7]= new spot(5, 7,new hor(false);
        board[5][2]= new spot(5, 2, new ele(false));
        board[5][6]= new spot(5, 6, new ele(false));
        board[5][3]= new spot(5, 3, new wiz(false));
        board[5][5]= new spot(5, 5, new wiz(false));
        board[5][4]= new spot(5, 4, new king(false));
        board[7][1]= new spot(7, 1, new gun(false));
        board[7][7]= new spot(7, 7, new gun(false));
        board[9][0]= new spot(9, 0, new sol(false));
        board[9][2]= new spot(9, 2, new sol(false));
        board[9][4]= new spot(9, 4, new sol(false));
        board[9][6]= new spot(9, 6, new sol(false));
        board[9][8]= new spot(9, 8, new sol(false));

    }
    public spot get(int x, int y){
        return board[x][y];
    }
    public boolean bothcontainsKing(){
        if(this.blackhas && this.otherhas)return true;
        return false;
    }
}
