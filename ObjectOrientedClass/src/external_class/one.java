package external_class;

import java.util.Calendar;

public class one {
    public static void main(String[] args) {

    }
}
class calender{
    calender() {
        Calendar now = Calendar.getInstance();
        int year= now.get(Calendar.YEAR);
        int month=now.get(Calendar.MONTH);
        int day=now.get(Calendar.DATE);
        int ampm=now.get(Calendar.AM_PM);
        int hour=now.get(Calendar.HOUR);
        int min=now.get(Calendar.MINUTE);
        int sec=now.get(Calendar.SECOND);
    }

}

class math{
    math(){
        int n = (int) (Math.random()*100+1);
    }
}