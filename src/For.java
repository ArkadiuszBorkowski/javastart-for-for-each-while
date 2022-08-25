import java.util.Scanner;

public class For {
        public static void main(String[] args) {

            int[] numbers = new int[3];
/*
            Scanner sc = new Scanner(System.in);

            for (int tmp: numbers) {
                System.out.println("Podaj liczbę");
                tmp = sc.nextInt();
            }

            for (int tmp:numbers) {
                System.out.println(tmp);
            }
*/
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    continue;
                }
                System.out.println("Pierwsza pętla " + i);
            }

            for (int i = 0; i < 10; i++) {

                if (i== 5) {
                    break;
                }
                System.out.println("Druga pętla " + i);
            }


            System.out.println("Koniec");

            //sc.close();
    }
}
