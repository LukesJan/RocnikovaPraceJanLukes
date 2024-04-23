import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrameSlither extends JFrame {
    Panel panel2 = new Panel();
    GameFrameSlither(){
        this.add(panel2);
        this.setTitle("Slither.io");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        panel2.setSlither(true);

    }
}

