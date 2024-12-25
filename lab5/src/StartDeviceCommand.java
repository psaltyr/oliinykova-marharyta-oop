public class StartDeviceCommand implements Command{
    private final Device device;

    public StartDeviceCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.startDevice();
    }
}
