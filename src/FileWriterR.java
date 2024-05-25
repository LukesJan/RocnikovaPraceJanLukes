import java.io.*;
import java.util.*;

public class FileWriterR {
    private static final String leadFile = "Lead.txt";
    private static final String rateFile = "1v1Rate.txt";
    private int oneW = 0;

    /**
     * in this metod we write score in to file
     * @param score score from panel (applesEaten)
     */
    public void writeScore(int score) {
        try (FileWriter fw = new FileWriter(leadFile, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(score);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * in this metod we search the file and compare current score with the on from file
     * if current > maxScore the current = maxscore
     */
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
    /**
     * in this metod we add data from file to List and the sort it from high scores to low scores and return subList of 5 elements
     */
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
    /**
     * in this metod we write score in to file
     * @param point score from panel
     */
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
    /**
     * in this metod we get List size
     */
    public int sizeAllPoints(){
        return allPoints.size();
    }
    /**
     * in this metod we add data from file to List and if the number is 1 then oneW+1 and this is number o ones
     * return is oneW
     */
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

