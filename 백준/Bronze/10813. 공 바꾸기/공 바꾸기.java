import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int[][] k = new int[m][2];

        for(int i=0; i<m; i++){
            for(int j=0; j<2; j++){
                k[i][j] = s.nextInt();
            }
        }
        //i 길이의 1차원 배열 다 으로 초기화

        int[] t = new int[n];

        for(int i = 0; i<n; i++){
            t[i] = i+1;
        }

        //k[i][0] 번째와 k[i][1] 교환이 m번 반복

        int o=0;

        for(int i=0; i<m; i++){
            int t1 = k[i][0]-1;
            int t2 = k[i][1]-1;

            o = t[t1];
            t[t1] = t[t2];
            t[t2] = o;


        }

        for(int i=0;i<n;i++){
            System.out.print(t[i]);
            if(i<n-1){
                System.out.print(" ");
            }
        }



        s.close();
    }
}