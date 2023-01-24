public class Main {
    public static void main(String[] args) {
        DuplicadosNao duplicadosNao = new DuplicadosNao();

        duplicadosNao.addFruit("banana");
        duplicadosNao.addFruit("banana");
        duplicadosNao.addFruit("maçã");
        duplicadosNao.addFruit("maçã");
        duplicadosNao.addFruit("pera");
        duplicadosNao.addFruit("uva");
        duplicadosNao.addFruit("morango");
        duplicadosNao.addFruit("melancia");
        duplicadosNao.addFruit("melão");
        duplicadosNao.addFruit("melão");

        duplicadosNao.printDuplicates();


    }
}
