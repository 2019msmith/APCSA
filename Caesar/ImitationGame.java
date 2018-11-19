import java.util.Scanner;

public class ImitationGame{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Cipher e = new Cipher();
        Decipher d = new Decipher();
        
        String m = e.getMessage();
        String n = d.getMessage1();
        int s = e.getShift();
        int h = d.getShift1();
        
        int a = 0;
        
        while (a==0){
            System.out.println("\nWould you like to encrypt a message, decrypt a message, or exit?\n\n'1' for Encrypt\n'2' for Decrypt\n'Enter' to Exit\n");
            e.setChoice(scan.nextLine());
            if(e.getChoice().equals("1")){
                System.out.println("\nGreat! What message would you like to encrypt?");
                System.out.println(e.Encrypt(m,s));
            }
            else if(e.getChoice().equals("2")){
                System.out.println("\nGreat! What message would you like to decrypt?");
                System.out.println(d.Decrypt(n,h));
            }
            else{
                System.out.println("\nOk! Goodbye!");
                a++;
            }
        }
    }
}