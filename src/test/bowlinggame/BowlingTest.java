package test.bowlinggame;

import main.bowlinggame.BowlingGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {
    private BowlingGame game;
    
    @BeforeEach
    void setUp() {
        game = new BowlingGame();
    }
    
    @Test
    void canScoreGutterGame() {
        game.roll(
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0}
                 );
        assertEquals(0, game.score());
    }
    
    @Test
    void canScoreGameOfOnes() {
        game.roll(
                new int[]{1, 1},
                new int[]{1, 1},
                new int[]{1, 1},
                new int[]{1, 1},
                new int[]{1, 1},
                new int[]{1, 1},
                new int[]{1, 1},
                new int[]{1, 1},
                new int[]{1, 1},
                new int[]{1, 1}
                 );
        assertEquals(20, game.score());
    }
    
    @Test
    void canScoreSpareFollowedByThree() {
        game.roll(
                new int[]{5, 5},
                new int[]{3, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0}
                 );
        assertEquals(16, game.score());
    }
    
    @Test
    void canScoreStrikeFollowedByThreeThenTree() {
        game.roll(
                new int[]{10},
                new int[]{3, 3},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0},
                new int[]{0, 0}
                 );
        assertEquals(22, game.score());
    }
    
    @Test
    void canScorePerfectGame() {
        game.roll(
                new int[]{10},
                new int[]{10},
                new int[]{10},
                new int[]{10},
                new int[]{10},
                new int[]{10},
                new int[]{10},
                new int[]{10},
                new int[]{10},
                new int[]{10},
                new int[]{10},
                new int[]{10}
                 );
        assertEquals(300, game.score());
    }
}
