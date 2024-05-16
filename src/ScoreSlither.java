import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoreSlither implements ActionListener{
    FileWriterR fr = new FileWriterR();
    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HEIGHT = 600;
    private int pointJ = fr.getAllPoints();
    private int pointD = fr.sizeAllPoints() - pointJ;
    private double percentage = (pointD+pointJ);
    private double percentageJ = pointJ / percentage * 100;
    private double percentageD = pointD / percentage * 100;

    JFrame frame = new JFrame();
    JButton buttonBack = new JButton("Menu");
    JButton buttonScoreboard = new JButton("Score board");
    JLabel label = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();


    public ScoreSlither() {
        buttonBack.addActionListener(this);
        buttonBack.setBounds(240,350,120,60);
        buttonScoreboard.addActionListener(this);
        buttonScoreboard.setBounds(240,200,120,60);
        frame.setLocationRelativeTo(null);
        frame.setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Score Slither");
        frame.setResizable(false);
        frame.setVisible(true);
        label.setText(String.valueOf(pointJ));
        label.setBounds(100,100,20,50);
        frame.add(label);
        label2.setText(String.valueOf(pointD));
        label2.setBounds(100,160,20,50);
        frame.add(label2);
        label3.setText(String.valueOf(percentageJ));
        label3.setBounds(100,220,200,50);
        frame.add(label3);
        label4.setText(String.valueOf(percentageD));
        label4.setBounds(150,100,200,50);
        frame.add(label4);
        frame.add(buttonBack);
        frame.add(buttonScoreboard);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(buttonBack)){
            Menu m = new Menu();
            frame.dispose();
        }
        if (e.getSource().equals(buttonScoreboard)){
            ScoreBoard sc = new ScoreBoard();
            frame.dispose();
        }
    }
}
