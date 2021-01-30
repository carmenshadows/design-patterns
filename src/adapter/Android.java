package adapter;

public class Android implements TypeCInterface {

    @Override
    public void plugTypeC() {
        System.out.println("plugging type c cable to android");
    }

    @Override
    public void recharge() {
        System.out.println("recharging android");
    }
}
