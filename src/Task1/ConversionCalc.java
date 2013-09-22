package Task1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;



public class ConversionCalc extends JFrame{
	
	private JLabel item1;
	private JLabel item2;
	private JLabel item3;
	private JPanel panel;
	
	/*
	 * Input text fields
	 */
	private JTextField miles;
	private JTextField inches;
	private JTextField kilos;
	
	private JTextField kilometers;
	private JTextField cm;
	private JTextField pounds;
	
	private JButton button1;
	
	public ConversionCalc(){
		super("Conversion Calc");
		
		/*
		 * Creating various elements from buttons, to Text fields!
		 */
		button1 = new JButton();
		button1.setText("Convert!");
		button1.setBounds(90, 120, 100, 20);
		
		item1 = new JLabel("To");
		item1.setToolTipText("Whoo, spooky ghost");
		item1.setBounds(130, 20, 100, 20);
		
		item2 = new JLabel("To");
		item2.setToolTipText("Whoo, spooky ghost");
		item2.setBounds(130, 50, 100, 20);
		
		item3 = new JLabel("To");
		item3.setToolTipText("Whoo, spooky ghost");
		item3.setBounds(130, 80, 100, 20);
		
		miles = new JTextField();
		miles.setText("Miles");
		miles.setBounds(50, 20, 60, 30);
		
		inches = new JTextField();
		inches.setText("Inches");
		inches.setBounds(50, 50, 60, 30);
		
		kilos = new JTextField();
		kilos.setText("Kilos");
		kilos.setBounds(50, 80, 60, 30);
		
		
		kilometers = new JTextField();
		kilometers.setText("KM");
		kilometers.setBounds(170, 20, 60, 30);
		
		cm = new JTextField();
		cm.setText("Cm");
		cm.setBounds(170, 50, 60, 30);
		
		pounds = new JTextField();
		pounds.setText("Kilos");
		pounds.setBounds(170, 80, 60, 30);
		
		panel = new JPanel();
		panel.setLayout(null);
		/*
		 * End of creating elements
		 */
		
		
		/*
		 * Creating our handler (class down below)
		 */
		Handler handler = new Handler();
		//adding item to handler so once the button is pressed a certain something is done
		button1.addActionListener(handler);
		
		/*
		 * Adding everything to the panel and then
		 * adding the panel to the frame, this way we can
		 * actually see the items being rendered!
		 */
		panel.add(button1);
		
		panel.add(miles);
		panel.add(inches);
		panel.add(kilos);
		
		panel.add(kilometers);
		panel.add(cm);
		panel.add(pounds);
		
		panel.add(item1);
		panel.add(item2);
		panel.add(item3);
		add(panel);
		
		
	}
	
	private static ConversionCalc calc;
	
	public static void main(String args[]){
		/*
		 * Setting the system default look and feel, meaning that what ever the
		 * system default theme is - java will use it and adapt their gui to that
		 */
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e){
			
		}
		
		calc = new ConversionCalc();
		/*
		 * Dispose on close means that it will get rid of the frame - with this you can have multiple frames and once X is clicked
		 * instead of killing the whole script it would only kill the frame created. Good if you have multiple windows being
		 * constantly opened
		 */
		calc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		calc.setLocation(400, 400);
		calc.setSize(280, 200);
		calc.setVisible(true);
	}
	
	
	/*
	 * Action listener, will listen if any even is called, for example a button pressed or
	 * text is entered
	 */
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			float mileToKm = 1.60935f;
			float inchToCm = 2.4f;
			float kgToPound = 2.2046f;
			
			
			/*
			 * Actual conversion happening here
			 * 
			 * this if statement checks if button one was the source
			 * of the event, if it was then everything inside the statement is run
			 * and so we see the values change to the new ones in the program
			 */
			
			if(event.getSource() == button1){
				/*
				 * I rounded the values because they returned really long doubles
				 * which made it a pain to read :s
				 */
				double km = Math.round(Double.parseDouble(miles.getText()) * mileToKm);
				kilometers.setText(km + "");
				double centm = Math.round(Double.parseDouble(inches.getText()) * inchToCm);
				cm.setText(centm + "");
				double pound = Math.round(Double.parseDouble(kilos.getText()) * kgToPound);
				pounds.setText(pound + "");
			}
			//possibly add another button to convert the values back?
		}
	}
	
}
