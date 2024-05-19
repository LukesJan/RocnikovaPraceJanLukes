import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu implements ActionListener {
    private static final int widthP = 600;
    private static final int heightP = 600;
    ImageIcon image = new ImageIcon("borderDvaA.png");
    JLabel border = new JLabel();
    JFrame frame = new JFrame();
    JButton start = new JButton("Snake");
    JButton buttonSlither = new JButton("Score Slither");
    JButton buttonBoard = new JButton("Score Boards");
    JButton button2v2 = new JButton("Slither.io");

    public Menu() {

        start.addActionListener(this);
        start.setBounds(170, 210, 120, 60);
        start.setFocusable(false);
        start.setBorder(null);
        start.setBackground(new Color(0, 173, 238, 255));
        start.setForeground(Color.black);

        buttonSlither.addActionListener(this);
        buttonSlither.setBounds(320, 330, 120, 60);
        buttonSlither.setFocusable(false);
        buttonSlither.setBorder(null);
        buttonSlither.setBackground(new Color(0, 173, 238, 255));
        buttonSlither.setForeground(Color.black);

        buttonBoard.addActionListener(this);
        buttonBoard.setBounds(170, 330, 120, 60);
        buttonBoard.setFocusable(false);
        buttonBoard.setBorder(null);
        buttonBoard.setBackground(new Color(0, 173, 238, 255));
        buttonBoard.setForeground(Color.black);

        button2v2.addActionListener(this);
        button2v2.setBounds(320, 210, 120, 60);
        button2v2.setFocusable(false);
        button2v2.setBorder(null);
        button2v2.setBackground(new Color(0, 173, 238, 255));
        button2v2.setForeground(Color.black);


        border.setSize(600, 600);
        border.setIcon(image);

        frame.setLocationRelativeTo(null);
        frame.setSize(widthP, heightP);
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
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);

        frame.add(border);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(start)) {
            MenuSnake mh = new MenuSnake();
            frame.dispose();

        }
        if (e.getSource().equals(buttonSlither)) {
            ScoreSlither sl = new ScoreSlither();
            frame.dispose();
        }
        if (e.getSource().equals(buttonBoard)) {
            ScoreBoard scoreBoard = new ScoreBoard();
            frame.dispose();
        }
        if (e.getSource().equals(button2v2)) {
            MenuSlither m2 = new MenuSlither();
            frame.dispose();
        }
    }
}


