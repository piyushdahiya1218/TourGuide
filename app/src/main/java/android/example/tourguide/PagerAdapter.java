package android.example.tourguide;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter
{

    public PagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public int getCount()
    {
        return 4;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch(position)
        {
            case 0:
                return new RestaurantsFragment();
            case 1:
                return new HistoricFragment();
            case 2:
                return new ParkFragment();
            case 3:
                return new HotelFragment();
            default:
                return null;
        }
    }
    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return new String("Restaurant");
            case 1:
                return new String("Historic");
            case 2:
                return new String("Parks");
            case 3:
                return new String("Hotels");
            default:
                return null;
        }
    }
}
