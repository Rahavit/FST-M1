package activities;

interface Addable {
    int add(int num1, int num2);
}

public class Activity12 {
    public static void main(String[] args) {
        Addable ad1 = (num1, num2) -> num1 + num2;

        Addable ad2 = (num1, num2) -> {
            int sum = num1 + num2;
            return sum;
        };
        System.out.println("Result 1: " + ad1.add(5, 3));
        System.out.println("Result 2: " + ad2.add(5, 5));
    }
}
