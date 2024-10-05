public class UnitConverter {

    public static double convertUnit(double value, String fromUnit, String toUnit) {
        double inches = toInches(value, fromUnit);
        return fromInches(inches, toUnit);
    }

    private static double toInches(double value, String unit) {
        switch (unit) {
            case "inches":
                return value;
            case "feet":
                return value * 12;
            case "cubits":
                return value * 18;
            case "steps":
                return value * 30;
            case "yards":
                return value * 36;
            case "miles":
                return value * 63360;
            default:
                throw new IllegalArgumentException("Unsupported unit: " + unit);
        }
    }

    private static double fromInches(double value, String unit) {
        switch (unit) {
            case "inches":
                return value;
            case "feet":
                return value / 12;
            case "cubits":
                return value / 18;
            case "steps":
                return value / 30;
            case "yards":
                return value / 36;
            case "miles":
                return value / 63360;
            default:
                throw new IllegalArgumentException("Unsupported unit: " + unit);
        }
    }

    public static void main(String[] args) {
        double valueInInches = 72;
        double valueInFeet = convertUnit(valueInInches, "inches", "feet");
        System.out.println(valueInInches + " inches is equal to " + valueInFeet + " feet");
    }
}
