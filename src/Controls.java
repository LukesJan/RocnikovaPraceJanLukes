import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controls implements ActionListener{
        private static final int widthP = 600;
        private static final int heightP = 600;
        ImageIcon image = new ImageIcon("borderDvaA.png");
        JLabel border = new JLabel();
        JFrame frame = new JFrame();
        JLabel pause = new JLabel("P: pause/run", SwingConstants.CENTER);
        JLabel p1= new JLabel("P1: ↑ ↓ ← →", SwingConstants.CENTER);
        JLabel p2 = new JLabel("P2: WSAD", SwingConstants.CENTER);
        JButton buttonBack = new JButton("Menu");

        public Controls() {

            pause.setBounds(240, 290, 120, 60);
            pause.setFocusable(false);
            pause.setBorder(null);
            pause.setForeground(new Color(0, 173, 238, 255));
            pause.setBackground(Color.black);


            p1.setBounds(240, 150, 120, 60);
            p1.setFocusable(false);
            p1.setBorder(null);
            p1.setForeground(new Color(0, 173, 238, 255));
            p1.setBackground(Color.black);


            p2.setBounds(240, 220, 120, 60);
            p2.setFocusable(false);
            p2.setBorder(null);
            p2.setForeground(new Color(0, 173, 238, 255));
            p2.setBackground(Color.black);

            buttonBack.addActionListener(this);
            buttonBack.setBounds(240, 360, 120, 60);
            buttonBack.setFocusable(false);
            buttonBack.setBorder(null);
            buttonBack.setBackground(new Color(0, 173, 238, 255));
            buttonBack.setForeground(Color.black);


            border.setSize(600, 600);
            border.setIcon(image);

            frame.setLocationRelativeTo(null);
            frame.setSize(widthP, heightP);
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setTitle("Controls");
            frame.setResizable(false);
            frame.setVisible(true);
            frame.add(pause);
            frame.add(p2);
            frame.add(buttonBack);
            frame.add(p1);
            frame.getContentPane().setBackground(Color.BLACK);
            frame.setLocationRelativeTo(null);

            frame.add(border);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(buttonBack)) {
                Menu m = new Menu();
                frame.dispose();
            }
        }
    }
