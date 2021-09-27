package javapatt;

import java.util.ArrayList;
import java.util.List;

public class GenshinImpactNotif implements Observed{
    List<String> characters = new ArrayList<>();

    List<Observer> players = new ArrayList<>();

    public void addCharacter (String character){
        this.characters.add(character);
        notifyObservers();
    }

    public void removeCharacter (String character){
        this.characters.remove(character);
        notifyObservers();
    }

    @Override
    public void addObserver(javapatt.Observer observer) {
        this.players.add(observer);
    }

    @Override
    public void removeObserver(javapatt.Observer observer) {
        this.players.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: players) {
            observer.handleEvent(this.characters);
        }
    }
}
