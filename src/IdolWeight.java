public class IdolWeight {

    static final double japaneseWeight = 0.9;
    static final double koreanWeight = 0.8;

    static double[] weightConstants = {
            japaneseWeight,
            koreanWeight
    };

    static String[] weightConstantNames = {
            "Japanese",
            "Korean"
    };

    public static void femaleWeight (double height) {
        if (height < 101) {
            System.out.println("Invalid Value.");
        }

        int number = 0;
        int finishNumber = 1;

        while (number <= finishNumber) {
            double decreasedHeight = height - 100;
            double femaleWeight = decreasedHeight * weightConstants[number];
            double totalWeight = Math.round(femaleWeight * 10) / 10.0;
            System.out.println("Your ideal " + weightConstantNames[number] + " female idol weight will be " + totalWeight + " kg.");
            number ++;
        }
    }
}
