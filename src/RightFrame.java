import javax.swing.*;

public class RightFrame extends JFrame {
    JLabel jmeno = new JLabel("Name: ");
    JLabel score = new JLabel("Score: 0");
    public RightFrame() {
        jmeno.setBounds(40,20,100,60);
        score.setBounds(40,50,100,60);
        this.setLocationRelativeTo(null);
        this.setSize(300,300);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("PlyerOne");
        this.setResizable(false);
        this.add(jmeno);
        this.add(score);
        this.setLocation(1500,100);

    }

    public void setScore(int score) {
        this.score.setText("Score: " + score);
    }
    public void setJmeno(String jmeno) {
        this.jmeno.setText("Name: " + jmeno);
    }
}

