public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(74,173);
        System.out.format("%.1f", bmi);
    }
}
