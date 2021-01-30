package adapter;

public class LightningToTypeCAdapter implements LightningInterface {

    private final LightningInterface lightningInterface;

    public LightningToTypeCAdapter(LightningInterface lightningInterface) {
        this.lightningInterface = lightningInterface;
    }

    @Override
    public void plugLightning() {
        System.out.println("type c plugged"); // like plugging to adapter.
        lightningInterface.plugLightning(); // like plugging to iphone.
    }

    @Override
    public void recharge() {
        System.out.println("recharging iphone by the type c cable.");
    }
}
