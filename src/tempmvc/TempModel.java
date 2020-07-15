package tempmvc;

/**
 * The 'Model' class for the Temperature Converter, contains the data and the 
 * methods needed to manipulate the data.
 * 
 * @author Ryan Herkt
 */
public class TempModel 
{
    private double converted;
    private String message;

    /**
     * Default constructor.
     */
    public TempModel() 
    {
        this.converted = 0.0;
        this.message = " degrees Celsius is: ";
    }

    /**
     * @return the converted number from C to F
     */
    public double getConverted() 
    {
        return converted;
    }

    /**
     * @param converted the converted to set
     */
    public void setConverted(double converted) 
    {
        this.converted = (converted * 1.8) + 32; //C to F
    }

    /**
     * @return the message shown to user
     */
    public String getMessage() 
    {
        return message;
    }
}