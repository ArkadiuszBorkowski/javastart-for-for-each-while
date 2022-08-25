import java.util.Scanner;

class InputNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile liczb chcesz wprowadzić?");
        int numbers = scanner.nextInt();

        int sum = 0;

//   1 ROZWIĄZANIE
//        for (int i = 0; i < numbers; i++) {
//            System.out.println("Wprowadź " + (i + 1) + " liczbę");
//            sum = sum + scanner.nextInt();
//            System.out.println(sum);
//        }

        //    for (; numbers > 0; numbers--) {
//            System.out.println("Wprowadź kolejną liczbę");
//            sum = sum + scanner.nextInt();
//            System.out.println(sum);
//        }


        while (numbers-- > 0) {
            System.out.println("Wprowadź " + (numbers + 1) + " liczbę");
            sum = sum + scanner.nextInt();
            System.out.println(sum);
        }

        System.out.println("Suma wprowadzonych liczb wynosi " + sum);
        scanner.close();
    }

}
