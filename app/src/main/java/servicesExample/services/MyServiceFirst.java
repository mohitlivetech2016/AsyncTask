package servicesExample.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Android on 06-Dec-16.
 */

public class MyServiceFirst extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "service starting OnstartCommand", Toast.LENGTH_SHORT).show();

        //stopSelf();
        return START_STICKY;
    }

    @Override
    public void onCreate() {

        Toast.makeText(this, "service oncreated", Toast.LENGTH_SHORT).show();
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "service destroy", Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        Toast.makeText(this , "Ibinder called..." , Toast.LENGTH_SHORT).show();
        return null;
    }


}
