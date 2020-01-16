package com.example.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class app_feedback extends AppCompatActivity {

    private static Button button_sbm;
    private static TextView  text_v;
    private static RatingBar rating_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_feedback);

        onButtonClickListener();
    }

    public void onButtonClickListener(){
        rating_b=findViewById(R.id.ratingBar);
        button_sbm= findViewById(R.id.buttonFeedback);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(app_feedback.this,String.valueOf(rating_b.getRating()),Toast.LENGTH_SHORT).show();
                    }
                }
        );

    }
}

