package dev.paridhi.netclanassignment.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.refineAvailabilitySpinner, android.R.layout.simple_spinner_item );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.Refinespinner.setAdapter(adapter);
    }
}