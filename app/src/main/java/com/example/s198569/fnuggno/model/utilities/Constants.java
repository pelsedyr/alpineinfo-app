package com.example.s198569.fnuggno.model.utilities;

/**
 * Created by luke on 11/19/15.
 */
public class Constants {

    //API URLs
    public static final String url_resort_base = "http://fnuggapi.cloudapp.net/search";
    public static final String url_resort_base_w_facet = "http://fnuggapi.cloudapp.net/search?facet=region:";
    public static final String url_resort_nord_norge = "http://fnuggapi.cloudapp.net/search?facet=region:Nord-Norge";
    public static final String url_resort_midt_norge = "http://fnuggapi.cloudapp.net/search?facet=region:Midt-Norge";
    public static final String url_resort_sorlandet = "http://fnuggapi.cloudapp.net/search?facet=region:Sørlandet";

    //Regions
    public static final String loc_sorlandet = "Sørlandet";
    public static final String loc_midt_norge = "Midt-Norge";
    public static final String loc_nord_norge = "Nord-Norge";
    public static final String loc_ostalndet = "Østlandet";
    public static final String loc_sor_vestlandet = "Sør-Vestlandet";
    public static final String loc_nord_vestlandet = "Nord-Vestlandet";

    //Animations
    public static final int DURATION_MILLIS = 400;
    public static final int DELAY_MILLIS = 200;

    //Local JSON keys
    public static final String CARD_NAME = "card_name";
    public static final String PRICE_ADULT = "price_adult";
    public static final String PRICE_YOUTH = "price_youth";

    //Other
    public static final String ANLEGG_STENGT = "Anlegg stengt";

    //GUI
    public static final int WEATHER_ICON_DP = 25;
    public static final int WEATHER_ICON_PADDING = 1;

    //Intent extras tokens
    public static final String RESORTS_LOCATIONS = "ResortsLocations";
    public static final String RESORT_INFO = "ResortInfo";
    public static final String OPENING_HOURS = "OpeningHours";
    public static final String RESORT_LOCATION = "ResortLocation";
    public static final String RESORT_NAME = "ResortName";
    public static final String LIFT_PRICES = "LiftPrices";
    public static final String CURRENT_REGION = "CurrentRegion";

    //Logcat tokens
    public static final String LOCATION = "Location";
    public static final String NAVIGATION_ITEM_SELECTED = "NavigationItemSelected";
    public static final String OPENED = "Opened";
    public static final String PRICES = "Prices";
    public static final String RESORT = "Resort";
    public static final String ERROR = "Error";

    //Logcat messages
    public static final String EXCEPTION_IN_TODAY_FORECAST = "Exception in Today forecast";
    public static final String EXCEPTION_IN_WEEKEND_FORECAST = "Exception in Weekend forecast";
    public static final String EXCEPTION_IN_LONG_TERM_FORECAST = "Exception in LongTerm forecast";
    public static final String ERROR_WHILE_SETTING_RESORT_IMAGE = "Error while setting resort image";


}
