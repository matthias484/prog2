

import org.testng.annotations.Test;
import trafficlight.ctrl.TrafficLightCtrl;

import static org.junit.jupiter.api.Assertions.*;


public class TrafficLightTest {

    @Test // check if not null
    public void SingletonTest() {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        assertNotNull(ctrl);
    }

    @Test // ctrl1 equals ctrl2
    public void SingletonTest2() {
        TrafficLightCtrl ctrl1 = TrafficLightCtrl.getInstance();
        TrafficLightCtrl ctrl2 = TrafficLightCtrl.getInstance();
        assertEquals(ctrl1,ctrl2);
    }

    @Test
    public void current() {

        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance(); //if current = green, next ist yellow
        ctrl.initStates();
        String currentColor = ctrl.getCurrentState().getColor();
        assertEquals(currentColor, "green");

    }
    @Test
    public void next() {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.nextState();
        String currentColor = ctrl.getCurrentState().getColor();
        assertEquals(currentColor, "yellow");
}



}
