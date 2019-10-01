public class CenturyFromYear {

    private int year;

    public CenturyFromYear() { }

    public int getCentury(int year){
        if(year <= 0){
            return 0;
        } else{
            return year % 100 == 0 ? (year / 100) : (year / 100) + 1;
        }
    }
}
