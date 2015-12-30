package com.zilexsoft.alpininfo.fnuggno.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.zilexsoft.alpininfo.fnuggno.R;
import com.zilexsoft.alpininfo.fnuggno.model.utilities.Constants;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class ResortMapActivity extends AppCompatActivity {

    private LatLng resortLocation;
    private String resortName;
    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resort_map);


        //ActionBar
        android.support.v7.app.ActionBar actionBar = getSupportActionBar(); //v7 action bar prevents nullpointer
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        //Get location
        Bundle bundle = getIntent().getExtras();
        resortLocation = bundle.getParcelable(Constants.RESORT_LOCATION);
        resortName = (String) bundle.getSerializable(Constants.RESORT_NAME);

        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.resort_map_fragment))
                .getMap();

        Marker resortMarker = map.addMarker(new MarkerOptions().position(resortLocation)
                .title(resortName));
        resortMarker.showInfoWindow();

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(resortLocation, 15));
        map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_resort_map, menu);
        return true;
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
