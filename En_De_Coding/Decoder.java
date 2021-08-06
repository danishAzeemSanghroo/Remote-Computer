/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package En_De_Coding;

import java.text.SimpleDateFormat;

/**
 *
 * @author Danish
 */
public class Decoder {

        public static String getDateFormat(java.util.Date date)
        {
        SimpleDateFormat f = new SimpleDateFormat("dd-MMM-YYYY");
            String d=f.format(date);
            return d;
        }
    
}
