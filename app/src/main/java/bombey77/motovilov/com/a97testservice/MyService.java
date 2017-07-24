package bombey77.motovilov.com.a97testservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Ромашка on 23.07.2017.
 */

public class MyService extends Service {

    //add this string for test

    private static final String LOG = "myLogs";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(LOG, "onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(LOG, "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(LOG, "onBind");
        return null;
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        Log.d(LOG, "onRebind");
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(LOG, "onUnbind");
        return trueg;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG, "onDestroy");
    }
}
