public class QuickCanine extends Enemy {
    public QuickCanine(int hp, String name, int amount){
        super(1, "QuickCanine", amount );
    }
        @Override
    public void attack() {
        System.out.println(name + " attacks with a Dangerous bite!");
    }
    @Override
    public void fightBack(Player player, int turn) {
        int health = hp*amount; 
        System.out.println(name + " you attack the dog");
        if(player.GetPower()> health){
            System.out.println("you overwhelm the dog, it is dead");
        }else if(player.GetPower() == health){
            System.out.println("It was a close fight, but you managed to win. You're slightly wounded, and no longer at full strength—but the beast is dead.");
            player.setHp(player.getHp()-(1*amount));// you lost a bit of health
            player.setPower(player.GetPower()-(1*amount));// you lost a bit of power
        }else{
            System.out.println("the creature was simply too powerful.");
        }
    }
}

