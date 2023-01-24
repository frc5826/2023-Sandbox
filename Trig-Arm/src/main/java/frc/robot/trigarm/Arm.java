package frc.robot.trigarm;

public class Arm {

    private double[] armSegments = new double[2];

    private Point goal;

    public Arm(double[] armSegments){

        for(int i = 0; i < this.armSegments.length; i++){
            this.armSegments[i] = armSegments[i];
        }

        goal = new Point();

    }

    public void setGoal(Point goal){
        this.goal = goal;


    }



}
