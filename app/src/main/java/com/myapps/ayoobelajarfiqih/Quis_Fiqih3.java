package com.myapps.ayoobelajarfiqih;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Quis_Fiqih3 extends AppCompatActivity {


    // Private Constants
    private static final String TAG = "QuizActivity1";
    public static final int DEFAULT_NUMBER_OF_QUESTIONS = 20;

    // Private member variables
    private ArrayList<Question> questions;
    private long seed;
    private int currentQuestion;
    private int correctAnswers;
    private int incorrectAnswers;
    private int numberOfQuestions;
    public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quis__fiqih1);


        questions = new ArrayList<Question>();

        if (null != savedInstanceState) {
            if (savedInstanceState.containsKey("seed")) {
                seed = savedInstanceState.getLong("seed");
            } else {
                seed = new Random().nextLong();
            }

            if (savedInstanceState.containsKey("currentQuestion")) {
                currentQuestion = savedInstanceState.getInt("currentQuestion");
            } else {
                currentQuestion = 0;
            }

            if (savedInstanceState.containsKey("correctAnswers")) {
                correctAnswers = savedInstanceState.getInt("correctAnswers");
            } else {
                correctAnswers = 0;
            }

            if (savedInstanceState.containsKey("incorrectAnswers")) {
                incorrectAnswers = savedInstanceState
                        .getInt("incorrectAnswers");
            } else {
                incorrectAnswers = 0;
            }
        } else {
            // There is no saved instance data, set it all up from scratch
            seed = new Random().nextLong();
            currentQuestion = 0;
            correctAnswers = 0;
            incorrectAnswers = 0;
        }
        // Get number of questions this quiz activity should display
        if (null != savedInstanceState
                && savedInstanceState.containsKey("numberOfQuestions")) {
            numberOfQuestions = savedInstanceState.getInt("numberOfQuestions");
        } else if (null != getIntent().getExtras()
                && getIntent().getExtras().containsKey("numberOfQuestions")) {
            numberOfQuestions = getIntent().getExtras().getInt(
                    "numberOfQuestions");
        } else {
            Log.w(TAG,
                    "QuizActivity1 has been started without a specified number of questions. This indicates an error in the way it is being called."); // Dev
            // String
            numberOfQuestions = DEFAULT_NUMBER_OF_QUESTIONS;
        }

        new Quis_Fiqih3.LoadQuestionsTask().execute("questions");
    }

    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        outState.putLong("seed", seed);
        outState.putInt("currentQuestion", currentQuestion);
        outState.putInt("correctAnswers", correctAnswers);
        outState.putInt("incorrectAnswers", incorrectAnswers);
        outState.putInt("numberOfQuestions", numberOfQuestions);
        super.onSaveInstanceState(outState);
    }

    /**
     * Loads questions stored in all files at the specified file path. Returns
     * an empty {@link ArrayList} if there are no questions found.
     *
     * @param questionFilePath The file path from which questions should be loaded.
     * @return An {@link ArrayList} of all questions found at the specified
     * path.
     */
    private ArrayList<String> loadQuestions(final String questionFilePath) {
        final ArrayList<String> questions = new ArrayList<String>();
        // TODO: This try block surrounds far too much code that it doesn't need
        // to, figure out what can go outside
        try {
            for (final String fileName : getAssets().list(questionFilePath)) {
                final InputStream input = getAssets().open(
                        questionFilePath + "/2iman");
                final BufferedReader reader = new BufferedReader(
                        new InputStreamReader(input));

                // Populate the questions ArrayList
                String inputLine;
                while (null != (inputLine = reader.readLine())) {
                    // Ignore any comments in the question file
                    if (!inputLine.startsWith("//")
                            && !(inputLine.length() == 0)) {
                        questions.add(inputLine);
                    }
                }
            }
        } catch (final IOException e) {
            Log.e(TAG, "IOException while reading questions from file.", e); // Dev
            // String
            Toast.makeText(
                    getApplicationContext(),
                    getResources().getString(
                            R.string.question_reading_exception),
                    Toast.LENGTH_LONG).show();
        }
        return questions;
    }

    private class LoadQuestionsTask extends AsyncTask<String, Integer, Void> {

        // TODO: Move some of the logic from loadQuestions into here.
        // loadQuestions should just deal with an individual file.
        @Override
        protected Void doInBackground(String... params) {
            final ArrayList<String> questionsTemp = new ArrayList<String>();

            // Load all questions available at each path given as an argument
            for (String path : params) {
                questionsTemp.addAll(loadQuestions(path));
            }

            // Randomise the output order of the questions
            final Random rand = new Random(seed);
            Collections.shuffle(questionsTemp, rand);

            // TODO: Get rid of horrible duplicated code below
            // Trim the questions to the number specified by the user
            if (numberOfQuestions < questionsTemp.size()) {
                int failedParses = 0;
                questions = new ArrayList<Question>();
                for (String s : questionsTemp.subList(0, numberOfQuestions)) {
                    try {
                        questions.add(Question.parse(s));
                    } catch (final IllegalArgumentException e) {
                        failedParses++;
                        Log.e(TAG, "Unable to parse question: " + s, e); // Dev
                        // String
                    }
                }

                // If any questions failed to parse, summarise (to the user) how
                // many failed
                if (0 < failedParses) {
                    Toast.makeText(
                            getApplicationContext(),
                            String.format(
                                    getResources()
                                            .getQuantityString(
                                                    R.plurals.question_reading_parse_fail_number,
                                                    failedParses), failedParses),
                            Toast.LENGTH_LONG).show();
                }
            } else {
                int failedParses = 0;
                questions = new ArrayList<Question>();
                for (String s : questionsTemp) {
                    try {
                        questions.add(Question.parse(s));
                    } catch (final IllegalArgumentException e) {
                        failedParses++;
                        Log.e(TAG, "Unable to parse question: " + s, e); // Dev
                        // String
                    }
                }

                // If any questions failed to parse, summarise (to the user) how
                // many failed
                if (0 < failedParses) {
                    Toast.makeText(
                            getApplicationContext(),
                            String.format(
                                    getResources()
                                            .getQuantityString(
                                                    R.plurals.question_reading_parse_fail_number,
                                                    failedParses), failedParses),
                            Toast.LENGTH_LONG).show();
                }
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {

            // If no questions were loaded, close the Activity
            if (questions.isEmpty()) {
                // TODO: This could return some sort of status to the
                // HomeActivity, which could then display a failure message
                Quis_Fiqih3.this.finish();
            } else {
                displayQuestion(currentQuestion);
            }
        }

        /**
         *
         */
        private void displayQuestion(final int questionID) {

            // Display the question
            final TextView quizQuestion = (TextView) findViewById(R.id.quiz_question);
            quizQuestion.setText(questions.get(questionID).getQuestion());

            // Display the answers to the question
            final ListView quizAnswers = (ListView) findViewById(R.id.quiz_answers);
            // TODO: Use my own TextView for this list to control appearance,
            // make it look like the rest of the app
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                    Quis_Fiqih3.this, R.layout.quiz_answer_row, questions
                    .get(questionID).getAnswers()
                    .toArray(new String[0]));
            quizAnswers.setAdapter(adapter);

            // Set up an OnClickListener for the ListView
            quizAnswers
                    .setOnItemClickListener(new AdapterView.OnItemClickListener() {

                        public void onItemClick(final AdapterView<?> parent,
                                                final View view, final int position,
                                                final long id) {
                            final String selectedAnswer = ((TextView) view)
                                    .getText().toString();
                            if (selectedAnswer.equals(questions.get(questionID)
                                    .getAnswer())) {
                                playbenar();
                                player.start();
                                correctAnswers++;
                                Toast.makeText(
                                        getApplicationContext(),
                                        getResources().getString(
                                                R.string.answer_correct),
                                        Toast.LENGTH_SHORT).show();
                            } else {
                                playsalah();
                                player.start();
                                incorrectAnswers++;
                                Toast.makeText(
                                        getApplicationContext(),
                                        getResources().getString(
                                                R.string.answer_incorrect),
                                        Toast.LENGTH_SHORT).show();
                            }

                            // Display the next question
                            currentQuestion++;

                            if (currentQuestion <= questions.size() - 1) {
                                displayQuestion(currentQuestion);
                            } else {
                                // Fire off a new Intent, and end this Activity
                                final Intent i = new Intent(Quis_Fiqih3.this,
                                        QuizEndActivity.class);
                                i.putExtra("correctAnswers", correctAnswers);
                                i.putExtra("incorrectAnswers", incorrectAnswers);
                                startActivity(i);

                                Quis_Fiqih3.this.finish();
                            }
                        }
                    });
        }
    }

    public void playbenar() {
        player = MediaPlayer.create(this, R.raw.benar);
    }

    public void playsalah() {
        player = MediaPlayer.create(this, R.raw.salah);
    }
}