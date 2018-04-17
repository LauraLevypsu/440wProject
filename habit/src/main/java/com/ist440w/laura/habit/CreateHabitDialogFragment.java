package com.ist440w.laura.habit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class CreateHabitDialogFragment extends DialogFragment{
    private EditText mEditText;
    private Button closeButton;



    public CreateHabitDialogFragment() {
        // Empty constructor is required for DialogFragment
        // Make sure not to add arguments to the constructor
        // Use `newInstance` instead as shown below

    }

    public static CreateHabitDialogFragment newInstance(String title) {
        CreateHabitDialogFragment frag = new CreateHabitDialogFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialogfragment_createhabit, container);

        //TODO: save new habit to database
    }

    @Override
    //changed @Nullable Bundle savedInstanceState to  Bundle savedInstanceState
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Get field from view
        mEditText = (EditText) view.findViewById(R.id.txt_your_name);
        // Fetch arguments from bundle and set title
        String title = getArguments().getString("title", "Enter Name");
        getDialog().setTitle(title);
        // Show soft keyboard automatically and request focus to field
        mEditText.requestFocus();
        getDialog().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

        closeButton = (Button) view.findViewById(R.id.closeButton);
        closeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                saveAndReturn();
            }
        });
    }
    public void saveAndReturn(){
        Intent intent = new Intent (this.getActivity(), HabitsViewActivity.class);
        startActivity(intent);
    }

}
