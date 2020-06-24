package com.myapps.ayoobelajarfiqih;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizEndActivity extends AppCompatActivity {

    // Private Constants
    private static final String TAG = "QuizEndActivity";

    // Private member variables
    private int correctAnswers;
    private int incorrectAnswers;
    private MediaPlayer player;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the values for correctAnswers and incorrectAnswers
        if (null != savedInstanceState
                && savedInstanceState.containsKey("correctAnswers")
                && savedInstanceState.containsKey("incorrectAnswers")) {
            correctAnswers = savedInstanceState.getInt("correctAnswers");
            incorrectAnswers = savedInstanceState.getInt("incorrectAnswers");
        } else if (null != getIntent().getExtras()
                && getIntent().getExtras().containsKey("correctAnswers")
                && getIntent().getExtras().containsKey("incorrectAnswers")) {
            correctAnswers = getIntent().getExtras().getInt("correctAnswers");
            incorrectAnswers = getIntent().getExtras().getInt(
                    "incorrectAnswers");
        } else {
            Log.w(TAG,
                    "Data for the number of correct/incorrect answers was not provided. This indicates that this Activity was started incorrectly.");
            correctAnswers = 0;
            incorrectAnswers = 0;
        }

        // Display the end of quiz summary
        setContentView(R.layout.quiz_end_summary);

        player = MediaPlayer.create(this, R.raw.keluar);
        correctAnswers = correctAnswers * 5;
        // Set the values for correct and incorrect answers
        final TextView correctAnswersText = (TextView) findViewById(R.id.quiz_end_correct_number);
        correctAnswersText.setText(String.valueOf(correctAnswers));

        final TextView incorrectAnswersText = (TextView) findViewById(R.id.quiz_end_incorrect_number);
        incorrectAnswersText.setText(String.valueOf(incorrectAnswers));

        // Set up the button to return to the main menu
        final Button quizEndButton = (Button) findViewById(R.id.quiz_end_accept_button);
        quizEndButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View v) {
                player.start();
                finish();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        outState.putInt("correctAnswers", correctAnswers);
        outState.putInt("incorrectAnswers", incorrectAnswers);
        super.onSaveInstanceState(outState);
    }

}
