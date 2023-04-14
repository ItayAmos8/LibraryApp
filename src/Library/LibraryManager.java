//Itay Amos
//313348104

package Library;

import java.util.ArrayList;
import java.util.Collections;

public class LibraryManager {

    public static String getBookName(ArrayList<LibraryItem> lib, int No) {//get the book name by catalogue number
        for (LibraryItem i : lib) {
            if (i instanceof Book) {//if the reference refer to book object
                if (i.getItemNo() == No) {//check if the item num is the correct one
                    return i.getName();
                }
            }
        }
        return null;//the number of the book is not in the book list
    }


    static ArrayList<Loan> sortLoanedBook(Reader reader) {//sort the loan lost by date

        if (reader.getLoanList().size() > 0) {//check if the list is not empty
            Collections.sort(reader.LoanList);//uses comparable interface to sort by compare to method
            return reader.LoanList;//return the sorted loan list
        }
        return reader.LoanList;//return the original empty loan list
    }

    public static ArrayList<LibraryItem> sortLibraryItem(ArrayList<LibraryItem> library, String subCode) {//sort the library items (book/magazine) by sub code
        ArrayList<LibraryItem> temp = new ArrayList<>();//temp arr to not destroy  the original list
        for (LibraryItem a : library) {
            if (a.getSubCode().equals(subCode)) {
                temp.add(a);
            }
        }
        Collections.sort(temp);//sort the array
        return temp;//return the sorted array
    }

    public static void printReaderLoanList(Reader reader, ArrayList<LibraryItem> lib) {//print the reader  loan list
        sortLoanedBook(reader);//call the method that sort the list
        int i = reader.LoanList.size();//size of the list,the size equal to the number of books
        System.out.println("Borrowed Books by Reader");
        reader.printDetails();//print the reader details
        if(i==0) {//if the list is empty
            System.out.println("\tNo loaned books");
        }else if(i==1){//if there is only on book on the list
            System.out.println("\t"+i+" loaned book");
        }
        else{
        System.out.println("\t"+i+" loaned books");//more the one book
        }
        for(Loan loan:reader.LoanList){
            String name=getBookName(lib,loan.getItemNo());//get the book name
            System.out.println("\t\tBook name: "+name);
            System.out.println("\t\tNumber: "+loan.getItemNo()+"\t Copy: "+loan.getSerialNo()+",\tReturn date: "+loan.printDate());
        }

    }


}







