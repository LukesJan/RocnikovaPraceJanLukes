import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Panel extends JPanel implements ActionListener {
    ScoreBoard sc = new ScoreBoard();
    RightFrame bc = new RightFrame();
    LeftFrame lv = new LeftFrame();
    Record rv = new Record();
    FileWriterR fr = new FileWriterR();
    static final int widthP = 600;
    static final int heightP = 600;
    static final int unitSize = 25;
    static final int unit = (widthP * heightP) / unitSize;
    static final int delay = 120;
    final int x[] = new int[unit];
    final int y[] = new int[unit];
    final int h[] = new int[unit];
    final int v[] = new int[unit];
    private int bodyParts = 1;
    private int applesEaten;
    private int bodyParts2 = 1;
    private int applesEaten2;
    private int appleX;
    private int appleY;
    private int red;
    private int green;
    private int blue;
    private int redSecond;
    private int greenSecond;
    private int blueSecond;
    private String direction = "";
    private String direction2 = "";
    boolean running = false;
    private boolean slither;
    private boolean pause;
    Timer timer;
    Random r;
    JButton button = new JButton();
    public Panel() {
        r = new Random();
        button.setBounds(200,0,200,100);
        this.setPreferredSize(new Dimension(widthP, heightP));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        timer = new Timer(delay, this);
        timer.start();
        startGame();
        sc.frame.setVisible(false);
    }

    public void setRed(int red) {
        if (red < 0 || red > 255) {
            this.red = 120;
        } else {
            this.red = red;
        }
    }

    public void setBlue(int blue) {
        if (blue < 0 || blue > 255) {
            this.blue = 120;
        } else {
            this.blue = blue;
        }
    }

    public void setGreen(int green) {
        if (green < 0 || green > 255) {
            this.green = 120;
        } else {
            this.green = green;
        }
    }

    public void setRedSecond(int redSecond) {
        if (redSecond < 0 || redSecond > 255) {
            this.redSecond = 120;
        } else {
            this.redSecond = redSecond;
        }
    }

    public void setBlueSecond(int blueSecond) {
        if (blueSecond < 0 || blueSecond > 255) {
            this.blueSecond = 120;
        } else {
            this.blueSecond = blueSecond;
        }
    }

    public void setGreenSecond(int greenSecond) {
        if (greenSecond < 0 || greenSecond > 255) {
            this.greenSecond = 120;
        } else {
            this.greenSecond = greenSecond;
        }
    }

    public void setSlither(boolean slither) {
        this.slither = slither;
    }

    public void startGame() {
        spawn();
        spawn2();
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
                    g.setColor(new Color(red, green, blue));
                    g.fillRect(x[i], y[i], unitSize, unitSize);
                }
            }
            if(slither) {
                for (int y = 0; y < bodyParts2; y++) {
                    if (y == 0) {
                        g.setColor(Color.blue);
                        g.fillRect(h[y], v[y], unitSize, unitSize);
                    } else {
                        g.setColor(new Color(redSecond, greenSecond, blueSecond));
                        g.fillRect(h[y], v[y], unitSize, unitSize);
                    }
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

    public void spawn2() {
        h[0] = r.nextInt((widthP / unitSize)) * unitSize;
        v[0] = r.nextInt((heightP / unitSize)) * unitSize;
    }

    public void newApple() {
        appleX = r.nextInt((widthP / unitSize)) * unitSize;
        appleY = r.nextInt((heightP / unitSize)) * unitSize;
    }
    public void paused(){
        pause =! pause;
        if (pause){
            timer.stop();
        }else{
            timer.start();
        }
        repaint();
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
            case "P", "p":
                paused();
        }
    }
    public void move2() {
        for (int y = bodyParts2; y > 0; y--) {
            h[y] = h[y - 1];
            v[y] = v[y - 1];
        }

        switch (direction2) {
            case "W", "w":
                v[0] = v[0] - unitSize;
                break;
            case "S" , "s":
                v[0] = v[0] + unitSize;
                break;
            case "D" , "d":
                h[0] = h[0] + unitSize;
                break;
            case "A" , "a":
                h[0] = h[0] - unitSize;
                break;
            case "P", "p":
                paused();
        }
    }
    public void checkApple() {
        if ((x[0] == appleX && y[0] == appleY)) {
            bodyParts++;
            applesEaten++;
            bc.setScore(applesEaten);
            lv.setScore2(applesEaten2);
            newApple();
        }
        if ((h[0] == appleX && v[0] == appleY)) {
            bodyParts2++;
            applesEaten2++;
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
                fr.write1v1(2);
            }
        }

    }

    public void checkCollisions2() {
        for (int y = bodyParts2; y > 0; y--) {
            if ((v[0] == v[y] && h[0] == h[y])) {
                running= false;
            }
        }
        if (h[0] < 0) {
            running = false;
        }
        if (h[0] >= widthP) {
            running = false;
        }
        if (v[0] >= heightP) {
            running = false;
        }
        if (v[0] < 0) {
            running = false;
        }
        if (!running) {
            timer.stop();
            if (slither){
                fr.write1v1(1);
            }
        }
    }
    public void checkCollisions3() {
        for (int z = bodyParts2+bodyParts; z > 0; z--) {
            if ((h[0] == x[z] && v[0] == y[z])) {
                running = false;
                fr.write1v1(2);
            }
            if ((x[0] == h[z] && y[0] == v[z])) {
                running = false;
                fr.write1v1(1);
            }
        }
        if (!running) {
            timer.stop();
        }
    }


    public void gameOver(Graphics g){
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free",Font.BOLD,75));
        FontMetrics met = getFontMetrics(g.getFont());
        g.drawString("Game Over", (widthP - met.stringWidth("Game Over"))/2, heightP /2);
        fr.writeScore(applesEaten);
        this.add(button);
    }
    public void checkWin(Graphics g){
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free",Font.BOLD,75));
        FontMetrics met = getFontMetrics(g.getFont());
        g.drawString("You Won", (widthP - met.stringWidth("You Won"))/2, heightP /2);
        this.add(button);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkApple();
            if (!direction.equalsIgnoreCase("")) {
                checkCollisions();
            }
            if(slither) {
                move2();
                if (!direction2.equalsIgnoreCase("")) {
                    checkCollisions2();
                }
                checkCollisions3();
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
                case KeyEvent.VK_A:
                    if (!direction2.equalsIgnoreCase("D")){
                        direction2 = "A";
                        break;
                    }
                case KeyEvent.VK_D:
                    if (!direction2.equalsIgnoreCase("A")){
                        direction2 = "D";
                        break;
                    }
                case KeyEvent.VK_W:
                    if (!direction2.equalsIgnoreCase("S")){
                        direction2 = "W";
                        break;
                    }
                case KeyEvent.VK_S:
                    if (!direction2.equalsIgnoreCase("W")){
                        direction2 = "S";
                        break;
                    }
                case KeyEvent.VK_P:
                    paused();
                    break;
            }
        }
    }
}

