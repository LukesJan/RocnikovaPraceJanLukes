import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GameFrame extends JFrame implements ActionListener {
    Panel panel = new Panel();
    GameFrame() {
        this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        panel.setSlither(false);
        panel.button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(panel.button)) {
            panel.bc.dispose();
            panel.rv.dispose();
            panel.lv.dispose();
            this.dispose();
            Menu menu = new Menu();
        }
    }
}
