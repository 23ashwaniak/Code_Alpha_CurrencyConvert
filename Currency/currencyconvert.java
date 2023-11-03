import java.util.Scanner;

class currencyconvert {
    // make function
    static void currencyConvert(int value) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter how much dollar you have..");
        int dollarValue = sc2.nextInt();
        switch (value) {
            case 1:
                System.out.println("Euro(EUR) value of " + dollarValue + "dollar is " + (dollarValue * 0.94));
                break;

            case 2:
                System.out.println(
                        "Australian dollar (AUD) value of " + dollarValue + "dollar is " + (dollarValue * 1.55));
                break;
            case 3:
                System.out
                        .println("Canadian dollar (CAD) value of " + dollarValue + "dollar is " + (dollarValue * 1.37));
                break;

            case 4:
                System.out.println("Indian Rupee (INR) value of " + dollarValue + "dollar is " + (dollarValue * 83.27));
                break;

            default:
                System.out.println("Enter valid input...");
                break;
        }
    }

    public static void main(String arg[]) {
        System.out.println("Currency Convertor Project By Ashwani......");
        Scanner sc = new Scanner(System.in);
        System.out.println("Select option.....");
        System.out.println("1. Dollar to Euro (EUR)");

        System.out.println("2. Dollar to Australian dollar (AUD)");
        System.out.println("3. Dollar to Canadian dollar (CAD) ");

        System.out.println("4. Dollar to Indian Rupee (INR)");
        int userInput = sc.nextInt();
        System.out.println("\n");
        currencyConvert(userInput);
        System.out.println("\n");
        System.out.println("Thanks........");

    }
}