import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        int b = 0;

        b = a/4;

        String r = "";

        for(int i=0; i<b; i++){
            r = r+"long ";
        }

        System.out.printf(r+"int");
    }
}