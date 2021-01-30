package adapter;

public class AdapterExample {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone();
        iPhone.plugLightning();
        iPhone.recharge();
        System.out.println();

        Android android = new Android();
        android.plugTypeC();
        android.recharge();
        System.out.println();

        LightningToTypeCAdapter lightningToTypeCAdapter = new LightningToTypeCAdapter(iPhone);
        lightningToTypeCAdapter.plugLightning();
        lightningToTypeCAdapter.recharge();

    }
}
