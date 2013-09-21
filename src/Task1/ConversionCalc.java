package Task1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;



public class ConversionCalc extends JFrame{
	
	private JLabel item1;
	private JPanel panel;
	private JTextField item2;
	private JButton button;
	
	public ConversionCalc(){
		super("Conversion Calc");
		
		item1 = new JLabel("Hello world!");
		item1.setToolTipText("Hovering");
		item2 = new JTextField();
		item2.setText("Crap");
		
		button = new JButton();
		button.setText("Cha");
		button.setBounds(40, 80, 40, 40);
		
		
		
		
		panel = new JPanel();
		panel.setLayout(null);
		Handler handler = new Handler();
		button.addActionListener(handler);
		item2.addActionListener(handler);
		panel.add(item1);
		panel.add(item2);
		panel.add(button);
		add(panel);
		
		
	}
	private static ConversionCalc calc;
	public static void main(String args[]){
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e){
			
		}
		calc = new ConversionCalc();
		calc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		calc.setSize(400, 200);
		calc.setVisible(true);
	}
	
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String string = "";
			boolean button = false;
			
			if(event.getSource() == item2){
				string = String.format("field 1: %s", event.getActionCommand());
			}
			JOptionPane.showMessageDialog(calc, string);
		}
	}
	
}
