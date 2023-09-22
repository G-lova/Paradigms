package org.example.seminar3;

import java.util.Scanner;

public class TicTacToe {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    private String[][] board;
    private String currentPlayer;

    public TicTacToe() {
        board = new String[3][3];
        currentPlayer = " X ";
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = String.valueOf(i) + '-' + String.valueOf(j);
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(" X ") || board[i][j].equals(" O ")) {
                    System.out.print(ANSI_RED + board[i][j] + ANSI_RESET);
                } else
                    System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-----------");
            }
        }
    }

    public boolean checkWin() {
        // Проверка по горизонтали
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }

        // Проверка по вертикали
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }

        // Проверка по диагонали
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(String.valueOf(i) + '-' + String.valueOf(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayBoard();
            System.out.print("Player " + currentPlayer + ", enter the position: ");
            String position = scanner.nextLine();
            int row = Integer.parseInt(position.split("-")[0]);
            int col = Integer.parseInt(position.split("-")[1]);

            // Проверка ввода координат
            if (row < 0 || row > 2 || col < 0 || col > 2 || !board[row][col].equals(String.valueOf(row) + '-' + String.valueOf(col))) {
                System.out.println("Invalid input. Try again.");
                continue;
            }

            board[row][col] = currentPlayer;

            if (checkWin()) {
                displayBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            } else if (isBoardFull()) {
                displayBoard();
                System.out.println("It's a tie!");
                break;
            }

            currentPlayer = (currentPlayer == " X ") ? " O " : " X ";
        }
    }
}
