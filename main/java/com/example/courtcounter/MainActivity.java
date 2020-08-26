package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0 ;
    int scoreTeamB = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }



    public void show3(View view){
        scoreTeamA = scoreTeamA + 3 ;
        displayForTeamA(scoreTeamA);
    }


    public void show2(View view){
        scoreTeamA = scoreTeamA + 2 ;
        displayForTeamA(scoreTeamA);
    }


    public void show1(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void show3B(View view){
        scoreTeamB = scoreTeamB + 3 ;
        displayForTeamB(scoreTeamB);
    }


    public void show2B(View view){
        scoreTeamB = scoreTeamB + 2 ;
        displayForTeamB(scoreTeamB);
    }


    public void show1B(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public  void  reset(View v){
        scoreTeamA = 0 ;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0 ;
        displayForTeamB(scoreTeamB);
    }

}
