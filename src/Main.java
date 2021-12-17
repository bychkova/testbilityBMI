public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 70;
        int height = 168;
        double BmiScore = service.calculate(weight, height);
        System.out.printf("%.1f", BmiScore);
    }
}
