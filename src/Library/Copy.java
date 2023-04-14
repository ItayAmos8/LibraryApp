//Itay Amos
//313348104

package Library;

public class Copy {
    private   int SerialNo;
    private int noDays;
    private int Location;


    public Copy(int noDays){//constructor for copy class
        this.noDays=noDays;
        setLocation(this.Location);//set the location of the copy

    }

    public  int getSerialNo(){//return the serial number of the copy
        return SerialNo;
    }


    public  int NoDays() {//return the number of days that user can loan it
        return noDays;
    }
    public int getLocation(){//return the location of the copy
        return Location;
    }
    public void setCopySerialNo(int serialNo){//set the serial no. of the copy
        this.SerialNo=serialNo;
    }
    public void setLocation(int location){//set the location of the copy
        this.Location=location;
    }
    public String printCopy(){//method that prints the correct output if the copy is borrowed or not
        if (Location==0){
            return " in library";
        }
        return " is borrowed";
    }

    public String toString(){
        return "\n\t\t"+"copy "+ SerialNo + printCopy()+"\t";
    }

}
