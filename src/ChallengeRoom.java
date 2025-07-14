import java.util.Scanner;

public class ChallengeRoom extends Room {
    public ChallengeRoom(String name, String description){
    super(name , description);
}
Scanner scanner = new Scanner(System.in);
// dungeon fight
    @Override
    public void problem(int answer, int roomNum, Player player) {
        int i= 1;
        while(i != 50){
            i++;
            if(roomNum < 5){
            System.out.println("what is 2 + 2");
            answer = scanner.nextInt();
            if(answer == 4){
                System.out.println("you are correct");
                
                if(player.getHp() < 10){ // if you answer right you get hp
                    player.setHp((player.getHp())+ 1);
                }else if(player.getHp() == 10){
                    player.setPower((player.GetPower())+ 1);// if health is full gain power instead
                }
                break;
            }else{
                System.out.println("you are wrong, you may not pass");
            }
        }else if(roomNum >5){
            int num = (int)(Math.random()* 9);
            System.out.println("what is"+ num*i + "multipied by" + 2* i);
            answer = scanner.nextInt();
            int correct = (num*i) * (2* i);
            if(answer == correct){
                System.out.println("you are correct");
                break;
            }else{
                System.out.println("you are wrong, you may not pass");
            }
        }
        }

    }
}
