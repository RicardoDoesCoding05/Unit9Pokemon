import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 100, 55, 40);
        Pokemon charizard = new Pokemon("Charizard", 150, 84, 78);

        System.out.println("A wild " + charizard.name + " appeared!");
        System.out.println("You sent out " + pikachu.name + "!");

        while (pikachu.hp > 0 && charizard.hp > 0) {
            pikachu.attack(charizard);
            if (charizard.hp > 0){
              charizard.attack(pikachu);
            }
        }

        if (pikachu.hp <= 0) {
            System.out.println(pikachu.name + " lost!");
        } else {
            System.out.println(charizard.name + " lost!");
        }
    }
}
