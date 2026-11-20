import java.util.Scanner;
public class day2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter money to check the expense : ");
        double money=scanner.nextDouble();
        if(money<0){
            System.out.print("Invalid amount!");
        }
        else if(money<100){
            System.out.print("Its a small expense! ");
        }
        else if(money>=100 && money<500){
            System.out.print("Its a medium expense! ");
        }
        else{
            System.out.print("Its a Large expense! ");
        }
        scanner.close();
    }
}
