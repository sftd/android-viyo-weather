package pl.allblue.viyoweather.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pl.allblue.viyoweather.R;


public class Placeholder extends Fragment
{

    static private final String ARG_SECTION_NUMBER = "section_number";

    static public Placeholder newInstance(int sectionNumber)
    {
        Placeholder fragment = new Placeholder();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }


    public Placeholder()
    {
    }


    /* Activity Overrides */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_weather, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        return rootView;
    }
    /* / Activity Overrides */
}
