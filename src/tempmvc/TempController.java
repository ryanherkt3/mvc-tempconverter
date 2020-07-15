package tempmvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The 'Controller' class for the Temperature Converter, which coordinates 
 * interactions between the Model and the View classes.
 * 
 * @author Ryan Herkt
 */
public class TempController 
{
    private TempModel model;
    private TempView view;
    
    /**
     * Constructor for this class with parameters for the Model and View 
     * classes, which this class interacts with
     * 
     * @param model
     * @param view 
     */
    public TempController(TempModel model, TempView view)
    {
        this.model = model;
        this.view = view;
        
        view.addCalculateListener(new CalculateListener());
    }
    
    // inner class
    class CalculateListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            double toConvert;
            
            // Surround interactions with the view with a try-catch block 
            // in case number wasn't properly entered
            try 
            {
                toConvert = view.getNumber();
                model.setConverted(toConvert);
                view.setConversion(toConvert, model.getMessage(), model.getConverted());
            } 
            catch (NumberFormatException ex) 
            {
                System.out.println(ex);
                view.displayErrorMessage("Enter a valid number!");
            }
        }
    }
}