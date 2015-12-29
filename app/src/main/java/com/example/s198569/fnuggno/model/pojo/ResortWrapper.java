package com.example.s198569.fnuggno.model.pojo;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by luke on 11/24/15.
 */
public class ResortWrapper implements Parcelable {

    private LatLng resortPosition;
    private String resortName;

    public ResortWrapper(LatLng resortPosition, String resortName) {
        this.resortPosition = resortPosition;
        this.resortName = resortName;
    }

    public LatLng getResortPosition() {
        return resortPosition;
    }

    public void setResortPosition(LatLng resortPosition) {
        this.resortPosition = resortPosition;
    }

    public String getResortName() {
        return resortName;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    @Override
    public String toString() {
        return "ResortWrapper{" +
                "resortPosition=" + resortPosition +
                ", resortName='" + resortName + '\'' +
                '}';
    }

    protected ResortWrapper(Parcel in) {
        resortPosition = (LatLng) in.readValue(LatLng.class.getClassLoader());
        resortName = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(resortPosition);
        dest.writeString(resortName);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<ResortWrapper> CREATOR = new Parcelable.Creator<ResortWrapper>() {
        @Override
        public ResortWrapper createFromParcel(Parcel in) {
            return new ResortWrapper(in);
        }

        @Override
        public ResortWrapper[] newArray(int size) {
            return new ResortWrapper[size];
        }
    };
}