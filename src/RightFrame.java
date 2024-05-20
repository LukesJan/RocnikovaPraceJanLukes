import javax.swing.*;
import java.awt.*;

public class RightFrame extends JFrame {
    ImageIcon image = new ImageIcon("borderJuniorA.png");
    JLabel border = new JLabel();
    JLabel jmeno = new JLabel("Name: ");
    JLabel score = new JLabel("Score: 0");

    public RightFrame() {
        jmeno.setBounds(100, 90, 100, 60);
        jmeno.setBorder(null);
        jmeno.setForeground(new Color(0, 173, 238, 255));
        jmeno.setBackground(Color.black);

        score.setBounds(100, 140, 100, 60);
        score.setBorder(null);
        score.setForeground(new Color(0, 173, 238, 255));
        score.setBackground(Color.black);
        this.setLocationRelativeTo(null);
        this.setSize(300, 300);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("PlyerOne");
        this.setResizable(false);
        this.add(jmeno);
        this.add(score);
        this.getContentPane().setBackground(Color.BLACK);
        border.setSize(300, 300);
        border.setIcon(image);
        this.add(border);
        this.setLocation(1500, 100);

    }

    public void setScore(int score) {
        this.score.setText("Score: " + score);
    }

    public void setJmeno(String jmeno) {
        this.jmeno.setText("Name: " + jmeno);
    }
}
