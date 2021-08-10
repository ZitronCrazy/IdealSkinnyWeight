public class KoreanIdolMeasurement {

    static final double topBust = 0.515;
    static final double underBust = 0.432;
    static final double waist = 0.37;
    static final double hip = 0.542;
    static final double thigh = 0.259;
    static final double calf = 0.205;
    static final double ankle = 0.126;

    static double[] koreanConstants = {
            topBust,
            underBust,
            waist,
            hip,
            thigh,
            calf,
            ankle
    };

    static String[] koreanConstantNames = {
            "top bust",
            "under bust",
            "waist",
            "hip",
            "thigh",
            "calf",
            "ankle"
    };

    public static void femaleKoreanMeasurement(double height) {
        if (height < 101) {
            System.out.println("Invalid Value.");
        }

        int number = 0;
        int finishNumber = 6;

        while (number <= finishNumber) {
            double femaleMeasurement = height * koreanConstants[number];
            double total = Math.round(femaleMeasurement * 10) / 10.0;
            System.out.println("Your ideal Korean female idol measurement for the " + koreanConstantNames[number] + " is " + total + " cm.");
            number ++;
        }
    }
}
