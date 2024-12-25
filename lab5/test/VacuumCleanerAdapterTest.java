import org.junit.jupiter.api.Test;

public class VacuumCleanerAdapterTest {
    @Test
    public void VacuumCleanerAdapterTestStart() {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        Device vacuumAdapter = new VacuumCleanerAdapter(vacuumCleaner);
        vacuumAdapter.startDevice();
    }

    @Test
    public void VacuumCleanerAdapterTestStop() {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        Device vacuumAdapter = new VacuumCleanerAdapter(vacuumCleaner);
        vacuumAdapter.stopDevice();
    }
}
