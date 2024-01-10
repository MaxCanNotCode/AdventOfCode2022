import java.io.*;
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
            char [] tup = helperLine.toCharArray();
            score = score + calc(tup[0], tup[2]);
        }
        return score;
    }

    private static int calc(char opp, char me) {
        int score;
        if(opp=='A'){
            if(me=='X'){
                score = 3;
            } else if (me == 'Y') {
                score = 3 + 1;
            } else {
                score = 6 + 2;
            }
        } else if (opp=='B') {
            if(me=='X'){
                score = 1;
            } else if (me == 'Y') {
                score = 3 +2;
            } else {
                score = 6+ 3;
            }
        } else {
            if(me=='X'){
                score = 2;
            } else if (me == 'Y') {
                score = 3 + 3;
            } else {
                score = 6+1;
            }
        }
        return score;
    }
}