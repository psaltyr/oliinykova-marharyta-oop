public class StopDeviceCommand implements Command {
    private final Device device;

    public StopDeviceCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.stopDevice();
    }
}
