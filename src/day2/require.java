package day2;

public class require {
    public static void main(String[] args){
       String id= args[0];
       String pw= args[1];
       if(id.equals("asdf")){
            if(pw.equals("asdf")){
                System.out.println("success login");
                }
            else{
                System.out.println("wrong pw");
                }
        }
        else{
            System.out.println("wrong id");
        }
       
    }
    
}
