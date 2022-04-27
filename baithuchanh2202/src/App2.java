import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so thu nhat: ");
        int a = scanner.nextInt();
        System.out.println("nhap vao so thu hai: ");
        int b = scanner.nextInt();
        System.out.println("nhap vao so thu ba: ");
        int c = scanner.nextInt();
        scanner.close();
        if(a+b>c && a+c>b && b+c>a && a>1 && b>1 && c>1){
            if(a == b || b == c || c == a){
                if(a == b && b == c){
                    System.out.println("tam giac deu");
                }
                else
                    System.out.println("tam giac can");
            }
            else if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(c*c+b*b==a*a)){
                if(a == b || b == c || c == a){
                    System.out.println("tam giac vuong can");
                }
                else{
                    System.out.println("tam giac vuong");
                }
            }
            else
                System.out.println("tam giac thuong");
        }
    }
}
