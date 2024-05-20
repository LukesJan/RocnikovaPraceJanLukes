import javax.swing.*;
import java.awt.*;

public class Record extends JFrame {
    FileWriterR fr = new FileWriterR();
    JLabel record = new JLabel();
    ImageIcon image = new ImageIcon("borderJuniorA.png");
    JLabel border = new JLabel();

    public Record () {
        record.setBounds(100,120,100,60);
        record.setText("Record: " +  fr.getMaxScore());
        record.setBorder(null);
        record.setForeground(new Color(0, 173, 238, 255));
        record.setBackground(Color.black);

        this.setLocationRelativeTo(null);
        this.setSize(300,300);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Record");
        this.setResizable(false);
        this.add(record);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLocation(180,100);

        border.setSize(300, 300);
        border.setIcon(image);
        this.add(border);
    }
}
