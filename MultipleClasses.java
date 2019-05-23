import java.util.Scanner;
public class MultipleClasses{
    private String username;
    private int num;
    public void setUsername(String theUsername){
        username = theUsername;
    }
    public void setNum(int theNum){
        num = theNum;
    }
    public String getUsername(){
        return username;
    }
    public int getNum(){
        return num;
    }
    public MultipleClasses(){}
    public void AccountTingz(){
        Scanner scan = new Scanner(System.in);
        MultipleClasses check = new MultipleClasses();
        int tries = 0;
        System.out.print("Set a username: ");
        check.setUsername(scan.nextLine());
        System.out.println("Your username: " + check.getUsername());
        //code continued
    }
}