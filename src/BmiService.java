public class BmiService {

    public int calculate(double weight, double height) {
        double bmi = weight / (height * height);
        int index = (int) bmi;
        return index;
    }
}
