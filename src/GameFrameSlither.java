import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GameFrameSlither extends JFrame implements ActionListener {
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
        panel2.menu.addActionListener(this);
        panel2.playAgain.addActionListener(this);
        panel2.rv.setVisible(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(panel2.menu)){
            panel2.bc.dispose();
            panel2.lv.dispose();
            panel2.rv.dispose();
            this.dispose();
            Menu menu = new Menu();
        }
        if (e.getSource().equals(panel2.playAgain)){
            panel2.bc.dispose();
            panel2.lv.dispose();
            panel2.rv.dispose();
            this.dispose();
            GameFrameSlither p = new GameFrameSlither();
        }
    }
}
