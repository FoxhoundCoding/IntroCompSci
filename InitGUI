import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Window.Type;
import java.awt.SystemColor;
import java.awt.Panel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

/**
 * 
 * @author colin_000
 * INIT's first GUI
 * PROMPTs user to choose "Register or Login"
 * IF Login, calls Login() class
 * IF Register, calls RegisterGUI() class
 * EXISTs program
 * 
 */
public class InitGUI extends JFrame implements ActionListener
{

	public InitGUI()
	{
		super("Welcome to Evil Corp!");
		getContentPane().setBackground(SystemColor.menu);
		getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 11));
		getContentPane().setForeground(SystemColor.desktop);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\colin_000\\Downloads\\EvilCorpLogo.png"));

		setForeground(SystemColor.desktop);
		setFont(new Font("Times New Roman", Font.BOLD, 15));
		setBackground(SystemColor.desktop);
		getContentPane().setLayout(null);
		setBounds(100, 100, 450, 300);

		JButton btnRegister = new JButton("Register");
		btnRegister.setActionCommand("Reg");
		btnRegister.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnRegister.setForeground(SystemColor.desktop);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmdReg = e.getActionCommand();

				if(cmdReg.equals("Reg"))
				{
					RegisterGUI regGUI = new RegisterGUI();
					regGUI.setVisible(true);
					dispose();


				}
			}
		});
		btnRegister.setBounds(166, 71, 106, 55);
		getContentPane().add(btnRegister);



		JButton btnLogin = new JButton("Login");
		btnLogin.setActionCommand("Open");
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnLogin.setForeground(SystemColor.desktop);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmdLog = e.getActionCommand();

				if(cmdLog.equals("Open"))
				{
					LoginGUI loginGUI = new LoginGUI();
					loginGUI.setVisible(true);
					dispose();


				}
			}
		});
		btnLogin.setBounds(166, 149, 106, 55);
		getContentPane().add(btnLogin);

	}

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run()
			{
				new InitGUI().setVisible(true);
			}

		});

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
	
}
