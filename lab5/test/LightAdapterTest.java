import org.junit.jupiter.api.Test;

public class LightAdapterTest {
    @Test
    public void LightAdapterTestStart() {
        Light light = new Light();
        Device lightAdapter = new LightAdapter(light);
        lightAdapter.startDevice();
    }

    @Test
    public void LightAdapterTestStop() {
        Light light = new Light();
        Device lightAdapter = new LightAdapter(light);
        lightAdapter.stopDevice();
    }
}