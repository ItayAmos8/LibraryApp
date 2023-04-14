//Itay Amos
//313348104
package Library;

import java.text.DateFormatSymbols;

public class Sheet {
    private int year,month,SerialNumber;

    public Sheet(int year,int month){
        this.year=year;
        this.month=month;
    }

    public int SerialNumber(){//return the serial number of the sheet
        return SerialNumber;
    }

    public int getYear(){//return the year of publication
        return year;
    }

    public int getMonth() {//return the month of publication
        return month;
    }
    public String printMonth(){//print the month by format
        return new DateFormatSymbols().getMonths()[getMonth()-1];
    }
    public String toString(){
        return "\n\t\t  "+getYear()+"\t"+printMonth()+"\t";
    }
}
