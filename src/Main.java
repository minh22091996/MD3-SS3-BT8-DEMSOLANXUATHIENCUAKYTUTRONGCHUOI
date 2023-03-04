import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String chuoi ;
        char kytu = 'b';
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi bat ki");
        chuoi = sc.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            if(chuoi.charAt(i) == kytu){
                count++;
            }
        }
        System.out.println("ky tu "+ (kytu) + " xuat hien "+ (count) + " lan trong chuoi ");
    }
}
