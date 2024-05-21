import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoreSlither implements ActionListener {
    FileWriterR fr = new FileWriterR();
    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HEIGHT = 600;
    private int pointJ = fr.getAllPoints();
    private int pointD = fr.sizeAllPoints() - pointJ;
    private double percentage = (pointD + pointJ);
    private double percentageJ = pointJ / percentage * 100;
    private double percentageD = pointD / percentage * 100;

    JFrame frame = new JFrame();
    ImageIcon image = new ImageIcon("borderDvaA.png");
    JLabel border = new JLabel();
    JButton buttonBack = new JButton("Menu");
    JButton buttonScoreboard = new JButton("Score board");
    JLabel label = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();

    public ScoreSlither() {
        frame.setLocationRelativeTo(null);
        frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Score Slither");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);

        buttonBack.addActionListener(this);
        buttonBack.setBounds(320, 360, 120, 60);
        buttonBack.setFocusable(false);
        buttonBack.setBorder(null);
        buttonBack.setBackground(new Color(0, 173, 238, 255));
        buttonBack.setForeground(Color.black);

        buttonScoreboard.addActionListener(this);
        buttonScoreboard.setBounds(170, 360, 120, 60);
        buttonScoreboard.setFocusable(false);
        buttonScoreboard.setBorder(null);
        buttonScoreboard.setBackground(new Color(0, 173, 238, 255));
        buttonScoreboard.setForeground(Color.black);

        label.setText(("Počet výher prvního hráče: "+pointJ));
        label.setBounds(200,140,200,50);
        label.setBorder(null);
        label.setForeground(new Color(0, 173, 238, 255));
        label.setBackground(Color.black);
        frame.add(label);

        label2.setText(("Počet výher druhého hráče: " + pointD));
        label2.setBounds(200,190,200,50);
        label2.setBorder(null);
        label2.setForeground(new Color(0, 173, 238, 255));
        label2.setBackground(Color.black);
        frame.add(label2);

        label3.setText(("Procento výher prvního hráče: "+percentageJ +"%"));
        label3.setBounds(200,240,400,50);
        label3.setBorder(null);
        label3.setForeground(new Color(0, 173, 238, 255));
        label3.setBackground(Color.black);
        frame.add(label3);

        label4.setText(("Procento výher druhého hráče: "+percentageD +"%"));
        label4.setBounds(200,300,400,50);
        label4.setBorder(null);
        label4.setForeground(new Color(0, 173, 238, 255));
        label4.setBackground(Color.black);
        frame.add(label4);

        border.setSize(600, 600);
        border.setIcon(image);

        frame.add(buttonBack);
        frame.add(buttonScoreboard);
        frame.add(border);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(buttonBack)) {
            Menu m = new Menu();
            frame.dispose();
        }
        if (e.getSource().equals(buttonScoreboard)) {
            ScoreBoard sc = new ScoreBoard();
            frame.dispose();
        }
    }
}