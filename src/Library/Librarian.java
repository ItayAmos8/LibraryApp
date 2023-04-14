//Itay Amos
//313348104
package Library;

import java.util.*;
import java.util.Calendar;

public class Librarian extends Reader {

    public Librarian(String firstName, String lastName, int id) {//constructor for librarian
        super(firstName, lastName, id);//call the father class reader constructor
    }

    public Date setTime(Book book) {//return when is the due date to return the copy after loaned
        Date date = new Date();
        int day= date.getDay()+book.getCopy().NoDays();//the day after the calculation of the return date
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, day);
        date=cal.getTime();
        return date;//return the date after fixed
    }

    public boolean loanBook(Reader reader, Book book) {
        if (book.getNumberofCopies() > 1) {//check if there is a copy to loan
            Copy copy = book.getCopy();
            if (!Objects.isNull(copy)) {
                reader.copies.add(copy);//add the copy to the array list
                Loan loan = new Loan(book.getItemNo(), copy.getSerialNo(), setTime(book));//create new loan
                reader.LoanList.add(loan);//add the new loan to the loan list
                copy.setLocation(reader.getID());//set the location of the copy to the reader id
                return true;
            }
        }
        return false;//return false if the loaned failed
    }

    public boolean returnBook(Reader reader, Book book) {//return the book to the library
        ArrayList<Loan> temp=reader.LoanList;//new array to work on that contains the reader loan list
        int i = temp.size();
        while (i >= 0) {//if there is any copy to return
            if (temp.get(i - 1).getItemNo() == book.getItemNo()) {//check if the copy that in the loan list is match to the book name
                reader.copies.get(i - 1).setLocation(0);//reset the location to 0 after return to the lib
                temp.remove(i - 1);//remove the copy from the temp loan list
                reader.copies.remove(i - 1);
                return true;
            }
            i--;
        }
        return false;
    }

}
