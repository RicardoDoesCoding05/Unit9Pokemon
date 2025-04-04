import java.util.Random;

class Pokemon{
    String name;
    int hp;
    int attack;
    int defense;
    
    public Pokemon(String name, int hp, int attack, int defense){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }
    
    public int attack(Pokemon target){
        Random random = new Random();
        int damage = (int) Math.floor((((2*50/5+2)*60*(double)this.attack/target.defense)+2));
        double modifier = (random.nextInt(38)+217)/255.0;
        damage = (int) Math.floor(damage * modifier);
        target.hp -= damage;
        System.out.println(this.name + " attacks " + target.name + " for " + damage + " damage!");
        if(target.hp <= 0){
            System.out.println(target.name + " fainted!");
        }
        return damage;
    }
}
