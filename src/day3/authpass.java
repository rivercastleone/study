package day3;
import java.util.*;
public class authpass {
    public static void main(String[] args){
        String id = "asdf";
        Scanner sc = new Scanner(System.in);
        String inputid;
        System.out.println("input your id");
        inputid=sc.nextLine();
        
        String pass = "1111";
        String pass2 = "2222";
        String inputpw;
        System.out.println("input your pw");
        inputpw=sc.nextLine();
        boolean isRightPass=(inputpw.equals(pass)||inputpw.equals(pass2));
        if(inputid.equals(id) && isRightPass){
            System.out.println("Hello");

        }
        else{
            System.out.println("Who are you?");
        }
        sc.close();
    }
    
}
