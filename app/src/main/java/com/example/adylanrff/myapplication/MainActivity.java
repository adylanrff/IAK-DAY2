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
                Toast.makeText(MainActivity.this, "Pencet", Toast.LENGTH_SHORT).show();
            }
        });



        changeRedScore(2);
        changeBlueScore(3);
    }




    void changeRedScore(Integer quantity){
        redTeamScore.setText(""+quantity);
    }

    void changeBlueScore(Integer quantity){
        blueTeamScore.setText(""+quantity);
    }


}
