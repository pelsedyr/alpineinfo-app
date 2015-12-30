package com.zilexsoft.alpininfo.fnuggno.model.utilities;

/**
 * Created by luke on 11/26/15.
 */
public class Coordinates {

    public static final double nord_norge_lat = 69.206720;
    public static final double nord_norge_lng = 18.885304;

    public static final double midt_norge_lat = 64.041938;
    public static final double midt_norge_lng = 12.386202;

    public static final double nord_vest_lat = 61.651783;
    public static final double nord_vest_lng = 6.377349;

    public static final double sor_vest_lat = 59.609122;
    public static final double sor_vest_lng = 6.127410;

    public static final double ostlandet_lat = 60.437949;
    public static final double ostlandet_lng = 9.730926;

    public static final double sorlandet_lat = 58.794246;
    public static final double sorlandet_lng = 7.712826;

    //Lattitude, Longtitude, Zoom level for Google Maps to cover all resorts in area
    public static final double nord_norge[] = {nord_norge_lat, nord_norge_lng, 5.0};
    public static final double midt_norge[] = {midt_norge_lat, midt_norge_lng, 7.0};
    public static final double nord_vest[] = {nord_vest_lat, nord_vest_lng, 7.0};
    public static final double sor_vest[] = {sor_vest_lat, sor_vest_lng, 6.0};
    public static final double ostlandet[] = {ostlandet_lat, ostlandet_lng, 6.0};
    public static final double sorlandet[] = {sorlandet_lat, sorlandet_lng, 7.0};


    public static double[] getCoordinatesAfterRegion(String regionName){
        switch (regionName){
            case Constants.loc_nord_norge:
                return nord_norge;
            case Constants.loc_midt_norge:
                return midt_norge;
            case Constants.loc_nord_vestlandet:
                return nord_vest;
            case Constants.loc_sor_vestlandet:
                return sor_vest;
            case Constants.loc_ostalndet:
                return ostlandet;
            case Constants.loc_sorlandet:
                return sorlandet;
            default:
                return new double[] {60.518191, 8.222574};
        }
    }

}
