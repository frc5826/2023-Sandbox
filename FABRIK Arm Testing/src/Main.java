import fabrik.Arm2Segment;
import fabrik.Point;
import fabrik.Vector;
import org.junit.Test;
import static org.junit.Assert.*;

public class Main {
    @Test
    public void testArm() {
        double[] armLengths = {6, 6};
        Arm2Segment arm = new Arm2Segment(armLengths, 0.01);
        arm.setGoal(new Point(1, 1));
        arm.fabrik();

        assertEquals(1, Math.round(arm.getPointInArm(2).getX()), 0);
    }
}