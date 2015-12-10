import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;


import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import java.awt.Toolkit;
import java.awt.SystemColor;
/**
 * 
 * @author colin_000
 *PROMPTs user for registration info 
 *CHECKs to see if all fields are filled
 *CHECKs to see if Password and Confirm Password match 
 *Encrypts input, then XoRs it
 *Sends it to FinalProjectDatabase.txt
 *PROMPT user "Registration Success!"
 *EXITS program
 *
 */
public class RegisterGUI extends JFrame {

	public static final String DEFAULT_ENCODING="UTF-8"; 
	static BASE64Encoder enc=new BASE64Encoder();
	static BASE64Decoder dec=new BASE64Decoder();

	public static String base64encode(String text){
		try {
			String rez = enc.encode( text.getBytes( DEFAULT_ENCODING ) );
			return rez;         
		}
		catch ( UnsupportedEncodingException e ) {
			return null;
		}
	}//base64encode

	public static String base64decode(String text){

		try {
			return new String(dec.decodeBuffer( text ),DEFAULT_ENCODING);
		}
		catch ( IOException e ) {
			return null;
		}

	}//base64decode
	private JPanel contentPane;
	private JTextField passTxt;
	private JTextField userTxt;
	private JLabel passLbl;
	private JPasswordField confPassTxt = new JPasswordField();
	String userName;
	String password;
	String confPass; 
	String dataString; 
	int passLength;


	
	public RegisterGUI() {
		setForeground(SystemColor.desktop);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\colin_000\\Downloads\\EvilCorpLogo.png"));


		setTitle("Sign-up for Evil Corp.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		passTxt = new JPasswordField();
		passTxt.setBounds(235, 63, 131, 26);
		contentPane.add(passTxt);
		passTxt.setColumns(10);

		userTxt = new JTextField();
		userTxt.setBounds(235, 26, 131, 26);
		contentPane.add(userTxt);
		userTxt.setColumns(10);

		JLabel userLbl = new JLabel("Username");
		userLbl.setBounds(136, 29, 89, 20);
		contentPane.add(userLbl);

		passLbl = new JLabel("Password");
		passLbl.setBounds(136, 66, 89, 20);
		contentPane.add(passLbl);

		Button regBttn = new Button("Register");
		regBttn.setForeground(Color.BLUE);
		regBttn.setFont(new Font("Dialog", Font.BOLD, 15));
		regBttn.setBackground(new Color(192, 192, 192));
		regBttn.setBounds(235, 180, 131, 59);
		contentPane.add(regBttn);

		JLabel confPassLbl = new JLabel("Confirm Password");
		confPassLbl.setBounds(117, 103, 123, 20);
		contentPane.add(confPassLbl);
		confPassTxt.setBounds(235, 100, 131, 26);
		contentPane.add(confPassTxt);
		confPassTxt.setColumns(10);

		JLabel infoLbl = new JLabel("-Password must be 7 or more characters in length");
		infoLbl.setForeground(Color.BLUE);
		infoLbl.setBounds(97, 142, 298, 20);
		contentPane.add(infoLbl);


		regBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{

				password = passTxt.getText();
				confPass = confPassTxt.getText();
				userName = userTxt.getText();
				passLength = password.length();
				dataString = (userName + password);

				if((!password.matches("")) && (!confPass.matches("")) && (!userName.matches(""))){

					if((password.matches(confPass))){
						if(passLength >= 7){
							//Call encryption and XoR methods
							String infoTxt= dataString ;
							String key="key phrase used for XOR-ing";
							System.out.println(infoTxt+" XOR-ed to: "+(infoTxt=xorMessage( infoTxt, key )));
							String encoded=base64encode( infoTxt );       
							System.out.println( " is encoded to: "+encoded);			

							try {
								PrintWriter out = new PrintWriter("FinalProjectDatabase.txt");
								out.println(encoded);
								out.close();
							} catch (FileNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							JOptionPane.showMessageDialog(contentPane, "Registration Successful.", "Thank You!",
									JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
						}
						else{
							JOptionPane.showMessageDialog(contentPane, "Password must be 7 characters or more.", "Warning",
									JOptionPane.WARNING_MESSAGE);
						}
					}

					else{

						JOptionPane.showMessageDialog(contentPane, "Password and Confirm Password don't match.", "Invalid",
								JOptionPane.WARNING_MESSAGE);
					}
				}
				else{

					JOptionPane.showMessageDialog(contentPane, "All fields must be field out.", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}


			}

		});
	}






	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterGUI frame = new RegisterGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static String xorMessage(String message, String key){
		try {
			if (message==null || key==null ) return null;

			char[] keys=key.toCharArray();
			char[] mesg=message.toCharArray();

			int ml=mesg.length;
			int kl=keys.length;
			char[] newmsg=new char[ml];

			for (int i=0; i<ml; i++){
				newmsg[i]=(char)(mesg[i]^keys[i%kl]);
			}//for i
			mesg=null; keys=null;
			return new String(newmsg);
		}
		catch ( Exception e ) {
			return null;
		}  
	}//xorMessage
}
