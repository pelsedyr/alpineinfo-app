package com.example.s198569.fnuggno.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.s198569.fnuggno.R;
import com.example.s198569.fnuggno.model.adapter.OpeningHoursAdapter;
import com.example.s198569.fnuggno.model.pojo.OpeningHoursWrapper;
import com.example.s198569.fnuggno.model.utilities.Constants;
import com.nhaarman.listviewanimations.appearance.simple.SwingLeftInAnimationAdapter;

import java.util.ArrayList;

public class OpenHoursActivity extends AppCompatActivity {

    private ArrayList<OpeningHoursWrapper> ohList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_hours);

        //ActionBar
        android.support.v7.app.ActionBar actionBar = getSupportActionBar(); //v7 action bar prevents nullpointer
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        Bundle bundle = getIntent().getExtras();
        ohList = (ArrayList<OpeningHoursWrapper>) bundle.getSerializable(Constants.OPENING_HOURS);

        final ListView listview = (ListView) findViewById(R.id.openHoursList);

        for(OpeningHoursWrapper w : ohList){
            Log.i(Constants.OPENED, w.toString());
        }

        final OpeningHoursAdapter adapter = new OpeningHoursAdapter(this, ohList);

        SwingLeftInAnimationAdapter animationAdapter = new SwingLeftInAnimationAdapter(adapter);
        animationAdapter.setAbsListView(listview);
        animationAdapter.getViewAnimator().setAnimationDurationMillis(Constants.DURATION_MILLIS);
        animationAdapter.getViewAnimator().setAnimationDelayMillis(Constants.DELAY_MILLIS);

        listview.setAdapter(animationAdapter);
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
