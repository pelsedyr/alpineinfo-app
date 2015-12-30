package com.zilexsoft.alpininfo.fnuggno.model.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.zilexsoft.alpininfo.fnuggno.R;

/**
 * CURRENTLY NOT IN USE!
 * Created by luke on 11/25/15.
 */
public class RegionSpinnerAdapter extends ArrayAdapter<String> {

    private Context context;
    private int resource;
    private String[] values;

    public RegionSpinnerAdapter(Context context, int resource, String[] values) {
        super(context, resource, values);
        this.context = context;
        this.resource = resource;
        this.values = values;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView view = (TextView) super.getView(position, convertView, parent);
        view.setTextColor(getContext().getResources().getColor(R.color.activeGreen));
        return view;
    }


    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView view = (TextView) super.getDropDownView(position, convertView, parent);
        view.setTextColor(getContext().getResources().getColor(R.color.colorPrimary));
        return view;
    }
}
