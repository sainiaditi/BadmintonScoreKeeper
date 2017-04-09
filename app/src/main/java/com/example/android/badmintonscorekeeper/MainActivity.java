package com.example.android.badmintonscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int playerA = 0;
    int playerB = 0;
    int foulA = 0;
    int foulB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForPlayerA(playerA);
        displayForPlayerB(playerB);
        displayFoulA(foulA);
        displayFoulB(foulB);
    }

    /**
     * Calculate score for Player A.
     */
    public void scoreOfA(View view) {
        playerA = playerA + 1;
        displayForPlayerA(playerA);
    }

    /**
     * Calculate score for Player B.
     */
    public void scoreOfB(View view) {
        playerB = playerB + 1;
        displayForPlayerB(playerB);
    }

    /**
     * Calculate foul for Player A.
     */
    public void foulA(View view) {
        foulA = foulA + 1;
        displayFoulA(foulA);
    }

    /**
     * Calculate foul for Player B.
     */
    public void foulB(View view) {
        foulB = foulB + 1;
        displayFoulB(foulB);
    }

    /**
     * Reset the values of foul and players
     */
    public void resetScore(View view) {
        playerA = 0;
        playerB = 0;
        foulA = 0;
        foulB = 0;
        displayForPlayerA(playerA);
        displayForPlayerB(playerB);
        displayFoulA(foulA);
        displayFoulB(foulB);
    }

    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul for Player A.
     */
    public void displayFoulA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul for Player B.
     */
    public void displayFoulB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_foul);
        scoreView.setText(String.valueOf(score));
    }
}
