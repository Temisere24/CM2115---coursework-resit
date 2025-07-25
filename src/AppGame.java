import java.util.Scanner;

public class AppGame{
  public static void main(String[] args) {
    //plyer input
    CreateCombatRoom room1 = new CreateCombatRoom();
    CreateChallengeRoom room2 = new CreateChallengeRoom();
    int answer=0;
    // Game loop
      Room room;
      Player you = new Player(100, 20);
      System.out.println("your hp is 100, your power is 20, power has to be greater than the enemy hp to deal damage");
    for (int i = 0; i < 6; i++) {
        if(i % 2 == 0 ){
        
        room =   room1.CreateRoom("Enemy room", "your Aim is to Fight and defeat your opponent");
        }else{
        room = room2.CreateRoom("puzzle room", "hope You got your thinking shoes on ");
        }
        room.describe();
        room.problem(answer, i, you);
        if(you.getHp() <= 0 ){// if all hp is lost game over
        System.out.println("you have died");
        System.out.println("  GAME OVER");
        
        break;
        }
      }
      System.out.println("you win");
    }
}

