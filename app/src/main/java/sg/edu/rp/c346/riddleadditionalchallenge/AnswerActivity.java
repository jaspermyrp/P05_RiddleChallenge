package sg.edu.rp.c346.riddleadditionalchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Log.d("AnswerActivity", "onCreate() called.");

        tvOut = findViewById(R.id.textView);

        Intent getIntent = getIntent();

        int getQuestionNumber = getIntent.getIntExtra("question", 0);
        String getQuestionAnswer = getIntent.getStringExtra("answer");

        String output = "Q"+getQuestionNumber+" answer is: "+getQuestionAnswer;
        if(getQuestionNumber != 0){
            tvOut.setText(output);
        }else{
            tvOut.setText("No question specified!");
        }
    }

    @Override
    protected void onStart() {
        Log.d("AnswerActivity", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("AnswerActivity", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("AnswerActivity", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("AnswerActivity", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("AnswerActivity", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("AnswerActivity", "onRestart() called.");
        super.onRestart();
    }

}
