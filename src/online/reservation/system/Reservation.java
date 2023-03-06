package online.reservation.system;

import javax.swing.*;//javax bcz we want to import an extended class of Swing
import java.awt.*; //to get Image class
import java.awt.event.*;//to use action listener interfcae in the program
import java.sql.Date;
import com.toedter.calendar.JDateChooser; //to use calendar for Date of Birth



public class Reservation extends JFrame implements ActionListener
{
    String formno;
    JButton submit;
    JComboBox combobox,combobox2,typeselect,typeselect2;
    String selecteditem,selecteditem2,selecteditem3,selecteditem4;
    Date selectedDate;
    Reservation()
    {
        //this.formno=formno;
        setTitle("RAILWAY RESERVATION SYSTEM");
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/railway.png")); //to navigate the image
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100); //positions the icon at the top left corner taking 4 args
        add(label);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icon/azadi.jpg")); //to navigate the image
        Image i5=i4.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel label1=new JLabel(i6);
        label1.setBounds(325,10,120,120); //positions the icon at the top left corner taking 4 args
        add(label1);
        
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("icon/g20.png")); //to navigate the image
        Image i8=i7.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel label2=new JLabel(i9);
        label2.setBounds(590,10,120,120); //positions the icon at the top left corner taking 4 args
        add(label2);
        
        JLabel from=new JLabel("From:");//to give message in the window for cardno
        from.setFont(new Font("Raleway",Font.BOLD,28)); // to format the message
        from.setBounds(100,120,150,30);//to position the message
        add(from);
        
       String[][] stations = {
        {"AGC", "AGRA CANTT"},
        {"AF", "AGRA FORT"},
        {"AH", "AUNRIHAR JN"},
        {"ALJN", "ALIGARH JN"},
        {"ALD", "ALLAHABAD JN"},
        {"ALY", "ALLAHABAD CITY"},
        {"UMB", "AMBALA CANTT"},
        {"ASN", "ASANSOL JN"},
        {"AWB", "AURANGABAD"},
        {"BPL", "BHOPAL JN"},
        {"BSB", "VARANASI JN"},
        {"BCT", "MUMBAI CENTRAL"},
        {"BRC", "VADODARA JN"},
        {"BZA", "VIJAYAWADA JN"},
        {"CDG", "CHANDIGARH"},
        {"CSTM", "MUMBAI CST"},
        {"DADN", "DADAR (WEST)"},
        {"DHN", "DHANBAD JN"},
        {"DLI", "DELHI"},
        {"DDU", "PT. DEEN DAYAL UPADHYAYA JN"},
        {"GKP", "GORAKHPUR JN"},
        {"HWH", "HOWRAH JN"},
        {"HYB", "HYDERABAD DECAN"},
        {"JAT", "JAMMU TAWI"},
        {"JP", "JAIPUR"},
        {"JHS", "JHANSI JN"},
        {"KGP", "KHARAGPUR JN"},
        {"KYN", "KALYAN JN"},
        {"LKO", "LUCKNOW NR"},
        {"MAS", "CHENNAI CENTRAL"},
        {"MTJ", "MATHURA JN"},
        {"NDLS", "NEW DELHI"},
        {"NGP", "NAGPUR"},
        {"NZM", "H NIZAMUDDIN"},
        {"PNBE", "PATNA JN"},
        {"PUNE", "PUNE JN"},
        {"RBL", "RAE BARELI JN"},
        {"RNC", "RANCHI"},
        {"SBC", "BANGALORE CITY JN"},
        {"SC", "SECUNDERABAD JN"},
        {"SRE", "SAHARANPUR"},
        {"TATA", "TATANAGAR JN"},
        {"TVC", "TRIVANDRUM CENTRAL"},
        {"VSKP", "VISAKHAPATNAM"}};
       String[] stationNames = new String[stations.length];
