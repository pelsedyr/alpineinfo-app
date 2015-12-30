package com.zilexsoft.alpininfo.fnuggno.model.pojo;

import java.io.Serializable;

/**
 * Created by luke on 11/24/15.
 */
public class OpeningHoursWrapper implements Serializable {

    private String dayOfWeek;
    private String fromHour;
    private String toHour;
    private boolean closed;

    public OpeningHoursWrapper() {
    }

    public OpeningHoursWrapper(String dayOfWeek, String fromHour, String toHour, boolean closed) {
        this.dayOfWeek = dayOfWeek;
        this.fromHour = fromHour.equalsIgnoreCase("")?"-":fromHour;
        this.toHour = toHour.equalsIgnoreCase("")?"-":toHour;
        this.closed = closed;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public String getFromHour() {
        return fromHour;
    }

    public String getToHour() {
        return toHour;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setFromHour(String fromHour) {
        this.fromHour = fromHour;
    }

    public void setToHour(String toHour) {
        this.toHour = toHour;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    @Override
    public String toString() {
        return "OpeningHoursWrapper{" +
                "dayOfWeek='" + dayOfWeek + '\'' +
                ", fromHour='" + fromHour + '\'' +
                ", toHour='" + toHour + '\'' +
                ", closed=" + closed +
                '}';
    }

    //For unknown reason the parcelable wont work this time. Going with Serializable instead.

   /* protected OpeningHoursWrapper(Parcel in) {
        dayOfWeek = in.readString();
        fromHour = in.readString();
        toHour = in.readString();
        closed = in.readByte() != 0x00;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(dayOfWeek);
        dest.writeString(fromHour);
        dest.writeString(toHour);
        dest.writeByte((byte) (closed ? 0x01 : 0x00));
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<OpeningHoursWrapper> CREATOR = new Parcelable.Creator<OpeningHoursWrapper>() {
        @Override
        public OpeningHoursWrapper createFromParcel(Parcel in) {
            return new OpeningHoursWrapper(in);
        }

        @Override
        public OpeningHoursWrapper[] newArray(int size) {
            return new OpeningHoursWrapper[size];
        }
    };*/
}
