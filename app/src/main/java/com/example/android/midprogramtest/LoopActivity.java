package com.example.android.midprogramtest;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoopActivity extends AppCompatActivity {

    private int num;
    private int result;
    TextView textView;
    EditText numberEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);
        textView = (TextView) findViewById(R.id.text_view);
        numberEdit = (EditText) findViewById(R.id.number_edittext);

        numberEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AsyncT asyncT = new AsyncT();
               // num = numberEdit.getText(); // Attempted to store the number provided in edittext in order to use that value with the loops method
                asyncT.execute(num);
                Intent intent = new Intent(LoopActivity.this, LoginActivity.class);
            }
        });





    }



    private class AsyncT extends AsyncTask<Integer, Integer, Integer> {

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

}



