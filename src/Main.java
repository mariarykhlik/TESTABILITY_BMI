public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        int mass = 60;
        float height = 1.80F;

        String bmi = String.format("%.1f", service.calculate(mass, height));
        System.out.println("При росте " + height + " (м) и весе " + mass + " (кг) индекс массы тела равен: ");
        System.out.println(bmi);

    }
}
