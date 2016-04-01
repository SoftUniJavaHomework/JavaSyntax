import java.util.Scanner;

/**
 * Created by pc on 20.3.2016 г..
 */
public class _02_TriangleArea {
    public static void main(String[] args) {
        System.out.println("Enter the coordinates of three points:");

        Scanner console = new Scanner(System.in);

        String[] pointA = console.nextLine().split(" ");
        int aX = Integer.parseInt(pointA[0]);
        int aY = Integer.parseInt(pointA[1]);

        String[] pointB = console.nextLine().split(" ");
        int bX = Integer.parseInt(pointB[0]);
        int bY = Integer.parseInt(pointB[1]);

        String[] pointC = console.nextLine().split(" ");
        int cX = Integer.parseInt(pointC[0]);
        int cY = Integer.parseInt(pointC[1]);

        double area = 0;
        area += aX*(bY - cY);
        area += bX*(cY - aY);
        area += cX*(aY - bY);
        area /= 2.0;
        area = Math.abs(area);

        if (area != 0) {
            System.out.printf("The area of the triangle is %d.", (int)area);
        } else {
            System.out.printf("%n0%nThe three points do not form a triangle!");
        }

    }
}
