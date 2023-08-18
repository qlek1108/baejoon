import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int i = s.nextInt();
        int j = s.nextInt();

        int[][] k = new int[j][3];

        for(int q=0; q<j; q++){
            for(int w=0; w<3; w++){
                k[q][w] = s.nextInt();
            }
        }
        //i 길이의 1차원 배열 다 0으로 초기화
        int[] o = new int[i];

        for(int q=0;q<i;q++){
            o[q] = 0;
        }

        //[q][0]~[q][1] 까지의 숫자 [q][2] 로 초기화
        //이걸 j 번 반복

        for(int q=0;q<j;q++){
            for(int w=k[q][0]-1; w<k[q][1]; w++){
                o[w] = k[q][2];
            }
        }

        for(int q=0;q<i;q++){
            System.out.print(o[q]);
            if(q<i-1){
                System.out.print(" ");
            }
        }

        s.close();
    }
}