import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoreBoard implements ActionListener {
    private static final int widthP = 600;
    private static final int heightP = 600;
    ImageIcon image = new ImageIcon("borderDvaA.png");
    JLabel border = new JLabel();
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
        buttonBack.setBounds(300,300,120,60);
        buttonBack.setFocusable(false);
        buttonBack.setBorder(null);
        buttonBack.setBackground(new Color(0, 173, 238, 255));
        buttonBack.setForeground(Color.black);

        buttonSlither.addActionListener(this);
        buttonSlither.setBounds(300,200,120,60);
        buttonSlither.setFocusable(false);
        buttonSlither.setBorder(null);
        buttonSlither.setBackground(new Color(0, 173, 238, 255));
        buttonSlither.setForeground(Color.black);

        label.setText((1+ ") " + fr.getAllScores().get(0)) + "\uD83D\uDC51");
        label.setBounds(200,140,200,50);
        label.setBorder(null);
        label.setForeground(new Color(0, 173, 238, 255));
        label.setBackground(Color.black);
        frame.add(label);

        label2.setText((2 +") "+fr.getAllScores().get(1)));
        label2.setBounds(200,200,200,50);
        label2.setBorder(null);
        label2.setForeground(new Color(0, 173, 238, 255));
        label2.setBackground(Color.black);
        frame.add(label2);

        label3.setText((3+") "+fr.getAllScores().get(2)));
        label3.setBounds(200,260,200,50);
        label3.setBorder(null);
        label3.setForeground(new Color(0, 173, 238, 255));
        label3.setBackground(Color.black);
        frame.add(label3);

        label4.setText((4+") "+fr.getAllScores().get(3)));
        label4.setBounds(200,320,200,50);
        label4.setBorder(null);
        label4.setForeground(new Color(0, 173, 238, 255));
        label4.setBackground(Color.black);
        frame.add(label4);

        label5.setText((5+") "+fr.getAllScores().get(4)));
        label5.setBounds(200,380,200,50);
        label5.setBorder(null);
        label5.setForeground(new Color(0, 173, 238, 255));
        label5.setBackground(Color.black);
        frame.add(label5);

        border.setSize(600, 600);
        border.setIcon(image);

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
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);

        frame.add(border);
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



