package lesson3;

import java.util.Random;
import java.util.Scanner;

/**
 * homework lesson3
 *
 * @author Amina
 * 11.03.2021
 */
public class TicTacToe {
    private static final char dot_Human;
    private static final char dot_AI;
    private static final char dot_Empty;
    private static final Random random;
    private static final Scanner scanner;
    private static int fieldSizeX;
    private static int fieldSizeY;

    private static char[][] field;

    static {
        random = new Random();
        scanner = new Scanner(System.in);
        dot_Human = 'X';
        dot_AI = 'Y';
        dot_Empty = '.';
    }

    public static void main(String[] args) {
        do {
            initField();
            printField();
            while (true) {
                humanTurn();
                printField();
                if (game(dot_Human, "Human wins!")) {
                    break;
                }
                aiTurn();
                printField();
                if (game(dot_AI, "AI wins!")) {
                    break;
                }
            }
            System.out.println("Wanna play again?>>> Y or N");
        } while (scanner.next().equalsIgnoreCase("y"));
    }

    public static void initField() {
        fieldSizeX = 3;
        fieldSizeY = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = dot_Empty;
            }
        }
    }

    public static void printField() {
        for (int x = 0; x < fieldSizeY; x++) {
            for (int y = 0; y < fieldSizeX; y++) {
                System.out.print(field[x][y] + " ");
            }
            System.out.println();
        }
    }

    private static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите координаты х и у через пробел >>>>");

            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        field[y][x] = dot_Human;
    }

    private static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        } while (!isCellValid(x, y));
        field[y][x] = dot_AI;

    }

    public static boolean isCellValid(int x, int y) {             // check cell
        if (x < 0 || y < 0 || x >= fieldSizeX || y >= fieldSizeY)
            return false;
        return field[y][x] == dot_Empty;
    }

    public static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellValid(x, y)) return false;
            }
        }
        return true;
    }

    public static boolean game(char dot, String s) {
        if (checkWin(dot)) {
            System.out.println(s);
            return true;
        }
        if (checkDraw()) {
            System.out.println("Draw!");
            return true;
        }
        return false;
    }

    public static boolean checkWin(char c) {
        boolean horizontal, vertical, diagonal;
        diagonal = true;

        for (int y = 0; y < fieldSizeY; y++) {
            horizontal = true;
            vertical = true;

            for (int x = 0; x < fieldSizeX; x++) {
                if (vertical) {
                    vertical = (field[y][x] == c);
                }
                if (horizontal) {
                    horizontal = (field[x][y] == c);
                }
            }
            if (horizontal || vertical) return true;
            if (diagonal) {
                diagonal = (field[y][y] == c || field[y][fieldSizeY - 1 - y] == c);
            }
        }
        return (diagonal);
    }
}
