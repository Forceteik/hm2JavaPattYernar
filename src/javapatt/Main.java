package javapatt;

public class Main {
    public static void main(String[] args) {
        GenshinImpactNotif notif = new GenshinImpactNotif();

        Observer firstPlayer = new Player("Forceteik");
        Observer secondPlayer = new Player("Miruna");
        Observer thirdPlayer = new Player("Imuran");

        notif.addObserver(firstPlayer);
        notif.addObserver(secondPlayer);
        notif.addObserver(thirdPlayer);


        notif.addCharacter("Ning Guang");
        notif.addCharacter("Qi Qi");
        notif.addCharacter("Emilia");

        notif.removeCharacter("Emilia");
    }
}
