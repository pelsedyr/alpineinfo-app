package com.zilexsoft.alpininfo.fnuggno.model.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.zilexsoft.alpininfo.fnuggno.R;
import com.zilexsoft.alpininfo.fnuggno.model.pojo.LiftPricesWrapper;

import java.util.ArrayList;

/**
 * Created by luke on 11/25/15.
 */
public class LiftPricesAdapter extends ArrayAdapter<LiftPricesWrapper> {

    private final Context context;
    private final ArrayList<LiftPricesWrapper> values;

    public LiftPricesAdapter(Context context, ArrayList<LiftPricesWrapper> objects) {
        super(context, R.layout.row_lift_prices, objects);
        this.context = context;
        this.values = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row = inflater.inflate(R.layout.row_lift_prices, parent, false);

        TextView card_type = (TextView) row.findViewById(R.id.lp_category);
        TextView adult = (TextView) row.findViewById(R.id.lp_adult);
        TextView youth = (TextView) row.findViewById(R.id.lp_youth);


        card_type.setText(values.get(position).getCardName());
        adult.setText(values.get(position).getAdult());
        youth.setText(values.get(position).getYouth());

        return row;
    }
}
