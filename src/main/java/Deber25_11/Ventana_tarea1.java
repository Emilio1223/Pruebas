/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber25_11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author emili
 */
public class Ventana_tarea1 extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
   

    public Ventana_tarea1(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 200);
        this.setLocation(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarJTextFields();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
        
    }

    public void iniciarPanels() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.lightGray);
        this.jPanelList.get(1).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(2).setBackground(Color.lightGray);
        this.jPanelList.get(3).setBackground(Color.lightGray);
        this.jPanelList.get(4).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(5).setBackground(Color.lightGray);
        this.jPanelList.get(6).setBackground(Color.lightGray);

        this.jPanelList.get(0).setLayout(new GridLayout(3,1));
        this.jPanelList.get(1).setLayout(new BorderLayout());
        this.jPanelList.get(2).setLayout(new GridLayout(1,3));
        this.jPanelList.get(6).setLayout(new GridLayout(1,1));
        
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        
        
        this.jPanelList.get(2).add(this.jPanelList.get(3));
        this.jPanelList.get(2).add(this.jPanelList.get(4));
        this.jPanelList.get(2).add(this.jPanelList.get(5));
        
        
    }
    
    public void iniciarJTextFields(){
        this.jLabelList = new ArrayList<>();
        
        this.jLabelList.add(new JLabel("Button 1"));
        this.jLabelList.add(new JLabel("Button 3"));
        this.jLabelList.add(new JLabel("2"));
        this.jLabelList.add(new JLabel("Button 5"));
        this.jLabelList.add(new JLabel("Long-named Button 4"));
        
        this.jPanelList.get(1).add(this.jLabelList.get(0),BorderLayout.CENTER);
        this.jPanelList.get(3).add(this.jLabelList.get(1),BorderLayout.CENTER);
        this.jPanelList.get(4).add(this.jLabelList.get(2),BorderLayout.CENTER);
        this.jPanelList.get(5).add(this.jLabelList.get(3),BorderLayout.CENTER);
        this.jPanelList.get(6).add(this.jLabelList.get(4),BorderLayout.CENTER);
        
        
        
    }
}   
    