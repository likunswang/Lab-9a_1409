
/**
 * Write a description of class Canada here.
 *
 * @author Luke
 * @version Nov.25.2017
 */
public class Canada
{
    // instance variables - replace the example below with your own
    private String[][] canada;

    public static final int BC = 5;
    public static final int AB = 8;
    public static final int MB = 4;
    public static final int NB = 3;
    public static final int NL = 9;
    public static final int NT = 12;
    public static final int NS = 2;
    public static final int NU = 11;
    public static final int ON = 0;
    public static final int PE = 6;
    public static final int QC = 1;
    public static final int SK = 7;
    public static final int YT = 10;
    public static final int ALL_PROVINCES_IN_CANADA = 13;

    public static final int NAME_OF_PROVINCE = 0;
    public static final int NAME_OF_CAPITAL_CITY = 1;
    public static final int NAME_OF_BIGGEST_CITY = 2;
    public static final int NAME_OF_ALL = 3;

    // useless code but i dont want to delete
    //private static final String[] provinces = { "Ontario", "Quebec", "Nova Scotia", "New Brunswick", 
    //        "Manitoba", "Britsh Columbia", "Prince Edward Island", "Saskatchewan", 
    //        "Alberta", "Newfoundland and Labrador", "Yukon", "Nunavut", "Northwest Territories" };
    private static final String[] Ontario = {"Ontario","Toront","Toronto"};
    private static final String[] Quebec = {"Quebec","Quebec City","Montreal"};
    private static final String[] NovaScotia = {"Nova Scotia","Halifax","Halifax"};
    private static final String[] NewBrunswick = {"New Brunswick","Fredericton","Saint John"};
    private static final String[] Manitoba = {"Manitoba","Winnipeg","Winnipeg"};
    private static final String[] BritishColumbia = {"British Columbia", "Victoria", "Vancouver"};
    private static final String[] PrinceEdwardIsland = {"Prince Edward Island","Charlottetown","Charlottetown"};
    private static final String[] Saskatchewan = {"Saskatchewan","Regina","Saskatoon"};
    private static final String[] Alberta = {"Alberta","Edmonton","Calgary"};
    private static final String[] NewfoundlandAndLabrador = {"Newfoundland and Labrador","St.John's","St.John's"};
    private static final String[] Yukon = {"Yukon","Whitehourse","Whitehourse"};
    private static final String[] Nunavut = {"Nunavut","Iqaluit","Iqaluit"};
    private static final String[] NorthwestTerritories = {"NorthWest Territories","Yellowknife","Yellowknife"};

    private static final  String[][] ProvinceArrays = {Ontario, Quebec, NovaScotia, NewBrunswick, Manitoba, BritishColumbia, 
            PrinceEdwardIsland, Saskatchewan, Alberta, NewfoundlandAndLabrador, 
            Yukon, Nunavut, NorthwestTerritories};

    /**
     * Constructor for objects of class Canada
     */
    public Canada()
    {
        //System.out.println(ProvinceArrays);

        canada = new String[ALL_PROVINCES_IN_CANADA][NAME_OF_ALL];
        for(int i = 0; i < ALL_PROVINCES_IN_CANADA; i++)
        {
            for(int j = 0; j < NAME_OF_ALL; j++)
            {
                canada[i][j]  =  new String(ProvinceArrays[i][j]);
            }
        }

    }

    /**
     * @param province name eg.British Columbia
     * @return name of capital city of the province
     */
    public String getCapitalCityOf(String province)
    {
        province = province.toLowerCase();
        for(int i = 0 ; i < ALL_PROVINCES_IN_CANADA; i++)
        {
            if(province.equals(canada[i][NAME_OF_PROVINCE].toLowerCase()))
            {
                return canada[i][NAME_OF_CAPITAL_CITY];
            } 
        }
        return null;
    }

    /**
     * @param province name eg.British Columbia
     * @return name of the largest city of the province
     */
    public String getLargestCityOf(String province)
    {
        province = province.toLowerCase();

        for(int i = 0; i < ALL_PROVINCES_IN_CANADA; i++)
        {
            if(province.equals(canada[i][NAME_OF_PROVINCE].toLowerCase()))
            {
                return canada[i][NAME_OF_BIGGEST_CITY];
            }
        }
        return null;
    }

    /**
     * @param name of the capital city
     * @return the name of the province whose capital city is the param
     */
    public String getProvinceWhoseCapitalls(String city)
    {
        city = city.toLowerCase();
        for(int i = 0; i < ALL_PROVINCES_IN_CANADA; i++)
        {
            if(city.equals(canada[i][NAME_OF_CAPITAL_CITY].toLowerCase()))
            {
                return canada[i][NAME_OF_PROVINCE];
            }
        }
        return null;
    }

    public void displayALLProvinceInfo()
    {
        for(int i = 0 ; i < ALL_PROVINCES_IN_CANADA; i++)
        {
            if(canada[i][NAME_OF_BIGGEST_CITY].equals(canada[i][NAME_OF_CAPITAL_CITY]))
            {
                System.out.println("The capital city of " + canada[i][NAME_OF_PROVINCE] + " is " + canada[i][NAME_OF_CAPITAL_CITY] + ",and it is also the largest city.");
            }
            else
            {
                System.out.println("The capital city of " + canada[i][NAME_OF_PROVINCE] + " is " + canada[i][NAME_OF_CAPITAL_CITY] + ",but the largest city is " 
                    + canada[i][NAME_OF_BIGGEST_CITY] + ".");
            }
        }

    }

}
