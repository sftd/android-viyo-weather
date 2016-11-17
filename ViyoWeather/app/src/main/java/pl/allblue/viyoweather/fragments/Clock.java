package pl.allblue.viyoweather.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import pl.allblue.viyoweather.R;


public class Clock extends Fragment
{

    static public Clock newInstance()
    {
        Clock fragment = new Clock();
        Bundle args = new Bundle();

        fragment.setArguments(args);

        return fragment;
    }


    public Clock()
    {

    }


    /* Fragment Overrides */
    @Override
    public void onCreate(Bundle saved_instance_state)
    {
        super.onCreate(saved_instance_state);
        if (this.getArguments() != null) {
           // Args...
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle saved_instance_state)
    {
        View view = inflater.inflate(R.layout.fragment_clock, container, false);

        return view;
    }

}
