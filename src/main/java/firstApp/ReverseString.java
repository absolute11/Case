package firstApp;

public class ReverseString {

    public String reverseString(String str){
        String reversed = "";
        for(int i =str.length() - 1;i>=0;i--){
            reversed+= str.charAt(i);
        }
        return reversed;
    }
}
