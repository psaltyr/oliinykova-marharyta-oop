import org.junit.jupiter.api.Test;

public class VacuumCleanerTest {
    @Test
    public void testVacuumCleanerStart() {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.start();
    }

    @Test
    public void testVacuumCleanerStop() {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.stop();
    }
}
