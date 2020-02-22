import java.util.Scanner;

class D129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int num = p * x / 100 - p * y / 100;
        
        num = Math.abs(num);

        System.out.println(num);
    }
}
