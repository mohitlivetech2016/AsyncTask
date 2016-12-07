package sharedpreferences.activity;

import android.content.Context;
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
import android.widget.Toast;

import com.app.asynctask.R;

import java.io.File;

public class LoginActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    public static final String MyPreferences = "MyPrefs" ;
    //public static final String mailId = "MyMail" ;
    //public static final String password = "MyPass" ;
    private EditText mEtName,mEtMailId,mEtPassword;
    private Button mBtnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shareprefencespctivity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mEtName=(EditText)findViewById(R.id.idEtRegisterActivityName);
        mEtMailId=(EditText)findViewById(R.id.idEtRegisterActivityMailId);
        mEtPassword=(EditText)findViewById(R.id.idEtRegisterActivityPassword);
        mBtnSubmit=(Button)findViewById(R.id.idBtnRegisterPageSubmit);

        sharedPreferences =getSharedPreferences(MyPreferences, Context.MODE_PRIVATE);

        mBtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String mail=  mEtMailId.getText().toString();
                String pass=mEtPassword.getText().toString();

                SharedPreferences.Editor editor= sharedPreferences.edit();
                editor.putString("mailId",mail);
                editor.putString("password",pass);
                editor.commit();

                System.out.print(sharedPreferences.getString("mailId","default value"));

                Toast.makeText(LoginActivity.this,"Thanks",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(LoginActivity.this,MainSharePrefencesActivity.class);
                startActivity(intent);

            }
        });


    }

}
