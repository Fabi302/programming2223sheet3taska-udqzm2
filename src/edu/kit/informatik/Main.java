package edu.kit.informatik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToe playField = new TicTacToe(new String[9]);
        AI ai = new AI();
        playField.emptyField();
        playField.fieldFormation();

        System.out.println(playField.fieldFormation());

        Scanner scanner = new Scanner(System.in);
        String player = "x";
        String input = "";


        for (int i = 1; i < 10; i++) {
            System.out.println(i + ". Zug: " + player);
            input = scanner.nextLine();
            if (!playField.isNotOccupied(Integer.parseInt(input))) {
                i--;
                continue;
            }
            playField.placeMark(Integer.parseInt(input), player);
            System.out.println(playField.fieldFormation());

            if (args[0].equals("ki")) {
                playField.placeMark(ai.nextMove(playField), "o");
            }
            if (playField.playerWon()) {
                System.out.println("Sieger: " + player);
                break;
            }
            else if (playField.fieldFull()) {
                System.out.println("Kein Sieger");
                break;
            }
            if (player.equals("x")) {
                player = "o";
            }
            else {
                player = "x";
            }
        }

    }
}