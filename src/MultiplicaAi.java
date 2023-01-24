public class MultiplicaAi {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Tabela de multiplicação de " + number);
        for (int i = 0; i <= 10; i++){
            int result = number * i;
            if(result < 10 && result > 0)
                System.out.println(i + " * " + number + " = " + "0" + number * i);
            else
                System.out.println(i + " * " + number + " = " + number * i);
        }
    }
}
