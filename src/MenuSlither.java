import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuSlither implements ActionListener {
    private static final int widthP = 600;
    private static final int heightP = 600 ;
    ImageIcon image = new ImageIcon("borderDvaA.png");
    JLabel border = new JLabel();
    JFrame frame = new JFrame();
    JButton start = new JButton("Start");
    JButton buttonBoard = new JButton("Score Boards");
    JButton backButton = new JButton("Back");
    JLabel nameASK = new JLabel("Enter your names:");
    JTextField red = new JTextField();
    JTextField green = new JTextField();
    JTextField blue = new JTextField();
    JTextField red2 = new JTextField();
    JTextField green2 = new JTextField();
    JTextField blue2 = new JTextField();
    JTextField nameField = new JTextField(50);
    JTextField nameField2 = new JTextField(50);
    public MenuSlither() {
        nameASK.setBounds(170, 160, 120, 40);
        nameASK.setForeground(new Color(0, 173, 238, 255));

        nameField.setBounds(320, 150, 100, 30);
        nameField.setBorder(null);
        nameField.setForeground(new Color(0, 173, 238, 255));
        nameField.setBackground(Color.black);
        nameField.setBorder(BorderFactory.createLineBorder(new Color(0, 173, 238, 255)));

        nameField2.setBounds(320, 190, 100, 30);
        nameField2.setBorder(null);
        nameField2.setForeground(new Color(0, 173, 238, 255));
        nameField2.setBackground(Color.black);
        nameField2.setBorder(BorderFactory.createLineBorder(new Color(0, 173, 238, 255)));

        red.setBounds(300, 240,40, 20);
        red.setText("RedP1");
        red.setBorder(null);
        red.setForeground(new Color(0, 173, 238, 255));
        red.setBackground(Color.black);
        red.setBorder(BorderFactory.createLineBorder(new Color(0, 173, 238, 255)));

        green.setBounds(300, 300,40, 20);
        green.setText("GreenP1");
        green.setBorder(null);
        green.setForeground(new Color(0, 173, 238, 255));
        green.setBackground(Color.black);
        green.setBorder(BorderFactory.createLineBorder(new Color(0, 173, 238, 255)));

        blue.setBounds(300, 360,40, 20);
        blue.setText("BlueP1");
        blue.setBorder(null);
        blue.setForeground(new Color(0, 173, 238, 255));
        blue.setBackground(Color.black);
        blue.setBorder(BorderFactory.createLineBorder(new Color(0, 173, 238, 255)));

        red2.setBounds(370, 240,40, 20);
        red2.setText("RedP2");
        red2.setBorder(null);
        red2.setForeground(new Color(0, 173, 238, 255));
        red2.setBackground(Color.black);
        red2.setBorder(BorderFactory.createLineBorder(new Color(0, 173, 238, 255)));

        green2.setBounds(370, 300,40, 20);
        green2.setText("GreenP2");
        green2.setBorder(null);
        green2.setForeground(new Color(0, 173, 238, 255));
        green2.setBackground(Color.black);
        green2.setBorder(BorderFactory.createLineBorder(new Color(0, 173, 238, 255)));

        blue2.setBounds(370, 360,40, 20);
        blue2.setText("BlueP2");
        blue2.setBorder(null);
        blue2.setForeground(new Color(0, 173, 238, 255));
        blue2.setBackground(Color.black);
        blue2.setBorder(BorderFactory.createLineBorder(new Color(0, 173, 238, 255)));

        start.addActionListener(this);
        start.setBounds(170, 230, 120, 40);
        start.setFocusable(false);
        start.setBorder(null);
        start.setBackground(new Color(0, 173, 238, 255));
        start.setForeground(Color.black);

        buttonBoard.addActionListener(this);
        buttonBoard.setBounds(170, 290, 120, 40);
        buttonBoard.setFocusable(false);
        buttonBoard.setBorder(null);
        buttonBoard.setBackground(new Color(0, 173, 238, 255));
        buttonBoard.setForeground(Color.black);

        backButton.addActionListener(this);
        backButton.setBounds(170, 350, 120, 40);
        backButton.setFocusable(false);
        backButton.setBorder(null);
        backButton.setBackground(new Color(0, 173, 238, 255));
        backButton.setForeground(Color.black);

        border.setSize(600, 600);
        border.setIcon(image);

        frame.setLocationRelativeTo(null);
        frame.setSize(widthP, heightP);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Menu Snake");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(start);
        frame.add(nameField);
        frame.add(nameField2);
        frame.add(nameASK);
        frame.add(buttonBoard);
        frame.add(backButton);
        frame.add(red);
        frame.add(green);
        frame.add(blue);
        frame.add(red2);
        frame.add(green2);
        frame.add(blue2);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.BLACK);

        frame.add(border);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(backButton)) {
            Menu m = new Menu();
            frame.dispose();
        }
        if (e.getSource().equals(buttonBoard)) {
            ScoreSlither scoreBoard = new ScoreSlither();
            frame.dispose();
        }
        if (e.getSource().equals(start)) {
            GameFrameSlither f = new GameFrameSlither();
            String names = nameField.getText();
            String names2 = nameField2.getText();
            f.panel2.rv.setVisible(false);
            f.panel2.bc.setJmeno(names);
            f.panel2.lv.setJmeno2(names2);
            if (!blue.getText().matches("\\d{3}")){
                f.panel2.setBlue(120);
            } else {
                f.panel2.setBlue(Integer.parseInt(blue.getText()));
            }
            if (!green.getText().matches("\\d{3}")){
                f.panel2.setGreen(120);
            } else {
                f.panel2.setGreen(Integer.parseInt(green.getText()));
            }
            if (!red.getText().matches("\\d{3}")){
                f.panel2.setRed(120);
            } else {
                f.panel2.setRed(Integer.parseInt(red.getText()));
            }
            if (!blue2.getText().matches("\\d{3}")){
                f.panel2.setBlueSecond(240);
            } else {
                f.panel2.setBlue(Integer.parseInt(blue2.getText()));
            }
            if (!green2.getText().matches("\\d{3}")){
                f.panel2.setGreenSecond(240);
            } else {
                f.panel2.setGreen(Integer.parseInt(green2.getText()));
            }
            if (!red2.getText().matches("\\d{3}")){
                f.panel2.setRedSecond(240);
            } else {
                f.panel2.setRed(Integer.parseInt(red2.getText()));
            }
            frame.dispose();
        }
    }
}
