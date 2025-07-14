import java.util.Scanner;

public class BeastShaman extends Enemy{
    public BeastShaman(int hp, String name, int amount){
        super(5, "the shaman", 1 );
    }
        @Override
    public void attack() {
        System.out.println(name + " you feel a malicious presence staring you down as you look forward and meet the gaze of the beast shaman");
    }
    @Override
    public void fightBack(Player player, int turn) {
        int health = hp*amount; 
        
        System.out.println( " you charge at the shaman");
        if(turn == 1){ //on the first turn
            System.out.println("it swiftly dodges ou having expected you to charge and strikes you, thats a lot of damage");
            player.setHp(getHp()- 5);// player hp is reduced by 5 
            System.out.println("it starts to charge up a spell, this is the price for you hastiness prepare yourself");
            summonEnemy().attack(); // summons an enemy
            System.out.println("you have to fight back");
                Scanner scanner = new Scanner(System.in);
                int reply  = scanner.nextInt();
                if(reply== 1){}
            summonEnemy().fightBack(player, turn);
        }else if(turn >= 2 && health < player.GetPower()){// if you dont attack on the first turn and you have more power than its health
            System.out.println("you wait observing it for the opportunity to strike, you notice it trying to chant a spell,  you dash forward and stab it through the heart. it is dead ");
            setHp(0);
        } else{
            System.out.println("the BeastShaman shrugs off your attack and heals itself, it has no effect");
        }
    }
    public Enemy summonEnemy(){
        if((int)(Math.random()*2)== 1){
            return new FesterBeast (2, "goon", 1);
        }else{
            return new RabidDog (1, "goon", 3);
        }
       
    }
    }
