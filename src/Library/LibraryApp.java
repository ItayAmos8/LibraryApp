package Library;

import java.util.ArrayList;

public class LibraryApp {

    public static void main(String[] args) {

        ArrayList<LibraryItem> library = generateLibrarayItems();
        ArrayList<Reader> libraryrReaders = generateLibrarayReaders(library);

        System.out.println("Libraray Items - SW ");

        ArrayList<LibraryItem> sortedLibrary = LibraryManager.sortLibraryItem ( library, "SW");
        for (LibraryItem il:sortedLibrary){System.out.println(il);}
        System.out.println("Libraray Items - EDU ");

        sortedLibrary = LibraryManager.sortLibraryItem ( library, "EDU");
        for (LibraryItem il:sortedLibrary){System.out.println(il);}
        LibraryManager.printReaderLoanList(libraryrReaders.get(2),library);
        LibraryManager.printReaderLoanList(libraryrReaders.get(3),library);
        transaction(library , libraryrReaders);
        LibraryManager.printReaderLoanList(libraryrReaders.get(3),library);

    }

    public static ArrayList<LibraryItem> generateLibrarayItems(){

        ArrayList<LibraryItem> lib = new ArrayList<LibraryItem>();
        Book book;
        Magazine magazine;

        int i;

        magazine = new Magazine("SW",213450,"IEEE - Software Engineering","IEEE Publications");
        for ( i=0; i< 6; i++) magazine.addSheet(2014,1+i*2);
        lib.add(magazine);
        book = new Book("SW", 201234, "JAVA -How to Program", "Deitel & Deitel" );
        for ( i=0; i< 6; i++) book.addCopy(0+i*3);
        lib.add(book);
        book = new Book("SW",206123,"Object Oriented Programming", "Levy");
        for ( i=0; i< 4; i++) book.addCopy(0+i*4);
        lib.add(book);
        magazine = new Magazine("SW",211210,"IEEE - Software & Computers ","IEEE Publications");
        for ( i=0; i< 3; i++) magazine.addSheet(2014,1+i*4);
        lib.add(magazine);
        book = new Book("SW",201426,"Object Oriented Software Engineering", "Oren");
        for ( i=0; i< 4; i++) book.addCopy(0+i*2);
        lib.add(book);
        book = new Book("SW",203761,"C++", "Kal");
        for ( i=0; i< 5; i++) book.addCopy(4);
        lib.add(book);
        magazine = new Magazine("EDU",113450,"Teaching","	Teachers Union Publications");
        for ( i=0; i< 6; i++) magazine.addSheet(2014,1+i*2);
        lib.add(magazine);
        book = new Book("EDU",104356, "How to Teach", "Gary");
        for ( i=0; i< 6; i++) book.addCopy(0+i*3);
        lib.add(book);
        book = new Book("EDU",101003,"Ways to Learn", "Berg");
        for ( i=0; i< 3; i++) book.addCopy(0+i*4);
        lib.add(book);

        return lib;
    }
    public static ArrayList<Reader>  generateLibrarayReaders(ArrayList<LibraryItem> lib){
        ArrayList<Reader> readers = new ArrayList<Reader>();
        Librarian librarian;
        readers.add(new Librarian("Lital","Avny",10));
        readers.add(new Reader("Rona","Shtien",11));

        readers.add(new Reader("Irit","Gross",1));
        readers.add(new Reader("Dan","Oren",2));
        readers.add(new Reader("Gal","Ilan",3));
        readers.add(new Reader("Rina","Kore",4));
        readers.add(new Reader("Dana","Salev",5));
        readers.add(new Reader("Sira","Ron",6));
        librarian = (Librarian)readers.get(0);
        librarian.loanBook(readers.get(3),(Book)lib.get(1));
        librarian.loanBook(readers.get(4),(Book)lib.get(2));
        librarian.loanBook(readers.get(5),(Book)lib.get(2));
        librarian.loanBook(readers.get(2),(Book)lib.get(1));
        librarian.loanBook(readers.get(2),(Book)lib.get(2));
        librarian.loanBook(readers.get(2),(Book)lib.get(4));

        return readers;
    }
    public static void transaction(ArrayList<LibraryItem> lib , ArrayList<Reader> readers){
        Librarian librarian = (Librarian)readers.get(0);
        librarian.returnBook(readers.get(3),(Book)lib.get(1));
    }
}


