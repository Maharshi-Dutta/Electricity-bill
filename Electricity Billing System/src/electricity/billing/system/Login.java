
package electricity.billing.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener {
 JButton login,cancel,signup,forgetpass;
        Choice Logginin;
        JTextField username;
        JPasswordField password;
    Login(){
        super ("Login Page");
        getContentPane().setBackground(new Color(115,223,211));
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(300, 20,100, 20);
        add(lblusername);
        
        username = new JTextField();
        username.setBounds(400, 20, 150, 20);
        
        add(username);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(300, 60,100, 20);
        add(lblpassword);
        
        password = new JPasswordField();
        password.setBounds(400, 60, 150, 20);
        
        add(password);
        
        JLabel Loggininas = new JLabel("Login in as");
        Loggininas.setBounds(300, 100,100, 20);
        add(Loggininas);
        
        Logginin =new Choice();
        Logginin.add("Admin");
        Logginin.add("Customer");
        Logginin.setBounds(400, 100, 150, 20);
        add(Logginin);
        
        login =new JButton("Login");
        login.setBounds(330,160,100,20);
        login.addActionListener(this);
        add(login);
        
        cancel =new JButton("Cancel");
        cancel.setBounds(450,160,100,20);
        cancel.addActionListener(this);
        add(cancel);
        
        JLabel sign =new JLabel("If you donot have a account");
        sign.setBounds(307,230,200,20);
        add(sign);
                
                
                
        signup =new JButton("Sign up");
        signup.setBackground(new Color(115,223,211));
        signup.setForeground(new Color(90,101,255));
        signup.setBorder(new EmptyBorder(5,5,5,5));
        signup.setBounds(460,230,80,20);
        signup.addActionListener(this);
        add(signup);
        
        forgetpass =new JButton("Forget Password");
        forgetpass.setBackground(new Color(115,223,211));
        forgetpass.setForeground(new Color(90,101,255));
        forgetpass.setBorder(new EmptyBorder(5,5,5,5));
        forgetpass.setBounds(460,200,110,20);
        forgetpass.addActionListener(this);
        add(forgetpass);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg")) ;
        Image i8 = i7.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
        ImageIcon i9 =new ImageIcon(i8);
        JLabel image =new JLabel(i9);
        image.setBounds(0,0,250,262);
        add(image);
        
        
        
        setSize(640,300);
        setLocation(500,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == login)
        {
        String susername = username.getText();
        String spassword = password.getText();
        String suser = Logginin.getSelectedItem();
        
        try{
        Conn c = new Conn();
        String query = "select * from login where username ='"+susername+"'and password ='"+spassword+"'and user ='"+suser+"'";
        ResultSet re = c.s.executeQuery(query);
        
        if(re.next()){
            String meter = re.getString("meter_no");
            String name = re.getString("name");
            setVisible(false);
            new Project(suser,meter,name);
        }
        else{
        JOptionPane.showMessageDialog(null, "Ivalid Login");
        username.setText("");
        password.setText("");
        }
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        
        }
        else if(ae.getSource() == cancel)
        {
            setVisible(false);
        }
        else if(ae.getSource() == signup)
        {
            setVisible(false);
             new Signup();
        }
        else if(ae.getSource() == forgetpass)
        {
            
            if(Logginin.getSelectedItem().equals("Admin")){
            new ChangePasswordadmin();
            
            }
            else{
            new ChangePassword();
            
            }
            setVisible(false);     
        }
        
        
    }
    
    public static void main(String args[])
    {
    new Login();
    }
    
}
