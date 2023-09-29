package laba;

public class Temperature implements Convertable {
    private double temp;

    public Temperature(double temp) {
        this.temp = temp;
    }

    public double convert(String temp_type) {
        double result = 0;

        switch (temp_type) {
            case "f":
                result = ((double)this.temp * (double)(9 / 5)) + (double)32;
                return result;
            case "k":
                result = ((double)this.temp + 273.15d);
                return result;
            default:
                break;
        }

        return result;
    }


}
