public class Main {
    public static void main(String[] args) {
        Pesawat player = new Pesawat();

        player.enemyleft = 10;

        player.Movementsdown();
        player.Shoot();
        player.Hit();
        System.out.println(player.enemyleft);
        player.Movementsup();

        player.Shoot();

        player.Hit();
        System.out.println(player.enemyleft);

        player.Movementsdown();
        player.Crash();

    }
}
