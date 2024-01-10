import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String inp = args[0];
        System.out.println(read(inp));
    }

    private static int read(String inp) throws IOException {
        int count = 0;
        String helperLine;
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(inp));
        char[] cArr = new char[0];
        while ((helperLine = reader.readLine()) != null) {
            cArr = helperLine.toCharArray();
        }
        ArrayList<Character> cList = new ArrayList<>();
        for(int i = 0; i < 14; i++){
            cList.add(cArr[i]);
        }
        for(int i =14; i< cArr.length; i++){
            if(check(cList)){
                count = i;
                i=cArr.length;
            } else {
                cList.remove(0);
                cList.add(cArr[i]);
            }
        }
        return count;
    }

    private static boolean check(ArrayList<Character> cList) {
        for(int i = 0; i<cList.size()-1; i++){
            for (int j = i+1; j<cList.size(); j++){
                if(cList.get(i)==cList.get(j)){
                    return false;
                }
            }
        }
        return true;
    }
}