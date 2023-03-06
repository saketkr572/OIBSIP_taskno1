//CREATION OF LOGIN PAGE

package online.reservation.system;
import javax.swing.*;//javax bcz we want to import an extended class of Swing
import java.awt.*; //to get Image class
import java.awt.event.*;//to use action listener interfcae in the program
import java.sql.*;//to use result set class // value returned after executing query is in the form of result set . so we pass it in result set object
public class Login extends JFrame implements ActionListener 
{
    JButton login, signup, clear;//defining buttons globally so that it can be accessed from Action performed function
    JTextField uidtextfield;//defining textfields globally outside the login constructor so that it can be accessed
    JPasswordField passtextfield;
    Login()
    {
        setTitle("RAILWAY RESERVATION SYSTEM");
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/icon.png")); //to navigate the image
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100); //positions the icon at the top left corner taking 4 args
        add(label);
        JLabel text=new JLabel("Welcome to Online Reservation System");//to give message in the window just before the icon
        text.setFont(new Font("Osward",Font.BOLD,28)); // to format the message
        text.setBounds(200,40,600,40);//to position the message
        getContentPane().setBackground(Color.WHITE);
        setSize(800,480); //defines dimension for your frame
        add(text);
        
        JLabel uid=new JLabel("User-Id:");//to give message in the window for cardno
        uid.setFont(new Font("Raleway",Font.BOLD,28)); // to format the message
        uid.setBounds(120,150,150,30);//to position the message
        add(uid);
        
        uidtextfield=new JTextField();//to create a text field to enter the card no
        uidtextfield.setBounds(300,150,230,30);
        uidtextfield.setFont(new Font("Arial",Font.BOLD,14));//to format the text in textfields
        add(uidtextfield);
        
        JLabel pass=new JLabel("Password:");//to give message in the window for PIN
        pass.setFont(new Font("Raleway",Font.BOLD,28)); // to format the message
        pass.setBounds(120,220,250,30);//to position the message
        add(pass);
        
        passtextfield=new JPasswordField();// to create a textfield for entering the pin
        passtextfield.setBounds(300,220,230,30);
        passtextfield.setFont(new Font("Arial",Font.BOLD,14));
        add(passtextfield);
        
        login=new JButton("SIGN IN");//to create a button for signing in
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);//to set the background color of button
        login.setForeground(Color.WHITE);//to set the foreground color of Button
        login.addActionListener(this);//calling function for adding action listener 
        add(login);
       
        clear=new JButton("CLEAR");//to create a button for clearing
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);//to set the background color of button
        clear.setForeground(Color.WHITE);//to set the foreground color of Button
        clear.addActionListener(this);//calling function for adding action listener 
        add(clear);
        
        signup=new JButton("SIGN UP");//to create a button for clearing
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);//to set the background color of button
        signup.setForeground(Color.WHITE);//to set the foreground color of Button
        signup.addActionListener(this);//calling function for adding action listener 
        add(signup);
       
        setVisible(true);//to show the frame to user after executing the code
        setLocation(350,200); //to show the frame from a centre location otherwise by default it opens from top left corner
        
    }
    

    public void actionPerformed(ActionEvent ae)//overriding actionlistener to listen the mouse click on buttons
    {
    if(ae.getSource()==clear)
    {
        uidtextfield.setText("");//to set text in the field after button is clicked.intentionally kept blank so that it is blank when clear is clicked
        passtextfield.setText("");//to set text in the field after button is clicked.intentionally kept blank so that it is blank when clear is clicked
    } else if (ae.getSource()==login)
    {
        Conn conn=new Conn();
        String uidnumber=uidtextfield.getText();//to get cardnumber
        String pinnumber=passtextfield.getText();//to get pin //cut specifies we cant use getText with password field. This is now obselete.
        String query="select * from login1 where username='"+uidnumber+"' and pass = '"+pinnumber+"'";//concatenating cardnumber and pin that has been generated//selecting queries with such property
        try{
            ResultSet rs=conn.s.executeQuery(query);//DDL command so we use executeQuery function .DDL is used to get data from data base
            if(rs.next())
            {
                setVisible(false);//close the login frame
                new Reservation().setVisible(true);//calling transaction cons and setting its visibility here true
            }else
            {
                JOptionPane.showMessageDialog(null,"Incorrect Card Number and PIN");
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }else if (ae.getSource()==signup)
    {
        setVisible(false);//if signup is clicked Visibility of the login page has to be turned off so that signup page can be opened
        new Signup().setVisible(true);//calling signup constructor to ope signup page and setting its visbility to true
    }
    
    }
    public static void main(String args[])
    {
        new Login();
    }
}
    

