/** Program to check if a number is an Armstrong number */

public class Armstrongnumb {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
