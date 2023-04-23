package W7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


//dp[N]값이 무조건 결과 값이 아니다..
public class LongestAscendingNumberArray {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N+1];

        int[] dp = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 1;

        for (int i = 1; i <= N; i++){
            if(seq[i] == 0){
                seq[i] = Integer.parseInt(st.nextToken());
            }
            dp[i] = 1;

            for (int j = 1; j < i; j++){
                if(seq[i] > seq[j] && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                    if (max < dp[i]){
                        max=  dp[i];
                    }
                }
            }


        }


        System.out.println(max);

    }

}


