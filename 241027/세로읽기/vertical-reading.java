import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] arr = new char[4][15];

        for(int i=0; i<4; i++){
            String tmp = br.readLine();
            for(int j=0; j < tmp.length(); j++){
                arr[i][j] = tmp.charAt(j); 
            }
        }
        // System.out.println(Arrays.deepToString(arr));

        for(int i=0; i<15; i++){
            for(int j=0; j < 4; j++){
                if(arr[j][i]!='\u0000'){
                    sb.append(arr[j][i]);
                }
            }
        }
        System.out.println(sb.toString());
    }
}