package com.ist440w.laura.habit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HabitsViewActivity extends AppCompatActivity{

    private Button createHabitButton;
    //TODO: REPLACE THIS BUTTON WITH A FAB
    private Button selectHabitButton;
    private Button editUserSettingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habitsview);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        createHabitButton = (Button) findViewById(R.id.createHabitButton);
        createHabitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openCreateHabitActivity();
            }
        });

        //TODO: MAKE THIS A CARD VIEW WHERE YOU CAN SELECT FROM A LIST OF HABITS
        selectHabitButton = (Button) findViewById(R.id.selectHabitButton);
        selectHabitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                selectHabit();
            }
        });

        editUserSettingsButton= (Button) findViewById(R.id.editUserSettingsButton);
        editUserSettingsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                editUserSettings();
            }
        });
    }
    public void openCreateHabitActivity(){
        Intent intent = new Intent (this, CreateHabitActivity.class);
        startActivity(intent);
        //TODO: CREATE HABITS IN A DIALOGUE BOX
    }

    public void selectHabit(){
        Intent intent = new Intent (this, HabitProgressActivity.class);
        startActivity(intent);
    }
    public void editUserSettings(){
        //TODO: DIALOGUE BOX WHERE USER EDITS USER DATA
    }
}
