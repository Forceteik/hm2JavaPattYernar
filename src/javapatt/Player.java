package javapatt;

import java.util.List;

public class Player implements Observer{
    String nickname;

    public Player (String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void handleEvent(List<String> characters) {
        System.out.println("Hello, " + nickname + "\nCheck Genshin Impact. We updated characters "
                + characters + "\n_________________________________________________________\n");
    }
}
