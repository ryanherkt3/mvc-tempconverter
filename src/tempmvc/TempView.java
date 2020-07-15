package tempmvc;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * The 'View' class for the Temperature Converter, contains the interface that 
 * the outside world sees and interacts with.
 * 
 * @author Ryan Herkt
 */
public class TempView extends JFrame
{
    private JLabel prompt = new JLabel("Enter a number:");
    private JTextField temperature = new JTextField(5);
    private JButton convert = new JButton("Convert");
    private JLabel conversion = new JLabel();
    
    /**
     * Default constructor.
     */
    public TempView()
    {
        JPanel allPanels = new JPanel(new GridLayout(2,1));
        JPanel panelOne = new JPanel();
        JPanel panelTwo = new JPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 180);
        this.setTitle("Celsius to Fahrenheit");
        
        panelOne.add(prompt);
        panelOne.add(temperature);
        panelOne.add(convert);
        panelTwo.add(conversion);
        
        allPanels.add(panelOne);
        allPanels.add(panelTwo);
        this.add(allPanels);
    }
    
    /**
     * Get number to convert from Celsius to Fahrenheit.
     * 
     * @return the number to convert as a double
     */
    public double getNumber()
    {
        return Double.parseDouble(temperature.getText());
    }
    
    /**
     * Execute the listener's actionPerformed method, if the calculateButton 
     * is clicked
     * 
     * @param listener 
     */
    void addCalculateListener(ActionListener listener) 
    {
        convert.addActionListener(listener);
    }
    
    /**
     * Open a pop-up that contains the error message passed
     * 
     * @param errorMessage 
     */
    void displayErrorMessage(String errorMessage) 
    {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

    /**
     * Set the text in the conversion label if the number entered is valid
     * 
     * @param original
     * @param message
     * @param toConvert
     */
    public void setConversion(double original, String message, double toConvert) 
    {
        conversion.setText(original + message + 
                String.format("%.1f", toConvert) + "°F");
    }
}