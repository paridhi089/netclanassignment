package dev.paridhi.netclanassignment.adapters.viewpageadapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import dev.paridhi.netclanassignment.fragments.explorefragment.BusinessFragment;
import dev.paridhi.netclanassignment.fragments.explorefragment.MerchantFragment;
import dev.paridhi.netclanassignment.fragments.explorefragment.PersonalFragment;

public class ExploreFragmentTabAdapter extends FragmentStateAdapter {
    public ExploreFragmentTabAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position==1)
        {
            return new BusinessFragment();
        }
        else if (position==2)
        {
            return new MerchantFragment();
        }
        else {
            return new PersonalFragment();
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
