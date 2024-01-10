import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String inp = args[0];
        System.out.println(read(inp));
    }

    private static String read(String inp) throws IOException {
        ArrayList<Character> l1 = new ArrayList<>();
        ArrayList<Character> l2 = new ArrayList<>();
        ArrayList<Character> l3 = new ArrayList<>();
        ArrayList<Character> l4 = new ArrayList<>();
        ArrayList<Character> l5 = new ArrayList<>();
        ArrayList<Character> l6 = new ArrayList<>();
        ArrayList<Character> l7 = new ArrayList<>();
        ArrayList<Character> l8 = new ArrayList<>();
        ArrayList<Character> l9 = new ArrayList<>();

        l1.add('B');l1.add('V');l1.add('S');l1.add('N');l1.add('T');l1.add('C');l1.add('H');l1.add('Q');
        l2.add('W');l2.add('D');l2.add('B');l2.add('G');
        l3.add('F');l3.add('W');l3.add('R');l3.add('T');l3.add('S');l3.add('Q');l3.add('B');
        l4.add('L');l4.add('G');l4.add('W');l4.add('S');l4.add('Z');l4.add('J');l4.add('D');l4.add('N');
        l5.add('M');l5.add('P');l5.add('D');l5.add('V');l5.add('F');
        l6.add('F');l6.add('W');l6.add('J');
        l7.add('L');l7.add('N');l7.add('Q');l7.add('B');l7.add('J');l7.add('V');
        l8.add('G');l8.add('T');l8.add('R');l8.add('C');l8.add('J');l8.add('Q');l8.add('S');l8.add('N');
        l9.add('J');l9.add('S');l9.add('Q');l9.add('C');l9.add('W');l9.add('D');l9.add('M');

        ArrayList<ArrayList<Character>> ll = new ArrayList<>();
        ll.add(l1);ll.add(l2);ll.add(l3);ll.add(l4);ll.add(l5);ll.add(l6);ll.add(l7);ll.add(l8);ll.add(l9);

        int count = 0;
        String helperLine;
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(inp));
        while ((helperLine = reader.readLine()) != null) {
        if (count>9){
            String[] sArr = helperLine.split(" ");
            int[] iArr = new int[]{Integer.parseInt(sArr[1]), Integer.parseInt(sArr[3]), Integer.parseInt(sArr[5])};
            for(int i = 0; i<iArr[0]; i++){
                ll.get(iArr[2]-1).add(ll.get(iArr[1]-1).get(ll.get(iArr[1]-1).size() - iArr[0] +i));
                ll.get(iArr[1]-1).remove(ll.get(iArr[1]-1).size()- iArr[0] +i);
            }
        }
        count++;
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <ll.size(); i++){
            if(ll.get(i).size()>0){
                str.append(ll.get(i).get(ll.get(i).size() - 1));
            }
        }
        return str.toString();
    }
}