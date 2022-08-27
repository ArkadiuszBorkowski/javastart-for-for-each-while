import java.util.Scanner;

class InputNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ile liczb chcesz wprowadzić");
        int numbersInput = input.nextInt();
        int sum = 0;

//        1 ROZWIĄZANIE
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

        while(numbersInput >0){
            System.out.println("Wprowadź kolejną liczbę");
            sum = sum + input.nextInt();
            numbersInput--;
        }

        System.out.println("Suma liczb to "+ sum );
    }

}
