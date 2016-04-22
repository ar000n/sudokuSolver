import java.util.ArrayList;

public class Checker {
    private Game game;

    public Checker(Game game) {
        this.game = game;
    }

    public boolean rowLevelCheck() {

        int[][] board = game.getBoard();
        for (int i = 0; i < 9; i++) {
            int sum = 0;
            for (int j = 0; j < 9; j++) {
                sum += board[i][j];
            }
            if (sum != 45) {
                return false;
            }
        }
        return true;
    }

    public boolean columnLevelChecker() {

        int[][] board = game.getBoard();
        for (int i = 0; i < 9; i++) {
            int sum = 0;
            for (int j = 0; j < 9; j++) {
                sum += board[j][i];
            }
            if (sum != 45) {
                return false;
            }
        }
        return true;
    }
}
