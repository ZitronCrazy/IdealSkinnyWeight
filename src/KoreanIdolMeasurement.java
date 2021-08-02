public class KoreanIdolMeasurement {
    public static void femaleKoreanMeasurement(double height) {
        if (height < 101) {
            System.out.println("Invalid Value.");
        }
        double femaleMeasurementTopBust = height * 0.515;
        double totalTopBust = Math.round(femaleMeasurementTopBust * 10) / 10.0;
        System.out.println("Your ideal Korean female idol measurement for the top bust is " + totalTopBust + " cm.");

        double femaleMeasurementUnderBust = height * 0.432;
        double totalUnderBust = Math.round(femaleMeasurementUnderBust * 10) / 10.0;
        System.out.println("Your ideal Korean female idol measurement for the under bust is " + totalUnderBust + " cm.");

        double femaleMeasurementWaist = height * 0.37;
        double totalWaist = Math.round(femaleMeasurementWaist * 10) / 10.0;
        System.out.println("Your ideal Korean female idol measurement for the waist is " + totalWaist + " cm.");

        double femaleMeasurementHip = height * 0.542;
        double totalHip = Math.round(femaleMeasurementHip * 10) / 10.0;
        System.out.println("Your ideal Korean female idol measurement for the hip is " + totalHip + " cm.");

        double femaleMeasurementThigh = height * 0.259;
        double totalThigh = Math.round(femaleMeasurementThigh * 10) / 10.0;
        System.out.println("Your ideal Korean female idol measurement for the thigh is " + totalThigh + " cm.");

        double femaleMeasurementCalf = height * 0.205;
        double totalCalf = Math.round(femaleMeasurementCalf * 10) / 10.0;
        System.out.println("Your ideal Korean female idol measurement for the calf is " + totalCalf + " cm.");

        double femaleMeasurementAnkle = height * 0.126;
        double totalAnkle = Math.round(femaleMeasurementAnkle * 10) / 10.0;
        System.out.println("Your ideal Korean female idol measurement for the ankle is " + totalAnkle + " cm.");
    }
}
