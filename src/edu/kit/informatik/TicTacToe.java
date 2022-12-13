package edu.kit.informatik;

/**
 * public class TicTacToe contains every method
 */
public class TicTacToe {
    /**
     * playField is the 3x3 Field used in the game represented through an Array with the length 9
     */
    String[] playField;
    public TicTacToe(String[] playField) {
        this.playField = playField;
    }

    /**
     * the method emptyField creates the default playField, filled with "-"
     */
    public void emptyField() {
        for (int i = 0; i < playField.length; i++) {
            playField[i] = "-";
        }
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
        for (int i = 0; i < 3; i++) {
            if (playField[i * 3].equals(playField[1 + i * 3]) && playField[1 + i * 3].equals(playField[2 + i * 3])
                && !playField[i * 3].equals("-")) { // checks vertical
                return true;
            }
            else if (playField[i].equals(playField[3 + i]) && playField[3 + i].equals(playField[6 + i])
                && !playField[i].equals("-")) { // checks horizontal
                return true;
            }
        }
        if (playField[0].equals(playField[4]) && playField[4].equals(playField[8]) && !playField[0].equals("-")) { // checks diagonal from left to right
            return true;
        }
        if (playField[2].equals(playField[4]) && playField[4].equals(playField[6]) && !playField[2].equals("-")) { // checks diagonal from right to left
            return true;
        }
        return false;
    }

    /**
     * method fieldFull checks if the field is completely filled with x or o
     * @return returns true if the field is completely filled
     */
    public boolean fieldFull() {
        for (int i = 0; i < playField.length; i++) {
            if (playField[i].equals("-")) {
            }
            return false;
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
    public String fieldFormation() {
        String rowOne = playField[0] + playField[1] + playField [2];
        String rowTwo = playField[3] + playField[4] + playField [5];
        String rowThree = playField [6] + playField[7] + playField[8];
        String fieldFormation = rowOne + "\n" + rowTwo + "\n" + rowThree;
        return fieldFormation;
    }

    /**
     * method checks if there is a possible win in one of the rows
     * @return if there is a possible win the index of the empty field needed is returned,
     * if there is no possible Win "-1" is returned
     */
    public int possibleWinRow() {
        for (int i = 0; i < 3; i++) {
            if (playField[i * 3].equals("-") && playField[1 + i * 3].equals(playField[2 + i * 3])) {
                return i * 3;
            }
            else if (playField[1 + i * 3].equals("-") && playField[i * 3].equals(playField[2 + i * 3])) {
                return 1 + i * 3;
            }
            else if (playField[2 + i * 3].equals("-") && playField[i * 3].equals(playField[1 + i * 3])) {
                return 2 + i * 3;
            }
        }
        return -1;
    }

    /**
     * method checks if there is a possible win in one of the verticals
     * @return if there is a possible win the index of the empty field needed is returned,
     * if there is no possible win "-1" is returned
     */
    public int possibleWinVertical() {
        for (int i = 0; i < 3; i++) {
            if (playField[i].equals("_") && playField[3 + i].equals(playField[6 + i])) {
                return i;
            }
            else if (playField[3 + i].equals("_") && playField[i].equals(playField[6 + i])) {
                return 3 + i;
            }
            else if (playField[6 + i].equals("_") && playField[i].equals(playField[3 + i])) {
                return 6 + i;
            }
        }
        return -1;
    }

    /**
     * method checks if there is a possible win in one of the diagonals
     * @return if there is a possible win the index of the empty field needed is returned,
     * if there is no possible win "-1" is returned
     */
    public int possibleWinDiagonal() {
        if (playField[0].equals("-") && playField[4].equals(playField[8])) {
            return 0;
        }
        else if (playField[2].equals("-") && playField[4].equals(playField[6])) {
            return 2;
        }
        else if (playField[4].equals("-") && playField[0].equals(playField[8])) {
            return 4;
        }
        else if (playField[4].equals("-") && playField[2].equals(playField[6])) {
            return 4;
        }
        else if (playField[6].equals("-") && playField[2].equals(playField[4])) {
            return 6;
        }
        else if (playField[8].equals("-") && playField[0].equals(playField[4])) {
            return 8;
        }
        return -1;
    }
}
