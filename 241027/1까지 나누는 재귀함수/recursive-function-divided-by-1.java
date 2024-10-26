import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder(); 
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        dfs(num);

        System.out.println(sb.toString());
    }

    public static void dfs(int num){
        if(num == 1){
            sb.append(num+" ");
            return;
        }
        sb.append(num+" ");

        if(num %2 == 0){
            num /=2;
            dfs(num);
        }
        else{
            num /=3;
            dfs(num);
        }

    }
}