import java.util.Scanner;

public class App1{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so a: ");
        int a = scanner.nextInt();
        System.out.println("nhap vao so b: ");
        int b = scanner.nextInt();
        scanner.close();
        int max = 0;
        if(a>b){
            for(int i = 1; i<=b; i++){
                if(a%i==0 && b%i==0){
                    if(max<i)
                        max = i;
                }
            }
        }
        else if(a==b){
            for(int i = 1; i<=a; i++){
                if(a%i==0 && b%i==0){
                    if(max<i)
                        max = i;
                }
            }
        }
        else{
            for(int i = 1; i<=a; i++){
                if(a%i==0 && b%i==0){
                if(max<i)
                    max = i;
                }
            }
        }
        System.out.println("Uc chung lon nhat cua " + a + " va " + b + " la " + max);
    }
    
}
