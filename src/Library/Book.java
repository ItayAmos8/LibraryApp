//Itay Amos
//313348104
package Library;

import java.util.ArrayList;

public class Book extends LibraryItem {
    private String author;
    private int NumberofCopies = 0;
    private ArrayList<Copy> Copies = new ArrayList<>();

    public Book(String subCode, int catalogueNo, String name, String author) {
        super(subCode, catalogueNo, name);//uses the father class LibraryItem constructor
        this.author = author;
    }

    public String getAuthor() {//return the name of the author
        return author;
    }

    public int getNumberofCopies() {//return the number of copies
        return NumberofCopies;
    }


    public boolean addCopy(int noDays) {//add copy to the copies list
        if (noDays >= 0) {
            Copy c1 = new Copy(noDays);//create new copy
            NumberofCopies++;//increment the nom of copies
            c1.setCopySerialNo(NumberofCopies);//set the serial number of the copy
            Copies.add(c1);//add the new copy to list
            return true;
        }
        return false;//add copy failed
    }

    public StringBuilder printCopies() {//print the copies by order
        StringBuilder s1 = new StringBuilder();
        for (Copy a : Copies) {
            s1.append(a);
        }
        return s1;
    }

    public Copy getCopy() {//get the copy
        if (Copies.size() > 0) {//if the array of copy is not empty
            for (Copy a : Copies) {
                if (a.getLocation() == 0 && a.NoDays() > 0) {//check if the location is 0 and if the num of days is bigger than 0
                    return a;
                }
            }
        }
        return null;
    }
    public String toString() {
        return "Book" + "\n\t" + "Subject Code: " + getSubCode() + "\n\t" + "Number: " + getItemNo() + "\n\t" + "Name: " + getName() +
                "\n\t" + "Author: " + getAuthor() + "\n\t" + "No. of copies: " + this.NumberofCopies +
                printCopies();
    }
}
