import javax.swing.*;

public class Record extends JFrame {
    FileWriterR fr = new FileWriterR();
    JLabel record = new JLabel();

    public Record () {
        record.setBounds(40,50,100,60);
        record.setText("Record: " +  fr.getMaxScore());
        this.setLocationRelativeTo(null);
        this.setSize(300,300);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Record");
        this.setResizable(false);
        this.add(record);
        this.setLocation(100,100);

    }
}

