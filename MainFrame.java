import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Book cathegory.
 * @author Gökberk Altıparmak
 * @version v1.0 24.04.2021
 */

public class MainFrame implements ActionListener
{
    // Properties
    private JFrame frame;
    private Container cp;
    private User user;
    private JPanel checkoutPanel;
    private JPanel userProfilePanel;
    private JPanel topPane;
    private JPanel centerPane;
    private JPanel booksPane;
    private JPanel booksName;
    private JPanel booksImage;
    private JPanel booksButton;
    private JPanel vehiclesPane;
    private JPanel vehiclesName;
    private JPanel vehiclesImage;
    private JPanel vehiclesButton;
    private JPanel devicesPane;
    private JPanel devicesName;
    private JPanel devicesImage;
    private JPanel devicesButton;
    private JPanel clothesPane;
    private JPanel clothesName;
    private JPanel clothesImage;
    private JPanel clothesButton;
    private JButton profileButton;
    private JButton checkoutButton;
    private JButton sellItemButton;
    private JButton book1;
    private JButton book2;
    private JButton book3;
    private JButton vehicle1;
    private JButton vehicle2;
    private JButton vehicle3;
    private JButton device1;
    private JButton device2;
    private JButton device3;
    private JButton clothe1;
    private JButton clothe2;
    private JButton clothe3;
    private JTextField searchField;
    private ImageIcon exampleImage;
    
    
    MainFrame( User user )
    {
        this.user = user;
        frame = new JFrame();
        frame.setTitle( "Main Page" );
        frame.setBounds( 500, 10, 1200, 1000 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setLayout( new BorderLayout() );
        frame.setResizable( false );
        
        checkoutPanel = new Checkout( user );
        userProfilePanel = new UserProfile( user );
    
        exampleImage = new ImageIcon( "download.png" );
        topPane = new JPanel();
        topPane.setLayout( new GridLayout( 1, 0 ) );
        topPane.setBorder( BorderFactory.createTitledBorder( "Menu" ) );
        
        profileButton = new JButton( "Profile" );
        profileButton.addActionListener( this );
        checkoutButton = new JButton( "Checkout" );
        checkoutButton.addActionListener( this );
        sellItemButton = new JButton( "Sell Item" );
        sellItemButton.addActionListener( this );
        searchField = new JTextField( 15 );
        
        topPane.add( new JLabel( user.getUser().getUserName() ) );
        topPane.add( profileButton );
        topPane.add( checkoutButton );
        topPane.add( sellItemButton );
        topPane.add( new JLabel( "Search: ", JLabel.RIGHT ) );
        topPane.add( searchField );
        
        booksName = new JPanel();
        booksName.setLayout( new GridLayout( 1, 0 ) );
        booksName.add( new JLabel( "item name here" ), SwingConstants.CENTER );
        booksName.add( new JLabel( "item name here" ), SwingConstants.CENTER );
        booksName.add( new JLabel( "item name here" ), SwingConstants.CENTER );
        
        booksImage = new JPanel();
        booksImage.setLayout( new GridLayout( 1, 0 ) );
        booksImage.add( new JLabel( exampleImage ) );
        booksImage.add( new JLabel( exampleImage ) );
        booksImage.add( new JLabel( exampleImage ) );
        
        book1 = new JButton( "add prize here" );
        book2 = new JButton( "add prize here" );
        book3 = new JButton( "add prize here" );
        
        book1.addActionListener( this );
        book2.addActionListener( this );
        book3.addActionListener( this );
        
        booksButton = new JPanel();
        booksButton.setLayout( new GridLayout( 1, 0 ) );
        booksButton.add( new JButton( "compare") );
        booksButton.add( book1 );
        booksButton.add( new JButton( "compare") );
        booksButton.add( book2 );
        booksButton.add( new JButton( "compare") );
        booksButton.add( book3 );
        
        booksPane = new JPanel();
        booksPane.setLayout( new BorderLayout() );
        booksPane.add( booksName, BorderLayout.NORTH );
        booksPane.add( booksImage, BorderLayout.CENTER );
        booksPane.add( booksButton, BorderLayout.SOUTH );
        
        vehiclesName = new JPanel();
        vehiclesName.setLayout( new GridLayout( 1, 0 ) );
        vehiclesName.add( new JLabel( "item name here" ), SwingConstants.CENTER );
        vehiclesName.add( new JLabel( "item name here" ), SwingConstants.CENTER );
        vehiclesName.add( new JLabel( "item name here" ), SwingConstants.CENTER );
        
        vehiclesImage = new JPanel();
        vehiclesImage.setLayout( new GridLayout( 1, 0 ) );
        vehiclesImage.add( new JLabel( exampleImage ) );
        vehiclesImage.add( new JLabel( exampleImage ) );
        vehiclesImage.add( new JLabel( exampleImage ) );
        
        vehicle1 = new JButton( "add prize here" );
        vehicle2 = new JButton( "add prize here" );
        vehicle3 = new JButton( "add prize here" );
        
        vehicle1.addActionListener( this );
        vehicle2.addActionListener( this );
        vehicle3.addActionListener( this );
        
        vehiclesButton = new JPanel();
        vehiclesButton.setLayout( new GridLayout( 1, 0 ) );
        vehiclesButton.add( vehicle1 );
        vehiclesButton.add( vehicle2 );
        vehiclesButton.add( vehicle3 );
        
        vehiclesPane = new JPanel();
        vehiclesPane.setLayout( new BorderLayout() );
        vehiclesPane.add( vehiclesName, BorderLayout.NORTH );
        vehiclesPane.add( vehiclesImage, BorderLayout.CENTER );
        vehiclesPane.add( vehiclesButton, BorderLayout.SOUTH );
        
        devicesName = new JPanel();
        devicesName.setLayout( new GridLayout( 1, 0 ) );
        devicesName.add( new JLabel( "item name here" ), SwingConstants.CENTER );
        devicesName.add( new JLabel( "item name here" ), SwingConstants.CENTER );
        devicesName.add( new JLabel( "item name here" ), SwingConstants.CENTER );
        
        devicesImage = new JPanel();
        devicesImage.setLayout( new GridLayout( 1, 0 ) );
        devicesImage.add( new JLabel( exampleImage ) );
        devicesImage.add( new JLabel( exampleImage ) );
        devicesImage.add( new JLabel( exampleImage ) );
        
        device1 = new JButton( "add prize here" );
        device2 = new JButton( "add prize here" );
        device3 = new JButton( "add prize here" );
        
        device1.addActionListener( this );
        device2.addActionListener( this );
        device3.addActionListener( this );
        
        devicesButton = new JPanel();
        devicesButton.setLayout( new GridLayout( 1, 0 ) );
        devicesButton.add( device1 );
        devicesButton.add( device2 );
        devicesButton.add( device3 );
        
        devicesPane = new JPanel();
        devicesPane.setLayout( new BorderLayout() );
        devicesPane.add( devicesName, BorderLayout.NORTH );
        devicesPane.add( devicesImage, BorderLayout.CENTER );
        devicesPane.add( devicesButton, BorderLayout.SOUTH );
        
        clothesName = new JPanel();
        clothesName.setLayout( new GridLayout( 1, 0 ) );
        clothesName.add( new JLabel( "item name here" ), SwingConstants.CENTER );
        clothesName.add( new JLabel( "item name here" ), SwingConstants.CENTER );
        clothesName.add( new JLabel( "item name here" ), SwingConstants.CENTER );
        
        clothesImage = new JPanel();
        clothesImage.setLayout( new GridLayout( 1, 0 ) );
        clothesImage.add( new JLabel( exampleImage ) );
        clothesImage.add( new JLabel( exampleImage ) );
        clothesImage.add( new JLabel( exampleImage ) );
        
        clothe1 = new JButton( "add prize here" );
        clothe2 = new JButton( "add prize here" );
        clothe3 = new JButton( "add prize " );
        
        clothe1.addActionListener( this );
        clothe2.addActionListener( this );
        clothe3.addActionListener( this );
        
        clothesButton = new JPanel();
        clothesButton.setLayout( new GridLayout( 1, 0 ) );
        clothesButton.add( clothe1 );
        clothesButton.add( clothe2 );
        clothesButton.add( clothe3 );
        
        clothesPane = new JPanel();
        clothesPane.setLayout( new BorderLayout() );
        clothesPane.add( clothesName, BorderLayout.NORTH );
        clothesPane.add( clothesImage, BorderLayout.CENTER );
        clothesPane.add( clothesButton, BorderLayout.SOUTH );
        
        centerPane = new JPanel();
        centerPane.setLayout( new GridLayout( 4, 1 ) );
        centerPane.add( booksPane );
        centerPane.add( vehiclesPane );
        centerPane.add( devicesPane );
        centerPane.add( clothesPane );
        
        cp = frame.getContentPane();
        
        cp.add( topPane, BorderLayout.NORTH );
        cp.add( centerPane, BorderLayout.CENTER );
        frame.setVisible( true );
    }

	@Override
    public void actionPerformed( ActionEvent e )
    {
        if ( e.getSource() == checkoutButton )
        {
            cp.remove( centerPane );
            cp.add( checkoutPanel, BorderLayout.CENTER );
            frame.repaint();
            frame.revalidate();
        }
        
        else if ( e.getSource() == profileButton )
        {
            cp.remove( centerPane );
            cp.add( userProfilePanel, BorderLayout.CENTER );
            frame.repaint();
            frame.revalidate();
        }
        else if ( e.getSource() == book1){
            Book booook1 = new Book(35,"New",5,"","1984","","","","George Orwell","YKY");
            frame.setVisible( false );
            new ProductPage(booook1, user);
        }
        else if ( e.getSource() == book2){
            Book booook1 = new Book(20,"Second Hand",1,"","Blindness","","","","Jose Saramago","Nadir Kitap");
            frame.setVisible( false );
            new ProductPage(booook1, user);

        }
        else if ( e.getSource() == book3){
            Book booook1 = new Book(40,"New",3,"","Lord Of The Flies","","","","William Golding","Penguin Books");
            frame.setVisible( false );
            new ProductPage(booook1, user);

        }
        else if ( e.getSource() == vehicle1){
            Vehicles vehiiicle1 = new Vehicles(1380000,"Second Hand",1,"black","Tesla Model X","Tesla","P90D",772);
            frame.setVisible( false );
            new ProductPage(vehiiicle1, user);

        }
        else if ( e.getSource() == vehicle2){
            Vehicles vehiiicle1 = new Vehicles(480000,"Second Hand",1,"red","Mini Cooper Electric","Mini","SE Signature",184);
            frame.setVisible( false );
            new ProductPage(vehiiicle1, user);
        }
        else if ( e.getSource() == vehicle3){
            Vehicles vehiiicle1 = new Vehicles(250000,"Second Hand",1,"blue","Golf","Volkswagen","1.6TDI BlueMotion Highline",115);
            frame.setVisible( false );
            new ProductPage(vehiiicle1, user);
        }
        else if ( e.getSource() == device1){
            TechnologicalDevices deviiiiiiiice1 = new TechnologicalDevices(3900,"Only used once",1,"Blue and red joy-cons","Nintendo Switch","Nintendo","console","6.2-inch, 720p LCD screen",1);
            frame.setVisible( false );
            new ProductPage(deviiiiiiiice1,user);

        }
        else if ( e.getSource() == device2){
            TechnologicalDevices deviiiiiiiice1 = new TechnologicalDevices(290,"Second Hand",1,"gray","Casio Watch","Casio","watch","33*82 mm",1);
            frame.setVisible( false );
            new ProductPage(deviiiiiiiice1,user);
        }
        else if ( e.getSource() == device3){
            TechnologicalDevices deviiiiiiiice1 = new TechnologicalDevices(130,"New",2,"white","AirPods","Apple","headphone","TWS, 5.0 Bluetooth",1);
            frame.setVisible( false );
            new ProductPage(deviiiiiiiice1,user);
        }
        else if ( e.getSource() == clothe1){
            Clothes cloothes1 = new Clothes(89,"Second Hand",1,"Blue","Dress","Bershka","Coton",1);
            frame.setVisible( false );
            new ProductPage(cloothes1, user);
        }
        else if ( e.getSource() == clothe2){
            Clothes cloothes1 = new Clothes(110,"New",2,"Black","Dress","Under Armour","Coton",2);
            frame.setVisible( false );
            new ProductPage(cloothes1, user);

        }
        else if ( e.getSource() == clothe3){
            Clothes cloothes1 = new Clothes(230,"Second Hand",1,"Red","Dress","Converse","Fabric",8);
            frame.setVisible( false );
            new ProductPage(cloothes1, user);
        }
          
    }
    class Checkout extends JPanel
    {
        private JButton buyButton;
        private int total;
        
        Checkout( User user )
        {
            this.setLayout( new GridLayout( 0, 2 ) );
            for ( int i = 0; i < user.getItemList().size(); i++ )
            {
                this.add( new JLabel( user.getItemList().get(i).getName() ) );
                this.add( new JLabel( String.valueOf( user.getItemList().get(i).getPrize() ) ) );
            }
            
            total = user.calculateTotal();
            this.add( new JLabel( "Total: " + total  ) );
            
            buyButton = new JButton( "Buy Items" );
            this.add( buyButton );
            buyButton.addActionListener( new ActionListener()
            {
               @Override
               public void actionPerformed( ActionEvent e )
               {
                   user.clearList();
                   checkoutPanel.repaint();
                   checkoutPanel.revalidate();
                   cp.remove( checkoutPanel );
                   cp.add( centerPane, BorderLayout.CENTER );
                   frame.repaint();
                   frame.revalidate();
               } 
            });
        }
    }
    
    class UserProfile extends JPanel
    {
        private JButton button;
        
        UserProfile( User user )
        {
            this.setLayout( new GridLayout( 0 ,1 ) );
            this.add( new JLabel( "UserID: " + user.getUser().getUserID() ) );
            this.add( new JLabel( "Username: " + user.getUser().getUserName() ) );
            this.add( new JLabel( "Email: " + user.getUser().getEmail() ) );
            this.add( new JLabel( "Name: " + user.getUser().getName() ) );
            this.add( new JLabel( "Age: " + String.valueOf( user.getUser().getAge() ) ) );
            button = new JButton( "Main Page" );
            this.add( button );
            button.addActionListener( new ActionListener()
            {
               @Override
               public void actionPerformed( ActionEvent e )
               {
                   cp.remove( userProfilePanel );
                   cp.add( centerPane, BorderLayout.CENTER );
                   frame.repaint();
                   frame.revalidate();
               } 
            });
        }
    }
}
