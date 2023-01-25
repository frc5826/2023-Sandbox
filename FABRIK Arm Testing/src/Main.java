import fabrik.Arm2Segment;
import fabrik.Point;
import org.junit.Test;
import static org.junit.Assert.*;

public class Main {
    @Test
    public void testArm() {
        double[] armLengths = {1, 1};
        Arm2Segment arm = new Arm2Segment(armLengths, 0.01);
        arm.setGoal(new Point(1, 1));
        arm.fabrik();

        assertEquals(1, arm.getPointInArm(2).getY(), 0);
    }
}