package com.example.tictactoe;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class WinDialog extends Dialog {
    private final String message;
    private final Activity_Add_Players activity_add_players;
    public WinDialog(@NonNull Context context, String message, Activity_Add_Players activity_add_players) {
        super(context);
        this.message=message;
        this.activity_add_players=activity_add_players;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.win_dialog_layout);

        final TextView messageTxt=findViewById(R.id.messageTxt);
        final Button startAgainBtn=findViewById(R.id.startAgainBtn);
        messageTxt.setText(message);

        startAgainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                activity_add_players.restartMatch();
                dismiss();

            }
        });
    }
}
