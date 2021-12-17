public class BmiService {
    public double calculate (int weightKg, int heightCm){
        double heightM = (heightCm * 1.0f) / 100.0;
        return (weightKg * 1.0f) / (heightM * heightM);
    }
}
