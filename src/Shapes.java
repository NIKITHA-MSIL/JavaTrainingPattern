import java.util.Scanner;

public class Shapes {
    public static void main(String args[]) {
        System.out.print("Enter the number of rows: ");
        int n = 5;
        int i, j;
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        Scanner nc = new Scanner(System.in);

        System.out.println("1.square\n2.triangle\n3.cylender\nInput the shape");
        String shape = nc.nextLine();
        switch (shape) {
            case "2":
                printtriangle("square", n);
                break;
            case "1":
                printsquare(rows);
                break;
            case "3": cylinder();
                break;
        }

    }

    public static void printcylender(Scanner sc,boolean isNumber)
    {
        String a;
        if (isNumber) {
            a = "1";
        } else {
            a = "A";
        }
        System.out.println("enter radious");
        int radius = sc.nextInt();
        float dist;
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                dist = (float) Math.sqrt((i - radius) * (i - radius) +
                        (j - radius) * (j - radius));

                if (dist > radius - 0.1 && dist < radius + 0.8)
                {
                    System.out.print(a);
                }
                else if(i == 2 * radius-2 || i == 2)
                {
                    System.out.print(a);

                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }
    }


    public static void printtriangle(String square, int n) {
        System.out.println("enter alphabets or numbers");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("numbers")) {
            for (int i = 1; i <= n; i++) {
                int p = 1;
                for (int j = i; j <= n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j < i; j++) {
                    System.out.print(p++ + " ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(p-- + " ");
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= n - i; j++) {
                    System.out.printf(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%c", (char) (j + 64));
                }
                for (int j = i - 1; j >= 1; j--) {
                    System.out.printf("%c", (char) (j + 64));
                }

                System.out.println();
            }

        }
    }

    public static void printSquare(int row, boolean isNumber) {
        String a, b;
        if (isNumber) {
            a = "1";
            b = "2";
        } else {
            a = "A";
            b = "B";
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i != 0 && i != row - 1) {
                    if (j != 0 && j != row - 1) {
                        System.out.print(b + " ");
                    } else {
                        System.out.print(a + " ");
                    }
                } else {
                    System.out.print(a + " ");
                }
            }
            System.out.print("\n");
        }

    }

    public static void cylinder() {
        System.out.println("enter alphabets or numbers");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("numbers")) {
            printcylender(scanner, true);
        } else {
            printcylender(scanner, false);
        }
    }
    public static void printsquare( int rows) {
        System.out.println("enter alphabets or numbers");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("numbers")) {
            printSquare(rows, true);
        } else {
            printSquare(rows, false);
        }
    }

}










