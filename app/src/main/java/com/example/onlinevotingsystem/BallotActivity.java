package com.example.onlinevotingsystem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class BallotActivity extends AppCompatActivity {

    private RadioGroup candidateRadioGroup;
    private Button submitVoteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ballot);

        candidateRadioGroup = findViewById(R.id.candidateRadioGroup);
        submitVoteButton = findViewById(R.id.submitVoteButton);

        submitVoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitVote();
            }
        });
    }

    private void submitVote() {
        int selectedId = candidateRadioGroup.getCheckedRadioButtonId();
        if (selectedId == -1) {
            Toast.makeText(BallotActivity.this, "Please select a candidate", Toast.LENGTH_SHORT).show();
        } else {
            RadioButton selectedRadioButton = findViewById(selectedId);
            String vote = selectedRadioButton.getText().toString();

            // Save vote to database (e.g., Firebase Realtime Database)
            Toast.makeText(BallotActivity.this, "Vote submitted for: " + vote, Toast.LENGTH_SHORT).show();

            // Optionally, navigate to a results or confirmation screen
        }
    }
}

