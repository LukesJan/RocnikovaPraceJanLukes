import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PanelTest {

    @Test
    void setRed() {
        Panel p = new Panel();
        p.setRed(5);
        assertEquals(5,p.getRed());
        p.setRed(-5);
        assertEquals(120,p.getRed());
    }
    @Test
    void startGame() {
        Panel p = new Panel();
        p.startGame();
        assertTrue(p.isRunning());
    }
    @Test
    void pause() {
        Panel p = new Panel();
        p.paused();
        assertTrue(p.isPause());
    }
}