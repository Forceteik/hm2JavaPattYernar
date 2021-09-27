package javapatt;

public interface Observed {
    public void addCharacter(Observer observer);

    public void removeCharacter(Observer observer);

    public void notifyObservers();
}
