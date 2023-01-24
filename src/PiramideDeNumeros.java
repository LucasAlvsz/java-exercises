public class PiramideDeNumeros {
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i < number; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
