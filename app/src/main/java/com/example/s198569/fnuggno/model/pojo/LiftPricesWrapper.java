package com.example.s198569.fnuggno.model.pojo;

import java.io.Serializable;

/**
 * Created by luke on 11/25/15.
 */
public class LiftPricesWrapper implements Serializable {

    private String cardName;
    private String adult;
    private String youth;

    public LiftPricesWrapper() {
    }

    public LiftPricesWrapper(String cardName, String adult, String youth) {
        this.cardName = cardName;
        this.adult = adult == null || adult.equalsIgnoreCase("0") ? "-":adult;
        this.youth = youth == null || youth.equalsIgnoreCase("0") ? "-":youth;

    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getAdult() {
        return adult;
    }

    public void setAdult(String adult) {
        this.adult = adult;
    }

    public String getYouth() {
        return youth;
    }

    public void setYouth(String youth) {
        this.youth = youth;
    }
}
