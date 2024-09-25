import java.util.*;
import java.io.*;

public class Main {
    static int[] mover = {}; 
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int start_r = 0; 
        int start_c = 0; 
        for(int i=0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String dir = st.nextToken();
            int move = Integer.parseInt(st.nextToken());


            switch(dir){
                case "N":
                    start_r += move*(1);
                break;
                case "E":
                    start_c+=move*(1);
                break;
                case "S":
                    start_r+=move*(-1);
                break;
                case "W":
                    start_c += move*(-1);
                break;
            }
        }

        System.out.println(start_c+" "+start_r);
    }
}