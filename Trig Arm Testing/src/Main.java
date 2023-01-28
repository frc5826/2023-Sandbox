import trigarm.*;

import static java.lang.Float.NaN;

public class Main {
    public static void main(String[] args) {

        Point goal = new Point(3, 4);
        Point origin = new Point(0,0);

        Arm arm = new Arm(5,5, goal, origin);

        System.out.println((180/Math.PI) * arm.calculateAlpha());
        System.out.println(arm.calculateDistance());
        System.out.println(180/Math.PI * (arm.calculateBeta()));
        System.out.println((180/Math.PI) * arm.calculateTheta());
        System.out.println((180/Math.PI) * arm.calculateGamma());

        if (arm.calculateDistance() > arm.checkReach()){
            System.out.println("Out of reach");
        } else {
            System.out.println("Within reach");
        }

    }
}