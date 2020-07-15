package tempmvc;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * The main class which creates and shows the GUI, using instances of the 
 * Model, View and Controller classes.
 * 
 * The GUI is a temperature converter, which uses the MVC design pattern to 
 * convert a valid number from celsius to fahrenheit.
 * 
 * @author Ryan Herkt
 */
public class TemperatureMVC 
{
    public static void main(String[] args)
    {
        TempModel model = new TempModel();
        TempView view = new TempView();
        TempController controller = new TempController(model, view);
        
        view.setVisible(true);
        
        // position the frame in the middle of the screen
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenDimension = tk.getScreenSize();
        Dimension frameDimension = view.getSize();
        view.setLocation((screenDimension.width-frameDimension.width)/2,
           (screenDimension.height-frameDimension.height)/2);
    }
}
