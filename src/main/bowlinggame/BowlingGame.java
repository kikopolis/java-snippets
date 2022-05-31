package main.bowlinggame;

public class BowlingGame {
    private int roll = 0;
    private final int[] rolls = new int[21];
    
    public int score() {
        int score  = 0;
        int cursor = 0;
        for (int frame = 0; frame < 10; frame++) {
            int roll1 = rolls[cursor];
            int roll2 = rolls[cursor + 1];
            if (isStrike(roll1)) { // STRIKE
                score += 10 + rolls[cursor + 1] + rolls[cursor + 2];
                cursor++;
            } else if (isSpare(roll1, roll2)) { // SPARE
                score += 10 + rolls[cursor + 2];
                cursor += 2;
            } else {
                score += roll1 + roll2;
                cursor += 2;
            }
        }
        return score;
    }
    
    /**
     * Add to the rolls total a single frame, which is two rolls.
     */
    public void roll(int[]... frames) {
        for (int[] frame : frames) {
            for (int pinsDown : frame) {
                rolls[roll++] = pinsDown;
            }
        }
    }
    
    private boolean isStrike(int roll1) {
        return roll1 == 10;
    }
    
    private boolean isSpare(int roll1, int roll2) {
        return roll1 + roll2 == 10;
    }
}
