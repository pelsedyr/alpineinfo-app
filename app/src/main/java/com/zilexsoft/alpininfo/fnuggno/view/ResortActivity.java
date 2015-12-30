package com.zilexsoft.alpininfo.fnuggno.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zilexsoft.alpininfo.fnuggno.R;
import com.zilexsoft.alpininfo.fnuggno.model.pojo.ResponseHuge;
import com.zilexsoft.alpininfo.fnuggno.model.pojo.LiftPricesWrapper;
import com.zilexsoft.alpininfo.fnuggno.model.utilities.Constants;
import com.zilexsoft.alpininfo.fnuggno.model.utilities.MeteoIconProvider;
import com.zilexsoft.alpininfo.fnuggno.model.pojo.OpeningHoursWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.mikepenz.iconics.context.IconicsContextWrapper;
import com.mikepenz.iconics.view.IconicsImageView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class ResortActivity extends AppCompatActivity {

    private TextView resortName, snowDepth24h, snowDepthSlope, snowDepthTerrain;
    private View iconView;
    private ImageView iconImageView;

    private ResponseHuge.Hits.HitsEntity.SourceEntity se;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resort);


        //ActionBar
        android.support.v7.app.ActionBar actionBar = getSupportActionBar(); //v7 action bar prevents nullpointer
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        //Get se object from previous activity
        Bundle bundle = getIntent().getExtras();
        se = (ResponseHuge.Hits.HitsEntity.SourceEntity) bundle.getSerializable(Constants.RESORT_INFO);

        resortName = (TextView) findViewById(R.id.resortInfo_resortName);
        resortName.setText(se.getName());


        //getIcon();

        //Snow report
        createSnowReport();

        //Resort status icon
        setResortIcon();

        //Slopes status
        setSlopesStatus();

        //Lifts status
        setLiftsStatus();

        //Current temperature
        setCurrentTemperature();

        //Current conditions descriptions
        setConditionsDescription();

        //Forecast
        //setWeatherForecast(); //Depriciated since fnugg.no changes API without notice exceptions must be cached for every forecast
        setTodayForecast();
        setWeekendForecast();
        setLongTermForecast();

        //About the resort description
        setAboutResortText();
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(IconicsContextWrapper.wrap(newBase));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_resort, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;
            case R.id.resort_show_map:
                this.showLocationOnMap(getWindow().getDecorView());
                this.finish();
                break;
            case R.id.resort_show_hours:
                this.showOpenHours(getWindow().getDecorView());
                this.finish();
                break;
            case R.id.resort_show_prices:
                this.showLiftPrices(getWindow().getDecorView());
                this.finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return super.onOptionsItemSelected(item);
    }

    private void showLocationOnMap(View view) {
        Intent mapIntent = new Intent(ResortActivity.this, ResortMapActivity.class);
        mapIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        double lat = se.getLocation().getLat();
        double lon = se.getLocation().getLon();
        String resortName = se.getName();
        LatLng resortLocation = new LatLng(lat, lon);
        mapIntent.putExtra(Constants.RESORT_LOCATION, resortLocation);
        mapIntent.putExtra(Constants.RESORT_NAME, resortName);
        ResortActivity.this.startActivity(mapIntent);
    }

    private void showOpenHours(View view) {
        Intent ohIntent = new Intent(ResortActivity.this, OpenHoursActivity.class);
        ohIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        ArrayList<OpeningHoursWrapper> ohList = new ArrayList<>();
        ResponseHuge.Hits.HitsEntity.SourceEntity.OpeningHoursEntity oh = se.getOpening_hours();
        //The opening hours come hardcoded in Json, therefore I have to hardcode them here to. Fortunately those are only seven days of the week.
        ohList.add(new OpeningHoursWrapper(getString(R.string.MONDAY), oh.getMonday().getFrom(), oh.getMonday().getTo(), oh.getMonday().isClosed()));
        ohList.add(new OpeningHoursWrapper(getString(R.string.TUESDAY), oh.getTuesday().getFrom(), oh.getTuesday().getTo(), oh.getTuesday().isClosed()));
        ohList.add(new OpeningHoursWrapper(getString(R.string.WEDNESDAY), oh.getWednesday().getFrom(), oh.getWednesday().getTo(), oh.getWednesday().isClosed()));
        ohList.add(new OpeningHoursWrapper(getString(R.string.THURSDAY), oh.getThursday().getFrom(), oh.getThursday().getTo(), oh.getThursday().isClosed()));
        ohList.add(new OpeningHoursWrapper(getString(R.string.FRIDAY), oh.getFriday().getFrom(), oh.getFriday().getTo(), oh.getFriday().isClosed()));
        ohList.add(new OpeningHoursWrapper(getString(R.string.SATURDAY), oh.getSaturday().getFrom(), oh.getSaturday().getTo(), oh.getSaturday().isClosed()));
        ohList.add(new OpeningHoursWrapper(getString(R.string.SUNDAY), oh.getSunday().getFrom(), oh.getSunday().getTo(), oh.getSunday().isClosed()));

        Log.i(Constants.OPENED, String.valueOf(ohList.size()));
        ohIntent.putExtra(Constants.OPENING_HOURS, ohList);
        ResortActivity.this.startActivity(ohIntent);

    }

    private void showLiftPrices(View view) {
        Intent lpIntent = new Intent(ResortActivity.this, LiftPricesActivity.class);
        lpIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        ArrayList<LiftPricesWrapper> lpList = new ArrayList<>();
        List<?> tmp = se.getLift_ticket_prices();
        Log.i(Constants.PRICES, se.getLift_ticket_prices().toString());

        for (Object e : tmp) {

            Log.i(Constants.PRICES, e.toString());

            try {
                JSONObject jsonObject = new JSONObject(e.toString().replaceAll("\\s", "")); //TODO: Problem with parsing strings containing empty space. Print the stacktrace from exception (nontrusive) for a demonstration. For now I'm removing it wiht some regex hack.
                String name = jsonObject.getString(Constants.CARD_NAME);
                int adult = !jsonObject.isNull(Constants.PRICE_ADULT) ? ((Double) jsonObject.getDouble(Constants.PRICE_ADULT)).intValue() : 0;
                int youth = !jsonObject.isNull(Constants.PRICE_YOUTH) ? ((Double) jsonObject.getDouble(Constants.PRICE_YOUTH)).intValue() : 0;

                lpList.add(new LiftPricesWrapper(name, String.valueOf(adult), String.valueOf(youth)));

            } catch (JSONException e1) {
                //e1.printStackTrace();
            }
        }

        lpIntent.putExtra(Constants.LIFT_PRICES, lpList);
        ResortActivity.this.startActivity(lpIntent);

    }

    private void createSnowReport() {
        snowDepth24h = (TextView) findViewById(R.id.resortInfo_snowDepth24h);
        snowDepthSlope = (TextView) findViewById(R.id.resortInfo_snowDepthSlope);
        snowDepthTerrain = (TextView) findViewById(R.id.resortInfo_snowDepthTerrain);

        String now = "";
        String slope = "";
        String terrain = "";

        try {
            now = se.getConditions().getCombined().getTop().getSnow().getToday().toString();
        } catch (NullPointerException e) {
            now = "-";
        }

        try {
            slope = se.getConditions().getCombined().getTop().getSnow().getDepth_slope().toString();
        } catch (NullPointerException e) {
            slope = "-";
        }

        try {
            terrain = se.getConditions().getCombined().getTop().getSnow().getDepth_terrain().toString();
        } catch (NullPointerException e) {
            terrain = "-";
        }

        snowDepth24h.setText(now);
        snowDepthSlope.setText(slope);
        snowDepthTerrain.setText(terrain);

    }


    private void setResortIcon() {

        String status = se.getConditions().getCurrent_report().getTop().getCondition_description();

        Log.i(Constants.RESORT, status);

        IconicsImageView resortStatusOpen = (IconicsImageView) findViewById(R.id.resortStatusIconOpen);
        IconicsImageView resortStatusClosed = (IconicsImageView) findViewById(R.id.resortStatusIconClosed);
        TextView resortOpenText = (TextView) findViewById(R.id.resortOpenText);
        TextView resortClosedText = (TextView) findViewById(R.id.resortClosedText);

        if (status.equalsIgnoreCase(Constants.ANLEGG_STENGT)) {
            resortOpenText.setTextColor(getResources().getColor(R.color.disabledGray));
            resortStatusOpen.setColor(getResources().getColor(R.color.disabledGray));
            resortStatusClosed.setColor(getResources().getColor(R.color.colorPrimary));
            ;
            resortClosedText.setTextColor(getResources().getColor(R.color.colorPrimary));
        } else {
            resortClosedText.setTextColor(getResources().getColor(R.color.colorPrimary));
            resortOpenText.setTextColor(getResources().getColor(R.color.activeGreen));
            resortStatusClosed.setColor(getResources().getColor(R.color.disabledGray));
            ;
            resortClosedText.setTextColor(getResources().getColor(R.color.disabledGray));
        }

    }


    private void setSlopesStatus() {
        int slopes_count = se.getSlopes().getCount();
        int slopes_opened = se.getSlopes().getOpen();
        int slopes_closed = se.getSlopes().getClosed();

        TextView openText = (TextView) findViewById(R.id.slopesOpendText);
        TextView openCount = (TextView) findViewById(R.id.slopesOpenedCount);
        TextView closedCount = (TextView) findViewById(R.id.slopesClosedCount);
        TextView closedText = (TextView) findViewById(R.id.slopesClosedText);

        openCount.setText(String.valueOf(slopes_opened));
        closedCount.setText(String.valueOf(slopes_closed));

        if (slopes_closed == slopes_count) {
            openText.setTextColor(getResources().getColor(R.color.disabledGray));
            openCount.setTextColor(getResources().getColor(R.color.disabledGray));
            closedCount.setTextColor(getResources().getColor(R.color.colorPrimary));
            ;
            closedText.setTextColor(getResources().getColor(R.color.colorPrimary));
        } else if (slopes_opened > 0) {
            openText.setTextColor(getResources().getColor(R.color.colorPrimary));
            openCount.setTextColor(getResources().getColor(R.color.activeGreen));
            closedCount.setTextColor(getResources().getColor(R.color.disabledGray));
            closedText.setTextColor(getResources().getColor(R.color.disabledGray));
        }
    }


    private void setLiftsStatus() {
        int lifts_count = se.getLifts().getCount();
        int lifts_opened = se.getLifts().getOpen();
        int lifts_closed = se.getLifts().getClosed();

        TextView openText = (TextView) findViewById(R.id.liftsOpendText);
        TextView openCount = (TextView) findViewById(R.id.liftsOpenedCount);
        TextView closedCount = (TextView) findViewById(R.id.liftsClosedCount);
        TextView closedText = (TextView) findViewById(R.id.liftsClosedText);

        openCount.setText(String.valueOf(lifts_opened));
        closedCount.setText(String.valueOf(lifts_closed));

        if (lifts_closed == lifts_count) {
            openText.setTextColor(getResources().getColor(R.color.disabledGray));
            openCount.setTextColor(getResources().getColor(R.color.disabledGray));
            closedCount.setTextColor(getResources().getColor(R.color.colorPrimary));
            ;
            closedText.setTextColor(getResources().getColor(R.color.colorPrimary));
        } else if (lifts_opened > 0) {
            openText.setTextColor(getResources().getColor(R.color.colorPrimary));
            openCount.setTextColor(getResources().getColor(R.color.activeGreen));
            closedCount.setTextColor(getResources().getColor(R.color.disabledGray));
            closedText.setTextColor(getResources().getColor(R.color.disabledGray));
        }
    }


    private void setCurrentTemperature() {
        int temp_c = se.getConditions().getCombined().getTop().getTemperature().getValue();

        TextView currentTemp = (TextView) findViewById(R.id.resortTemperature);
        currentTemp.setText(String.valueOf(temp_c));
    }

    private void setConditionsDescription() {
        String conditions = se.getConditions().getCurrent_report().getTop().getCondition_description();
        Log.i(Constants.RESORT, conditions);

        TextView conditionsText = (TextView) findViewById(R.id.resortConditionsText);
        conditionsText.setText(conditions);
    }


    private void setTodayForecast(){
        try{
            String todayStatus = se.getConditions().getForecast().getToday().getTop().getSymbol().getName();
            int todayTemp = se.getConditions().getForecast().getToday().getTop().getTemperature().getValue();
            IconicsImageView todayIcon = (IconicsImageView) findViewById(R.id.forecastTodayIcon);
            TextView todayText = (TextView) findViewById(R.id.forecastTodayTemp);
            todayIcon.setIcon(MeteoIconProvider.getIconByStatus(this, todayStatus));
            todayIcon.setColor(getResources().getColor(R.color.inactiveGray));
            todayIcon.getIcon().sizeDp(Constants.WEATHER_ICON_DP);
            todayIcon.getIcon().paddingDp(Constants.WEATHER_ICON_PADDING);
            todayText.setText(String.valueOf(todayTemp));
        }catch(Exception e){
            Log.e(Constants.ERROR, Constants.EXCEPTION_IN_TODAY_FORECAST);
            String todayStatus = Constants.ERROR;
            IconicsImageView todayIcon = (IconicsImageView) findViewById(R.id.forecastTodayIcon);
            TextView todayText = (TextView) findViewById(R.id.forecastTodayTemp);
            todayIcon.setIcon(MeteoIconProvider.getIconByStatus(this, todayStatus));
            todayIcon.setColor(getResources().getColor(R.color.inactiveGray));
            todayIcon.getIcon().sizeDp(Constants.WEATHER_ICON_DP);
            todayIcon.getIcon().paddingDp(Constants.WEATHER_ICON_PADDING);
            todayText.setText(R.string.FORECAST_NOT_AVAILABLE);
        }
    }

    private void setWeekendForecast(){
        try {
            String weekendStatus = se.getConditions().getForecast().getWeekend().getSymbol().getName();
            int weekendTemp = se.getConditions().getForecast().getWeekend().getTemperature().getValue();
            IconicsImageView weekendIcon = (IconicsImageView) findViewById(R.id.forecastWeekendIcon);
            TextView weekendText = (TextView) findViewById(R.id.forecastWeekendTemp);
            weekendIcon.setIcon(MeteoIconProvider.getIconByStatus(this, weekendStatus));
            weekendIcon.setColor(getResources().getColor(R.color.inactiveGray));
            weekendIcon.getIcon().sizeDp(Constants.WEATHER_ICON_DP);
            weekendIcon.getIcon().paddingDp(Constants.WEATHER_ICON_PADDING);
            weekendText.setText(String.valueOf(weekendTemp));
        }catch(Exception e){
            Log.e(Constants.ERROR, Constants.EXCEPTION_IN_WEEKEND_FORECAST);
            String weekendStatus = Constants.ERROR;
            IconicsImageView weekendIcon = (IconicsImageView) findViewById(R.id.forecastWeekendIcon);
            TextView weekendText = (TextView) findViewById(R.id.forecastWeekendTemp);
            weekendIcon.setIcon(MeteoIconProvider.getIconByStatus(this, weekendStatus));
            weekendIcon.setColor(getResources().getColor(R.color.inactiveGray));
            weekendIcon.getIcon().sizeDp(Constants.WEATHER_ICON_DP);
            weekendIcon.getIcon().paddingDp(Constants.WEATHER_ICON_PADDING);
            weekendText.setText(R.string.FORECAST_NOT_AVAILABLE);
        }
    }

    private void setLongTermForecast(){
        try{
            String longTermStatus = se.getConditions().getForecast().getLong_term().get(0).getSymbol().getName();
            int longTermTemp = se.getConditions().getForecast().getLong_term().get(0).getTemperature().getValue();
            IconicsImageView longTermIcon = (IconicsImageView) findViewById(R.id.forecastLongTermIcon);
            TextView longTermText = (TextView) findViewById(R.id.forecastLongTermTemp);
            longTermIcon.setIcon(MeteoIconProvider.getIconByStatus(this, longTermStatus));
            longTermIcon.setColor(getResources().getColor(R.color.inactiveGray));
            longTermIcon.getIcon().sizeDp(Constants.WEATHER_ICON_DP);
            longTermIcon.getIcon().paddingDp(Constants.WEATHER_ICON_PADDING);
            longTermText.setText(String.valueOf(longTermTemp));
        }catch (Exception e){
            Log.e(Constants.ERROR, Constants.EXCEPTION_IN_LONG_TERM_FORECAST);
            String longTermStatus = Constants.ERROR;
            IconicsImageView longTermIcon = (IconicsImageView) findViewById(R.id.forecastLongTermIcon);
            TextView longTermText = (TextView) findViewById(R.id.forecastLongTermTemp);
            longTermIcon.setIcon(MeteoIconProvider.getIconByStatus(this, longTermStatus));
            longTermIcon.setColor(getResources().getColor(R.color.inactiveGray));
            longTermIcon.getIcon().sizeDp(Constants.WEATHER_ICON_DP);
            longTermIcon.getIcon().paddingDp(Constants.WEATHER_ICON_PADDING);
            longTermText.setText(R.string.FORECAST_NOT_AVAILABLE);
        }
    }


    private void setAboutResortText(){
        String about = se.getDescription().replace("\n","").replace("\r","");
        String url = se.getUrls().getHomepage();
        String localizedLinkName = getString(R.string.RESORT_LINK_TEXT);
        String urlParsed = "<a href='" + url + "'>" + localizedLinkName + "</a>";
        TextView aboutText = (TextView) findViewById(R.id.resortAboutText);
        TextView urlAdress = (TextView) findViewById(R.id.resortAboutUrl);
        urlAdress.setMovementMethod(LinkMovementMethod.getInstance());
        aboutText.setText(about);
        urlAdress.setText(Html.fromHtml(urlParsed));
    }

}
