package routines;

/*
 * user specification: the function's comment should contain keys as follows: 1. write about the function's comment.but
 * it must be before the "{talendTypes}" key.
 * 
 * 2. {talendTypes} 's value must be talend Type, it is required . its value should be one of: String, char | Character,
 * long | Long, int | Integer, boolean | Boolean, byte | Byte, Date, double | Double, float | Float, Object, short |
 * Short
 * 
 * 3. {Category} define a category for the Function. it is required. its value is user-defined .
 * 
 * 4. {param} 's format is: {param} <type>[(<default value or closed list values>)] <name>[ : <comment>]
 * 
 * <type> 's value should be one of: string, int, list, double, object, boolean, long, char, date. <name>'s value is the
 * Function's parameter name. the {param} is optional. so if you the Function without the parameters. the {param} don't
 * added. you can have many parameters for the Function.
 * 
 * 5. {example} gives a example for the Function. it is optional.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
public class time {

	public static String timeDifference ( String dateStart , String dateStop) {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		 
		Date d1 = null;
		Date d2 = null;

		String timeDifference = new String() ; 
 
		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);
 
			
Date d3 = null;
Date d4=null;
Date d5=null;
d5 = format.parse("00:00:01");
d3 = format.parse("23:59:59");
d4 = format.parse("00:00:00");

long diff2 = ((d3.getTime() - d1.getTime())+( d2.getTime()-d4.getTime())+(d5.getTime()-d4.getTime()));
 
			long diffSeconds2 = diff2 / 1000 % 60;
			long diffMinutes2 = diff2 / (60 * 1000) % 60;
			long diffHours2= diff2 / (60 * 60 * 1000) % 24;
 
			 timeDifference = diffHours2+":"+diffMinutes2+":"+diffSeconds2 ;

 
		} catch (Exception e) {
			e.printStackTrace();
		}
 
		
		return timeDifference;
	
			
	}
}
