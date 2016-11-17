package pl.allblue.viyoweather.activities;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import pl.allblue.viyoweather.R;
import pl.allblue.viyoweather.MainAdapter;


public class Main extends AppCompatActivity
{

    private MainAdapter sectionsPagerAdapter = null;

    /* Widgets */
    private ViewPager wViewPager = null;
    private TabLayout wTablLayout = null;

    @Override
    protected void onCreate(Bundle saved_instance_state)
    {
        super.onCreate(saved_instance_state);
        this.setContentView(R.layout.activity_main);

        /* Widgets */
        this.wViewPager = (ViewPager)this.findViewById(R.id.container);
        this.wTablLayout = (TabLayout)this.findViewById(R.id.tablLayout);

        /* Menu */
        Toolbar toolbar = (Toolbar)this.findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);

        /* ViewPager */
        this.sectionsPagerAdapter = new MainAdapter(
                this.getSupportFragmentManager());
        this.wViewPager.setAdapter(this.sectionsPagerAdapter);
        this.wTablLayout.setupWithViewPager(this.wViewPager);

        this.wTablLayout.getTabAt(0).setIcon(R.drawable.ic_alarm_black_48dp);
        this.wTablLayout.getTabAt(1).setIcon(R.drawable.ic_wb_cloudy_white_48dp);
        this.wTablLayout.getTabAt(2).setIcon(R.drawable.ic_wb_cloudy_white_48dp);
    }

    /* Activity Overrides */
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        this.getMenuInflater().inflate(R.menu.menu_weather, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.action_settings)
            return true;

        return super.onOptionsItemSelected(item);
    }

}
