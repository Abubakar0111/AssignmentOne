package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAscore = 0;
    int teamBscore = 0;
    TextView teamAtextscore, teamBtextscore;
    Button teamAthree, teamAtwo, teamAfree, teamBthree, teamABwo, teamBfree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void displayforteamA(int score) {
        teamAtextscore = (TextView) findViewById(R.id.team_a_score);
        teamAtextscore.setText(String.valueOf(score));
    }
    public void displayforteamB(int score) {
        teamBtextscore = (TextView) findViewById(R.id.teamBscore);
        teamBtextscore.setText(String.valueOf(score));
    }
    public void IncreaseScore(View view) {
        int buttonId = view.getId();
        if (buttonId == R.id.i3pointA) {
            teamAscore = teamAscore + 3;
            displayforteamA(teamAscore);
        }
        if (buttonId == R.id.i2pointA) {
            teamAscore = teamAscore + 2;
            displayforteamA(teamAscore);
        }
        if (buttonId == R.id.fhTeamA) {
            teamAscore = teamAscore + 1;
            displayforteamA(teamAscore);
        }
        if (buttonId == R.id.i3pointB) {
            teamBscore = teamBscore + 3;
            displayforteamB(teamBscore);
        }
        if (buttonId == R.id.i2pointB) {
            teamBscore = teamBscore + 2;
            displayforteamB(teamBscore);
        }
        if (buttonId == R.id.fhTeamB) {
            teamBscore = teamBscore + 1;
            displayforteamB(teamBscore);
        }
    }
    public void oClear(View view) {
        teamAscore = 0;
        teamBscore = 0;
        displayforteamA(0);
        displayforteamB(0);

    }
}