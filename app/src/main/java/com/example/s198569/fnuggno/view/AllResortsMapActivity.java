package com.example.s198569.fnuggno.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.example.s198569.fnuggno.R;
import com.example.s198569.fnuggno.model.utilities.Constants;
import com.example.s198569.fnuggno.model.utilities.Coordinates;
import com.example.s198569.fnuggno.model.utilities.LatComparator;
import com.example.s198569.fnuggno.model.utilities.LonComparator;
import com.example.s198569.fnuggno.model.pojo.ResortWrapper;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.Collections;

public class AllResortsMapActivity extends AppCompatActivity {

    private ArrayList<ResortWrapper> resortLocations;
    private GoogleMap map;
    private String currentRegion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_resorts_map);

        //ActionBar
        android.support.v7.app.ActionBar actionBar = getSupportActionBar(); //v7 action bar prevents nullpointer
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        //Location points
        Bundle bundle = getIntent().getExtras();
        resortLocations = (ArrayList<ResortWrapper>) bundle.getSerializable(Constants.RESORTS_LOCATIONS);
        currentRegion = bundle.getString(Constants.CURRENT_REGION);

        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.resorts_map_fragment))
                .getMap();

        LatLngBounds.Builder bounds = new LatLngBounds.Builder();

        for(ResortWrapper r : resortLocations){
            Marker marker = map.addMarker(new MarkerOptions().position(r.getResortPosition()).title(r.getResortName()));
            //marker.showInfoWindow();
            bounds.include(r.getResortPosition());
        }

        ArrayList<ResortWrapper> lattRes = (ArrayList<ResortWrapper>) resortLocations.clone();
        ArrayList<ResortWrapper> longRes = (ArrayList<ResortWrapper>) resortLocations.clone();

        Collections.sort(lattRes, new LatComparator());
        Collections.sort(longRes, new LonComparator());

        for(ResortWrapper e : lattRes) {
            Log.i(Constants.LOCATION, e.toString());
        }
        for(ResortWrapper e : longRes) {
            Log.i(Constants.LOCATION, e.toString());
        }

        double lattPos = lattRes.get(0).getResortPosition().latitude;
        double longPos = longRes.get(longRes.size()-1).getResortPosition().longitude;

        LatLng middle = new LatLng(lattPos, longPos);
        long corZoom = Math.round((longPos + lattPos)/2);

        //map.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds.build(), 15));
        //map.moveCamera(CameraUpdateFactory.newLatLngZoom(middle, corZoom));
        double[] currentPosition = Coordinates.getCoordinatesAfterRegion(currentRegion);
        LatLng regionMiddle = new LatLng(currentPosition[0], currentPosition[1]);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(regionMiddle, 50));
        map.animateCamera(CameraUpdateFactory.zoomTo(((Double )currentPosition[2]).intValue()), 2000, null);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return super.onOptionsItemSelected(item);
    }
}
