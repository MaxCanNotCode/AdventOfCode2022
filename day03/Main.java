import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String inp = args[0];
        System.out.println(read(inp));
    }

    private static int read(String inp) throws IOException {
        int score;
        int count = 0;
        ArrayList<char[]> c3L = new ArrayList<>();
        ArrayList<Character> cList = new ArrayList<Character>();
        String helperLine;
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(inp));
        while ((helperLine = reader.readLine()) != null) {
            if (count ==3){
                count = 0;
                char [] tmp = check(c3L.get(0), c3L.get(1));
                tmp = check(c3L.get(2), tmp);
                cList.add(tmp[0]);
                c3L.clear();
            }
            char [] cArr = helperLine.toCharArray();
            c3L.add(cArr);
            count++;
        }
        char [] tmp = check(c3L.get(0), c3L.get(1));
        tmp = check(c3L.get(2), tmp);
        cList.add(tmp[0]);
        score = toNum(cList);
        return score;
    }

    private static char[] check(char[] c1, char[] c2) {
        ArrayList<Character> cTl = new ArrayList<Character>();
        for(int i = 0; i< c1.length; i++){
            for (int j=0; j<c2.length; j++){
                if (c1[i]==c2[j]){
                    cTl.add(c1[i]);
                }
            }
        }
        char[] retArr = new char[cTl.size()];
        for(int i = 0; i < cTl.size(); i++){
            retArr[i] = cTl.get(i);
        }
        return retArr;
    }

    private static int toNum(ArrayList<Character> cList) {
        int score = 0;
        for(int i = 0; i < cList.size(); i++){
            int tmp = cList.get(i) - 38;

            if (tmp > 52){
                tmp = cList.get(i) -96;
            }
            score = score + tmp;
        }
        return score;
    }
}