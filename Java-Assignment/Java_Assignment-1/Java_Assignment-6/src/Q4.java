import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Q4 {
	static class DateItem {
        String date;

        DateItem(String date) {
            this.date = date;
        }
    }

    static class SortByDate implements Comparator<DateItem> {
        @Override
        public int compare(DateItem a, DateItem b) {
            return a.date.compareTo(b.date);
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<DateItem> dateList = new LinkedList<>();
        dateList.add(new DateItem("2020-03-25"));
        dateList.add(new DateItem("2019-01-27"));
        dateList.add(new DateItem("2020-03-26"));
        dateList.add(new DateItem("2020-02-26"));
        Collections.sort(dateList, new SortByDate());
        dateList.forEach(date -> {
            System.out.println("your date of birth is"+date.date);
        });

	}

}
}
