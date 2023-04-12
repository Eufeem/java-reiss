package com.feem.reiss.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Carlos García
 */
public class DateUtil {

    /**
     * Format Examples
     * dd/MM/yyyy
     * dd-MMM-yyyy;
     * MM dd, yyyy
     * dd-MMM-yyyy HH:mm:ss
     */

    /**
     * @param stringDate - String date
     * @param stringFormat - Format of date
     * @return Date
     * @throws ParseException
     */
    private Date stringToDate(String stringDate, String stringFormat) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(stringFormat);
        return sdf.parse(stringDate);
    }

    /**
     * @param date - Value of date
     * @param stringFormat - Format of date
     * @return - Date parse a string
     */
    private String dateToString(Date date, String stringFormat) {
        DateFormat dateFormat = new SimpleDateFormat(stringFormat);
        return dateFormat.format(date);
    }

    /**
     * @param date - Value of date
     * @return - Date on milliseconds
     */
    private Long getMilliseconds(Date date) {
        return date.getTime();
    }

    /**
     *
     * @param firstDate - First date to compare
     * @param secondDate - Second date to compare
     * @return - If is equals return true else if false
     */
    private Boolean compareTwoDates(Date firstDate, Date secondDate) {
        return firstDate.equals(secondDate);
    }
}
