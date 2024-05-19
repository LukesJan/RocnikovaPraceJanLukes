import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuSnake implements ActionListener {
    private static final int widthP = 600;
    private static final int heightP = 600;
    JFrame frame = new JFrame();
    ImageIcon image = new ImageIcon("borderDvaA.png");
    JLabel border = new JLabel();
    JButton start = new JButton("Start");
    JButton buttonBoard = new JButton("Score Board");
    JButton zpetButton = new JButton("Back");
    JTextField red = new JTextField();
    JTextField green = new JTextField();
    JTextField blue = new JTextField();
    JLabel redQ = new JLabel();
    JLabel greenQ = new JLabel();
    JLabel blueQ = new JLabel();
    JLabel nameASK = new JLabel("Enter your name:");
    JTextField nameField = new JTextField(20);
    public MenuSnake() {


        nameASK.setBounds(170, 160, 120, 40);
        nameASK.setForeground(new Color(0, 173, 238, 255));

        nameField.setBounds(320, 160, 100, 40);
        nameField.setBorder(null);
        nameField.setForeground(new Color(0, 173, 238, 255));
        nameField.setBackground(Color.black);
        nameField.setBorder(BorderFactory.createLineBorder(new Color(0, 173, 238, 255)));

        red.setBounds(210, 240,40, 20);
        red.setText("");
        red.setBorder(null);
        red.setForeground(new Color(0, 173, 238, 255));
        red.setBackground(Color.black);
        red.setBorder(BorderFactory.createLineBorder(new Color(0, 173, 238, 255)));

        green.setBounds(210, 300,40, 20);
        green.setText("");
        green.setBorder(null);
        green.setForeground(new Color(0, 173, 238, 255));
        green.setBackground(Color.black);
        green.setBorder(BorderFactory.createLineBorder(new Color(0, 173, 238, 255)));

        blue.setBounds(210, 360,40, 20);
        blue.setText("");
        blue.setBorder(null);
        blue.setForeground(new Color(0, 173, 238, 255));
        blue.setBackground(Color.black);
        blue.setBorder(BorderFactory.createLineBorder(new Color(0, 173, 238, 255)));

        redQ.setText("Red:");
        redQ.setBounds(160,240,40,20);
        redQ.setBorder(null);
        redQ.setForeground(new Color(0, 173, 238, 255));
        redQ.setBackground(Color.black);
        frame.add(redQ);

        greenQ.setText("Green:");
        greenQ.setBounds(160,300,40,20);
        greenQ.setBorder(null);
        greenQ.setForeground(new Color(0, 173, 238, 255));
        greenQ.setBackground(Color.black);
        frame.add(greenQ);

        blueQ.setText("Blue:");
        blueQ.setBounds(160,360,40,20);
        blueQ.setBorder(null);
        blueQ.setForeground(new Color(0, 173, 238, 255));
        blueQ.setBackground(Color.black);
        frame.add(blueQ);

        start.addActionListener(this);
        start.setBounds(300, 230, 120, 40);
        start.setFocusable(false);
        start.setBorder(null);
        start.setBackground(new Color(0, 173, 238, 255));
        start.setForeground(Color.black);

        buttonBoard.addActionListener(this);
        buttonBoard.setBounds(300, 290, 120, 40);
        buttonBoard.setFocusable(false);
        buttonBoard.setBorder(null);
        buttonBoard.setBackground(new Color(0, 173, 238, 255));
        buttonBoard.setForeground(Color.black);

        zpetButton.addActionListener(this);
        zpetButton.setBounds(300, 350, 120, 40);
        zpetButton.setFocusable(false);
        zpetButton.setBorder(null);
        zpetButton.setBackground(new Color(0, 173, 238, 255));
        zpetButton.setForeground(Color.black);

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
        frame.add(nameASK);
        frame.add(buttonBoard);
        frame.add(zpetButton);
        frame.add(red);
        frame.add(green);
        frame.add(blue);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.BLACK);

        frame.add(border);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(zpetButton)) {
            Menu m = new Menu();
            frame.dispose();
        }
        if (e.getSource().equals(buttonBoard)) {
            ScoreBoard scoreBoard = new ScoreBoard();
            frame.dispose();
        }
        if (e.getSource().equals(start)) {
            GameFrame f = new GameFrame();
            String nameP = nameField.getText();
            f.panel.bc.setJmeno(nameP);
            f.panel.lv.setVisible(false);
            if (!blue.getText().matches("\\d{3}")){
                f.panel.setBlue(120);
            } else {
                f.panel.setBlue(Integer.parseInt(blue.getText()));
            }
            if (!green.getText().matches("\\d{3}")){
                f.panel.setGreen(120);
            } else {
                f.panel.setGreen(Integer.parseInt(green.getText()));
            }
            if (!red.getText().matches("\\d{3}")){
                f.panel.setRed(120);
            } else {
                f.panel.setRed(Integer.parseInt(red.getText()));
            }
            frame.dispose();
        }
    }

}
