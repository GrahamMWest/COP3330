import java.util.Scanner;

public class CAI {

    public static void newQuestion(int userSelect, int userDifficulty) {

        switch (userSelect) {
            case 1:
                addition(userDifficulty);
                break;
            case 2:
                multiplication(userDifficulty);
                break;
            case 3:
                subtraction(userDifficulty);
                break;
            case 4:
                division(userDifficulty);
                break;
            default:
                break;
        }
    }

    public static void addition(int userDifficulty) {
        Scanner scnr = new Scanner(System.in);
        randomInteger createRandNum = new randomInteger();
        int rand1 = 0, rand2 = 0, userInput;
        double ans;
        int percent = 0;

        for (int i = 0; i < 10; i++) {

            if (userDifficulty == 1) {
                rand1 = createRandNum.generateRandomDifficultyOne();
                rand2 = createRandNum.generateRandomDifficultyOne();
            } else if (userDifficulty == 2) {
                rand1 = createRandNum.generateRandomDifficultyTwo();
                rand2 = createRandNum.generateRandomDifficultyTwo();
            } else if (userDifficulty == 3) {
                rand1 = createRandNum.generateRandomDifficultyThree();
                rand2 = createRandNum.generateRandomDifficultyThree();
            } else if (userDifficulty == 4) {
                rand1 = createRandNum.generateRandomDifficultyFour();
                rand2 = createRandNum.generateRandomDifficultyFour();
            }

            System.out.println("How much is " + rand1 + " plus " + rand2);
            userInput = scnr.nextInt();
            ans = rand1 + rand2;

            response(userInput, ans);
        }
    }

    public static void multiplication(int userDifficulty) {
        Scanner scnr = new Scanner(System.in);
        randomInteger createRandNum = new randomInteger();
        int rand1 = 0, rand2 = 0;
        double userInput, ans = 0;

        for (int i = 0; i < 10; i++) {

            if (userDifficulty == 1) {
                rand1 = createRandNum.generateRandomDifficultyOne();
                rand2 = createRandNum.generateRandomDifficultyOne();
            } else if (userDifficulty == 2) {
                rand1 = createRandNum.generateRandomDifficultyTwo();
                rand2 = createRandNum.generateRandomDifficultyTwo();
            } else if (userDifficulty == 3) {
                rand1 = createRandNum.generateRandomDifficultyThree();
                rand2 = createRandNum.generateRandomDifficultyThree();
            } else if (userDifficulty == 4) {
                rand1 = createRandNum.generateRandomDifficultyFour();
                rand2 = createRandNum.generateRandomDifficultyFour();
            }

            System.out.println("How much is " + rand1 + " times " + rand2);
            userInput = scnr.nextInt();
            ans = rand1 * rand2;

            response(userInput, ans);

        }
    }

    public static void subtraction(int userDifficulty) {
        Scanner scnr = new Scanner(System.in);
        randomInteger createRandNum = new randomInteger();
        int rand1 = 0, rand2 = 0;
        double userInput, ans;

        for (int i = 0; i < 10; i++) {

            if (userDifficulty == 1) {
                rand1 = createRandNum.generateRandomDifficultyOne();
                rand2 = createRandNum.generateRandomDifficultyOne();
            } else if (userDifficulty == 2) {
                rand1 = createRandNum.generateRandomDifficultyTwo();
                rand2 = createRandNum.generateRandomDifficultyTwo();
            } else if (userDifficulty == 3) {
                rand1 = createRandNum.generateRandomDifficultyThree();
                rand2 = createRandNum.generateRandomDifficultyThree();
            } else if (userDifficulty == 4) {
                rand1 = createRandNum.generateRandomDifficultyFour();
                rand2 = createRandNum.generateRandomDifficultyFour();
            }

            System.out.println("How much is " + rand1 + " minus " + rand2);
            userInput = scnr.nextInt();
            ans = rand1 - rand2;

            response(userInput, ans);

        }
    }

    public static void division(int userDifficulty) {
        Scanner scnr = new Scanner(System.in);
        randomInteger createRandNum = new randomInteger();
        double userInput, ans;
        int rand1 = 0, rand2 = 0;

        for (int i = 0; i < 10; i++) {

            if (userDifficulty == 1) {
                rand1 = createRandNum.generateRandomDifficultyOne();
                rand2 = createRandNum.generateRandomDifficultyOne();
            } else if (userDifficulty == 2) {
                rand1 = createRandNum.generateRandomDifficultyTwo();
                rand2 = createRandNum.generateRandomDifficultyTwo();
            } else if (userDifficulty == 3) {
                rand1 = createRandNum.generateRandomDifficultyThree();
                rand2 = createRandNum.generateRandomDifficultyThree();
            } else if (userDifficulty == 4) {
                rand1 = createRandNum.generateRandomDifficultyFour();
                rand2 = createRandNum.generateRandomDifficultyFour();
            }

            if (rand2 > rand1) {
                System.out.println("How much is " + rand2 + " divided by " + rand1);
                userInput = scnr.nextInt();
                ans = (double) rand2 / rand1;
            } else {
                System.out.println("How much is " + rand1 + " divided by " + rand2);
                userInput = scnr.nextInt();
                ans = (double) rand1 / rand2;
            }

            response(userInput, ans);
        }
    }

    public static void response(double userInput, double ans) {
        randomInteger createRandNum = new randomInteger();
        int choice = createRandNum.generateRandomChoice();

        if (userInput == ans) {
            switch (choice) {
                case 0:
                    System.out.println("Very good!");
                    break;
                case 1:
                    System.out.println("Excellent!");
                    break;
                case 2:
                    System.out.println("Nice work!");
                    break;
                case 3:
                    System.out.println("Keep up the good work!");
                    break;
                default:
                    break;

            }
        } else if (userInput != ans) {
            switch (choice) {
                case 0:
                    System.out.println("No. Please try again.");
                    break;
                case 1:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 2:
                    System.out.println("Don't give up!");
                    break;
                case 3:
                    System.out.println("No. Keep trying.");
                    break;
                default:
                    break;
            }
        }
    }

    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userSelect, userDifficulty;
        char userChoice = '\0';

        while (userChoice != 'q') {
            System.out.println("Computer-Assisted Instruction Program");
            System.out.println("Enter q to quit");
            System.out.println("What type of arithmetic would you like to study? (1. addition, 2. multiplication, 3. subtraction, 4. division)");
            userSelect = scnr.nextInt();

            System.out.println("What difficulty level would you like? (1, 2, 3, or 4)");
            userDifficulty = scnr.nextInt();

            newQuestion(userSelect, userDifficulty);

            userChoice = scnr.next().charAt(0);

            System.out.println("");
        }

    }
}
