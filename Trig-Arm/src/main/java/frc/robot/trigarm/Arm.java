package frc.robot.trigarm;

public class Arm {

    private double armseg1, armseg2;

    private Point goal;
    private Point origin;

    private Vector distance_c;

    public Arm(double armseg1, double armseg2){
        this.armseg1 = armseg1;
        this.armseg2 = armseg2;


        goal = new Point();
        origin = new Point();

    }

    public void setGoal(Point goal){
        this.goal = goal;

    }

    public void setOrigin(Point origin) {
        this.origin = origin;

    }

    public double calculateDistance(Point goal, Point origin, Vector distance_c) {
        distance_c = new Vector(origin, goal);

        return distance_c.getMagnitude();

    }

    public double calculateAlpha(Point goal) {

        return Math.atan2(goal.getY(), goal.getX());
    }

    public double calculateBeta(double armseg1, double armseg2) {

        return Math.acos(Math.pow(armseg2, 2)-(Math.pow(armseg1, 2) + Math.pow(distance_c.getMagnitude(), 2))/((-2) * armseg1 * distance_c.getMagnitude()));

    }

    public double calculateTheta() {

        return (calculateAlpha(goal) + calculateBeta(armseg1, armseg2));

    }

    public double calculateGamma(Vector distance_c, double armseg2) {

        return Math.asin(distance_c.getMagnitude() * (Math.sin(calculateBeta(armseg1, armseg2)/armseg2)));

    }
    
}
