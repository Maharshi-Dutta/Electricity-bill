
package electricity.billing.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;



public class Viewinfo extends JFrame implements ActionListener {
    JButton  cancel;
    public Viewinfo(String meter){
    
    setBounds(350,150,850,650);
    getContentPane().setBackground(Color.WHITE);
   
    setLayout(null);
    
    
    
    
    JLabel heading =new JLabel("Customer Information");
    heading.setBounds(250,0,500,40);
    heading.setFont(new Font("Times New Roman",Font.PLAIN,20));
    add(heading);
    
    JLabel lblname =new JLabel("Name");
    lblname.setBounds(70,80,100,20);
    lblname.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(lblname);
    
    JLabel name =new JLabel("");
    name.setBounds(250,80,150,20);
    name.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(name);
    
     JLabel lblmeternum =new JLabel("Meter Number");
    lblmeternum.setBounds(70,140,115,20);
    lblmeternum.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(lblmeternum);
    
    JLabel meternum =new JLabel("");
    meternum.setBounds(250,140,100,20);
    meternum.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(meternum);
    
    
     JLabel lbladdress =new JLabel("Address");
    lbladdress.setBounds(70,200,100,20);
    lbladdress.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(lbladdress);
    
    JLabel address =new JLabel("");
    address.setBounds(250,200,150,20);
    address.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(address);
    
    
      JLabel lblcity =new JLabel("City");
    lblcity.setBounds(70,260,100,20);
    lblcity.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(lblcity);
    
    JLabel city =new JLabel("");
    city.setBounds(250,260,100,20);
    city.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(city);
    
    
      JLabel lblstate =new JLabel("State");
    lblstate.setBounds(500,80,100,20);
    lblstate.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(lblstate);
    
    JLabel state =new JLabel("");
    state.setBounds(650,80,100,20);
    state.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(state);
    
    JLabel lblemail =new JLabel("Email");
    lblemail.setBounds(500,140,100,20);
    lblemail.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(lblemail);
    
    JLabel email =new JLabel("");
    email.setBounds(650,140,180,20);
    email.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(email);
    
    
     JLabel lblphone =new JLabel("Phone");
    lblphone.setBounds(500,200,100,20);
    lblphone.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(lblphone);
    
    JLabel phone =new JLabel("");
    phone.setBounds(650,200,100,20);
    phone.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(phone);
    
     JLabel lblspin =new JLabel("Security Pin");
    lblspin.setBounds(500,260,100,20);
    lblspin.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(lblspin);
    
    JLabel spin =new JLabel("");
    spin.setBounds(650,260,100,20);
    spin.setFont(new Font("Times New Roman",Font.PLAIN,18));
    add(spin);
  
    try{
    Conn c = new Conn();
    ResultSet rs = c.s.executeQuery("select * from customer where meter_no = '"+meter+"'");
       while(rs.next()){
            name.setText(rs.getString("name"));
            address.setText(rs.getString("address"));
            city.setText(rs.getString("city"));
            state.setText(rs.getString("state"));
            email.setText(rs.getString("email"));
            phone.setText(rs.getString("phone"));
            meternum.setText(rs.getString("meter_no"));
            spin.setText(rs.getString("Securitypin"));
    } 
    }catch(Exception e)
    {
    e.printStackTrace();
    }
    
    
    
    cancel = new JButton("Cancel");
    cancel.setBackground(Color.black);
    cancel.setForeground(Color.white);
    cancel.setFont(new Font("Times New Roman",Font.PLAIN,18));
    cancel.setBounds(350,340,100,25);
    cancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cancel.setBorderPainted(true);
    add(cancel);
    cancel.addActionListener(this);
    
    
    ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/viewcustomer.jpg"));
    Image i2= i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(20, 350, 600, 300);
    add(image);
    
    
    setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
    
        setVisible(false);
    }
    
    public static void main(String args[])
    {
    new Viewinfo("");
    
    }
}
