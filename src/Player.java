public class Player {
    int Hp = 100; // player health
    int power = 20 ; // attack power

    public Player(int Hp, int power) {
        this.Hp = Hp;
        this.power = power; 
    }

    public void setHp(int Hp){
        this.Hp = Hp;
    }
    public void setPower(int power){
        this.power = power;
    }
    public int GetPower(){
        return power;
    }
    public int getHp(){
        return Hp;
    }


}
