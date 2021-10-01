package practice.classroom;

public class Methods {
    public static void main(String[] args) {

        int y = 1;
        int x = 2;
        int result1 = y + x;
        System.out.println("Your result: " + result1);

        int result = returnSum(y, x);
        System.out.println("Your result: " + result);

        printName("Nikita");


    }

    // void - return nothing
    // public static int sum(int firstNumber, int secondNumber)
    //return value;

    public static void sum(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        System.out.println("Your result: " + result);
    }

    public static  int returnSum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public static void printName(String name){
        System.out.println("Print providet name: " + name);
    }
}
