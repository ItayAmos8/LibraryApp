//Itay Amos
//313348104
package Library;

import java.util.ArrayList;

public class Magazine extends LibraryItem {
    private String info;
    private ArrayList<Sheet> SheetList=new ArrayList<>();//sheet list

    public Magazine(String subCode, int catalogueNo, String name, String info) {
        super(subCode, catalogueNo, name);//uses the father class LibraryItems constructor
        this.info = info;
    }

    public String getInfo() {//get the info
        return info;
    }

    public StringBuilder printSheet() {//print the sheet
        StringBuilder s1 = new StringBuilder();

        for (Sheet a : SheetList) {
            s1.append(a);

        }
        return s1;
    }

    public boolean addSheet(int year, int month) {//add sheet to the magazine
       if (month > 0 && month < 13) {//check if the month is valid
            Sheet s1 = new Sheet(year, month);//create a new sheet
            SheetList.add(s1);//add the sheet to the list
            return true;
        }
        return false;//add failed
    }

    public String toString(){
        return "Magazine"+"\n\t"+"Subject Code: "+getSubCode()+"\n\t"+"Number: "+getItemNo()+"\n\t"+"Name: "+getName()+
                "\n\t"+"Info: "+getInfo()+"\t"+printSheet();
    }

}