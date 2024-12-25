import org.junit.jupiter.api.Test;

public class StopDeviceCommandTest {

    @Test
    public void testExecuteVacuum() {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        Device vacuumAdapter = new VacuumCleanerAdapter(vacuumCleaner);
        Command stopCommand = new StopDeviceCommand(vacuumAdapter);

        stopCommand.execute();
    }

    @Test
    public void testExecuteLight() {
        Light light = new Light();
        Device lightAdapter = new LightAdapter(light);
        Command stopCommand = new StartDeviceCommand(lightAdapter);

        stopCommand.execute();
    }
}
