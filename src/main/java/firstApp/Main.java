package firstApp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Program one and two
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseString("Hello world"));


        //Program 3
        exchangeWithVariable exchangeWithVariable = new exchangeWithVariable();
        exchangeWithVariable.exchangeWith(5,10);
        //Program 4
        ExchangeWithout exchangeWithout = new ExchangeWithout();
        exchangeWithout.exchangeWithout(5,10);
        //Program 5
        CountWords countWords = new CountWords();
        countWords.countWords("This is a test. This test is only a test.");


    }
}