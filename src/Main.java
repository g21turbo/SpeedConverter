public class Main {
    public static void main(String[] args) {

        toMilesPerHour(25);
        printConversion(25);

    }
    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("invalid value");
            return -1;
        } else {
            double milesPerHour = 0;
            milesPerHour = kilometersPerHour / 1.609;
            return Math.round(milesPerHour);
        }
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {

            double milesPerHour = kilometersPerHour / 1.609;

            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }


}