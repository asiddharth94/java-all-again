import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the base of the triangle:");
//        float base = sc.nextFloat();
//        System.out.println("Enter the height of the triangle:");
//        float height = sc.nextFloat();
//        System.out.println("The area of the triangle is: " + areaOfTriangleByBaseAndHeight(base, height));

//        System.out.println("Enter the sides of the triangle: ");
//        float sideOne = sc.nextFloat();
//        float sideTwo = sc.nextFloat();
//        float sideThree = sc.nextFloat();
//        System.out.println("The area of the triangle is: " + areafTriangleBySides(sideOne, sideTwo, sideThree));

        System.out.println("Enter the coefficents: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        try {
            double[] roots = rootsOfQuadraticEq(a, b, c);
            System.out.println("The roots are: " + roots[0] + " " + roots[1] );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    static methods belong to the class, non-static methods belong to instances of the class.
//    public static float areaOfTriangleByBaseAndHeight(float base, float height) {
//        return base*height/2;
//    }

//    public static double areafTriangleBySides(float sideOne, float sideTwo, float sideThree) {
//        float s = (sideOne+sideTwo+sideThree)/2;
//        double area = Math.sqrt(s*(s-sideOne)*(s-sideTwo)*(s-sideThree));
//        return area;
//    }

    public static double[] rootsOfQuadraticEq(float a, float b, float c) throws Exception {
        double[] roots = {0, 0};
        double rootOne, rootTwo;

        float discriminant = (b*b)-(4*a*c);
        if (discriminant < 0) {
            throw new Exception("Imaginary roots. Please try again!");
        } else {
            rootOne = (-b + Math.sqrt(discriminant))/(2*a);
            if (discriminant == 0) {
                roots[0] = rootOne;
                roots[1] = rootOne;
            }
            else {
                rootTwo = (-b - Math.sqrt(discriminant))/(2*a);
                roots[0] = rootOne;
                roots[1] = rootTwo;
            }
        }
        return roots;
    }

}