package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String emailId;
    StockObservable stockObservable;
    public EmailAlertObserver(String emailId, StockObservable stockObservable){
        this.emailId =emailId;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        sendMail(emailId , "Product is in stock hurry up!!!!!!!!!");
    }
    public void sendMail(String emailId, String msg){
        System.out.println("Send mail to " + emailId);
    }
}
