package intentService.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.asynctask.R;

import intentService.services1.MyIntentService;

public class MainIntentServicesActivity extends AppCompatActivity {

    Button mBtnStartIntentServices,mBtnStopIntentServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_intent_services);

        mBtnStartIntentServices=(Button)findViewById(R.id.idBtnStartIntentService);
        mBtnStopIntentServices=(Button)findViewById(R.id.idBtnStopIntentService);
        mBtnStartIntentServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startService(new Intent(getBaseContext(),MyIntentService.class));
                //Intent intent=new Intent(this, MyIntentService.class);
                //startService(intent);

            }
        });
        mBtnStopIntentServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Intent intent=new Intent(this,MyIntentService.class);
                //startService(intent);
                stopService(new Intent(getBaseContext(),MyIntentService.class));

            }
        });


    }




   /* public void startIntentService(View view)
    {

        Intent intent=new Intent(this, MyIntentService.class);
                startService(intent);

    }*/


}
