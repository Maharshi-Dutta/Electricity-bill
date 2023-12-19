
package electricity.billing.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Project extends JFrame implements ActionListener {
    
    String atype , meter,name;
    Project(String atype,String meter,String name)
    { 
        super("DashBoard");
        this.atype = atype;
        this.meter = meter;
        this.name = name;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/background.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 990,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        setVisible(true);
        
        //Menubar Created --->
        JMenuBar mb = new JMenuBar();
        mb.setBackground(new Color (222,222,222));
        mb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setJMenuBar(mb);
        
        //1st Menu --->>
        JMenu master = new JMenu("Master");
        master.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        master.setFont(new Font("",Font.BOLD,18));
        master.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        
        //master item 1 --->
        
        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer .setFont(new Font("Times New Roman",Font.BOLD,18));
        newcustomer.setBackground(Color.white);
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(image1));
        newcustomer.addActionListener(this);
//        newcustomer.setMnemonic('N');
//        newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        master.add(newcustomer);

// Item 2 --->
        JMenuItem customerdetails = new JMenuItem("Customer Details");
        customerdetails .setFont(new Font("Times New Roman",Font.BOLD,18));
        customerdetails.setBackground(Color.white);
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon2.jpg"));
        Image image2 = icon2.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(image2)); 
        customerdetails.addActionListener(this);
//        customerdetails.setMnemonic('M');
//        customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
master.add(customerdetails);

//Item 3 --->
        JMenuItem depositdetails = new JMenuItem("Deposit Details");
        depositdetails .setFont(new Font("Times New Roman",Font.BOLD,18));
        depositdetails.setBackground(Color.white);
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
        Image image3 = icon3.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
        depositdetails.setIcon(new ImageIcon(image3));  
        depositdetails.addActionListener(this);
//        depositdetails.setMnemonic('D');
//        depositdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
            master.add(depositdetails);
            
//Item 4 --->
        JMenuItem calculatebill = new JMenuItem("Calculate Bill");
        calculatebill .setFont(new Font("Times New Roman",Font.BOLD,18));
        calculatebill.setBackground(Color.white);
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image4 = icon4.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(image4));  
        calculatebill.addActionListener(this);
//        calculatebill.setMnemonic('S');
//        calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
            master.add(calculatebill);
            
      
//Menu 2 --->
        JMenu info = new JMenu("Information");
        info.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
       
        info.setFont(new Font("",Font.BOLD,18));
        

// 1st Item --->
JMenuItem updateinfo = new JMenuItem("Update Info");
        updateinfo .setFont(new Font("Times New Roman",Font.BOLD,18));
        updateinfo.setBackground(Color.white);
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
        Image image5 = icon5.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
        updateinfo.setIcon(new ImageIcon(image5));  
        updateinfo.addActionListener(this);
//        updateinfo.setMnemonic('U');
//        updateinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,ActionEvent.CTRL_MASK));
            info.add(updateinfo);
            
//2nd Item --->
JMenuItem viewinfo = new JMenuItem("View Info");
        viewinfo.setFont(new Font("Times New Roman",Font.BOLD,18));
        viewinfo.setBackground(Color.white);
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image6 = icon6.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
        viewinfo.setIcon(new ImageIcon(image6));  
        viewinfo.addActionListener(this);
//        viewinfo.setMnemonic('V');
//        viewinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
            info.add(viewinfo);

            
            
//3rd Menu --->
 JMenu user = new JMenu("User");
        user.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        
        user.setFont(new Font("",Font.BOLD,18));

//1st Item --->
JMenuItem paybill = new JMenuItem("Pay Bill");
        paybill.setFont(new Font("Times New Roman",Font.BOLD,18));
        paybill.setBackground(Color.white);
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
        Image image7 = icon7.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(image7));
        paybill.addActionListener(this);
//        paybill.setMnemonic('P');
//        paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
            user.add(paybill);
            
            
