package android.example.tourguide;

public class Word {

    private String mlocationname;
    private String mlocationdes;
    private int mimage = NO_IMAGE;
    private static final int NO_IMAGE = -1;
    private double mlat;
    private double mlon;

    public Word(String locationname, String locationdes, double lat, double lon)
    {
        mlocationname = locationname;
        mlocationdes = locationdes;
        mlat = lat;
        mlon = lon;
    }
    public Word(String locationname, String locationdes, int image, double lat, double lon)
    {
        mlocationname = locationname;
        mlocationdes = locationdes;
        mimage = image;
        mlat = lat;
        mlon = lon;
    }
    public Word(String locationname, String locationdes)
    {
        mlocationname = locationname;
        mlocationdes = locationdes;
    }
    public String getlocationname()
    {
        return mlocationname;
    }
    public String getlocationdes()
    {
        return mlocationdes;
    }
    public int getimage()
    {
        return mimage;
    }
    public boolean hasImage() {
        return mimage != NO_IMAGE;
    }
    public double getlat()
    {
        return mlat;
    }
    public double getlon()
    {
        return mlon;
    }
}
