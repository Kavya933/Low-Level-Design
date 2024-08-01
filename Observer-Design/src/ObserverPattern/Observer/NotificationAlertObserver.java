package ObserverPattern.Observer;

// this will observe stock and when thing are in stock it will update all observer/people who have clicked on notify me button.
public interface NotificationAlertObserver {
    public void update();
}
