import static org.junit.jupiter.api.Assertions.*;

class FileWriterRTest {


    @org.junit.jupiter.api.Test
    void getMaxScore() {
        FileWriterR fr = new FileWriterR();
        assertEquals(fr.getAllScores().get(0), fr.getMaxScore());
    }
}