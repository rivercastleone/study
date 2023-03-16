package day3;

public class methodd {
        public static void main(String[] args) {

                printTwoTimes("a", "-");
                printTwoTimes("a", "*");
                printTwoTimes("a", "&");
                printTwoTimes("b", "!");
                System.out.println(returnex());
            } 
        public static void printTwoTimes(String text, String delimiter) {
            System.out.print(delimiter);
            System.out.print(text);
            System.out.println(text);
        }
        public static int returnex(){
            return 1;
        }
     
    
}
