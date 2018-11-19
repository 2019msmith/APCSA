import java.util.Scanner;

public class Cipher{
    private String message;
    private String choice;
    private int shift;
    public void setMessage(String theMessage){
        message = theMessage;
    }
    public void setChoice(String theChoice){
        choice = theChoice;
    }
    public void setShift(int theShift){
        shift = theShift;
    }
    public String getMessage(){
        return message;
    }
    public String getChoice(){
        return choice;
    }
    public int getShift(){
        return shift;
    }
    public String Encrypt(String m, int s){
        Scanner scan = new Scanner(System.in);
        Cipher e = new Cipher();
        
        e.setMessage(scan.nextLine());
        System.out.println("Your message: "+ e.getMessage());
        
        System.out.println("\nWhat is the desired shift?");
        e.setShift(scan.nextInt());
        System.out.println("Your shift: "+ e.getShift());
        
        m = e.getMessage();
        s = e.getShift();
        String newMessage = "";
        for (int i = 0; i < m.length(); i++) {
            char c = m.charAt(i);
            int ascii = (int) c;
            ascii = (int) c + s;
            newMessage += (char) ascii;
        }
        
        System.out.println("\nYour final message:\n");
        return(newMessage);
    }
}