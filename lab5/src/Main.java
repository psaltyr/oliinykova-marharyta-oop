public class Main {
    public static void main(String[] args) {

        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        Light light = new Light();

        Device vacuumAdapter = new VacuumCleanerAdapter(vacuumCleaner);
        Device lightAdapter = new LightAdapter(light);

        Command startDeviceVacuum = new StartDeviceCommand(vacuumAdapter);
        Command stopDeviceVacuum = new StopDeviceCommand(vacuumAdapter);

        Command startDeviceLight = new StartDeviceCommand(lightAdapter);
        Command stopDeviceLight = new StopDeviceCommand(lightAdapter);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.addCommand(startDeviceVacuum);
        remoteControl.addCommand(startDeviceLight);
        remoteControl.addCommand(stopDeviceLight);
        remoteControl.addCommand(stopDeviceVacuum);

        remoteControl.executeCommands();
    }
}