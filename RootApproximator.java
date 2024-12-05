public class RootApproximator {

    public static double approximateRoot(double a, double MAXEPSILON) {
        double guess = 1.0;

        while (true) {
            double newGuess = (guess + a / guess) / 2;
            System.out.println(guess);
            if (Math.abs(guess - newGuess) < MAXEPSILON) {
                return newGuess;
            }
            guess = newGuess;
        }
    }

    public static void main(String[] args) {
        double number = 115; 
        double epsilon = 0.0001; 

        double result = approximateRoot(number, epsilon);
        System.out.println("Approximate square root of " + number + " is: " + result);
    }
}
