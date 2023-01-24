import java.util.ArrayList;

public class DuplicadosNao {
    private ArrayList<String> fruits = new ArrayList<String>();

    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public void printDuplicates() {
        for (int i = 0; i < fruits.size(); i++) {
            for (int j = i + 1; j < fruits.size(); j++) {
                if (fruits.get(i).equals(fruits.get(j))) {
                    System.out.println(fruits.get(i));
                }
            }
        }
    }
}
