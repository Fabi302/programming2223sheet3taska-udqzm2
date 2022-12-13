package edu.kit.informatik;

public class AI {
    public int nextMove(TicTacToe playBoard) {
        if (playBoard.possibleWin() != -1) {
            return playBoard.possibleWin();
        }
        if (playBoard.playField[4].equals("-")) {
            return 4;
        }
        for (int i = 0; i < 4; i++) {
            if (playBoard.playField[i * 2].equals("-")) {
                return i * 2;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (playBoard.playField[i].equals("-")) {
                return i;
            }
        }
        return 42;
    }
}
