//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Circle circle = new Circle();
//        circle.setRadius(5);
//        double areaOfCircle = circle.calculateArea();
//        System.out.println(areaOfCircle);
//
//        Rectangle rect1 = new Rectangle();
//        double areaOfRect1 = rect1.calculateArea();
//        System.out.println(areaOfRect1);
//        Rectangle rect2 = new Rectangle(10, 5);
//        double areaOfRect2 = rect2.calculateArea();
//        System.out.println(areaOfRect2);
//
//        Cylinder cylinder = new Cylinder(5, 10);
//        double areaOfCylinder = cylinder.calculateArea();
//        System.out.println(areaOfCylinder);

//        Scanner sc = new Scanner(System.in);
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

//        System.out.println("Enter the coefficents: ");
//        float a = sc.nextFloat();
//        float b = sc.nextFloat();
//        float c = sc.nextFloat();
//        try {
//            double[] roots = rootsOfQuadraticEq(a, b, c);
//            System.out.println("The roots are: " + roots[0] + " " + roots[1] );
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        System.out.println("Enter year: ");
//        int year = sc.nextInt();
//        if (isLeapYear(year)) {
//            System.out.println("Leap year!");
//        } else {
//            System.out.println(("Not a Leap year!"));
//        }

//        System.out.println("Enter two numbers: ");
//        float numOne = sc.nextFloat();
//        float numTwo = sc.nextFloat();
//        System.out.println("Select operation from add, sub, mul, div: ");
//        sc.nextLine();
//        String operation = sc.nextLine();
//        float result;
//        try {
//            result = performArithmeticOperations(numOne, numTwo, operation);
//            System.out.println("The result is: " + result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        System.out.println("Enter a number: ");
//        int number = sc.nextInt();
//        printDigits(number);

//        System.out.println("Enter a number: ");
//        int number = sc.nextInt();
//        System.out.println("The reverse is: " + reverseNumber(number));

//        System.out.println("Enter a number: ");
//        int number = sc.nextInt();
//        if (checkPalindrome(number)) {
//            System.out.println("Palindrome!");
//        } else {
//            System.out.println("Not A Palindrome!");
//        }

//        printPatternOne();
//        printPatternTwo();
//        printPatternThree();
//        printPatternFour();
//        printPatternFive();
//        printPatternSix();
//        printPatternSeven();
//
//        int[] inputArr = {3, 6, 9, 32, 4, 1, 5, 11, 34, 23, 31};
//        System.out.println(findSecondLargest(inputArr));

//        int[] inputArr = {3, 6, 9, 32, 4, 1, 5, 11, 34, 23, 31};
//        int[] outputArr = leftRotate1DArray(inputArr);
//        for (int x: outputArr) {
//            System.out.print(x+" ");
//        }

//        int[][] inputArr1 = {{3, 6, 9}, {32, 4, 1}, {5, 11, 34}};
//        int[][] inputArr2 = {{13, 4, 2}, {4, 9, 1}, {8, 31, 23}};
//        int[][] outputMatrix = addMatrices(inputArr1, inputArr2);
//        for(int i=0; i<outputMatrix.length; i++) {
//            for(int j=0; j<outputMatrix[0].length; j++) {
//                System.out.print(outputMatrix[i][j] + " ");
//            }
//            System.out.println("");
//        }
//
//        int[][] inputArr1 = {{3, 6, 9}, {32, 4, 1}, {5, 11, 34}};
//        int[][] inputArr2 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
//        int[][] outputMatrix = multiplyMatrices(inputArr1, inputArr2);
//        for(int i=0; i<outputMatrix.length; i++) {
//            for(int j=0; j<outputMatrix[0].length; j++) {
//                System.out.print(outputMatrix[i][j] + " ");
//            }
//            System.out.println("");
//        }

//        An array of Subject objects
        Subject[] subjects = new Subject[3];

        subjects[0] = new Subject((short) 1, "Maths", (short) 100, (short) 99);
        subjects[1] = new Subject((short) 2, "English", (short) 100, (short) 96);
        subjects[2] = new Subject((short) 3, "Science", (short) 100, (short) 98);

        Student studentOne = new Student((short) 4, "Ryan");
        studentOne.setSubjects(subjects);

//        Subject[] studentOneSubjects = studentOne.getSubjects();
//        for(Subject subject: studentOneSubjects) {
//            System.out.println(subject);
//        }
        System.out.println(studentOne);

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

//    public static double[] rootsOfQuadraticEq(float a, float b, float c) throws Exception {
//        double[] roots = {0, 0};
//        double rootOne, rootTwo;
//
//        float discriminant = (b*b)-(4*a*c);
//        if (discriminant < 0) {
//            throw new Exception("Imaginary roots. Please try again!");
//        } else {
//            rootOne = (-b + Math.sqrt(discriminant))/(2*a);
//            if (discriminant == 0) {
//                roots[0] = rootOne;
//                roots[1] = rootOne;
//            } else {
//                rootTwo = (-b - Math.sqrt(discriminant))/(2*a);
//                roots[0] = rootOne;
//                roots[1] = rootTwo;
//            }
//        }
//        return roots;
//    }

//    public static boolean isLeapYear(int year) {
//        boolean isLeap = false;
//
//        if(year%4 == 0) {
//            if(year%100 == 0) {
//                if(year%400 == 0) {
//                    isLeap = true;
//                }
//            } else {
//                isLeap = true;
//            }
//        }
//
//        return isLeap;
//    }

