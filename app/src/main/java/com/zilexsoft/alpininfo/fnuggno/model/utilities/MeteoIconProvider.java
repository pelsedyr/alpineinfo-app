package com.zilexsoft.alpininfo.fnuggno.model.utilities;

import android.content.Context;

import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.meteocons_typeface_library.Meteoconcs;

/**
 * Created by luke on 11/21/15.
 */
public class MeteoIconProvider {

    public static IconicsDrawable getIconByStatus(Context context, String weatherStatus) {

        IconicsDrawable id = new IconicsDrawable(context);

        switch (weatherStatus) {
            case "Sun":
                return id.icon(Meteoconcs.Icon.met_sun);
            case "LightCloud":
                return id.icon(Meteoconcs.Icon.met_cloud_sun);
            case "PartlyCloud":
                return id.icon(Meteoconcs.Icon.met_cloud);
            case "Cloud":
                return id.icon(Meteoconcs.Icon.met_clouds);
            case "LightRainSun":
                return id.icon(Meteoconcs.Icon.met_drizzle);
            case "LightRainThunderSun":
                return id.icon(Meteoconcs.Icon.met_cloud_flash);
            case "SleetSun":
                return id.icon(Meteoconcs.Icon.met_sun);
            case "SnowSun":
                return id.icon(Meteoconcs.Icon.met_sun);
            case "LightRain":
                return id.icon(Meteoconcs.Icon.met_drizzle);
            case "Rain":
                return id.icon(Meteoconcs.Icon.met_rain);
            case "RainThunder":
                return id.icon(Meteoconcs.Icon.met_clouds_flash);
            case "Sleet":
                return id.icon(Meteoconcs.Icon.met_snow);
            case "Snow":
                return id.icon(Meteoconcs.Icon.met_snow);
            case "SnowThunder":
                return id.icon(Meteoconcs.Icon.met_clouds_flash);
            case "Fog":
                return id.icon(Meteoconcs.Icon.met_fog);
            case "SleetSunThunder":
                return id.icon(Meteoconcs.Icon.met_rain);
            case "SnowSunThunder":
                return id.icon(Meteoconcs.Icon.met_cloud_flash);
            case "LightRainThunder":
                return id.icon(Meteoconcs.Icon.met_cloud_flash);
            case "SleetThunder":
                return id.icon(Meteoconcs.Icon.met_cloud_flash);
            case "DrizzleThunderSun":
                return id.icon(Meteoconcs.Icon.met_cloud_flash);
            case "RainThunderSun":
                return id.icon(Meteoconcs.Icon.met_cloud_flash);
            case "LightSleetThunderSun":
                return id.icon(Meteoconcs.Icon.met_cloud_flash);
            case "HeavySleetThunderSun":
                return id.icon(Meteoconcs.Icon.met_clouds_flash);
            case "LightSnowThunderSun":
                return id.icon(Meteoconcs.Icon.met_snow);
            case "HeavySnowThunderSun":
                return id.icon(Meteoconcs.Icon.met_snow_heavy);
            case "DrizzleThunder":
                return id.icon(Meteoconcs.Icon.met_cloud_flash);
            case "LightSleetThunder":
                return id.icon(Meteoconcs.Icon.met_cloud_flash);
            case "HeavySleetThunder":
                return id.icon(Meteoconcs.Icon.met_clouds_flash);
            case "LightSnowThunder":
                return id.icon(Meteoconcs.Icon.met_cloud_flash);
            case "HeavySnowThunder":
                return id.icon(Meteoconcs.Icon.met_clouds_flash);
            case "DrizzleSun":
                return id.icon(Meteoconcs.Icon.met_drizzle);
            case "RainSun":
                return id.icon(Meteoconcs.Icon.met_rain);
            case "LightSleetSun":
                return id.icon(Meteoconcs.Icon.met_snow);
            case "HeavySleetSun":
                return id.icon(Meteoconcs.Icon.met_snow_heavy);
            case "LightSnowSun":
                return id.icon(Meteoconcs.Icon.met_snow);
            case "HeavysnowSun":
                return id.icon(Meteoconcs.Icon.met_snow_heavy);
            case "Drizzle":
                return id.icon(Meteoconcs.Icon.met_drizzle);
            case "LightSleet":
                return id.icon(Meteoconcs.Icon.met_rain);
            case "HeavySleet":
                return id.icon(Meteoconcs.Icon.met_windy_rain);
            case "LightSnow":
                return id.icon(Meteoconcs.Icon.met_snow);
            case "HeavySnow":
                return id.icon(Meteoconcs.Icon.met_snow_heavy);
            case "Error":
                return id.icon(GoogleMaterial.Icon.gmd_cloud_off);
            default:
                return id.icon(Meteoconcs.Icon.met_snowflake);
        }

    }

    public static String getIconTextReferance(String weatherStatus) {
        switch (weatherStatus) {
            case "Sun":
                return "met-sun";
            case "LightCloud":
                return "met-cloud-sun";
            case "PartlyCloud":
                return "met-cloud";
            case "Cloud":
                return "met-clouds";
            case "LightRainSun":
                return "met-drizzle";
            case "LightRainThunderSun":
                return "met-cloud-flash";
            case "SleetSun":
                return "met-sun";
            case "SnowSun":
                return "met-sun";
            case "LightRain":
                return "met-drizzle";
            case "Rain":
                return "met-rain";
            case "RainThunder":
                return "met-clouds-flash";
            case "Sleet":
                return "met-snow";
            case "Snow":
                return "met-snow";
            case "SnowThunder":
                return "met-clouds-flash";
            case "Fog":
                return "met-fog";
            case "SleetSunThunder":
                return "met-rain";
            case "SnowSunThunder":
                return "met-cloud-flash";
            case "LightRainThunder":
                return "met-cloud-flash";
            case "SleetThunder":
                return "met-cloud-flash";
            case "DrizzleThunderSun":
                return "met-cloud-flash";
            case "RainThunderSun":
                return "met-cloud-flash";
            case "LightSleetThunderSun":
                return "met-cloud-flash";
            case "HeavySleetThunderSun":
                return "met-clouds-flash";
            case "LightSnowThunderSun":
                return "met-snow";
            case "HeavySnowThunderSun":
                return "met-snow-heavy";
            case "DrizzleThunder":
                return "met-cloud-flash";
            case "LightSleetThunder":
                return "met-cloud-flash";
            case "HeavySleetThunder":
                return "met-clouds-flash";
            case "LightSnowThunder":
                return "met-cloud-flash";
            case "HeavySnowThunder":
                return "met-clouds-flash";
            case "DrizzleSun":
                return "met-drizzle";
            case "RainSun":
                return "met-rain";
            case "LightSleetSun":
                return "met-snow";
            case "HeavySleetSun":
                return "met-snow-heavy";
            case "LightSnowSun":
                return "met-snow";
            case "HeavysnowSun":
                return "met-snow-heavy";
            case "Drizzle":
                return "met-drizzle";
            case "LightSleet":
                return "met-rain";
            case "HeavySleet":
                return "met-windy-rain";
            case "LightSnow":
                return "met-snow";
            case "HeavySnow":
                return "met-snow-heavy";
            case "Error":
                return "gmd-cloud-off";
            default:
                return "gmd-cloud-off";
        }
    }

}
