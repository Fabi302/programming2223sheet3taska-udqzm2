package edu.kit.informatik;

import java.util.Scanner;
/**
 * public class TicTacToe contains every method
 */
public class TicTacToe {
    /**
     * playField is the 3x3 Field used in the game
     */
    String[] playField = new String[9];

    /**
     * the method emptyField creates the default playField, filled with "-"
     */
    public String[] emptyField() {
        for(int i = 0; i < playField.length; i++) {
            playField[i] = "-";
        }
        return playField;
    }

    /**
     * method isNotOccupied checks if the given index is free ("-")
     * @param k is the given index
     * @return place is free ("-")
     */
    public boolean isNotOccupied(int k) {
        return playField[k].equals("-");
    }

    /**
     * the method playerWon checks if one of the winning conditions
     * (3 x's or 3 O's vertical, horizontal or diagonal) is met
     * @return returns "won" if the game is won
     */
    public boolean playerWon() {
        boolean won = false;
        for(int i = 0; i < 3; i++) {
            if(playField[0 +i].equals(playField[1 + i].equals(playField[2 + i]))) { // checks vertical
                won = true;
            }
            else if(playField[0 +i].equals(playField[3 +i].equals(playField[6 + i]))) { // checks horizontal
                won = true;
            }
        }
        if(playField[0].equals(playField[4].equals(playField[8]))) { // checks diagonal from left to right
            won = true;
        }
        if(playField[2].equals(playField[4].equals(playField[6]))) { // checks diagonal from right to left
            won = true;
        }
        return won;

    }

    /**
     * method fieldFull checks if the field is completely filled with x or o
     * @return returns true if the field is completely filled
     */
    public boolean fieldFull() {
        for(int i = 0; i < playField.length; i++) {
            if(playField[i] != "-") {
            }
        }
        return true;
    }
    /**
     * method placeMark places the given mark at the given position
     * @param k is the given index
     * @param u is the mark x or o
     */
    public void placeMark(int k, String u) {
        playField[k] = u;
    }

    /**
     * method fieldFormation creates the wanted formation with 3 letters in one row
     */
    public void fieldFormation() {
        String rowOne = playField[0] + playField[1] + playField [2];
        String rowTwo = playField[3] + playField[4] + playField [5];
        String rowThree = playField [6] + playField[7] + playField[8];
        String fieldFormation = rowOne + "\n" + rowTwo + "\n" + rowThree;
        }
    }
}
