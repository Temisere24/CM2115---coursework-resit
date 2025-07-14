import java.util.Scanner;

public class CombatRoom extends Room {
    public CombatRoom(String name, String description){
        super(name , description);
    }
        // dungeon fight
    @Override
    public void problem(int answer, int roomNum , Player player) {
            if(roomNum <= 3){
                int i=1;
                // retry loop
                while(i != 50){
                RabidDog dog = new RabidDog(1, "RabidDog", roomNum);
                dog.attack();
                dog.description();
                System.out.println("will you fight back(type '1 for yes' or '2 for no')");
                Scanner scanner = new Scanner(System.in);
                int reply  = scanner.nextInt();
                if(reply== 1){
                dog.fightBack(player , i );
                break;
            }else if(reply == 2){
                System.out.println("you chose to hold");
                System.out.println("the dog attacks tirelessly but cannot break your defences, it is tired and vunerable, will you attack ?");
                dog.chargeAttack(player.GetPower());
            }else{
                System.out.println("you did not give a clear answer, please answer ('1 for yes' or '2 for no')");
            }
        }
    }else if(roomNum > 3 && roomNum < 7){
        int i=1;
                // retry loop
                while(i != 50){
                FesterBeast beast = new FesterBeast (3, "FesterBeast", roomNum);
                beast.attack();
                beast.description();
                System.out.println("will you fight back(type '1 for yes' or '2 for no')");
                Scanner scanner = new Scanner(System.in);
                int reply  = scanner.nextInt();
                if(reply== 1){
                beast.fightBack(player , i );
                break;
            }else if(reply == 2){
                System.out.println("you chose to hold");
                System.out.println("the beast swipes at you though you dodge its strikes the poison emanating from it is filling the room, you have to finish it soon and get out of this room, will you attack ?");
                beast.chargeAttack(player.GetPower());
                player.setHp((player.getHp())-i);// beast takes more hp every turn 
            }else{
                System.out.println("you did not give a clear answer, please answer ('1 for yes' or '2 for no')");
            }
        }
    
    }else if(roomNum == 7){
        int i = 1;
        while(i != 50){
            BeastShaman beast = new BeastShaman (5, "beast master", roomNum);
            beast.attack();
            beast.description();
            System.out.println("will you fight back(type '1 for yes' or '2 for no')");
            Scanner scanner = new Scanner(System.in);
            int reply  = scanner.nextInt();
            if(reply== 1){
            beast.fightBack(player , i );
            break;
        }else if(reply == 2){
            System.out.println("you chose to hold");
            beast.chargeAttack(player.GetPower());
        }else{
            System.out.println("you did not give a clear answer, please answer ('1 for yes' or '2 for no')");
        }
    }


    }
} 
}
