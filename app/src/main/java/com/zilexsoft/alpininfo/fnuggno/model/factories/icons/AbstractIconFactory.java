package com.zilexsoft.alpininfo.fnuggno.model.factories.icons;

import com.mikepenz.fontawesome_typeface_library.FontAwesome;

/**
 * Created by luke on 11/21/15.
 */
public abstract class AbstractIconFactory {
    abstract int getColor(String color);
    abstract FontAwesome.Icon getIconType(String iconType);
}
