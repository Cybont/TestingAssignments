package octobitz.cybonspace.bowling;

import octobitz.cybonspace.bowling.models.Game;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import junit.framework.TestCase;

@SpringBootTest

public class BowlingGameTest extends TestCase {
    private Game g;

    protected void setUp() throws Exception {
        g = new Game();
    }
    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    public void testAllOnes() throws Exception {
        int result = rollMany(20,1);
        assertEquals(result, g.score());
    }

    public void testOneSpare() throws Exception {
        rollSpare();
        g.roll(3);
        rollMany(17,0);
        assertEquals(16,g.score());
    }

    public void testOneStrike() throws Exception {
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);
        assertEquals(24, g.score());
    }

    public void testPerfectGame() throws Exception {
        int result = rollMany(12,10);
        assertEquals(result, g.score());
    }

    private void rollStrike() {
        g.roll(10);
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

    private int rollMany(int i, int i1) {
        for (int j = 0; j < i1; j++) {
            g.roll(10);
        }
        return g.score();
    }
}




