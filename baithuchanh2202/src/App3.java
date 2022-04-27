import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so de kiem tra: ");
        int n = scanner.nextInt();
        scanner.close();

        if(n <= 1){
            System.out.println("khong phai so nguyen to");
        }
        if(n==2)
                    System.out.println("la so nguyen to");
        else{
            for(int i = 2; i <= n/2; i++){
                if(n%i==0){
                    System.out.println("khong phai so nguyen to");
                    return;
                }
                else
                    System.out.println("la so nguyen to");
                    return;
            }
        }

    }
}
