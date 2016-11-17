package pl.allblue.viyoweather;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;

import pl.allblue.viyoweather.fragments.Clock;
import pl.allblue.viyoweather.fragments.Meteo;
import pl.allblue.viyoweather.fragments.Placeholder;
import pl.allblue.viyoweather.fragments.Weather;


public class MainAdapter extends FragmentPagerAdapter
{

    private Fragment fClock = null;
    private Fragment fWeather = null;
    private Fragment fMeteo = null;

    public MainAdapter(FragmentManager fragment_manager)
    {
        super(fragment_manager);
    }

    /* FragmentPagesAdapter Overrides */
    @Override
    public int getCount()
    {
        return 3;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position) {
            case 0:
                return Clock.newInstance();
            case 1:
                return Weather.newInstance();
            case 2:
                return Meteo.newInstance();
        }

        throw new RuntimeException("Unknown fragment item.");
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return null;

//        switch (position) {
//        case 0:
//            return "SECTION 1";
//        case 1:
//            return "SECTION 2";
//        case 2:
//            return "SECTION 3";
//    }
//        return null;
    }
}
