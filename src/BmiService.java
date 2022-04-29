public class BmiService {

    public float calculate(int mass, float height) {

        float heightSquared = height * height;
        float bmi = mass / heightSquared;
        return bmi;

    }
}
