import java.util.Scanner;

public class centuries {

    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Input a year and the system will print wich century it is in: ");
        int number = leitor.nextInt();
        int rest = number % 100;
        int result = number / 100;
        if (rest != 0) {
            result += 1;

        }

        System.out.println(result + "th century");
        leitor.close();
    }
}
