import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        String inp = args[0];
        System.out.println(read(inp));
    }

    private static int read(String inp) throws IOException {
        int max = 0;
        int second = 0;
        int third = 0;
        int cur = 0;
        String helperLine;
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(inp));
        while ((helperLine = reader.readLine()) != null) {
            if (helperLine.equals("")){
                if(max<cur){
                    third = second;
                    second = third;
                    max = cur;
                } else if (second<cur){
                    third = second;
                    second = cur;
                } else if (third < cur) {
                    third = cur;
                }
                cur = 0;
            } else {
                cur = cur + Integer.parseInt(helperLine);
            }
        }
        return max + second + third;
    }
}