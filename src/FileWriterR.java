import java.io.*;
import java.util.*;

public class FileWriterR {
    private static final String leadFile = "Lead.txt";
    private static final String rateFile = "1v1Rate.txt";
    private int oneW = 0;
    public void writeScore(int score) {
        try (FileWriter fw = new FileWriter(leadFile, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(score);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int getMaxScore() {
        int maxScore = Integer.MIN_VALUE;
        try (Scanner scanner = new Scanner(new File(leadFile))) {
            while (scanner.hasNextInt()) {
                int currentScore = scanner.nextInt();
                if (currentScore > maxScore) {
                    maxScore = currentScore;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return maxScore;
    }
    public List<Integer> getAllScores() {
        List<Integer> allScores = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(leadFile))) {
            while (scanner.hasNextInt()) {
                int currentScore = scanner.nextInt();
                allScores.add(currentScore);
                Collections.sort(allScores, Comparator.reverseOrder());

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return allScores.subList(0,5);
    }
    public void write1v1(int point) {
        try (FileWriter fw = new FileWriter(rateFile, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(point);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private List<Integer> allPoints = new ArrayList<>();
    public int sizeAllPoints(){
        return allPoints.size();
    }
    public int getAllPoints() {
        try (Scanner scanner = new Scanner(new File(rateFile))) {
            while (scanner.hasNextInt()) {
                int currentPoint = scanner.nextInt();
                allPoints.add(currentPoint);
                if (currentPoint == 1){
                    oneW++;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return oneW;
    }
}

