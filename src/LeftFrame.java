import javax.swing.*;

public class LeftFrame extends JFrame{
    JLabel jmeno2 = new JLabel("Name: ");
    JLabel score2 = new JLabel("Score: 0");
    public LeftFrame() {


        jmeno2.setBounds(40,20,100,60);


        score2.setBounds(40,50,100,60);

        this.setLocationRelativeTo(null);
        this.setSize(300,300);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("PlayerTwo");
        this.setResizable(false);
        this.add(jmeno2);
        this.add(score2);
        this.setLocation(200,100);
    }

    public void setScore2(int score2) {
        this.score2.setText("Score: " + score2);
    }
    public void setJmeno2(String jmeno2) {
        this.jmeno2.setText("Name: " + jmeno2);
    }
}

