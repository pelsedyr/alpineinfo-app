package com.example.s198569.fnuggno.model.factories.icons;

/**
 * Created by luke on 11/21/15.
 */
public class IconFactoryProducer {

    public static AbstractIconFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("STATUS")){
            return new StatusIconFactory();
        }

        return null;
    }
}
