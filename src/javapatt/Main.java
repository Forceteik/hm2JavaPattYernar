package javapatt;

public class Main {
    public static void main(String[] args) {
        GenshinImpactNotif notif = new GenshinImpactNotif();

        notif.addCharacter("Nin Guan");
        notif.addCharacter("Qi Qi");

        Observer firstPlayer = new Player("Forceteik");
        Observer secondPlayer = new Player("Miruna");
        Observer thirdPlayer = new Player("Imuran");

        notif.addCharacter("Emilia");
    }
}
