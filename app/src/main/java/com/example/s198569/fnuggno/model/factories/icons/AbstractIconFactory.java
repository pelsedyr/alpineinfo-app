package com.example.s198569.fnuggno.model.factories.icons;

import android.graphics.Color;
import android.graphics.drawable.Icon;

import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.iconics.IconicsDrawable;

/**
 * Created by luke on 11/21/15.
 */
public abstract class AbstractIconFactory {
    abstract int getColor(String color);
    abstract FontAwesome.Icon getIconType(String iconType);
}
