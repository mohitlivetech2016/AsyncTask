package com.app.asynctask;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Android on 05-Dec-16.
 */

public class MyAsyncTask extends AsyncTask<Void, Integer, String> {


    Context context;
    TextView textView;
    Button button;
    ProgressDialog  progressDialog;

    MyAsyncTask(Context context,TextView textView,Button button)
    {

        this.context=context;
        this.textView=textView;
        this.button=button;


    }

    protected String doInBackground(Void... param) {

        int i=0;

        synchronized (this)
        {

            while (i<10)
            {

                try {
                    wait(1500);
                    i++;
                    publishProgress(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }


        }



        return "Download Completed";
    }
    protected void onPreExecute() {

        progressDialog =new ProgressDialog((context));

        progressDialog.setTitle("Download in process....");
        progressDialog.setMax(10);
        progressDialog.setProgress(0);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.show();



    }



    protected void onPostExecute(String result) {

        textView.setText(result);
        button.setEnabled(true);
        progressDialog.hide();
    }


    protected void onProgressUpdate(Integer... valu) {


        int progress=valu[0];
        progressDialog.setProgress(progress);
        textView.setText("Download in progress ");
    }



}
