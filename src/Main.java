public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 80.7;
        double height = 1.78;
        int index = service.calculate(weight, height);
        System.out.println("Для роста " + height + " метра и веса " + weight + " кг индекс массы тела " + index + " кг/м2;");

    }
}
