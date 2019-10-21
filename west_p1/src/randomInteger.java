import java.security.SecureRandom;

public class randomInteger {

        public int generateRandomChoice() {
            SecureRandom rand = new SecureRandom();

            int randNum = rand.nextInt(4);

            return randNum;
        }

        public int generateRandomDifficultyOne() {
            SecureRandom rand = new SecureRandom();

            int randNum = rand.nextInt(9);

            return randNum;
        }

        public int generateRandomDifficultyTwo() {
            SecureRandom rand = new SecureRandom();

            int randNum = rand.nextInt(99);

            return randNum;
        }

        public int generateRandomDifficultyThree() {
            SecureRandom rand = new SecureRandom();

            int randNum = rand.nextInt(999);

            return randNum;
        }

        public int generateRandomDifficultyFour() {
            SecureRandom rand = new SecureRandom();

            int randNum = rand.nextInt(999);

            return randNum;
        }
    }
