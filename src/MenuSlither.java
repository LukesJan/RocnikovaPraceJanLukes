import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuSlither implements ActionListener {
    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HEIGHT = 600;

    JFrame frame = new JFrame();
    JButton start = new JButton("Start");
    JButton buttonBoard = new JButton("Score Boards");
    JButton backButton = new JButton("Back");
    JLabel label = new JLabel("Choose your names");
    JTextField red = new JTextField();
    JTextField green = new JTextField();
    JTextField blue = new JTextField();
    JTextField red2 = new JTextField();
    JTextField green2 = new JTextField();
    JTextField blue2 = new JTextField();
    JTextField name = new JTextField(50);
    JTextField name2 = new JTextField(50);

    public MenuSlither() {


        label.setBounds(240, 30, 250, 40);

        name.setBounds(120, 100, 120, 60);
        name2.setBounds(320, 100, 120, 60);

        start.addActionListener(this);
        start.setBounds(240, 190, 120, 60);

        red.setBounds(500, 100, 40, 20);

        green.setBounds(500, 250, 40, 20);

        blue.setBounds(500, 300, 40, 20);

        red2.setBounds(100, 100, 40, 20);

        green2.setBounds(100, 250, 40, 20);

        blue2.setBounds(100, 300, 40, 20);

        buttonBoard.addActionListener(this);
        buttonBoard.setBounds(240, 280, 120, 60);

        backButton.addActionListener(this);
        backButton.setBounds(240, 370, 120, 60);


        frame.setLocationRelativeTo(null);
        frame.setSize(SCREEN_HEIGHT, SCREEN_WIDTH);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Menu Slither");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(start);
        frame.add(name);
        frame.add(label);
        frame.add(buttonBoard);
        frame.add(name2);
        frame.add(backButton);
        frame.add(red);
        frame.add(green);
        frame.add(blue);
        frame.add(red2);
        frame.add(green2);
        frame.add(blue2);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(backButton)) {
            Menu m = new Menu();
            frame.dispose();

        }
        if (e.getSource().equals(start)) {
            GameFrameSlither f = new GameFrameSlither();
            String names = name.getText();
            String names2 = name2.getText();
            System.out.println(names);
            System.out.println(names2);
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
                f.panel2.setBlueSecond(120);
            } else {
                f.panel2.setBlue(Integer.parseInt(blue2.getText()));
            }
            if (!green2.getText().matches("\\d{3}")){
                f.panel2.setGreenSecond(120);
            } else {
                f.panel2.setGreen(Integer.parseInt(green2.getText()));
            }
            if (!red2.getText().matches("\\d{3}")){
                f.panel2.setRedSecond(120);
            } else {
                f.panel2.setRed(Integer.parseInt(red2.getText()));
            }
            frame.dispose();
        }
    }
}

