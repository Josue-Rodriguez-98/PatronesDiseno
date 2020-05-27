public interface Subject {
    
    public abstract void registerObserver(Observer observer);
    public abstract void removeObserver(Observer observer);
    public abstract void notifyAllObservers();
    
}
