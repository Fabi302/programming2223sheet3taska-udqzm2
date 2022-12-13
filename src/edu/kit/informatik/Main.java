package edu.kit.informatik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToe playField = new TicTacToe(new String[9]);

        playField.emptyField();
        playField.fieldFormation();

        System.out.println(playField.fieldFormation());

        Scanner scanner = new Scanner(System.in);
        String player = "x";


        for (int i = 1; i < 10; i++) {
            System.out.println(i + ". Zug:" + player);
            String input = scanner.nextLine();
            if (!playField.isNotOccupied(Integer.parseInt(input))){
                i--;
                continue;
            }
            playField.placeMark(Integer.parseInt(input), player);
            System.out.println(playField.fieldFormation());

            if (playField.playerWon()) {
                System.out.println("Sieger:" + player);
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