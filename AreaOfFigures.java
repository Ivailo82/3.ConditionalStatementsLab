package ConditionalStatementsLab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figureName = scanner.nextLine();
        //square, rectangle, circle или triangle
        if (figureName.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double squareArea = a * a;
            System.out.printf("%.3f",squareArea);
        }
        else if (figureName.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double rectangleArea = a * b;
            System.out.printf("%.3f",rectangleArea);
        }
        else if (figureName.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double circleArea = Math.PI * r * r;
            System.out.printf("%.3f",circleArea);
        }
        else if (figureName.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double ha = Double.parseDouble(scanner.nextLine());
            double triangleArea = (a * ha) / 2;
            System.out.printf("%.3f",triangleArea);
        }
    }
}
