package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText playerOne =findViewById(R.id.playerOneName);
        final EditText playerTwo =findViewById(R.id.playerTwoName);
        final AppCompatButton startGameBtn =findViewById(R.id.startGameBtn);



        startGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String getPlayerOneName = playerOne.getText().toString();
                final String getPlayerTwoName = playerTwo.getText().toString();


                if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter the players name", Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(MainActivity.this, Activity_Add_Players.class);
                intent.putExtra("playerOne",getPlayerOneName);
                intent.putExtra("playerTwo",getPlayerTwoName);
                startActivity(intent);




            }
        });
    }
}