//2nd Item --->
JMenuItem billdetails = new JMenuItem("Bill Details");
        billdetails.setFont(new Font("Times New Roman",Font.BOLD,18));
        billdetails.setBackground(Color.white);
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("icon/icon8.png"));
        Image image8 = icon8.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(image8));
        billdetails.addActionListener(this);
//        billdetails.setMnemonic('B');
//        billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
            user.add(billdetails);
        
//4th Menu --->
 JMenu report = new JMenu("Report");
        report.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        
        report.setFont(new Font("",Font.BOLD,18));

//1st Item --->
JMenuItem genratebill = new JMenuItem("Generate Bill");
        genratebill.setFont(new Font("Times New Roman",Font.BOLD,18));
        genratebill.setBackground(Color.white);
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
        Image image9 = icon9.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
       genratebill.setIcon(new ImageIcon(image9)); 
       genratebill.addActionListener(this);
//       genratebill.setMnemonic('G');
//        genratebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
            report.add(genratebill);
            
            
               //5th Menu --->
 JMenu utility = new JMenu("Utility");
        utility.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        
        utility.setFont(new Font("",Font.BOLD,18));

//1st Item --->
JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setFont(new Font("Times New Roman",Font.BOLD,18));
        notepad.setBackground(Color.white);
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("icon/icon10.png"));
        Image image10 = icon10.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
      notepad.setIcon(new ImageIcon(image10));
      notepad.addActionListener(this);
//       notepad.setMnemonic('W');
//        notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
            utility.add(notepad);
            

//2st Item --->
JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setFont(new Font("Times New Roman",Font.BOLD,18));
        calculator.setBackground(Color.white);
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
        Image image11 = icon11.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(image11));  
        calculator.addActionListener(this);
//       notepad.setMnemonic('');
//        notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
            utility.add(calculator);
        
            
//6th Menu --->
 JMenu exit = new JMenu("Exit");
       exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        
        exit.setFont(new Font("",Font.BOLD,18));

//1st Item --->
JMenuItem mexit = new JMenuItem("Log Out");
        mexit.setFont(new Font("Times New Roman",Font.BOLD,18));
        mexit.setBackground(Color.white);
        ImageIcon icon12 = new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image image12 = icon12.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
      mexit.setIcon(new ImageIcon(image12));
      mexit.addActionListener(this);
//       mexit.setMnemonic('W');
//        mexit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
            exit.add(mexit);
        if(atype.equals("Admin"))
        {
        mb.add(master);
        mb.add(utility);
        mb.add(exit);
        }else{
        mb.add(info);
             mb.add(user);
             mb.add(report);
             mb.add(utility);
             mb.add(exit);
        }
            
            
             
           
             
        setLayout(new FlowLayout());
        
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        
        if(msg.equals("New Customer"))
        {
            new Newcustomer();
        }
        else if(msg.equals("Customer Details")){
            new Customerdetails();
        }
        else if(msg.equals("Deposit Details")){
            new Depositdetails();
        }
        else if(msg.equals("Calculate Bill")){
                    new Calculatebill();
        }else if(msg.equals("Log Out")){
                    new Login();
                    setVisible(false);
        }else if(msg.equals("View Info")){
                    new Viewinfo(meter);
                    
        }
        else if(msg.equals("Update Info")){
                    new Update(meter,name);
                    
        }
        else if(msg.equals("Bill Details")){
                    new Billdetails(meter);
                    
        }
        else if(msg.equals("Notepad")){
                    try{
                        Runtime.getRuntime().exec("notepad.exe");
                        
                    }catch(Exception e)
                    {
                    e.printStackTrace();
                    }
                    
        }
        else if(msg.equals("Calculator")){
                     try{
                        Runtime.getRuntime().exec("calc.exe");
                        
                    }catch(Exception e)
                    {
                    e.printStackTrace();
                    }
                    
        }
        else if(msg.equals("Pay Bill")){
                    new Paybill(meter,name);
                    
        }
        else if(msg.equals("Generate Bill")){
                    new Genertabill(meter);
                    
        }
        
    }
    
    
    
    
    public static void main(String args[])
    {
        new Project("","","");
    }
}
