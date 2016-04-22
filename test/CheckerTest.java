import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class CheckerTest {
    private Game game;


    @Before
    public void setUp() throws Exception {

        int[][] table = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                table[i][j] = j + 1;
            }
        }

        game = new Game(table);
    }

    @Test
    public void rowLevelCheck_should_check_each_row_is_done_or_not() {
        Checker checker = new Checker(game);
        assertTrue(checker.rowLevelCheck());

    }

    @Test
    public void columnLevelCheck_should_check_each_is_done_or_not() {
        Checker checker = new Checker(game);
        assertFalse(checker.columnLevelChecker());
    }
}