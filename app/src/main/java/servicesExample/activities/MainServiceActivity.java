package servicesExample.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.app.asynctask.R;

import servicesExample.services.MyServiceFirst;

public class MainServiceActivity extends AppCompatActivity {

    private Button mBtnStartServices,mBtnStopServices;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_service);

        mBtnStartServices=(Button)findViewById(R.id.idBtnStartServices);
        mBtnStopServices=(Button)findViewById(R.id.idBtnStopServices);


        mBtnStartServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startService(new Intent(getBaseContext(),MyServiceFirst.class));

            }
        });

        mBtnStopServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stopService(new Intent(getBaseContext(),MyServiceFirst.class));

            }
        });
    }

}
