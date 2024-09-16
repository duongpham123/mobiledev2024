package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new WeatherAndForecastFragmentOne();
            case 1:
                return new WeatherAndForecastFragmentTwo();
            case 2:
                return new WeatherAndForecastFragmentThree();
            default:
                return new WeatherAndForecastFragmentOne();
        }
    }

    @Override
    public int getItemCount() {
        return 3; // số lượng tab
    }
}

