interface Observer {
    void update(String msg);
}

class Subscriber implements Observer {
    private String name;
    public Subscriber(String name) { this.name = name; }
    public void update(String msg) {
        System.out.println(name + " received: " + msg);
    }
}

class Publisher {
    private java.util.List<Observer> observers = new java.util.ArrayList<>();
    public void add(Observer o) { observers.add(o); }
    public void notifyAllObservers(String msg) {
        for (Observer o : observers) o.update(msg);
    }
}