for (int i = 0; i < stations.length; i++) {
    stationNames[i] = stations[i][1]; // Or use stations[i][0] for station codes
}




       combobox = new JComboBox<>(stationNames);
       combobox.setBounds(200,120,400,30);
       combobox.setBackground(Color.WHITE);
       add(combobox);
       
        JLabel tostation=new JLabel("To:");//to give message in the window for cardno
        tostation.setFont(new Font("Raleway",Font.BOLD,28)); // to format the message
        tostation.setBounds(100,170,150,30);//to position the message
        add(tostation);
        
        String[][] tostations = {
        {"AGC", "AGRA CANTT"},
        {"AF", "AGRA FORT"},
        {"AH", "AUNRIHAR JN"},
        {"ALJN", "ALIGARH JN"},
        {"ALD", "ALLAHABAD JN"},
        {"ALY", "ALLAHABAD CITY"},
        {"UMB", "AMBALA CANTT"},
        {"ASN", "ASANSOL JN"},
        {"AWB", "AURANGABAD"},
        {"BPL", "BHOPAL JN"},
        {"BSB", "VARANASI JN"},
        {"BCT", "MUMBAI CENTRAL"},
        {"BRC", "VADODARA JN"},
        {"BZA", "VIJAYAWADA JN"},
        {"CDG", "CHANDIGARH"},
        {"CSTM", "MUMBAI CST"},
        {"DADN", "DADAR (WEST)"},
        {"DHN", "DHANBAD JN"},
        {"DLI", "DELHI"},
        {"DDU", "PT. DEEN DAYAL UPADHYAYA JN"},
        {"GKP", "GORAKHPUR JN"},
        {"HWH", "HOWRAH JN"},
        {"HYB", "HYDERABAD DECAN"},
        {"JAT", "JAMMU TAWI"},
        {"JP", "JAIPUR"},
        {"JHS", "JHANSI JN"},
        {"KGP", "KHARAGPUR JN"},
        {"KYN", "KALYAN JN"},
        {"LKO", "LUCKNOW NR"},
        {"MAS", "CHENNAI CENTRAL"},
        {"MTJ", "MATHURA JN"},
        {"NDLS", "NEW DELHI"},
        {"NGP", "NAGPUR"},
        {"NZM", "H NIZAMUDDIN"},
        {"PNBE", "PATNA JN"},
        {"PUNE", "PUNE JN"},
        {"RBL", "RAE BARELI JN"},
        {"RNC", "RANCHI"},
        {"SBC", "BANGALORE CITY JN"},
        {"SC", "SECUNDERABAD JN"},
        {"SRE", "SAHARANPUR"},
        {"TATA", "TATANAGAR JN"},
        {"TVC", "TRIVANDRUM CENTRAL"},
        {"VSKP", "VISAKHAPATNAM"}};
        String[] stationNames2 = new String[tostations.length];
for (int i = 0; i < tostations.length; i++) {
    stationNames2[i] = tostations[i][1]; // Or use stations[i][0] for station codes
}

       combobox2 = new JComboBox<>(stationNames2);
       selecteditem2=(String)combobox2.getSelectedItem();
       combobox2.setBounds(200,170,400,30);
       combobox2.setBackground(Color.WHITE);
       add(combobox2);
       
       JLabel dot=new JLabel("Date of Travel:");//creating a label for DOB
       dot.setFont(new Font("Raleway",Font.BOLD,28));//formatting the Label
       dot.setBounds(100,210,200,30);//postining of label
       add(dot);
       
       JDateChooser datechooser1=new JDateChooser();
       selectedDate = (Date) datechooser1.getDate();//object creation for date chooser
       datechooser1.setBounds(300,210,285,30);//Formatting datechooser
       add(datechooser1);
      
       
       String type[]={"GENERAL","LADIES","LOWER BIRTH/SR. CITIZEN","PERSON WITH DISABILITY","TATKAL","PREMIUM TATKAL"};
       typeselect=new JComboBox(type);
       selecteditem3=(String)typeselect.getSelectedItem();
         
       typeselect.setBounds(100,250,400,30);
       typeselect.setBackground(Color.WHITE);
       add(typeselect);
       
       String classtype[]={"All Classes","Anubhuti Class(EA)","AC First Class(1A)","Vistadome AC(EV)","Executive Chair Car(EC)","AC 2 Tier(2A)","First Class(FC)","AC 3 Tier(3A)","AC 3 Economy(3E)","Vistadome Chair Car(VC)","AC Chair Car(CC)","Sleeper(SL)","Vistadome Non AC(VS)","Second Sitting(2S)"};
       typeselect2=new JComboBox(classtype);
       selecteditem4=(String)typeselect2.getSelectedItem();

       typeselect2.setBounds(100,290,400,30);
       typeselect2.setBackground(Color.WHITE);
       add(typeselect2);
       
       submit=new JButton("Submit");// Creating a Button to submit the details and move to next page
       submit.setBackground(Color.BLACK);//setting bg color of button
       submit.setForeground(Color.WHITE);//setting fg color of button
       submit.setFont(new Font("Raleway",Font.BOLD,14));//formatting the button
       submit.setBounds(620, 400,120,30);//positioning the button
       submit.addActionListener(this);//to get action on clicking next button
       add(submit);
       
        
        //getContentPane().setBackground(Color.WHITE);
        //setSize(1000,1000); //defines dimension for your frame
        
       
        getContentPane().setBackground(Color.WHITE);
        setSize(850,500); //defines dimension for your frame
        //add(text);
        
        setVisible(true);//to show the frame to user after executing the code
        setLocation(350,200); //to show the frame from a centre location otherwise by default it opens from top left corner
        
    }
    
     public void actionPerformed(ActionEvent ae)
     {
         if(ae.getSource()==submit)
         {
             /*String select1=""+selecteditem;
             String select2=""+selecteditem2;
             String select3=""+selecteditem3;
             String select4=""+selecteditem4;
             String select5=""+selectedDate;*/
             try
             {
               Conn conn=new Conn();
               String query1="insert into booking values('"+formno+"','"+selecteditem+"','"+selecteditem2+"','"+selectedDate+"','"+selecteditem3+"','"+selecteditem4+"')";
               conn.s.executeUpdate(query1);
                                  JOptionPane.showMessageDialog(null,"Ticket Booked Successfully");
                                  setVisible(false);
                   //new ticket(formno).setVisible(true);

             }catch(Exception e)
             {
                 System.out.println(e);
             }
         }
     }
       
    public static void main(String args[])
    {
        new Reservation();
    }
}