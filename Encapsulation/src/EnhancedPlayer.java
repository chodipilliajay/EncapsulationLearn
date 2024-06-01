public class EnhancedPlayer {

    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name, 100, "Sword");
    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        //using the constructor to make sure the health is in the range of 1 to 100. with if else statement
        if (health <= 0){
            this.health = 1;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
        //we could do some additional validation, to make sure that it's valid.
        this.weapon = weapon;
        // this constructor give us a little control, that is how's new player created.
    }

    public void loseHealth(int damage){









        
        health -= damage;
        if (health <= 0) {
            System.out.println("Player knocked out of game");
        }
    }
    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth){
        health += extraHealth;
        if (health > 100){
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}
