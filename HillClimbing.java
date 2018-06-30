public class HillClimbing {

    private final double START_X_COORDINATE;
    private final double END_X_COORDINATE;


    public HillClimbing() {
        START_X_COORDINATE = -2;
        END_X_COORDINATE = 2;
    }

    private double f(double x) {
        return -(x-1)*(x-1)+2;
    }


    public double hillClimbing() {
        double dx = 0.01;
        double currentPoint = START_X_COORDINATE;
        double max;

        for (max = f(currentPoint); max <= f(currentPoint+dx) && currentPoint <= END_X_COORDINATE; currentPoint+=dx) {
            max = f(currentPoint+dx);
            System.out.printf("Climbing to x: %.2f f(x): %.2f\n", currentPoint, f(currentPoint));
        }

        System.out.println("Max local maximum with hill climbing " + max);
        return max;

    }

}
