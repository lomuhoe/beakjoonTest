import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if(minute<45){
            if(hour==0){
                hour=23;
            }else{
                hour--;
            }
            minute+=15;
        }else {
            minute-=45;
        }
        System.out.println(hour+" "+minute);
    }
}