package co.com.ceiba.mobile.pruebadeingreso;

import android.content.Context;

public class BaseApplication extends android.app.Application {

    private static Context mContext;
    private static BaseApplication INSTANCE;
    public static Context getContext() {return INSTANCE;}
}
