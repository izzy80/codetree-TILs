import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        a = solve(a);
        b = solve(b);
        c = solve(c);

        System.out.println(a+" "+b+" "+c);

    }

    public static int solve(int num){
        if(num%2 == 0){
            num/=2;
        }
        else{
            num = num*3-20;
        }
        return num;
    }
}