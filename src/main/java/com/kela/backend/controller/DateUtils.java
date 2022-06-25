package com.kela.backend.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public static Date createDateFromDateString(String dateString){
        Date date = null;
        if(dateString != null){
            try{
                date = DATE_FORMAT.parse(dateString);
            }
            catch (ParseException pe){
                date = new Date();
            }
        }
        else{
            date = new Date();
        }
        return date;
    }
}
