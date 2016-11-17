package pl.allblue.viyoweather.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import pl.allblue.viyoweather.R;


public class Weather extends Fragment
{

    static public Weather newInstance()
    {
        Weather fragment = new Weather();
        Bundle args = new Bundle();

        fragment.setArguments(args);

        return fragment;
    }


    private WebView wWebView = null;

    public Weather()
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
                    "<a href=\"http://www.accuweather.com/en/pl/warsaw/274663/weather-forecast/274663\" class=\"aw-widget-legal\">\n" +
                    "<!--\n" +
                    "By accessing and/or using this code snippet, you agree to AccuWeather’s terms and conditions (in English) which can be found at http://www.accuweather.com/en/free-weather-widgets/terms and AccuWeather’s Privacy Statement (in English) which can be found at http://www.accuweather.com/en/privacy.\n" +
                    "-->\n" +
                    "</a><div id=\"awcc1479422901068\" class=\"aw-widget-current\"  data-locationkey=\"274663\" data-unit=\"c\" data-language=\"en-us\" data-useip=\"false\" data-uid=\"awcc1479422901068\"></div><script type=\"text/javascript\" src=\"http://oap.accuweather.com/launch.js\"></script>" +
                "</body></html>";
        this.wWebView.getSettings().setJavaScriptEnabled(true);
        this.wWebView.loadData(html, "text/html", null);

        return view;
    }

}
