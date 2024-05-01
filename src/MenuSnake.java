import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuSnake implements ActionListener {
    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HEIGHT = 600;

    JFrame frame = new JFrame();
    JButton start = new JButton("Start");
    JButton buttonBoard = new JButton("Score Boards");
    JButton backButton = new JButton("Back");
    JTextField red = new JTextField();
    JTextField green = new JTextField();
    JTextField blue = new JTextField();
    JLabel label = new JLabel("Enter your name");
    JTextField nameField = new JTextField(20);

    public MenuSnake() {


        label.setBounds(240, 30, 120, 40);

        nameField.setBounds(240, 100, 120, 60);
        red.setBounds(500, 100, 40, 20);

        green.setBounds(500, 250, 40, 20);

        blue.setBounds(500, 300, 40, 20);


        start.addActionListener(this);
        start.setBounds(240, 190, 120, 60);

        buttonBoard.addActionListener(this);
        buttonBoard.setBounds(240, 280, 120, 60);

        backButton.addActionListener(this);
        backButton.setBounds(240, 370, 120, 60);

        frame.setLocationRelativeTo(null);
        frame.setSize(SCREEN_HEIGHT, SCREEN_WIDTH);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Menu Snake");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(start);
        frame.add(nameField);
        frame.add(label);
        frame.add(buttonBoard);
        frame.add(backButton);
        frame.add(red);
        frame.add(green);
        frame.add(blue);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(backButton)) {
            Menu m = new Menu();
            frame.dispose();
        }
        if (e.getSource().equals(buttonBoard)) {
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

