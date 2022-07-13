public class BmiService {
    public double calculate(double weight, double height) {
        double heightSquare = height * height / 10000;
        return weight / heightSquare;
    }

}
