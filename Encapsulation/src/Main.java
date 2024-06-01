public class Main {
    public static void main(String[] args)
    {
        //BAD ENCAPSULATION
        //THIS IS A CLASS THAT DOESN'T HAVE ANY ENCAPSULATION RULES
//        Player player = new Player();
//        player.fullName = "Ajay CH";
//        player.health = 20;
//        player.weapon = "AK47";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = "+player.healthRemaining());

        //GOOD ENCAPSULATION

        EnhancedPlayer aj = new EnhancedPlayer("AJ");
        System.out.println("Initialized health is "+aj.healthRemaining());

        EnhancedPlayer vj = new EnhancedPlayer("VJ", 200, "Sword");
        System.out.println("Initialized health is "+vj.healthRemaining());
    }
}