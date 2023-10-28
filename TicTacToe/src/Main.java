import java.util.*;

public class Main {

    public static void main(String[] args) {
        char[][] gameBoard = {{'1', '|', '2', '|', '3'},
                {'-', '+', '-', '+', '-'},
                {'4', '|', '5', '|', '6'},
                {'-', '+', '-', '+', '-'},
                {'7', '|', '8', '|', '9'}};

        printGameBoard(gameBoard);

        while (true) {
            Scanner scan = new Scanner(System.in);
            int x;

            while (true) {
                System.out.println("Enter your number (1-9):");
                x = scan.nextInt();
                if (x >= 1 && x <= 9) {
                    int row = (x - 1) / 3 * 2;
                    int col = (x - 1) % 3 * 2;
                    if (gameBoard[row][col] != 'X' && gameBoard[row][col] != 'O') {
                        break;
                    } else {
                        System.out.println("Error: Please choose free position");
                    }
                } else {
                    System.out.println("Error: Please enter a number between 1 and 9");
                }
            }
            Positions pos = new Positions();

            pos.PlaceSwitch(gameBoard, x, "player1");

            printGameBoard(gameBoard);
            WinnerCheck checking = new WinnerCheck();
            checking.Check(gameBoard);
            String result = checking.Check(gameBoard);
            System.out.println(result);

            if (result.contains("wins") || result.equals("It's a draw!")) {
                break;
            }

            Random r = new Random();
            int y = r.nextInt(9) + 1;
            pos.PlaceSwitch(gameBoard, y, "player2");

            printGameBoard(gameBoard);
            checking.Check(gameBoard);
            result = checking.Check(gameBoard);
            System.out.println(result);

            if (result.contains("wins") || result.equals("It's a draw!")) {
                break;
            }
        }
    }

    public static void printGameBoard(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }
}
