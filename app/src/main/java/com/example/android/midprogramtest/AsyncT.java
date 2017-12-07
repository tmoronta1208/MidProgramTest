package com.example.android.midprogramtest;

import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

class AsyncT extends AsyncTask<Integer, Integer, Integer> {

    private int num;
    private int result;
    TextView textView;

    @Override
    protected Integer doInBackground(Integer... integers) {

        result = 0;
        for (int i = num; i <= 100000; i++) {
            result = result + i;
            publishProgress(result);
        }
        return result;
    }

    protected void onPreExecute(){}

    protected void onProgressUpdate(Integer...integers){

     textView.setText("Loops Completed: " + result);

    }
    protected void onPostExecute(){

        textView.setText("Loops Completed: " + result);

    }




}
