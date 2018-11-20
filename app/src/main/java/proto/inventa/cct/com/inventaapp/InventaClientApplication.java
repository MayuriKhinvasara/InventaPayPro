package proto.inventa.cct.com.inventaapp;

import android.content.Context;

import proto.inventa.cct.com.inventalibrary.InventaSdk;

public class InventaClientApplication extends InventaSdk {

    public static final String TAG = InventaClientApplication.class.getSimpleName();
    private static Context applicationContext;
    public static int realWorldDistance = 0;


    @Override
    public void onCreate() {
        super.onCreate();
      //  Fabric.with(this, new Crashlytics());
      //  DiscoveryHelper.setDiscoveryTransitionsReceiver(new DiscoveryBroadcastReceiver());
        applicationContext = getApplicationContext();

    }

    /**
     * Gets the application context.
     *
     * @return the context
     */
    public static Context getContext() {
        return applicationContext;
    }



}
