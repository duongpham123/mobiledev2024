package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new WeatherAndForecastFragmentOne();
            case 1:
                return new WeatherAndForecastFragmentTwo();
            case 2:
                return new WeatherAndForecastFragmentThree();

        }return new WeatherAndForecastFragmentOne();
    }

    @Override
    public int getCount() {
        
        return 3;
    }
}
