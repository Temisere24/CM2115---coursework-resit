public class RabidDog extends Enemy {
    public RabidDog(int hp, String name, int amount){
        super(1, "RabidDog", amount );
    }
        @Override
    public void attack() {
        System.out.println(name + " attacks with a vicious bite!");
    }
    @Override
    public void fightBack(Player player, int turn) {
        int health = hp*amount; 
        System.out.println(name + " you attack the dog");
        if(player.GetPower()> health){
            System.out.println("you overwhelm the dog, it is dead");
        }else if(player.GetPower() == health){
            System.out.println("it was close but somehow you won, ur a bit injured but the bastard is dead,  you are nolonger at full strength");
            player.setHp(player.getHp()-(1*amount));// you lose a bit of health
            player.setPower(player.GetPower()-(1*amount));// you lose a bit of power
        }else{
            System.out.println("you lost, it was too strong");
        }
    }
}

