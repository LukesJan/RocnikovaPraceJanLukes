import javax.swing.*;
import java.awt.*;

public class LeftFrame extends JFrame{
    ImageIcon image = new ImageIcon("borderJuniorA.png");
    JLabel border = new JLabel();
    JLabel jmeno2 = new JLabel("Name: ");
    JLabel score2 = new JLabel("Score: 0");
    public LeftFrame() {
        jmeno2.setBounds(100,90,100,60);
        jmeno2.setBorder(null);
        jmeno2.setForeground(new Color(0, 173, 238, 255));
        jmeno2.setBackground(Color.black);

        score2.setBounds(100,140,100,60);
        score2.setBorder(null);
        score2.setForeground(new Color(0, 173, 238, 255));
        score2.setBackground(Color.black);


        this.setLocationRelativeTo(null);
        this.setSize(300,300);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("PlayerTwo");
        this.setResizable(false);
        this.add(jmeno2);
        this.add(score2);
        this.setLocation(200,100);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLocation(180,100);
        border.setSize(300, 300);
        border.setIcon(image);
        this.add(border);
    }

    public void setScore2(int score2) {
        this.score2.setText("Score: " + score2);
    }
    public void setJmeno2(String jmeno2) {
        this.jmeno2.setText("Name: " + jmeno2);
    }
}
