package com.example.profileuicardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.profileuicardview.ui.main.FeedbackformFragment;

public class feedbackform extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedbackform_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, FeedbackformFragment.newInstance())
                    .commitNow();
        }
    }
}