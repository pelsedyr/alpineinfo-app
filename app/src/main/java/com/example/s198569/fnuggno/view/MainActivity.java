package com.example.s198569.fnuggno.view;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.s198569.fnuggno.R;
import com.example.s198569.fnuggno.model.adapter.CustomAdapter;
import com.example.s198569.fnuggno.model.adapter.TitleNavigationAdapter;
import com.example.s198569.fnuggno.model.pojo.ResponseHuge;
import com.example.s198569.fnuggno.model.utilities.Constants;
import com.example.s198569.fnuggno.model.pojo.ResortWrapper;
import com.example.s198569.fnuggno.model.utilities.SpinnerNavItem;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.mikepenz.iconics.context.IconicsContextWrapper;
import com.nhaarman.listviewanimations.appearance.simple.*;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ActionBar.OnNavigationListener {

    ListView listView;
    //Response responseObj;
    ResponseHuge responseObj;
    CustomAdapter adapterResorts;
    Gson gson;
    AsyncHttpClient client;
    private MenuItem mSpinnerItem1 = null;
    private String choosenRegion;
    private SwipeRefreshLayout swipeRefreshLayout;

    //Action bar and spinner
    private ActionBar actionBar;
    private ArrayList<SpinnerNavItem> navSpinner;
    private TitleNavigationAdapter adapterNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        populateActionBar();
        populateResortData(Constants.url_resort_sorlandet);

        //Swipetorefresh
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swiperefresh);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Toast.makeText(MainActivity.this, R.string.REFRESHING, Toast.LENGTH_SHORT).show();
                populateResortData(choosenRegion);
            }
        });

        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                int topRowVerticalPosition = (listView == null || listView.getChildCount() == 0) ?
                        0 : listView.getChildAt(0).getTop();
                swipeRefreshLayout.setEnabled((topRowVerticalPosition >= 0));
            }
        });
    }


    private void populateActionBar(){
        actionBar = getSupportActionBar();

        // Hide the action bar title
        actionBar.setDisplayShowTitleEnabled(false);

        // Enabling Spinner dropdown navigation
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        // Spinner title navigation data
        navSpinner = new ArrayList<SpinnerNavItem>();
        navSpinner.add(new SpinnerNavItem(Constants.loc_sorlandet, R.drawable.ic_action_sor));
        navSpinner.add(new SpinnerNavItem(Constants.loc_midt_norge, R.drawable.ic_action_midt));
        navSpinner.add(new SpinnerNavItem(Constants.loc_nord_norge, R.drawable.ic_action_nord));
        navSpinner.add(new SpinnerNavItem(Constants.loc_ostalndet, R.drawable.ic_action_ost));
        navSpinner.add(new SpinnerNavItem(Constants.loc_sor_vestlandet, R.drawable.ic_action_sor_vest));
        navSpinner.add(new SpinnerNavItem(Constants.loc_nord_vestlandet, R.drawable.ic_action_nord_vest));

        // title drop down adapter
        adapterNavigation = new TitleNavigationAdapter(getApplicationContext(), navSpinner);

        // assigning the spinner navigation
        actionBar.setListNavigationCallbacks(adapterNavigation, this);
    }

  /*  private void populateActionBar() {

        SpinnerAdapter spinnerAdapter = ArrayAdapter.createFromResource(this, R.array.actions, android.R.layout.simple_spinner_dropdown_item);


        ActionBar.OnNavigationListener callbackSpinner = new ActionBar.OnNavigationListener() {
            String[] items = getResources().getStringArray(R.array.actions);

            @Override
            public boolean onNavigationItemSelected(int position, long id) {
                Log.d("NavigationItemSelected", items[position]);

                String base_search = Constants.url_resort_base_w_facet;
                populateResortData(base_search + items[position]);

                return true;
            }
        };

        ActionBar actions = getSupportActionBar();
        actions.setIcon(R.drawable.fnugg);
        actions.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
        actions.setDisplayShowTitleEnabled(false);
        actions.setListNavigationCallbacks(spinnerAdapter, callbackSpinner);

    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.resort_show_all_resorts_map:
                this.showSelectedResortsOnMap();
                break;
            case R.id.resort_show_help:
                this.showHelpActivity();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return super.onOptionsItemSelected(item);
    }


    private void showSelectedResortsOnMap() {
        Intent resortMapIntent = new Intent(MainActivity.this, AllResortsMapActivity.class);
        resortMapIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        List<ResponseHuge.Hits.HitsEntity> resortsList = responseObj.getHits().getHits();
        ArrayList<ResortWrapper> resortLocations = new ArrayList<ResortWrapper>();
        for (ResponseHuge.Hits.HitsEntity e : resortsList) {
            double lat = e.get_source().getLocation().getLat();
            double lon = e.get_source().getLocation().getLon();
            String rName = e.get_source().getName();
            resortLocations.add(new ResortWrapper(new LatLng(lat, lon), rName));
        }
        String currentRegion = (String) responseObj.getHits().getHits().get(0).get_source().getRegion().get(0);
        resortMapIntent.putExtra(Constants.CURRENT_REGION,currentRegion);
        resortMapIntent.putExtra(Constants.RESORTS_LOCATIONS, resortLocations);
        MainActivity.this.startActivity(resortMapIntent);
    }


    private void showHelpActivity(){
        Intent helpIntent = new Intent(MainActivity.this, HelpActivity.class);
        helpIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        MainActivity.this.startActivity(helpIntent);
    }


    private void populateResortData(final String url) {
        //Fetching and populating data
        listView = (ListView) findViewById(R.id.resortList);
        client = new AsyncHttpClient();

        client.get(MainActivity.this, url, new AsyncHttpResponseHandler() {

            @Override
            public void onFailure(int i, org.apache.http.Header[] headers, byte[] bytes, Throwable throwable) {
                alertUser(getString(R.string.NETWORK_ERROR), getString(R.string.NETWORK_ERROR_TIP), url);
            }

            @Override
            public void onSuccess(int i, org.apache.http.Header[] headers, byte[] bytes) {
                String responseStr = new String(bytes);
                gson = new Gson();
                responseObj = gson.fromJson(responseStr, ResponseHuge.class);
                adapterResorts = new CustomAdapter(MainActivity.this, responseObj.getHits().getHits());

                SwingLeftInAnimationAdapter animationAdapter = new SwingLeftInAnimationAdapter(adapterResorts);
                animationAdapter.setAbsListView(listView);
                animationAdapter.getViewAnimator().setAnimationDurationMillis(Constants.DURATION_MILLIS);
                animationAdapter.getViewAnimator().setAnimationDelayMillis(Constants.DELAY_MILLIS);

                listView.setAdapter(animationAdapter);

                choosenRegion = url;
                swipeRefreshLayout.setRefreshing(false);
            }

        });


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                ResponseHuge.Hits.HitsEntity r = (ResponseHuge.Hits.HitsEntity) parent.getItemAtPosition(position);

                /*Toast.makeText(getApplicationContext(),
                        "Click ListItem Number " + position + r.get_source().getName(), Toast.LENGTH_SHORT)
                        .show();*/


                Intent resortActivity = new Intent(MainActivity.this, ResortActivity.class);
                resortActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                ResponseHuge.Hits.HitsEntity.SourceEntity se = r.get_source();
                resortActivity.putExtra(Constants.RESORT_INFO, se);
                MainActivity.this.startActivity(resortActivity);

            }
        });
    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(IconicsContextWrapper.wrap(newBase));
    }


    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }


    private void alertUser(String error_text, String message, final String requestedQuery) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle(error_text);
        alert.setMessage(message);

        alert.setPositiveButton(R.string.MODAL_NETWORK_POSITIVE, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                populateResortData(requestedQuery);
            }
        });

        alert.setNegativeButton(R.string.MODAL_NETWORK_NEGATIVE, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alert.show();
    }

    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        String[] items = getResources().getStringArray(R.array.actions);
        Log.d(Constants.NAVIGATION_ITEM_SELECTED, items[itemPosition]);
        String base_search = Constants.url_resort_base_w_facet;
        populateResortData(base_search + items[itemPosition]);

        return true;
    }
}
