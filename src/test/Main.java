package test;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sA = bufferedReader.readLine();
        int iA = Integer.parseInt(sA);

        String sB = bufferedReader.readLine();
        int iB = Integer.parseInt(sB);

        String sC = bufferedReader.readLine();
        int iC = Integer.parseInt(sC);

        if(iA == iC && iA == iB) {
            System.out.println(iA + " " + iB + " " + iC);
        }
        else if(iA == iB && iA != iC){
            System.out.println(iA + " " + iB);
        }
        else if(iB == iC && iB != iA ){
            System.out.println(iB + " " + iC);
        }
        else if(iA == iC && iA != iB) {
            System.out.println(iA + " " + iC);
        }
    }
}
