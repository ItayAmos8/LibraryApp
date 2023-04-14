//Itay Amos
//313348104
package Library;

import java.util.ArrayList;


public class Reader {
    private String firstName;
    private String lastName;
    private int id;

    public ArrayList<Copy> copies = new ArrayList<>();//array list for the copy list
    public ArrayList<Loan> LoanList = new ArrayList<>();//array list for the loan list

    public Reader(String firstName, String lastName, int id) {//constructor for reader
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getID() {//get the id number of the reader
        return id;
    }
    public ArrayList<Loan> getLoanList(){//return the loan list
        return LoanList;
    }

    public void printDetails() {//print the detail of th reader
        System.out.println(getClass().getSimpleName()+"\n\t"+"First Name: "+firstName+"\n\tLast Name: "+
                lastName+"\n\tReader No.: "+id+" ");
    }

    public String toString() {
        return getClass().getSimpleName()+"\n\t"+"First Name: "+getFirstName()+"\n\tLast Name: "+
                getLastName()+"\n\tReader No.:"+id+"\n\t";
    }

}


