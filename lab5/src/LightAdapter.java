public class LightAdapter extends Device{
    private final Light light;
    public LightAdapter(Light light) {
        this.light = light;
    }

    @Override
    public void startDevice(){
        light.turnOn();
    }

    @Override
    public void stopDevice(){
        light.turnOff();
    }
}
