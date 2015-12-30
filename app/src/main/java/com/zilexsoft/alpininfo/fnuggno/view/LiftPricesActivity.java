package com.zilexsoft.alpininfo.fnuggno.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.zilexsoft.alpininfo.fnuggno.R;
import com.zilexsoft.alpininfo.fnuggno.model.adapter.LiftPricesAdapter;
import com.zilexsoft.alpininfo.fnuggno.model.pojo.LiftPricesWrapper;
import com.zilexsoft.alpininfo.fnuggno.model.utilities.Constants;
import com.nhaarman.listviewanimations.appearance.simple.SwingLeftInAnimationAdapter;

import java.util.ArrayList;

public class LiftPricesActivity extends AppCompatActivity {

    private ArrayList<LiftPricesWrapper> lpList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lift_prices);

        //ActionBar
        android.support.v7.app.ActionBar actionBar = getSupportActionBar(); //v7 action bar prevents nullpointer
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        Bundle bundle = getIntent().getExtras();
        lpList = (ArrayList<LiftPricesWrapper>) bundle.getSerializable("LiftPrices");

        final ListView listView = (ListView) findViewById(R.id.lift_prices_list);
        final LiftPricesAdapter adapter = new LiftPricesAdapter(this, lpList);

        SwingLeftInAnimationAdapter animationAdapter = new SwingLeftInAnimationAdapter(adapter);
        animationAdapter.setAbsListView(listView);
        animationAdapter.getViewAnimator().setAnimationDurationMillis(Constants.DURATION_MILLIS);
        animationAdapter.getViewAnimator().setAnimationDelayMillis(Constants.DELAY_MILLIS);

        listView.setAdapter(animationAdapter);
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
