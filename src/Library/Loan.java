//Itay Amos
//313348104
package Library;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Loan implements Comparable<Loan>{
    private int ItemNo;
    private int serialNo;
    private Date date;
    static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");



    public Loan(int catalogueNo, int serialNo, Date date) {//constructor for loan
        ItemNo = catalogueNo;
        this.serialNo = serialNo;
        this.date = date;
    }
    public int getItemNo() {//get the item number of the loan item
        return ItemNo;
    }
    public Calendar getDate() {//get the date
        Calendar calendar = new GregorianCalendar();
        calendar.set(date.getYear(),date.getMonth(),date.getDay());
        calendar.setTime(date);
        return calendar;
    }
    public String printDate(){//return a string of the date
        return format.format(date);
    }

    public int getSerialNo() {
        return serialNo;
    }

    @Override
    public int compareTo(Loan o) {//uses Comparable interface to compare by date
        return Loan.this.date.compareTo(o.date);
    }

    public String toString(){
        return "\n\t\tNumber: "+ItemNo+"\tCopy: "+serialNo+"\tReturn date: "+format.format(getDate());
    }
}
