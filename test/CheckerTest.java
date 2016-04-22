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

        Integer[] row = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        row1.addAll(Arrays.asList(row));
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        row2.addAll(Arrays.asList(row));
        ArrayList<Integer> row3 = new ArrayList<Integer>();
        row3.addAll(Arrays.asList(row));
        ArrayList<Integer> row4 = new ArrayList<Integer>();
        row4.addAll(Arrays.asList(row));
        ArrayList<Integer> row5 = new ArrayList<Integer>();
        row5.addAll(Arrays.asList(row));
        ArrayList<Integer> row6 = new ArrayList<Integer>();
        row6.addAll(Arrays.asList(row));
        ArrayList<Integer> row7 = new ArrayList<Integer>();
        row7.addAll(Arrays.asList(row));
        ArrayList<Integer> row8 = new ArrayList<Integer>();
        row8.addAll(Arrays.asList(row));
        ArrayList<Integer> row9 = new ArrayList<Integer>();
        row9.addAll(Arrays.asList(row));
        ArrayList<ArrayList> allRows = new ArrayList<ArrayList>();
        ArrayList[] rows = new ArrayList[]{row1, row2, row3, row4, row5, row6, row7, row8, row9};
        allRows.addAll(Arrays.asList(rows));

        Game game = new Game(rows);
        System.out.println(game);
    }

    @Test
    public void rowLevelCheck_each_row_is_done_or_not() {
        System.out.println(game);
        Checker checker = new Checker(game);
        assertTrue(checker.rowLevelCheck());

    }
}