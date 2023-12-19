
package electricity.billing.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;

public class Genertabill extends JFrame implements ActionListener{
    
    private javax.swing.JComboBox cmonth;
    String meter;
    JButton bill ;
    JTextArea area;
    
    Genertabill(String meter){
    
        
        this.meter= meter;
    setSize(500,800);
    setLocation(550,30);
    cmonth = new javax.swing.JComboBox();
    
    setLayout(new BorderLayout());
    
    Panel panel = new Panel();
    JLabel heading = new JLabel("Generate Bill");
     heading.setFont(new java.awt.Font("Times New Roman", 1, 16));
    JLabel meternumber = new JLabel();
   
    
    cmonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        cmonth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmonthActionPerformed(evt);
            }
        });
        cmonth.setFont(new java.awt.Font("Times New Roman", 1, 16));
     area = new JTextArea(50,15);
    area.setText("\n\n\t--------Click on the ---------\n\t Generate Bill Button to get\n\tthe bill of the Selected Month");
    area.setFont(new java.awt.Font("Times New Roman", 2, 20));
    JScrollPane pane = new JScrollPane(area);
    
    
    bill = new JButton("Generate Bill");
    bill.setFont(new java.awt.Font("Times New Roman", 1, 18));
    bill.addActionListener(this);
    panel.add(heading);
    panel.add(meternumber);
    panel.add(cmonth);
    add(panel,"North");
    add(pane,"Center");
    add(bill,"South");
    
    
    
    
    
    
    
     setVisible(true);
    }
    private void cmonthActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    } 
    
    public void actionPerformed(ActionEvent ae){
        try{
        Conn c = new Conn();
        String month = (String)cmonth.getSelectedItem();
        
        area.setText("\n\n\t        Maharshi Dutta Project\n                    ELECTRICITY BILL GENERATED\n                            FOR THE MONTH\n                            OF "+month+", 2022") ; 
           
        ResultSet rs = c.s.executeQuery("select * from customer where meter_no='"+meter+"'");
        
        while(rs.next()){
            area.setFont(new java.awt.Font("Times New Roman", 1, 20));
        area.append("\n\n\n\n     Customer Name:  "+ rs.getString("name"));
        area.append("\n     Meter Number  :  "+ rs.getString("meter_no"));
        area.append("\n     Address             :  "+ rs.getString("address"));
        area.append("\n     City                   :  "+ rs.getString("city"));
        area.append("\n     State                  :  "+ rs.getString("state"));
        area.append("\n     Email                 :  "+ rs.getString("email"));
        area.append("\n     Phone Number   :  "+ rs.getString("phone"));
        area.append("\n<--------------------####################--------------------------->");
        area.append("\n");
        
        }
        
         rs = c.s.executeQuery("select * from meter_info where meter_no='"+meter+"'");
        
        while(rs.next()){
            area.setFont(new java.awt.Font("Times New Roman", 1, 20));
        area.append("\n\n     Meter Location:  "+ rs.getString("meter_loc"));
        area.append("\n     Meter Number  :  "+ rs.getString("meter_no"));
        area.append("\n     Meter Type         :  "+ rs.getString("meter_type"));
        area.append("\n     Phase Type              :  "+ rs.getString("phase_type"));
        area.append("\n     Bill Type             s:  "+ rs.getString("bill_type"));
        area.append("\n     Days                 :  "+ rs.getString("days"));
         area.append("\n<--------------------####################--------------------------->");
        area.append("\n");
        }
        
        rs = c.s.executeQuery("select * from tax");
        
        while(rs.next()){
            area.setFont(new java.awt.Font("Times New Roman", 1, 20));
        area.append("\n\n     Cost Per Unit:  "+ rs.getString("cost_per_unit"));
        area.append("\n     Service Charge  :  "+ rs.getString("service_charge"));
        area.append("\n     Meter Rent         :  "+ rs.getString("meter_rent"));
        area.append("\n     Service Tax              :  "+ rs.getString("service_tax"));
        area.append("\n     Swacch Bharat Cess             s:  "+ rs.getString("swacch_bharat_cess"));
        area.append("\n     Fixed Tax                 :  "+ rs.getString("fixed_tax"));
         area.append("\n<--------------------####################--------------------------->");
        area.append("\n");
        }
        
        rs = c.s.executeQuery("select * from bill where meter_no = '"+meter+"' and month ='"+month+"'");
        
        while(rs.next()){
            area.setFont(new java.awt.Font("Times New Roman", 1, 20));
        area.append("\n\n     Current Month:  "+ rs.getString("month"));
        area.append("\n     Units Consumed  :  "+ rs.getString("units"));
        area.append("\n     Total Bill         :  "+ rs.getString("total_bill"));
        area.append("\n<--------------------####################--------------------------->");
        area.append("\n     Total Payable      :  "+ rs.getString("total_bill"));

         area.append("\n<--------------------####################--------------------------->");
        area.append("\n");
        }
        
        
        }catch(Exception e)
        {
        e.printStackTrace();
        }
        
        
        
        
    }
    
    
    public static void main(String args[])

{

new Genertabill("");
}

    
}

