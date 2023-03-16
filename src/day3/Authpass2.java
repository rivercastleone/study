package day3;

import java.util.Scanner;

public class Authpass2 {
    public static void main(String[] args){
        String[] user={"asdf","qwer","zxcv"};
        int[] pw={1234,5678,1357};
        Scanner sc = new Scanner(System.in);
        boolean isRightid = false;
        boolean isRightPass = false;
        String inputid;
        int inputpw;
        
        System.out.println("input your id");
        inputid = sc.nextLine();
        
        System.out.println("input your pw");
        inputpw = sc.nextInt();

        int i;
        for(i=0; i<user.length; i++){
            String Authid=user[i];
            if(Authid.equals(inputid)){
                isRightid=true;
                break;
            }
        }
        
        if(isRightid){
            int j;
            for(j=0; j<pw.length; j++){
                int Authpw=pw[i];
                if(Authpw==inputpw){
                    isRightPass=true;
                    break;
                }
            }
        }


        if(isRightid&&isRightPass){
            System.out.println("Hello " +"["+inputid+"]");
        }
        else if(isRightid||isRightPass){
            System.out.println("Wrong id or Wrong pw");
        }
        else{
            System.out.println("Wrong id and Wrong pw");
        }

        sc.close();
    }
    
}
