package com.example.onlinevotingsystem;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultsActivity extends AppCompatActivity {

    private TextView resultsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        resultsTextView = findViewById(R.id.resultsTextView);

        // Fetch results from database and display
        String results = "Candidate A: 60%\nCandidate B: 40%"; // Example data
        resultsTextView.setText(results);
    }
}
