import org.junit.jupiter.api.Test;

public class LightTest {
    @Test
    public void testLightTurnOn() {
        Light light = new Light();
        light.turnOn();
    }

    @Test
    public void testLightTurnOff() {
        Light light = new Light();
        light.turnOff();
    }
}
