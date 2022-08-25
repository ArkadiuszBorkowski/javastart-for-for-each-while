public class WhileLoops {
    public static void main(String[] args) {

        int maxNumber = 10;
        int i = 0;

        while (i < maxNumber) {
            System.out.println("test" + i);
            i++;
        }

        do {
            System.out.println("Ciało pętli");
            i++;
        } while (i < maxNumber);
        System.out.println("Koniec");
    }
}
