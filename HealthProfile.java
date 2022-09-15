package ClassActivities;
import java.util.Scanner;
public class HealthProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Health health1 = new Health("jerry","stanley","male",12,30, 1994, 6, 49);
        int age = 2022 - health1.getYearOfBirth();

        System.out.printf("age is %d%n and first and lastname is %s%n%s%n", age, health1.getFirstName(),health1.getLastName());
    }
}
