package com.zilexsoft.alpininfo.fnuggno.model.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.zilexsoft.alpininfo.fnuggno.R;
import com.zilexsoft.alpininfo.fnuggno.model.pojo.OpeningHoursWrapper;

import java.util.ArrayList;

/**
 * Created by luke on 11/24/15.
 */
public class OpeningHoursAdapter extends ArrayAdapter<OpeningHoursWrapper> {

    private final Context context;
    private final ArrayList<OpeningHoursWrapper> values;

    public OpeningHoursAdapter(Context context, ArrayList<OpeningHoursWrapper> objects) {
        super(context, R.layout.row_open_hours, objects);
        this.context = context;
        this.values = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row = inflater.inflate(R.layout.row_open_hours, parent, false);

        TextView day = (TextView) row.findViewById(R.id.oh_day_of_week);
        TextView from = (TextView) row.findViewById(R.id.oh_from);
        TextView to = (TextView) row.findViewById(R.id.oh_to);
        //TextView status = (TextView) row.findViewById(R.id.oh_now);

        day.setText(values.get(position).getDayOfWeek());
        from.setText(values.get(position).getFromHour());
        to.setText(values.get(position).getToHour());
        //status.setText(values.get(position).isClosed()?"Closed":"Open");day.setText(values.get(position).getDayOfWeek());

        return row;
    }
}
