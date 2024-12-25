public class VacuumCleanerAdapter extends Device {
    private final VacuumCleaner vacuumCleaner;
    public VacuumCleanerAdapter(VacuumCleaner vacuumCleaner) {
        this.vacuumCleaner = vacuumCleaner;
    }

    @Override
    public void startDevice(){
        vacuumCleaner.start();
    }

    @Override
    public void stopDevice(){
        vacuumCleaner.stop();
    }
}
