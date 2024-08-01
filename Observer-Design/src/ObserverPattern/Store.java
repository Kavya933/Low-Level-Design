package ObserverPattern;

import ObserverPattern.Observable.IphoneObservable;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.MobileAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable IphoneStockObservable = new IphoneObservable();
        NotificationAlertObserver observer1 = new EmailAlertObserver("kavya@gmail.com", IphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("Mohit@gmail.com", IphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("kav123", IphoneStockObservable);

        IphoneStockObservable.add(observer1);
        IphoneStockObservable.add(observer2);
        IphoneStockObservable.add(observer3);
        IphoneStockObservable.setStockCount(10);
    }
}
