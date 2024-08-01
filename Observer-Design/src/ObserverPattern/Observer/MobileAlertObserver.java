package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    String userName;
    StockObservable stockObservable;
    public MobileAlertObserver(String userName, StockObservable stockObservable){
        this.userName = userName;
        this. stockObservable = stockObservable;
    }
    @Override
    public void update() { // when this method is called it can take data from stockObservable
        sendMsgOnMobile(userName, " Product is in stock hurry up!!!!!!!!!");
    }
    public void sendMsgOnMobile(String userName, String msg){
        System.out.println("Send mail to " + userName);
    }
}
