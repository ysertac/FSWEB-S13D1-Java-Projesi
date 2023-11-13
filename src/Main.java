import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("--------------------------------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("--------------------------------");
        System.out.println(hasTeen2(9, 99, 19));
        System.out.println(hasTeen2(23, 15, 42));
        System.out.println(hasTeen2(22, 23, 34));
        System.out.println("--------------------------------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("--------------------------------");

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            System.out.println("Enter the height of the rectangle: ");
            double height = scanner.nextDouble();
            System.out.println("Area of rectangle: " + area(width, height));
        } catch (Exception ex) {
            System.out.println("Invalid input");
        }

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            System.out.println("Area of circle: " + area(radius));
        } catch (Exception ex) {
            System.out.println("Invalid input");
        }
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        if (!isBarking) {
            return false;
        }
        return clock < 8 || clock >=20;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <=19) ||
                (secondAge >= 13 && secondAge <=19) ||
                (thirdAge >= 13 && thirdAge <=19);
    }

    public static boolean hasTeen2(int... ages) {
        for (int age: ages) {
            if (age >= 13 && age <= 19) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if (isSummer){
            return temperature > 25 && temperature <= 45;
        } else {
            return temperature > 25 && temperature <=35;
        }
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            System.out.println("Width and height values must be bigger than 0");
            return -1;
        }
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);
    }
}