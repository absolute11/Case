package firstApp;

public class ExchangeWithout {

    public void exchangeWithout(int x1,int x2){
        x1 = x1 + x2;
        x2 = x1 - x2;
        x1 = x1 - x2;
        System.out.println("x1  : " + x1 + " " + "x2 : " + x2);
    }
}
