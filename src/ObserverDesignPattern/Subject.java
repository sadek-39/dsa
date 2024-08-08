package ObserverDesignPattern;

//Subject or Publisher
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
