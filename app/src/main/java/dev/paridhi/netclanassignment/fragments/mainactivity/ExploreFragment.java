package dev.paridhi.netclanassignment.fragments.mainactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import dev.paridhi.netclanassignment.R;
import dev.paridhi.netclanassignment.adapters.viewpageadapter.ExploreFragmentTabAdapter;
import dev.paridhi.netclanassignment.databinding.FragmentExploreBinding;
import dev.paridhi.netclanassignment.fragments.explorefragment.BusinessFragment;
import dev.paridhi.netclanassignment.fragments.explorefragment.MerchantFragment;
import dev.paridhi.netclanassignment.fragments.explorefragment.PersonalFragment;


public class ExploreFragment extends Fragment {
    FragmentExploreBinding binding;
    ExploreFragmentTabAdapter adapter;
    public FragmentManager fragmentManager;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentExploreBinding.inflate(getLayoutInflater(),container,false);
        View view=binding.getRoot();

        getChildFragmentManager().beginTransaction().replace(R.id.exploreFrameLayout,new PersonalFragment()).commit();

      //FragmentManager fragmentManager1=getChildFragmentManager();

       binding.exploreTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
           @Override
           public void onTabSelected(TabLayout.Tab tab) {
               if (tab.getPosition()==0)
               {
                   getChildFragmentManager().beginTransaction().replace(R.id.exploreFrameLayout,new PersonalFragment()).commit();
               }
              else if(tab.getPosition()==1)
               {
                   getChildFragmentManager().beginTransaction().replace(R.id.exploreFrameLayout,new BusinessFragment()).commit();

               } else if (tab.getPosition()==2) {
                   getChildFragmentManager().beginTransaction().replace(R.id.exploreFrameLayout,new MerchantFragment()).commit();

               }

           }

           @Override
           public void onTabUnselected(TabLayout.Tab tab) {

           }

           @Override
           public void onTabReselected(TabLayout.Tab tab) {

           }
       });


        return view;


    }
}