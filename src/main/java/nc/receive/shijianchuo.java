package nc.receive;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.expression.ParseException;

public class shijianchuo {
      public static void main(String[] args) {
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
          date = df.parse("2017-09-01");
        } catch (java.text.ParseException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        long tim = cal .getTimeInMillis();
        System.out.println(tim);
        
      } 
  


}
