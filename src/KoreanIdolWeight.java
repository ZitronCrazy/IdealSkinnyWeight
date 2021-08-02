public class KoreanIdolWeight {
    public static void femaleKoreanWeight(double height) {
        if (height < 101) {
            System.out.println("Invalid Value.");
        }
        double decreasedHeight = height - 100;
        double femaleWeight = decreasedHeight * 0.8;
        double totalWeight = Math.round(femaleWeight * 10) / 10.0;
        System.out.println("Your ideal Korean female idol weight will be " + totalWeight + " kg.");
    }
}
