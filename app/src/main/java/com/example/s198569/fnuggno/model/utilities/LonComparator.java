package com.example.s198569.fnuggno.model.utilities;

import com.example.s198569.fnuggno.model.pojo.ResortWrapper;

import java.util.Comparator;

/**
 * Created by luke on 11/24/15.
 */
public class LonComparator implements Comparator<ResortWrapper> {
    @Override
    public int compare(ResortWrapper lhs, ResortWrapper rhs) {
        return Double.valueOf(lhs.getResortPosition().longitude).compareTo(rhs.getResortPosition().longitude);
    }
}