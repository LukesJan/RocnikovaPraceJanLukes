import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu implements ActionListener {
    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HEIGHT = 600;

    JFrame frame = new JFrame();
    JButton start = new JButton("Snake");
    JButton button2v2 = new JButton("Slither.io");
    public Menu() {

        start.addActionListener(this);
        start.setBounds(240,200,120,60);

        button2v2.addActionListener(this);
        button2v2.setBounds(240,280,120,60);


        frame.setLocationRelativeTo(null);
        frame.setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Menu");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(start);
        frame.add(button2v2);
        frame.setLocation(500,300);


    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(start)){
            GameFrame f = new GameFrame();
            frame.dispose();

        }

        if (e.getSource().equals(button2v2)){

            frame.dispose();
        }
    }
}



