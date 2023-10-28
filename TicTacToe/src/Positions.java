public class Positions {
    public static void PlaceSwitch(char[][] gameBoard, int x, String user) {
        char sy = ' ';
        if (user.equals("player1")) {
            sy = 'X';
        } else if (user.equals("player2")) {
            sy = 'O';
        }

        switch (x) {
            case 1:
                if (gameBoard[0][0] != 'X' && gameBoard[0][0] != 'O')
                    gameBoard[0][0] = sy;
                break;
            case 2:
                if (gameBoard[0][2] != 'X' && gameBoard[0][2] != 'O')
                    gameBoard[0][2] = sy;
                break;
            case 3:
                if (gameBoard[0][4] != 'X' && gameBoard[0][4] != 'O')
                    gameBoard[0][4] = sy;
                break;
            case 4:
                if (gameBoard[2][0] != 'X' && gameBoard[2][0] != 'O')
                    gameBoard[2][0] = sy;
                break;
            case 5:
                if (gameBoard[2][2] != 'X' && gameBoard[2][2] != 'O')
                    gameBoard[2][2] = sy;
                break;
            case 6:
                if (gameBoard[2][4] != 'X' && gameBoard[2][4] != 'O')
                    gameBoard[2][4] = sy;
                break;
            case 7:
                if (gameBoard[4][0] != 'X' && gameBoard[4][0] != 'O')
                    gameBoard[4][0] = sy;
                break;
            case 8:
                if (gameBoard[4][2] != 'X' && gameBoard[4][2] != 'O')
                    gameBoard[4][2] = sy;
                break;
            case 9:
                if (gameBoard[4][4] != 'X' && gameBoard[4][4] != 'O')
                    gameBoard[4][4] = sy;
                break;
            default:
                break;
        }
    }

}
