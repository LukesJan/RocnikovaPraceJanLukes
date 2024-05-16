import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu implements ActionListener {
    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HEIGHT = 600;

    JFrame frame = new JFrame();
    JButton start = new JButton("Snake");
    JButton buttonSlither = new JButton("Score Slither");
    JButton buttonBoard = new JButton("Score Boards");
    JButton button2v2 = new JButton("Slither.io");
    public Menu() {

        start.addActionListener(this);
        start.setBounds(240,75,120,60);

        buttonSlither.addActionListener(this);
        buttonSlither.setBounds(240,150,120,60);

        buttonBoard.addActionListener(this);
        buttonBoard.setBounds(240,250,120,60);

        button2v2.addActionListener(this);
        button2v2.setBounds(240,350,120,60);


        frame.setLocationRelativeTo(null);
        frame.setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Menu");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(start);
        frame.add(buttonBoard);
        frame.add(button2v2);
        frame.add(buttonSlither);
        frame.setLocation(500,300);


    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(start)){
            MenuSnake mh = new MenuSnake();
            frame.dispose();

        }
        if (e.getSource().equals(buttonSlither)){
            ScoreSlither sl = new ScoreSlither();
            frame.dispose();
        }
        if (e.getSource().equals(buttonBoard)){
            ScoreBoard scoreBoard = new ScoreBoard();
            frame.dispose();
        }
        if (e.getSource().equals(button2v2)){
            MenuSlither m2 = new MenuSlither();
            frame.dispose();
        }
    }
}






