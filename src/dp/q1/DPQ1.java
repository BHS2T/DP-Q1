/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.q1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Tsiyon
 */
public class DPQ1 implements ActionListener {
    
    private static final List<Swimmer> swimmerList = SwimmerViewSorted.swimmerList;
    private JFrame jFrame;
    private JLabel executiveLbl;
    private JTable table;
    private JScrollPane jScrollPane;
    private JButton sortBtn,backBtn;
    Object[][] swimmerData;
    public DPQ1(){
        
  
    }
    public  void Display(){
        int i =0,j=0;
        
        SwimmerViewSorted svs = new SwimmerViewSorted();
        svs.returnNotSorted();
        System.out.println("Swimmer size  "+swimmerList.size());
        for (i = 0; i < swimmerList.size(); i++) {
            swimmerData[i][j] = swimmerList.get(i).name;
            swimmerData[i][j+1] = swimmerList.get(i).age;

        }
        jFrame = new JFrame();
        String[] columns = new String[]{"Products", "Quantity Shipped"};

        jFrame.setTitle("Executive View");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.pack();

        //Label
        executiveLbl = new JLabel();
        executiveLbl.setText("Executive View");
        executiveLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        executiveLbl.setBounds(130, 2, 300, 40);
        jFrame.add(executiveLbl);

        //Table
        table = new JTable(swimmerData, columns);
        table.setFont(new java.awt.Font("Tahoma", 0, 18));

        jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(50, 50, 350, 230);
        jFrame.add(jScrollPane);

        //Sort Button
        sortBtn = new JButton("Sort");
        sortBtn.setBounds(270, 300, 70, 40);
        jFrame.add(sortBtn);
        
        backBtn = new JButton("Back");
        backBtn.setBounds(0, 0, 70, 40);
        jFrame.add(backBtn);

        jFrame.setLayout(null);
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);
        sortBtn.addActionListener(this);
        backBtn.addActionListener(this);
    
    }
    public static void main(String[] args){
        DPQ1 dp = new DPQ1();
        dp.Display();
        SwimmerViewSorted svs = new SwimmerViewSorted();
        svs.sortSwimmerData("time");
        System.out.println(swimmerList.get(0).age);
        System.out.println(swimmerList.get(1).age);
        System.out.println(swimmerList.get(2).age);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
