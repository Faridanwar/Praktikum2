public class Pesawat {
    int enemyleft;

    void Shoot(){
        System.out.println("Fire...");
    }

    void Hit(){
        System.out.println("You're hitting an enemy...");
        enemyleft -= 1;
    }

    void Movementsup(){
        System.out.println("Going up..");
    }

    void Movementsdown(){
        System.out.println("Going down...");
    }

    void Crash(){
        System.out.println("You're Crash onto enemy..");
        System.out.println("Game Over...");
    }
}
