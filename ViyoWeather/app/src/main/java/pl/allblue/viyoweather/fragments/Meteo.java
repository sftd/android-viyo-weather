package pl.allblue.viyoweather.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import pl.allblue.viyoweather.R;


public class Meteo extends Fragment
{

    static public final String Url =
            "http://www.meteo.pl/um/metco/mgram_pict.php?ntype=0u&row=406&col=250&lang=pl";

    static public Meteo newInstance()
    {
        Meteo fragment = new Meteo();
        Bundle args = new Bundle();

        fragment.setArguments(args);

        return fragment;
    }


    private WebView wWebView = null;

    public Meteo()
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
        View view = inflater.inflate(R.layout.fragment_meteo, container, false);

        /* Widgets */
        this.wWebView = (WebView)view.findViewById(R.id.fragment_meteo_WebView);

        /* Init */
        String html =
                "<html><head></head><body>" +
                    "<img src=\"" + Meteo.Url + "\"" +
                            " style=\"max-width: 100%; max-height: 100%;\"" +
                "</body></html>";
        this.wWebView.loadData(html, "text/html", null);

        return view;
    }

}
