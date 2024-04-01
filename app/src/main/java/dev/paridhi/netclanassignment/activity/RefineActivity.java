package dev.paridhi.netclanassignment.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;

import dev.paridhi.netclanassignment.R;
import dev.paridhi.netclanassignment.databinding.ActivityRefineBinding;

public class RefineActivity extends AppCompatActivity {

    ActivityRefineBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRefineBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        binding.refineCharacterCount.setText(binding.refineStatus.getText().toString().length()+"/250");

        binding.refineStatus.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                binding.refineCharacterCount.setText(binding.refineStatus.getText().toString().length()+"/250");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.refineAvailabilitySpinner, android.R.layout.simple_spinner_item );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.Refinespinner.setAdapter(adapter);
    }
}