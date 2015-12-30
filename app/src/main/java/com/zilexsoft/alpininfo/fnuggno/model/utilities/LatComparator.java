package com.zilexsoft.alpininfo.fnuggno.model.utilities;

import com.zilexsoft.alpininfo.fnuggno.model.pojo.ResortWrapper;

import java.util.Comparator;

/**
 * Created by luke on 11/24/15.
 */
public class LatComparator implements Comparator<ResortWrapper> {
    @Override
    public int compare(ResortWrapper lhs, ResortWrapper rhs) {
        return Double.valueOf(lhs.getResortPosition().latitude).compareTo(rhs.getResortPosition().latitude);
    }
}
