package com.app.asynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button mBtnShowProcessBar;
    private TextView mTvShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvShow=(TextView)findViewById(R.id.idTextView);
        mBtnShowProcessBar=(Button)findViewById(R.id.idBtnShowProgreeBar);

        mBtnShowProcessBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            MyAsyncTask myAsyncTask= new MyAsyncTask(MainActivity.this,mTvShow,mBtnShowProcessBar);
                myAsyncTask.execute();
                mBtnShowProcessBar.setEnabled(false);

            }
        });


    }
}
