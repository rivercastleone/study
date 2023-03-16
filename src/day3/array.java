package day3;

public class array{
    public static void main(String[] args){
        String[] user = new String[3];
        user[0]="asdf";
        user[1]="ASDF";
        user[2]="ㅁㄴㅇㄹ";
        System.out.println(user[0] + user[1] + user[2]);
        int[] score = {1,20,300};
        System.out.println(score[2]);
        System.out.println(score.length);

        int i;
        for(i=0; i<3; i++){
            System.out.print(user[i]+" ");
        }
    }
}
