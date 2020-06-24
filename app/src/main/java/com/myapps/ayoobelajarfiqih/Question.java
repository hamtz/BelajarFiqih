package com.myapps.ayoobelajarfiqih;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {

    private final String question;
    private final ArrayList<String> answers;

    private Question(final String question, final ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    /**
     * Takes a comma separated String of the question type, the question, and
     * the answers, and returns a {@link Question} representation of them.
     *
     * @param input
     *            The input String made up of the type of question, the question
     *            itself, and the answers (comma separated).
     * @return a {@link Question} representation of the input string.
     * @throws IllegalArgumentException
     */
    public static Question parse(final String input)
            throws IllegalArgumentException {

        final String[] questionComponents;
        final String question;
        final ArrayList<String> answers = new ArrayList<String>();

        // Split the input on commas
        if (null != input) {
            questionComponents = input.split(",");
        } else {
            throw new IllegalArgumentException(
                    "Question to be parsed was null."); // Dev String
        }

        // Extract the component parts of the question
        if (4 < questionComponents.length) {
            question = questionComponents[0].trim();

            for (int i = 1; i < questionComponents.length; i++) {
                answers.add(questionComponents[i].trim());
            }

        } else {
            throw new IllegalArgumentException(
                    "Question had insufficient parts. Note that at least two answers are required."); // Dev
            // String
        }

        // Construct and return a new Question
        return new Question(question, answers);

    }

    /**
     * Returns the question element of the {@link Question}
     *
     * @return the question element of the {@link Question}
     */
    public final String getQuestion() {
        return question;
    }

    /**
     * Returns the answers, in a random order, as an ArrayList of String
     *
     * @return the answers, in a random order, as an ArrayList of String
     */
    public final List<String> getAnswers() {
        // ArryList is not immutable, create a defensive copy
        final ArrayList<String> answers = new ArrayList<String>(this.answers);
        Collections.shuffle(answers);
        return answers;
    }

    /**
     * Returns the correct answer to the {@link Question}
     *
     * @return the correct answer to the {@link Question}
     */
    public final String getAnswer() {
        return answers.get(0);
    }

}