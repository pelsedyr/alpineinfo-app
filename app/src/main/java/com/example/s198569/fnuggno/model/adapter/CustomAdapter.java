package com.example.s198569.fnuggno.model.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.s198569.fnuggno.R;
import com.example.s198569.fnuggno.model.pojo.ResponseHuge;
import com.example.s198569.fnuggno.model.utilities.Constants;
import com.example.s198569.fnuggno.model.utilities.MeteoIconProvider;
import com.mikepenz.iconics.view.IconicsImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by luke on 11/19/15.
 */
public class CustomAdapter extends BaseAdapter {

    private List<ResponseHuge.Hits.HitsEntity> mResortItem;
    private Context mContext;
    private LayoutInflater inflater;

    public CustomAdapter(Context mContext, List<ResponseHuge.Hits.HitsEntity> mResortItem) {
        this.mContext = mContext;
        this.mResortItem = mResortItem;
    }

    @Override
    public int getCount() {
        return mResortItem.size();
    }

    @Override
    public Object getItem(int position) {
        return mResortItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.each_list_item, parent, false);
        ResponseHuge.Hits.HitsEntity item = (ResponseHuge.Hits.HitsEntity) getItem(position);

        ImageView thumbnail = (ImageView) rowView.findViewById(R.id.resortThumbnail);
        TextView title = (TextView) rowView.findViewById(R.id.resortTitle);

        try {
            String imageUrl = item.get_source().getImages().getMobile().getScale2().getCover();
            Picasso.with(mContext).load(imageUrl).error(mContext.getResources().getDrawable(R.drawable.error_thumbnail)).into(thumbnail);

            //Picasso.with(mContext).setIndicatorsEnabled(true); //For picasso debugging
        }catch (Exception exc){
            Log.e(Constants.ERROR, Constants.ERROR_WHILE_SETTING_RESORT_IMAGE);
        }

        title.setText(item.get_source().getName());

        //Temperature and current weather icon
        TextView frontTemperature = (TextView) rowView.findViewById(R.id.front_resort_temp);
        TextView frontWeatherIcon = (TextView) rowView.findViewById(R.id.front_weather_icon);
        //IconicsImageView icon = (IconicsImageView) rowView.findViewById(R.id.front_weather_icon);

        int temp = item.get_source().getConditions().getCombined().getTop().getTemperature().getValue();
        String icon_status = item.get_source().getConditions().getCombined().getTop().getSymbol().getName();

        frontTemperature.setText(String.valueOf(temp));
        frontWeatherIcon.setText("{"+MeteoIconProvider.getIconTextReferance(icon_status)+"}");


        return rowView;
    }
}
