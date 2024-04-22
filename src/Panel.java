import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Panel extends JPanel implements ActionListener {
    static final int widthP = 600;
    static final int heightP = 600;
    static final int unitSize = 25;
    static final int unit = (widthP * heightP) / unitSize;
    static final int delay = 120;
    final int x[] = new int[unit];
    final int y[] = new int[unit];
    private int bodyParts = 1;
    private int applesEaten;
    private int appleX;
    private int appleY;
    private String direction = "";
    boolean running = false;
    private boolean slither;
    private boolean pause;
    Timer timer;
    Random r;
    public Panel() {
        r = new Random();
        this.setPreferredSize(new Dimension(widthP, heightP));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        timer = new Timer(delay, this);
        timer.start();
        startGame();
    }

    public void setSlither(boolean slither) {
        this.slither = slither;
    }

    public void startGame() {
        spawn();
        newApple();
        running = true;
        pause = false;

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g) {
        if (running) {
            for (int i = 0; i < heightP / unitSize; i++) {
                g.drawLine(i * unitSize, 0, i * unitSize, heightP);
                g.drawLine(0, i * unitSize, i * widthP, i * unitSize);
            }
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, unitSize, unitSize);

            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], unitSize, unitSize);
                } else {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], unitSize, unitSize);
                }
            }
        } else if (applesEaten == 24 * 24 - 1) {
            checkWin(g);
        } else {
            gameOver(g);
        }
    }

    public void spawn() {
        x[0] = r.nextInt((widthP / unitSize)) * unitSize;
        y[0] = r.nextInt((heightP / unitSize)) * unitSize;
    }
    public void newApple() {
        appleX = r.nextInt((widthP / unitSize)) * unitSize;
        appleY = r.nextInt((heightP / unitSize)) * unitSize;
    }
    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        switch (direction) {
            case "U":
                y[0] = y[0] - unitSize;
                break;
            case "DD":
                y[0] = y[0] + unitSize;
                break;
            case "R":
                x[0] = x[0] + unitSize;
                break;
            case "L":
                x[0] = x[0] - unitSize;
                break;
        }
    }
    public void checkApple() {
        if ((x[0] == appleX && y[0] == appleY)) {
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }

    public void checkCollisions() {
        for (int i = bodyParts; i > 0 ; i--) {
            if ((x[0] == x[i] && y[0] == y[i])){
                running = false;
            }
        }
        if (x[0] < 0) {
            running = false;
        }
        if (x[0] >= widthP) {
            running = false;
        }
        if (y[0] >= heightP) {
            running = false;
        }
        if (y[0] < 0) {
            running = false;
        }
        if (!running) {
            timer.stop();
            if (slither){
            }
        }

    }
    public void gameOver(Graphics g){
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free",Font.BOLD,75));
        FontMetrics met = getFontMetrics(g.getFont());
        g.drawString("Game Over", (widthP - met.stringWidth("Game Over"))/2, heightP /2);
    }
    public void checkWin(Graphics g){
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free",Font.BOLD,75));
        FontMetrics met = getFontMetrics(g.getFont());
        g.drawString("You Won", (widthP - met.stringWidth("You Won"))/2, heightP /2);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkApple();
            if (!direction.equalsIgnoreCase("")) {
                checkCollisions();
            }
        }
        repaint();
    }
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (!direction.equalsIgnoreCase("R")) {
                        direction = "L";
                        break;
                    }
                case KeyEvent.VK_RIGHT:
                    if (!direction.equalsIgnoreCase("L")) {
                        direction = "R";
                        break;
                    }
                case KeyEvent.VK_UP:
                    if (!direction.equalsIgnoreCase("DD")) {
                        direction = "U";
                        break;
                    }
                case KeyEvent.VK_DOWN:
                    if (!direction.equalsIgnoreCase("U")) {
                        direction = "DD";
                        break;
                    }
            }
        }
    }
}


