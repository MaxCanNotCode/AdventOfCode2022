import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String inp = args[0];
        System.out.println(read(inp));
    }

    private static int read(String inp) throws IOException {
        int score = 0;
        String helperLine;
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(inp));
        while ((helperLine = reader.readLine()) != null) {
            String[] sArr = helperLine.split("[,-]");
            if(check(sArr)){
                score++;
            }
        }
        return score;
    }

    private static boolean check(String[] sArr) {
        int aStart = Integer.parseInt(sArr[0]);
        int aEnd = Integer.parseInt(sArr[1]);
        int bStart = Integer.parseInt(sArr[2]);
        int bEnd = Integer.parseInt(sArr[3]);

        return (aStart >= bStart && aStart <= bEnd) || (bStart >= aStart && bStart <= aEnd) || (bEnd >= aStart && bEnd <= aEnd) ||(aEnd >= bStart && aEnd <= bEnd);
    }
}