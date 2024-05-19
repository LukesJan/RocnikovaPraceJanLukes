import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoreBoard implements ActionListener {

    private static final int widthP = 600;
    private static final int heightP = 600;
    FileWriterR fr = new FileWriterR();
    JFrame frame = new JFrame();
    JButton buttonBack = new JButton("Menu");
    JButton buttonSlither = new JButton("Score Slither");
    JLabel label = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();

    public ScoreBoard() {
        buttonBack.addActionListener(this);
        buttonBack.setBounds(240,350,120,60);
        buttonSlither.addActionListener(this);
        buttonSlither.setBounds(240,200,120,60);
        frame.setLocationRelativeTo(null);
        frame.setSize(widthP, heightP);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Scoreboard");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(buttonBack);
        frame.add(buttonSlither);
        label.setText(String.valueOf(fr.getAllScores().get(0)));
        label.setBounds(100,100,200,50);
        frame.add(label);
        label2.setText(String.valueOf(fr.getAllScores().get(1)));
        label2.setBounds(100,160,200,50);
        frame.add(label2);
        label3.setText(String.valueOf(fr.getAllScores().get(2)));
        label3.setBounds(100,220,200,50);
        frame.add(label3);
        label4.setText(String.valueOf(fr.getAllScores().get(3)));
        label4.setBounds(100,280,200,50);
        frame.add(label4);
        label5.setText(String.valueOf(fr.getAllScores().get(4)));
        label5.setBounds(100,340,200,50);
        frame.add(label5);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(buttonBack)){
            Menu m = new Menu();
            frame.dispose();
        }
        if (e.getSource().equals(buttonSlither)){
            ScoreSlither sc = new ScoreSlither();
            frame.dispose();
        }
    }
}




