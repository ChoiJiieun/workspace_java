package ch11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ApiDate {
	public static void main(String[] args) {
		// 1. Date 클래스
		// 1970년 1월 1일 자정(UTC)이후의 시간을 밀리초 단위로 표현
		Date dateToday = new Date();
		System.out.println(dateToday);
		// 원하는 문자열 format 형태
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(dateToday));  // 대소문자 구별함.
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(dateToday));
		// KST 한국
		// 뉴욕 시간
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
		TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
		sdf3.setTimeZone(timeZone);
		System.out.println(sdf3.format(dateToday));
		
		// string to date
		String str = "2024/08/02 09:00:00";
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		try {
			Date start = sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// calendar 클래스 (year, month 같은 필드를 제공) 날짜 계산에 유용함.
		Calendar calToday = Calendar.getInstance();  // <-- 싱글톤
		System.out.println(calToday.getTime());
		System.out.println(calToday.get(Calendar.DATE));
		System.out.println(calToday.get(Calendar.MONTH)+1);
		System.out.println(calToday.get(Calendar.YEAR));
		System.out.println(calToday.get(Calendar.HOUR_OF_DAY));
		
		// 1일뒤
		calToday.add(Calendar.DATE, 1);
		System.out.println(sdf.format(calToday.getTime()));
		
		// 3일뒤
		calToday.add(Calendar.DATE, 3);
		System.out.println(sdf.format(calToday.getTime()));
		
		// 5개월 뒤
		calToday.add(Calendar.MONTH, 5);
		System.out.println(sdf.format(calToday.getTime()));
		
		Calendar calendars = Calendar.getInstance();
		int year = 2024;
		int month = 1;
		calendars.set(year, month-1, 1);  // 해당월의 1일 날짜
		System.out.println(sdf.format(calendars.getTime()));
		
		// 해당 월의 마지막 일자 얻기
		int lastDay = calendars.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		
		// 해당 월의 시작 요일
		int startDay = calendars.get(Calendar.DAY_OF_WEEK);
		System.out.println(startDay);  // 1. 일요일, 2. 월요일
		
		/*System.out.println(year + "년 " + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int current = 1;
		for (int i = 1; i <= 42; i++) {
			if (i < startDay) {
				System.out.print("\t");
			} else {
				if (! (i % 7 == 1 || i % 7 == 0)) {
					System.out.printf("%d\t", current);
				} else {
					System.err.printf("%d\t", current);
				}
				current++;
				if (current > lastDay) {
					break;
				}
			}
			if (i % 7 == 0) {
				System.out.println();
			}
		}*/
		
		workingCalenar(2024, 8);
	}
	// 주말 빼고 출력
	public static void workingCalenar(int year, int month) {
		Calendar calendars = Calendar.getInstance();
		calendars.set(year, month-1, 1);
		
		int startDay = calendars.get(Calendar.DAY_OF_WEEK);
		int lastDay = calendars.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + "년 " + month + "월 달력");
		System.out.println("Mon\tTue\tWen\tThu\tFri");
		
		int current = 1;
		for (int i = 1; i <= 42; i++) {
			if (i < startDay) {
				if (i != 1) {
					System.out.print("\t");
				}
			} else {
				if (! (i % 7 == 1 || i % 7 == 0)) {
					System.out.printf("%d\t", current);
				}
				current++;
				if (current > lastDay) {
					break;
				}
			}
			if (i % 7 == 0) {
				System.out.println();
			}
		}
	}
}