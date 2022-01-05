/* 
ID: minimoj1
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("ride.in")); // Reads ride.in file
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out"))); // Creates ride.out output file
        StringTokenizer comet = new StringTokenizer(r.readLine()); // Reads first line
        StringTokenizer group = new StringTokenizer(r.readLine());

        String c = comet.nextToken();
        String g = group.nextToken();
        
        int cometTotal = 1;
        for ( char curr : c.toCharArray()){
            cometTotal*= (int)curr - (int)'A'+1;
        }
        cometTotal%=47;


        int groupTotal = 1;
        for (char curr : g. toCharArray()){
            groupTotal*= (int)curr - (int)'A'+1;
        }
        groupTotal%=47;

        if (groupTotal == cometTotal){
            out.println("GO");
        } else out.println("STAY");

        out.close();
        r.close();



    }
}

