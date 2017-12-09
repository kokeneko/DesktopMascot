package DesktopMascot;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeClass {

	public static String nowtime() {
		Date d = new Date();
		SimpleDateFormat time = new SimpleDateFormat("HH時mm分ss秒");
		String Time = time.format(d);

		return Time;
	}

}
