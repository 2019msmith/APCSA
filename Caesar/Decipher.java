import java.util.Scanner;

public class Decipher{
    private String message1;
    private String choice1;
    private int shift1;
    public void setMessage1(String theMessage){
        message1 = theMessage;
    }
    public void setChoice1(String theChoice){
        choice1 = theChoice;
    }
    public void setShift1(int theShift){
        shift1 = theShift;
    }
    public String getMessage1(){
        return message1;
    }
    public String getChoice1(){
        return choice1;
    }
    public int getShift1(){
        return shift1;
    }
    public String Decrypt(String n, int h){
        Scanner scan = new Scanner(System.in);
        Decipher d = new Decipher();
        
        d.setMessage1(scan.nextLine());
        System.out.println("Your message: "+ d.getMessage1());
        
        System.out.println("\nWhat is the desired shift?");
        d.setShift1(scan.nextInt());
        System.out.println("Your shift: "+ d.getShift1());
        
        n = d.getMessage1();
        h = d.getShift1();
        String newMessage = "";
        for (int i = 0; i < n.length(); i++) {
            char g = n.charAt(i);
            int ascii = (int) g;
            ascii = (int) g - h;
            newMessage += (char) ascii;
        }
        
        System.out.println("\nYour final message:\n");
        return(newMessage);
    }
}