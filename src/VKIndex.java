import java.util.Scanner;

public class VKIndex {
    public static void main(String[] args) {
        int kg;
        float boy, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz(kg): ");
        kg = input.nextInt();
        System.out.print("Boyunuzu giriniz(m): ");
        boy = input.nextFloat();

        result= kg/(boy*boy);
        System.out.printf("Vücut Kitle İndeksiniz: %.2f",result);

    }
}
