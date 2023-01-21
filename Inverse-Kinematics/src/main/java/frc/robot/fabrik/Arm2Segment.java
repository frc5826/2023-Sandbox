package frc.robot.fabrik;

import frc.robot.Constants;

public class Arm2Segment {

    private double[] armLengths;
    private Point[] points = new Point[3];
    private Point goal;

    private double errorMargin;

    public Arm2Segment(double[] armLengths, double errorMargin){
        this.armLengths = armLengths;
        for(int x = 0; x < points.length; x++){
            points[x] = new Point();
        }
        findPointsFromEncoders();

        goal = new Point();

        this.errorMargin = errorMargin;
    }

    public void findPointsFromEncoders(){
        //TODO use encoders to find our starting points
        //currently assumes our arm is perfectly vertical, fine for current equations
        points[1].setCoords(0, armLengths[1]);
        points[2].setCoords(0, armLengths[2] + points[1].getY());
    }

    public void setGoal(Point goal){
        this.goal = goal;
    }

    public boolean outOfMargin(){
        return Math.sqrt(Math.pow((goal.getX()-points[2].getX()),2) + Math.pow((goal.getY()-points[2].getY()),2)) > errorMargin;
    }

    public void fabrik(){

        Point[] pointsPrime = new Point[3];

        for(int x = 0; x < pointsPrime.length; x++){
            pointsPrime[x] = new Point();
        }

        while(outOfMargin()){

            //FORWARD

            pointsPrime[2] = goal;

        }
    }

    public Point getNextPrime(Point origin, Point cast){
        //TODO do the vector thing to find the next prime point
        return new Point();
    }

}
