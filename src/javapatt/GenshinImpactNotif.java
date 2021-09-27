package javapatt;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

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
    public void addCharacter(javapatt.Observer observer) {

    }

    @Override
    public void removeCharacter(javapatt.Observer observer) {

    }

    @Override
    public void notifyObservers() {
        for(Observer observer: players) {
            observer.handleEvent(this.characters);
        }
    }
}
