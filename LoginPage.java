import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * Book cathegory.
 * @author Gökberk Altıparmak
 * @version v1.0 24.04.2021
 */

public class LoginPage implements ActionListener
{
    private JFrame frame;
    private JPanel panel;
    private JLabel login;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JLabel label;
    private JLabel label2;
    private JTextField userText;
    private JButton registerButton;
    private JPasswordField passwordText;
    private JButton loginButton;
    private Font newFont;
    private Font loginFont;
    private Font textFont;
    
    public LoginPage()
    {
        panel = new JPanel();
        frame = new JFrame();
        
        //frame.setSize( 800, 800 );
        frame.setBounds( 300, 90, 900, 600 );
        frame.setResizable( false );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        panel.setLayout( null );
        
        newFont = new Font("Serif", Font.PLAIN, 24);
        loginFont = new Font( "Serif", Font.BOLD, 40 );
        textFont = new Font ( "Arial", Font.PLAIN, 15 );
        
        login = new JLabel( "Login Page" );
        login.setFont( loginFont );
        login.setBounds( 400, 10, 300, 100 );
        
        userLabel = new JLabel( "Username " );
        userLabel.setFont( newFont );
        userLabel.setBounds( 250, 100, 200, 100 );
        
        userText = new JTextField( 20 );
        userText.setBounds( 370, 130, 200, 40 );
        userText.setFont( textFont );
        userText.setBackground( Color.WHITE );
        
        passwordLabel = new JLabel( "Password " );
        passwordLabel.setFont( newFont );
        passwordLabel.setBounds( 250, 170, 200, 100 );
        
        passwordText = new JPasswordField( 20 );
        passwordText.setBounds( 370, 200, 200, 40 );
        passwordText.setFont( textFont );
        passwordText.setBackground( Color.WHITE );
        
        loginButton = new JButton( "Login" );
        loginButton.setBounds( 430, 270, 100, 25 );
        loginButton.addActionListener( this );
        
        registerButton = new JButton( "Register" );
        registerButton.setBounds( 430, 400, 100, 25 );
        registerButton.addActionListener( this );
        
        label = new JLabel( "Don't have account yet?" );
        label.setFont( newFont );
        label.setBounds( 350, 330, 300, 50 );
        
        label2 = new JLabel( "Register to open it =>" );
        label2.setBounds( 300, 386, 170, 50 );
        
        panel.add( userText );
        panel.add( login );
        panel.add( userLabel );
        panel.add( passwordLabel );
        panel.add( passwordText );
        panel.add( loginButton );
        panel.add( registerButton );
        panel.add( label );
        panel.add( label2 );
        
        frame.add( panel );
        frame.setVisible( true );
    }
    
    @Override
    public void actionPerformed( ActionEvent e )
    {
        if ( e.getSource() == loginButton )
        {
            new BankRegisterPage();
            frame.setVisible( false );
        }
        else 
        {
            new UserRegisterPage();
            frame.setVisible( false );
        }
	}
    
    public static boolean hasUpperCase( String password )
    {
        for ( int i = 0; i < password.length(); i++ )
        {
            if ( Character.isUpperCase( password.charAt( i ) ) )
            {
                return true;
            }
        }
        return false;
    }
    
    public static boolean hasDigit( String password )
    {
        for ( int i = 0; i < password.length(); i++ )
        {
            if ( Character.isDigit( password.charAt( i ) ) )
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main( String[] args )
    {
        new LoginPage();
    }
}



