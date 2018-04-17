package com.ist440w.laura.habit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class CreateHabitActivity extends AppCompatActivity {

    private Button saveAndReturnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createhabit);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        saveAndReturnButton = (Button) findViewById(R.id.saveHabitButton);
        saveAndReturnButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                saveAndReturn();
            }
        });
    }
    public void saveAndReturn(){
        Intent intent = new Intent (this, HabitsViewActivity.class);
        startActivity(intent);
        //TODO: save new habit to database
    }
}
