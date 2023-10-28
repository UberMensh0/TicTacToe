public class WinnerCheck {
        public String Check(char[][] gameBoard) {
            char[] players = {'X', 'O'};

            for (char player : players) {
                for (int i = 0; i < 3; i++) {
                    // Check rows
                    if (gameBoard[i * 2][0] == player && gameBoard[i * 2][2] == player && gameBoard[i * 2][4] == player) {
                        return player + " wins!";
                    }
                    // Check columns
                    if (gameBoard[0][i * 2] == player && gameBoard[2][i * 2] == player && gameBoard[4][i * 2] == player) {
                        return player + " wins!";
                    }
                }
                // Check diagonals
                if ((gameBoard[0][0] == player && gameBoard[2][2] == player && gameBoard[4][4] == player)
                        || (gameBoard[0][4] == player && gameBoard[2][2] == player && gameBoard[4][0] == player)) {
                    return player + " wins!";
                }
            }

            boolean isDraw = true;
            for (int i = 0; i < 5; i += 2) {
                for (int j = 0; j < 5; j += 2) {
                    if (gameBoard[i][j] != 'X' && gameBoard[i][j] != 'O') {
                        isDraw = false;
                        break;
                    }
                }
            }
            if (isDraw) {
                return "It's a draw!";
            }

            return "Ongoing";
        }
    }


