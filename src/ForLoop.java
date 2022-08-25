import java.util.Scanner;

class ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj liczbę do sprawdzenia:");
            int tmp = sc.nextInt();

            if (tmp % 2 == 0) {
                System.out.println("Liczba jest parzysta");
            } else {
                System.out.println("Liczba jest nieparzysta");
            }
        }
        sc.close();
    }
}


/*

int[] numbers = new int[20];

for (int i = 0; i < numbers.length; i++) {
    numbers[i] = i + 1;
}

for (int i = 0; i < numbers.length; i ++) {
    System.out.println("Liczba " + numbers[i]);
}


 */
