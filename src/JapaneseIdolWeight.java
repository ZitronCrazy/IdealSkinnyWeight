public class JapaneseIdolWeight {
    public static void femaleJapaneseWeight(double height) {
        if (height < 101) {
            System.out.println("Invalid Value.");
        }
        double decreasedHeight = height - 100;
        double femaleWeight = decreasedHeight * 0.9;
        double totalWeight = Math.round(femaleWeight * 10) / 10.0;
        System.out.println("Your specified height: " + height + " cm");
        System.out.println("Your ideal Japanese female idol weight will be " + totalWeight + " kg.");
    }
}
