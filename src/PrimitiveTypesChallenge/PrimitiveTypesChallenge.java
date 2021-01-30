package PrimitiveTypesChallenge;

// MY SOLUTION WAY
public class PrimitiveTypesChallenge {
    public static void main(String[] args) {

        byte myChallengeByteValue = 10;
        short myChallengeShortValue = 20;
        int myChallengeIntValue = 50;
        long myChallengeLongValue = 50000 + (10 * (long) (myChallengeByteValue + myChallengeShortValue + myChallengeIntValue));
        System.out.println("Challenge Value = " + myChallengeLongValue);

// TIMS SOLUTION WAY
      byte byteValue = 10;
      short shortValue = 20;
      int intValue = 50;
      long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
      System.out.println("Total Value = " + longTotal);

      short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
      System.out.println("Short Total = " + shortTotal);

    }
}