package intentService.services1;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Android on 06-Dec-16.
 */

public class MyIntentService extends IntentService {
    public MyIntentService() {
        super("My Working Thread");
    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText( this,"OnStartCommand Called",Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        Toast.makeText(this,"OnHandleIntent called",Toast.LENGTH_SHORT).show();

        synchronized (this)
        {
            int count=0;

            while (count<10)
            {

                try {
                    wait(300);
                    count++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }



        }


    }

    @Override
    public void onDestroy() {

        super.onDestroy();
        Toast.makeText(this,"Ondestroy Called",Toast.LENGTH_SHORT).show();
    }
}
