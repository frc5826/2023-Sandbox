package frc.robot.trigarm;

public class Arm {

    private double armseg1, armseg2;

    private Point goal;

    private Point origin;

    private Vector distance_c;

    public Arm(double armseg1, double armseg2, Point origin){
        this.armseg1 = armseg1;
        this.armseg2 = armseg2;

        this.origin = origin;

        goal = new Point(10,10);

    }

    public double calculateDistance() {
        distance_c = new Vector(origin, goal);

        return distance_c.getMagnitude();

    }

    public double calculateAlpha() {

        return Math.atan2(goal.getY(), goal.getX());
    }

    public double calculateBeta() {

        return Math.acos((Math.pow(armseg2, 2)-(Math.pow(armseg1, 2) + Math.pow(calculateDistance(), 2)))/((-2) * armseg1 * calculateDistance()));

    }

    public double calculateTheta() {

        return (calculateAlpha() + calculateBeta());

    }

    public double calculateGamma() {

        return Math.asin(distance_c.getMagnitude() * (Math.sin(calculateBeta()/armseg2)));

    }

    public double returnMaxRange() {

        return armseg1 + armseg2;
    }

    public double returnMinRange() {

        return armseg2 - armseg1;
    }

}
