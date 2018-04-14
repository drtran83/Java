package Chapter12;

//imports

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Info:
 * Name:  Tom Tran
 * Class:  CISS 238 - Java
 * Professor: James Barringer
 * Week: 7
 * Date: December 4, 2017
 * 
 * Chapter 12  Programming Challenge 3  Dorm and Meal Plan Calculator
 */

public class DormAndMealPlanCalc extends JFrame {
	
	// Array with dorm names
	
	private String [] dorms = {"Allen Hall", "Pike Hall", "Farthing Hall", "University Studies"};

	// Array with meal plan descriptions
	
	private String [] meals = {"7 meals per week", "14 meals per week", "Unlimited meals per week"};

	// To calculate prices
	
	private double [] dormPrices = {1500, 1600, 1200, 1800};
	
	private double [] mealPrices = {560, 1095, 1500};
	
    // Combo box to display dorms
	
	private JComboBox dormBox;
	
	// Combo box to display meal plans
	
	private JComboBox mealBox;

    // Panel for dorm combo box
	
	private JPanel dormsPanel;
	
	// Panel for meal combo box
	
	private JPanel mealPanel;
	
	// Panel for the buttons
	
	private JPanel buttonsPanel;
	
	
	// To exit the application
	
	private JButton exitButton;
	
	// To Calculate
	
	private JButton calcButton;
	

	/**
	 * Constructor
	 */

	public DormAndMealPlanCalc() {
		
		// Display a title.
		
		super("Dorm and Meal Plan Cacluator");
		
		// Specify what happens when the close button is clicked.
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new BorderLayout());
		
		// Build the dorm panel.
		
		buildDormPanel();
		
		// Build the meal plan panel.
		
		buildMealPanel();

		// Build the button panel.
		
		buildButtonPanel();

		// Add the panels to the content pane.
		
		add (dormsPanel, BorderLayout.NORTH);
		add(mealPanel, BorderLayout.CENTER);
		add(buttonsPanel,BorderLayout.SOUTH);

		// Pack and display the window.
		
		pack();
		setVisible(true);
	}

	/**
	 * buildDormPanel method
	 */

	private void buildDormPanel() {
		
		// Create a label prompting the user to select a dorm.
		
		dormsPanel = new JPanel();
		
		JLabel dormLabel = new JLabel ("Select a Dorm");
		
		// Create the dorm combo box.
		
		dormBox = new JComboBox(dorms);
		
		// Put the components in a panel.
		
		dormsPanel.add(dormLabel);
		dormsPanel.add(dormBox);
		
	}

	/**
	 * buildMealPanel method
	 */

	private void buildMealPanel() {
		
		// Create a label prompting the user to select a meal plan.
		
		mealPanel = new JPanel();
		JLabel mealLabel = new JLabel("Select a Meal Plan");
		
		// Create the meal plan combo box.
		
		mealBox = new JComboBox(meals);

		// Put the components in a panel.
	
		mealPanel.add(mealLabel);
		mealPanel.add(mealBox);
	}

	/**
	 * buildButtonPanel method
	 */

	private void buildButtonPanel() {
		
		// Create a button to calculate the charges.
		
		calcButton = new JButton("Calculate");
		
		// Add an action listener to the button.
		
		calcButton.addActionListener(new CalcButtonListener());
		
		// Create a button to exit the application.
		
		exitButton = new JButton("Exit");
			
		// Add an action listener to the button.
		
		exitButton.addActionListener(new ExitButtonListener());

		// Put the buttons in their own panel.
		
		buttonsPanel = new JPanel();
		
		buttonsPanel.add(calcButton);
		buttonsPanel.add(exitButton);
	}

	
	/**
	 * CalcButtonListener is an action listener class for the calc button
	 * component.
	 */

            //calc code here
	
	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			
			int meal = mealBox.getSelectedIndex();
			int dorm = dormBox.getSelectedIndex();
			double total = mealPrices[meal] + dormPrices[dorm];
			
			
			JOptionPane.showMessageDialog(null, "Total Charges per Semsester: " + "$" + total);
			
		}	
		
		
	}
	
	/**
	 * ExitButtonListener is an action listener class for the exitButton
	 * component.
	 */

            //exit code here
	
	private class ExitButtonListener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
			
		}


		
	}
	
	
	/**
	 * The main method creates an instance of the DormAndMealPlanCalc class.
	 */
	public static void main(String[] args) {
		DormAndMealPlanCalc dmpc = new DormAndMealPlanCalc();
	}
}