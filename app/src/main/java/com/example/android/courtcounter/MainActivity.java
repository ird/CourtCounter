package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.EnumMap;

public class MainActivity extends AppCompatActivity {


    private int[] score = {0,0};

    private enum TEAM {A,B}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int team(TEAM t){
        if(t == TEAM.A) return 0;
        return 1;
    }
    private void updateTeamScore(TEAM t){
        TextView scoreView;
        if(t == TEAM.A)
            scoreView = (TextView) findViewById(R.id.team_a_score);
        else
            scoreView = (TextView) findViewById(R.id.team_b_score);

        scoreView.setText(String.valueOf(score[team(t)]));
    }
    private void setTeamScore(int inc, TEAM t) {
        score[team(t)] += inc;
    }
    public void teamAOnePoint(View view){
        setTeamScore(1,TEAM.A);
        updateTeamScore(TEAM.A);
    }
    public void teamATwoPoints(View view){
        setTeamScore(2,TEAM.A);
        updateTeamScore(TEAM.A);
    }
    public void teamAThreePoints(View view){
        setTeamScore(3,TEAM.A);
        updateTeamScore(TEAM.A);
    }
    public void teamBOnePoint(View view){
        setTeamScore(1,TEAM.B);
        updateTeamScore(TEAM.B);
    }
    public void teamBTwoPoints(View view){
        setTeamScore(2,TEAM.B);
        updateTeamScore(TEAM.B);
    }
    public void teamBThreePoints(View view){
        setTeamScore(3,TEAM.B);
        updateTeamScore(TEAM.B);
    }
    public void reset(View view){
        score[0] = 0;
        score[1] = 0;
        updateTeamScore(TEAM.A);
        updateTeamScore(TEAM.B);
    }
}
