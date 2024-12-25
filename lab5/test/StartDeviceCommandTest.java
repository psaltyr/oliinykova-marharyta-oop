import org.junit.jupiter.api.Test;

public class StartDeviceCommandTest {

    @Test
    public void testExecuteVacuum() {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        Device vacuumAdapter = new VacuumCleanerAdapter(vacuumCleaner);
        Command startCommand = new StartDeviceCommand(vacuumAdapter);

        startCommand.execute();
    }

    @Test
    public void testExecuteLight() {
        Light light = new Light();
        Device lightAdapter = new LightAdapter(light);
        Command startCommand = new StartDeviceCommand(lightAdapter);

        startCommand.execute();
    }
}
