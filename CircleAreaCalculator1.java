import java.util.Scanner;

public class CircleAreaCalculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ป้อนรัศมีของวงกลม: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("พื้นที่ของวงกลมคือ: " + area);
        
        scanner.close();
    }
}
