package com.zilexsoft.alpininfo.fnuggno.model.factories.icons;

import com.zilexsoft.alpininfo.fnuggno.R;
import com.mikepenz.fontawesome_typeface_library.FontAwesome;

/**
 * Created by luke on 11/21/15.
 */
public class StatusIconFactory extends AbstractIconFactory {

    @Override
    int getColor(String color) {
        if(color == null)
            return 0;

        switch(color){
            case "ACTIVE":
                return R.color.activeGreen;
            case "DISABLED":
                return R.color.disabledGray;
            case "INACTIVE":
                return R.color.inactiveGray;
            default:
                return R.color.colorPrimary;
        }
    }



    @Override
    FontAwesome.Icon getIconType(String iconType) {
        if(iconType == null)
            return null;

        switch (iconType){
            case "OPEN":
                return FontAwesome.Icon.faw_check_circle_o;
            case "CLOSED":
                return FontAwesome.Icon.faw_exclamation_circle;
            default:
                return FontAwesome.Icon.faw_question;
        }
    }


}
