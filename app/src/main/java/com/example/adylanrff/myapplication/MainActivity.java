package com.example.adylanrff.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView redTeamScore;
    private Button redTeamPlus2;
    private Button redTeamPlus3;

    private TextView blueTeamScore;
    private Button blueTeamPlus2;
    private Button blueTeamPlus3;

    private Button resetButton;

    private Integer redTeam = 0;
    private Integer blueTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redTeamScore = (TextView) findViewById(R.id.red_team_score);
        blueTeamScore = (TextView) findViewById(R.id.blue_team_score);
        resetButton = (Button) findViewById(R.id.reset_button);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redTeam = 0;
                blueTeam = 0;
                changeRedScore(redTeam);
                changeRedScore(blueTeam);
            }
        });

        changeRedScore(0);
        changeBlueScore(0);
    }


    public void updateRedScore(View v){
        if(v.getId()==R.id.red_team_plus_2){
            redTeam+=2;
        }
        else {
            redTeam+=3;
        }

        changeRedScore(redTeam);
    }

    public void updateBlueScore(View v){
        if(v.getId()==R.id.blue_team_plus_2){
            blueTeam+=2;
        }
        else {
            blueTeam+=3;
        }
        changeBlueScore(blueTeam);
    }

    void changeRedScore(Integer quantity){
        if(redTeam>=10){
            redTeamScore.setTextSize(30);
        }
        redTeamScore.setText(""+quantity);
    }

    void changeBlueScore(Integer quantity){
        if (blueTeam>=10){
            blueTeamScore.setTextSize(30);
        }
        blueTeamScore.setText(""+quantity);
    }

}
