package dev.paridhi.netclanassignment.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import dev.paridhi.netclanassignment.R;
import dev.paridhi.netclanassignment.databinding.ActivityMainBinding;
import dev.paridhi.netclanassignment.fragments.mainactivity.ChatFragment;
import dev.paridhi.netclanassignment.fragments.mainactivity.ContactsFragment;
import dev.paridhi.netclanassignment.fragments.mainactivity.ExploreFragment;
import dev.paridhi.netclanassignment.fragments.mainactivity.GroupsFragment;
import dev.paridhi.netclanassignment.fragments.mainactivity.NetworkFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    String username,location;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(view);
        setSupportActionBar(binding.mainToolbar);

        username="Paridhi Prisha Saikia";
        location="Malleswaram, Bengaluru";

        binding.toolbarTitle.setText("Howdy "+username+" !!");
        binding.toolbarSubTitle.setText(location);

        binding.refineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),RefineActivity.class));
            }
        });




        replaceFragment(new ExploreFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            int selected=item.getItemId();

            if(selected==R.id.explore)
            {
                replaceFragment(new ExploreFragment());

            } else if (selected==R.id.network) {
                replaceFragment(new NetworkFragment());

            }else if (selected==R.id.chat) {
                replaceFragment(new ChatFragment());

            }else if (selected==R.id.contacts) {
                replaceFragment(new ContactsFragment());

            }else if (selected==R.id.groups) {
                replaceFragment(new GroupsFragment());
            }

            return true;

        });
    }
    public void replaceFragment(Fragment fragment)
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.MainPageFrameLayout,fragment).commit();
    }
}