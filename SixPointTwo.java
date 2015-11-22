import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SixPointTwo extends JFrame {


	private JPanel contentPane;
	static JTextField  numOneTxt = new JTextField();
	static JTextField  numTwoTxt = new JTextField();
	static JLabel numOneLbl = new JLabel("First number");
	static JLabel numTwoLbl = new JLabel("Second number");
	static JButton submitBtn = new JButton("Calculate");



	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SixPointTwo frame = new SixPointTwo();
					frame.setVisible(true);
					submitBtn.addActionListener(new ActionListener(){

						public void actionPerformed(ActionEvent evt){
							int x = Integer.parseInt(numOneTxt.getText());
							int y = Integer.parseInt(numTwoTxt.getText());
							int sum = x + y;
							JOptionPane.showMessageDialog(null, "The sum is: " + sum);
						}
						});
					}catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}


			public SixPointTwo() {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 300);
				numOneLbl.setBounds(20, 20, 100, 20);
				numTwoLbl.setBounds(20, 70, 100, 20);
				numOneTxt.setBounds(120, 70, 100, 20);
				numTwoTxt.setBounds(120, 20, 100, 20);
				submitBtn.setBounds(150, 170, 100, 20);
				contentPane = new JPanel();
				contentPane.add(numOneLbl);
				contentPane.add(numTwoLbl);
				contentPane.add(numOneTxt);
				contentPane.add(numTwoTxt);
				contentPane.add(submitBtn);
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				contentPane.setLayout(new BorderLayout(0, 0));
				setContentPane(contentPane);





			}

		}
