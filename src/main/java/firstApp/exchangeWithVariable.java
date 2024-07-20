package firstApp;

public class exchangeWithVariable {

    public void exchangeWith(int x1,int x2){
        int x3 = x1;
        x1 = x2;
        x2 = x3;
        System.out.println("x1 : " + x1 + " " + "x2 : " + x2);
    }

}
