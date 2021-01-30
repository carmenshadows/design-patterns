package adapter;

public class IPhone implements LightningInterface {

    @Override
    public void plugLightning() {
        System.out.println("plugging lightning cable to iphone");
    }

    @Override
    public void recharge() {
        System.out.println("recharging iphone");
    }
}
