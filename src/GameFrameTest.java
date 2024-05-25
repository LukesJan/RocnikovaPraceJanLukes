import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameFrameTest {
    @Test
    void testInitialize() {
        GameFrame gameFrame = new GameFrame();
        assertNotNull(gameFrame);
    }

    @Test
    void testFrameTitle() {
        GameFrame gameFrame = new GameFrame();
        assertEquals("Snake", gameFrame.getTitle());
    }
}