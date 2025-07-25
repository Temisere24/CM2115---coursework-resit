public class GrimBeast extends Enemy {
    public GrimBeast(int hp, String name, int amount){
        super(3, "GrimBeast", amount );
    }
        @Override
    public void attack() {
        System.out.println(name + " you are slowly being poisoned, the air is toxic, you have to escape");
    }
    @Override
    public void fightBack(Player player, int turn) {
        int health = hp*amount; 
        
        System.out.println(name + " you slice at the beast");
        if(health - player.GetPower()==2){//if u have 2 less power than its health
            System.out.println("you hack at the beast, its juices are everywhere, it does not seem phazed");
            setHp((int)((health/amount)-player.GetPower()));
        }else if(health - player.GetPower() == 1){// if you have one less power than its health
            System.out.println("you hack at it again, it leats out a shriek of pain as you finlly find its heart, its almost done now");
            setHp((int)((health/amount)-player.GetPower()));
        }if(health- player.GetPower() <= 0){ // if you have as much power as its health
            System.out.println("you stab its grotesque heart, the beast finally dies");
            setHp((int)((health/amount)-player.GetPower()));
        }
        else if(player.GetPower() == health){
            System.out.println("the beast doesent even flinch, need more strength");
        }else {
            System.out.println("you struk at the abominable thing, blood drawm from the slash contaminates you, you are too weak to wound it , too weak to fight it , you gasp for air as its poison slowly overwhelms your body, you are dead");
            player.setHp(0);
        }
    }
    }

