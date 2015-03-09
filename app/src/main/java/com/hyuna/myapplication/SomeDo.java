package com.hyuna.myapplication;

import java.text.DecimalFormat;


public class SomeDo  {

    public static final String PATTERN = "+{###)##-###-##-##";

    public String getFormatInt(Integer integer) {
        DecimalFormat formaters = new DecimalFormat(PATTERN);
        return formaters.format(integer);
    }
}
