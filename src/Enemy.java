public abstract class Enemy {
    int hp;
    String name;
    int amount;
    
    public Enemy(int hp, String name, int amount) {
        this.hp = hp;
        this.name = name;
        this.amount = amount;
    }
    
    public abstract void attack();
    public void setAmount(int amount){
        this.amount = amount;
    }
    
    public void setHp(int hp){
        this.hp = hp;
    }
    public int getHp(){
        return hp;
    }
    public int getAmount(){
        return amount;
    }
    public String getName(){
        return name;
    }
    public String description(){
        String description = "there are " + getAmount() + " " + getName() + "s" + " " + "each with " + getHp(); 
        return description;
    }
    public void chargeAttack(int power){
        power++;
    }
    public abstract void fightBack(Player player, int turn);
    }
    