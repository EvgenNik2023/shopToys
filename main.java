import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {

    static ArrayList<toys> assortment = new ArrayList<>();
    static ArrayList<toys> winnings = new ArrayList<>();
    static int id = 1;

    static void Assortment(int id){

        for (int i = 0; i < 5; i++) {
            assortment.add(new Duck(id, 5));
            id++;
            assortment.add(new Robot(id, 5));
            id++;
            assortment.add(new Rabbit(id, 5));
            id++;
            assortment.add(new Fox(id, 5));
            id++;
            assortment.add(new Bear(id, 5));
            id++;
        }
        assortment.forEach(n-> System.out.println(n.toString()));
    }

    public static void main(String[] args) {
        Assortment(1);
        System.out.println("Для начала розыгрыша нажмите 1, или 0 для выхода: ");
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        while (choice!=0){
            if (choice!=1){
                System.out.println("Вы ввели неверный символ, попробуйте ещё: ");
                choice = input.nextInt();
            }
            int r = random.nextInt(10);
            toys win = assortment.get(r);
            System.out.println("Ура, вы выиграли! ");
            System.out.println(win);
            winnings.add(win);
            assortment.remove(win);
            System.out.println("Хотите сыграть ещё? 1 - yes, 0 - no");
            choice = input.nextInt();
        }

    }
    
}

