//SignUp Form 1

package online.reservation.system;
import java.awt.*;
import javax.swing.*; //contains JFrame class
import java.util.*;//to use random package
import com.toedter.calendar.JDateChooser; //to use calendar for Date of Birth
import java.awt.event.*;//to implement actionlistener interface 
public class Signup extends JFrame implements ActionListener //to use size location and visibility methods
{
    long random;
    JTextField usernamefield,fullnamefield,emailtextfield,citytextfield,statetextfield,pincodetextfield;
    JButton submit;
    JComboBox occupation;
    JRadioButton male,female,others;
    JDateChooser datechooser;
    JPasswordField passwordfield;
   
    Signup()
   {
       
       setLayout(null);//by default the setBounds is centred Layout . We need to null it
       setTitle("CREATE ACCOUNT");
       Random ran=new Random();//to generate random form nos .
       random=Math.abs((ran.nextLong()%9000L)+1000L);//Since at first form nos were random alphanumeric keys , we will apply method .nextLong which will give val in Long. Long vals are giving very long values to cut short them we will mod it with 9000L and then add 1000L into it . Stil it is giving a negative val so we wll use math.abs which will give absolute val terminating the negative character from the No generated 
       JLabel formno=new JLabel("Application Form No. "+random);//creating a label for Applc No and passing the value of random into it
       formno.setFont(new Font("Raleway",Font.BOLD,28));//formatting the formno
       formno.setBounds(245,40,600,40);//postining of formno
       add(formno);
              
       JLabel createusername=new JLabel("Create Username: ");//creating a label for name 
       createusername.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       createusername.setBounds(100,140,200,30);//postining of label
       add(createusername);
       
       usernamefield=new JTextField(); //Creating object for adding textfield to the label
       usernamefield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       usernamefield.setBounds(300,140,450,30);
       add(usernamefield);
       
       JLabel createpass=new JLabel("Create Password: ");//creating a label for name 
       createpass.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       createpass.setBounds(100,190,200,30);//postining of label
       add(createpass);
       
       passwordfield=new JPasswordField(); //Creating object for adding textfield to the label
       passwordfield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       passwordfield.setBounds(300,190,450,30);
       add(passwordfield);
       
       JLabel fullname=new JLabel("Enter Full Name: ");//creating a label for name 
       fullname.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       fullname.setBounds(100,240,200,30);//postining of label
       add(fullname);
       
       fullnamefield=new JTextField(); //Creating object for adding textfield to the label
       fullnamefield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       fullnamefield.setBounds(300,240,450,30);
       add(fullnamefield);
       
       JLabel emailid=new JLabel("Enter Email Id: ");//creating a label for name 
       emailid.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       emailid.setBounds(100,290,150,30);//postining of label
       add(emailid);
       
       emailtextfield=new JTextField(); //Creating object for adding textfield to the label
       emailtextfield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       emailtextfield.setBounds(300,290,450,30);
       add(emailtextfield);
       
       JLabel dob=new JLabel("Date of Birth:");//creating a label for DOB
       dob.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       dob.setBounds(100,340,200,30);//postining of label
       add(dob);
       
       datechooser=new JDateChooser();//object creation for date chooser
       datechooser.setBounds(300,340,400,30);//Formatting datechooser
       add(datechooser);
       
       JLabel occ=new JLabel("Occupation:");//creating a label for Marital Status
       occ.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       occ.setBounds(100,390,200,30);//postining of label
       add(occ);
       
       String occupationvals[]={"Government","Public","Private","Professional","Self Employed","Student","Others"};
       occupation=new JComboBox(occupationvals);
       occupation.setBounds(300,390,400,30);
       occupation.setBackground(Color.WHITE);
       add(occupation);
       
       JLabel gender=new JLabel("Gender:");//creating a label for Gender
       gender.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       gender.setBounds(100,440,200,30);//postining of label
       add(gender);
       
       male=new JRadioButton("Male");//to set Value for RadioButton
       male.setBounds(300,440,120,30);//positioning the Radio Button
       male.setBackground(Color.WHITE);
       add(male);
       
       female=new JRadioButton("Female");//to set Value for RadioButton
       female.setBounds(450,440,120,30);//positioning the Radio Button
       female.setBackground(Color.WHITE);
       add(female);
       
      
       
       others=new JRadioButton("Others");//to set Value for RadioButton
       others.setBounds(600,440,120,30);//positioning the Radio Button
       others.setBackground(Color.WHITE);
       add(others);
       
       ButtonGroup gendergroup=new ButtonGroup(); //to group radio buttons to avoid redundancy while selecting an option
       gendergroup.add(male);
       gendergroup.add(female);
       gendergroup.add(others);
             
       
       JLabel city=new JLabel("City:");//creating a label for City
       city.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       city.setBounds(100,490,200,30);//postining of label
       add(city);
       
       citytextfield=new JTextField(); //Creating object for adding textfield to the label
       citytextfield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       citytextfield.setBounds(300,490,450,30);
       add(citytextfield);
       
       JLabel state=new JLabel("State:");//creating a label for State
       state.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       state.setBounds(100,540,200,30);//postining of label
       add(state);
       
       statetextfield=new JTextField(); //Creating object for adding textfield to the label
       statetextfield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       statetextfield.setBounds(300,540,450,30);
       add(statetextfield);
       
       JLabel pincode=new JLabel("Pin Code:");//creating a label for Pin code
       pincode.setFont(new Font("Raleway",Font.BOLD,20));//formatting the Label
       pincode.setBounds(100,590,200,30);//postining of label
       add(pincode);
       
       pincodetextfield=new JTextField(); //Creating object for adding textfield to the label
       pincodetextfield.setFont(new Font("Raleway",Font.BOLD,14));//formatting the text to be enterd in the textfield
       pincodetextfield.setBounds(300,590,450,30);
       add(pincodetextfield);
       
       submit=new JButton("Submit");// Creating a Button to submit the details and move to next page
       submit.setBackground(Color.BLACK);//setting bg color of button
       submit.setForeground(Color.WHITE);//setting fg color of button
       submit.setFont(new Font("Raleway",Font.BOLD,14));//formatting the button
       submit.setBounds(620, 660,120,30);//positioning the button
       submit.addActionListener(this);//to get action on clicking next button
       add(submit);
       
       getContentPane().setBackground(Color.WHITE);//getcontentPane gives the whole pane and allows modification in the whole frame using various other methods
       setSize(850,800); //setting size for the frame of signup page
       setLocation(350,10);//to set the location of SignupOne
       setVisible(true);//visibility is false bydefault . we need to make it true
   }
    public void actionPerformed(ActionEvent ae)//overriding method so that event can be liststened by Actionlistener and action can be performed
    {
        if(ae.getSource()==submit)
        {
        String formno=""+random; //since formno is a long val we add "" and concat it to convert it into string
        String uname=usernamefield.getText();//to get the values out of the username
        String pfield=passwordfield.getText();//to get the values out of password field
        String emailid=emailtextfield.getText();
        String funame=fullnamefield.getText();//to get the values out of the nametextfield
        String cityname=citytextfield.getText();
        String statename=statetextfield.getText();
        String pincode=pincodetextfield.getText();
        String dob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
        String occup=(String)occupation.getSelectedItem();
        String gender=null;
        if(male.isSelected())
        {
            gender="Male";
        }   else if(female.isSelected())
                {
                    gender="Female";
        }
        else if(others.isSelected())
        {
            gender="Others";
        }
        
        
        try
        {
           if(uname.equals(""))
           {
               JOptionPane.showMessageDialog(null,"User Name is Required"); //popup message incase textfield is empty
               
           }
           else if(pfield.equals(""))
           {
               JOptionPane.showMessageDialog(null,"Password is Required"); //popup message incase textfield is empty
           }
           else if(emailid.equals(""))
                   {
                       JOptionPane.showMessageDialog(null,"Email is Required"); //popup message incase textfield is empty
                   }
           else if(funame.equals(""))
           {
               JOptionPane.showMessageDialog(null,"Name is Required"); //popup message incase textfield is empty
           }
           else if(cityname.equals(""))
           {
              JOptionPane.showMessageDialog(null,"City Name is Required"); //popup message incase textfield is empty 
           }
           else if(statename.equals(""))
           {
              JOptionPane.showMessageDialog(null,"State Name is Required"); //popup message incase textfield is empty  
           }
           else if(pincode.equals(""))
           {
                JOptionPane.showMessageDialog(null,"Pin Code is Required"); //popup message incase textfield is empty  
           }
           else{
               Conn conn= new Conn();
               
               String query= " insert into signup values('"+formno+"','"+uname+"','"+pfield+"','"+occup+"','"+emailid+"','"+funame+"','"+dob+"','"+gender+"','"+cityname+"','"+statename+"','"+pincode+"')";
               String query1=" insert into login1 values('"+formno+"','"+uname+"','"+pfield+"')";
               conn.s.executeUpdate(query);//DML command to pass rhee query so that it can be executed this way queries will run in mysqlS
               conn.s.executeUpdate(query1);
               setVisible(false);//closes 
               new Reservation().setVisible(true);
           }
        
        }
        catch(Exception e)
        {
          System.out.println(e);
        }
        
        }}
public static void main(String args[])
{
new Signup();
}
}

