package sharedpreferences.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.app.asynctask.R;

import java.io.File;

public class MainSharePrefencesActivity extends AppCompatActivity {

    private static final String MY_PREFS_NAME = "MyPreferences";
    private EditText mEtMailId,mEtPassword;
    private Button mBtnLogin,mBtnReset,mBtnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_share_prefences);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mEtMailId=(EditText)findViewById(R.id.idEtRegisterActivityMailId);
        mEtPassword=(EditText)findViewById(R.id.idEtMainActivityPassword);
        mBtnLogin=(Button)findViewById(R.id.idBtnLogin);
        mBtnRegister=(Button)findViewById(R.id.idBtnRegister);
        mBtnReset=(Button)findViewById(R.id.idBtnReset);


        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainSharePrefencesActivity.this,LoginActivity.class);
                startActivity(intent);

            }
        });



    }

    @Override
    protected void onStart() {


        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        String restoredText = prefs.getString("text", null);
        if (restoredText != null) {
            String mail = prefs.getString("mailId", "No name defined");
            String pass = prefs.getString("password", "No Password");


        }
        System.out.print(prefs.getString("mailId","default value"));

        super.onStart();
    }

    @Override
    protected void onResume() {


        //contains(String mailId)


        super.onResume();

    }
}
