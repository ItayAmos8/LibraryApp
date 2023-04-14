//Itay Amos
//313348104
package Library;

public abstract class LibraryItem implements Comparable<LibraryItem>{
    private String subCode;
    private String name;
    private int ItemNo;

    public LibraryItem(String subCode, int catalogueNo, String name){//father constructor to Books and Magazine class
        this.subCode=subCode;
        ItemNo=catalogueNo;
        this.name=name;
    }

    public String getSubCode(){//return the code
        return subCode;
    }

    public String getName(){//return the name of the magazine/book
        return name;
    }
    public int getItemNo(){//return the catalogue number of the magazine/book
        return ItemNo;
    }

    @Override
    public int compareTo(LibraryItem o) {//compare the lib item by name, uses comparable interface
        return LibraryItem.this.name.compareTo(o.name);
    }


}