//    public static float performArithmeticOperations(float numOne, float numTwo, String operation) throws Exception {
//        float result = 0.0f;
//
//        switch(operation) {
//            case "add":
//                result = numOne + numTwo;
//                break;
//            case "sub":
//                result = numOne - numTwo;
//                break;
//            case "mul":
//                result = numOne * numTwo;
//                break;
//            case "div":
//                result = numOne / numTwo;
//                break;
//            default: throw new Exception("Not a valid operation");
//        }
//        return result;
//    }

//    public static void printDigits(int num) {
//        int copyOfNum = num;
//
//        while(copyOfNum > 0) {
//            int digit = copyOfNum % 10;
//            System.out.println(digit);
//            copyOfNum = copyOfNum / 10;
//        }
//    }

//    public static int reverseNumber(int num) {
//        int copyOfNum = num, reverseNum = 0;
//
//        while(copyOfNum > 0) {
//            int digit = copyOfNum % 10;
//            reverseNum = reverseNum * 10 + digit;
//            copyOfNum = copyOfNum / 10;
//        }
//
//        return reverseNum;
//    }
//
//    public static boolean checkPalindrome(int num) {
//        int revNum = reverseNumber(num);
//        return num == revNum;
//    }

//    public static void printPatternOne() {
//        for(int i=0; i<5; i++) {
//            for(int j=0; j<i+1; j++) {
//                System.out.print(j + 1 + " ");
//            }
//            System.out.println("");
//        }
//    }
//
//    public static void printPatternTwo() {
//        int counter = 1;
//        for(int i=0; i<5; i++) {
//            for(int j=0; j<i+1; j++) {
//                System.out.format("%02d ", counter++);
//            }
//            System.out.println("");
//        }
//    }

//    public static void printPatternThree() {
//        for(int i=0; i<5; i++) {
//            for(int j=i; j<5; j++) {
//                System.out.format("%2d", j+1);
//            }
//            System.out.println("");
//        }
//    }
//    public static void printPatternFour() {
//        for(int i=0; i<5; i++) {
//            for(int j=0; j<5; j++) {
//                if(j<i) {
//                    System.out.print("  ");
//                } else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//    }
//
//    public static void printPatternFive() {
//        for(int i=5; i>0; i--) {
//            for(int j=0; j<5; j++) {
//                if(j+1 >= i) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println("");
//        }
//    }

//    public static void printPatternSix() {
//        for(int i=0; i<5; i++) {
//            for(int j=0; j<5; j++) {
//                if(j+i > 3) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            for(int j=0; j<4; j++) {
//                if(j < i) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }
//    public static void printPatternSeven() {
//        for(int i=0; i<5; i++) {
//        for(int j=0; j<5; j++) {
//            if(j+i > 3) {
//                System.out.print("* ");
//            } else {
//                System.out.print("  ");
//            }
//        }
//        for(int j=0; j<4; j++) {
//            if(j < i) {
//                System.out.print("* ");
//            } else {
//                System.out.print("  ");
//            }
//        }
//        System.out.println();
//    }
//        for(int i=0; i<4; i++) {
//            for(int j=0; j<5; j++) {
//                if(j>i) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            for(int j=0; j<3; j++) {
//                if(j + i < 3) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }

//    public static int findSecondLargest(int[] arr) {
//        int largest = arr[0];
//        int secondLargest = arr[0];
//
////        if the number is less than secondLargest, continue
////        if the number is greater than largest, update both
////        if the number < largest && number > secondLargest, update secondLargest
//        for(int i=1; i<arr.length; i++) {
//            if(arr[i] > largest) {
//                secondLargest = largest;
//                largest = arr[i];
//            } else if(arr[i] > secondLargest) {
//                secondLargest = arr[i];
//            }
//        }
//
//        return secondLargest;
//    }

//    public static int[] leftRotate1DArray(int[] arr) {
//        int[] rotatedArr = new int[arr.length];
//
//        int temp = arr[0];
//
//        for(int i=1; i<arr.length; i++) {
//            rotatedArr[i-1] = arr[i];
//        }
//        rotatedArr[rotatedArr.length-1] = temp;
//        return rotatedArr;
//    }

//    public static int[][] addMatrices(int[][] m1, int[][] m2) {
//    Matrices should be of same dimension mxn , for performing addition and subtraction
//        int numOfRows = m1.length;
//        int numOfCols = m1[0].length;
//        int[][] addedMatrix = new int[numOfRows][numOfCols];
//
//        for(int i=0; i<numOfRows; i++) {
//            for(int j=0; j<numOfCols; j++) {
//                addedMatrix[i][j] = m1[i][j] + m2[i][j];
//            }
//        }
//
//        return addedMatrix;
//    }

//    public static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
//        Number of cols of first matrix (mxn) should be equal to
//        number of rows of second matrix (nxp) , for performing multiplication (mxp)
//        int numOfRows = m1.length;
//        int numOfCols = m1[0].length;
//        int[][] multipliedMatrix = new int[numOfRows][numOfCols];
//
//        for(int i=0; i<numOfRows; i++) {
//            for(int j=0; j<numOfCols; j++) {
//                int res = 0;
//                for(int k=0; k<m2.length; k++) {
//                    res = res + m1[i][k] * m2[k][j];
//                }
//                multipliedMatrix[i][j] = res;
//            }
//        }
//
//        return multipliedMatrix;
//    }
}