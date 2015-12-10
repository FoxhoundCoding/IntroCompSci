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

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.awt.Canvas;
import java.awt.SystemColor;
import java.awt.Toolkit;
/**
 * 
 * @author colin_000
 * PROMPTs user for login info	
 * CHECKs if all fields have been filled 
 * PULLS string from FinalProjectDatabase.txt 
 * DECRYPTs string from FinalProjectDatabase
 * XORs the string
 * CHECKs if input info is equal to the encrypted string 
 * IF equal 
 * PROMPT user with JOP "Login Success!" 
 *
 */
public class LoginGUI extends JFrame {

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
	private JPasswordField passTxt;
	private JTextField userTxt;
	private JLabel passLbl;
	int tries = 0;
	int limit = 3;
	String userName;
	String passWord;
	String result;
	String dataString;
	String xor;
	
	public LoginGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\colin_000\\Downloads\\EvilCorpLogo.png"));
		setTitle("Login to Evil Corp.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		passTxt = new JPasswordField();
		passTxt.setBounds(235, 119, 131, 26);
		contentPane.add(passTxt);
		passTxt.setColumns(10);

		userTxt = new JTextField();
		userTxt.setBounds(235, 68, 131, 26);
		contentPane.add(userTxt);
		userTxt.setColumns(10);

		JLabel userLbl = new JLabel("Username");
		userLbl.setBounds(136, 71, 89, 20);
		contentPane.add(userLbl);

		passLbl = new JLabel("Password");
		passLbl.setBounds(136, 122, 89, 20);
		contentPane.add(passLbl);

		Button loginBtn = new Button("Login");
		loginBtn.setForeground(Color.BLUE);
		loginBtn.setFont(new Font("Dialog", Font.BOLD, 15));
		loginBtn.setBackground(new Color(192, 192, 192));
		loginBtn.setBounds(235, 169, 131, 59);
		contentPane.add(loginBtn);


		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				userName = userTxt.getText();
				passWord = passTxt.getText();
				dataString = userName + passWord;
				String originTxt;
				String key="key phrase used for XOR-ing";
				
				if( tries < 3){

					if((!userName.matches(""))||(!passWord.matches(""))){

						//Find txt file
						try {
							String result = Files.lines(Paths.get("FinalProjectDatabase.txt"))
									.parallel() // for parallel processing   
									.filter(line -> line.length() > 2) // to filter some lines by a predicate
									.map(String::trim) // to change line 
									.collect(Collectors.joining());
							//Decrypting information from .txt file
							System.out.println("From file: " + result);
							originTxt = base64decode( result ); //Decrypts String 
							System.out.println("Decoded text: " +originTxt);
							String xor = xorMessage( originTxt, key);//XoR's String with key
							System.out.println("post- XoR: " + xor);
							
							if(xor.equals(dataString)){
								JOptionPane.showMessageDialog(contentPane, "Login Successful.", "Thank You!",
										JOptionPane.INFORMATION_MESSAGE);
								System.exit(0);
							}
							
							else{
								JOptionPane.showMessageDialog(contentPane, "Username or Password is not found.", "Invalid",
										JOptionPane.WARNING_MESSAGE);
								tries++;
							}
							
							
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} // to join lines
						

					}
					else{
						JOptionPane.showMessageDialog(contentPane, "Username or Password field has not been filled out.", "Warning",
								JOptionPane.WARNING_MESSAGE);
					}
				}


				else{
					JOptionPane.showMessageDialog(contentPane, "User locked out, please confirm log in information.", "Locked Out",
							JOptionPane.WARNING_MESSAGE);
					System.exit(0);
				}

			}

		});
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//XoR method 
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
}//class




