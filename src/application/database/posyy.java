import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class ColorRec {
    int r,g,b;
    int b1,b2;
    int i,mR,mG;
    int r1,r2,g1,g2;
    
    JFrame jf = new JFrame("RGB color recommendation");
    
    JPanel jp_1 = new JPanel();
    
    JPanel jp_21 = new JPanel();
    JPanel jp_22 = new JPanel();
    JPanel jp_23 = new JPanel();
    JPanel jp_24 = new JPanel();
    JPanel jp_25 = new JPanel();
    JPanel jp_26 = new JPanel();
    JPanel jp_27 = new JPanel();
    JPanel jp_28 = new JPanel();
    JPanel jp_29 = new JPanel();
    
    JLabel jl_1 = new JLabel("R");
    JLabel jl_2 = new JLabel("G");
    JLabel jl_3 = new JLabel("B");
    JTextField jtf_1 = new JTextField();
    JTextField jtf_2 = new JTextField();
    JTextField jtf_3 = new JTextField();
    JButton jb = new JButton     ("show color");
    JButton jb_show = new JButton("color & RGB");
    public ColorRec(){
        button();
        
        jp_1.setLayout(null);
        jf.setLayout(null);
        
        jf.setBounds(200,200,800,600);
        jp_1.setBounds(0,0,200,600);
        
        jl_1.setBounds(50,30,50,30);
        jl_2.setBounds(50,160,50,30);
        jl_3.setBounds(50,290,50,30);
        
        jl_1.setFont(new Font("Arial",Font.BOLD,20));
        jl_2.setFont(new Font("Arial",Font.BOLD,20));
        jl_3.setFont(new Font("Arial",Font.BOLD,20));
        
        jtf_1.setBounds(50,70,50,50);
        jtf_2.setBounds(50,200,50,50);
        jtf_3.setBounds(50,330,50,50);
        
        jb.setBounds(40,440,100,40);
        jb_show.setBounds(40,500,100,40);
        
        jp_21.setBounds(320,120,120,120);
        jp_22.setBounds(440,120,120,120);
        jp_23.setBounds(560,120,120,120);
        
        jp_24.setBounds(320,240,120,120);
        jp_25.setBounds(440,240,120,120);
        jp_26.setBounds(560,240,120,120);
        
        jp_27.setBounds(320,360,120,120);
        jp_28.setBounds(440,360,120,120);
        jp_29.setBounds(560,360,120,120);
        
        jp_1.setBackground(new Color(150,150,150));
        jp_1.add(jl_1);
        jp_1.add(jl_2);
        jp_1.add(jl_3);
        jp_1.add(jtf_1);
        jp_1.add(jtf_2);
        jp_1.add(jtf_3);
        jp_1.add(jb);
        jp_1.add(jb_show);
        
        jf.add(jp_1);
        
        jf.add(jp_21);
        jf.add(jp_22);
        jf.add(jp_23);
        jf.add(jp_24);
        jf.add(jp_25);
        jf.add(jp_26);
        jf.add(jp_27);
        jf.add(jp_28);
        jf.add(jp_29);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    public void button(){
        jb.addActionListener( new ActionListener() {            
            public void actionPerformed(ActionEvent e){
                        mR=0;mG=0;
                        
                        jp_21.removeAll();
                        jp_22.removeAll();
                        jp_23.removeAll();
                        
                        r = Integer.parseInt(jtf_1.getText());
                        g = Integer.parseInt(jtf_2.getText());
                        b = Integer.parseInt(jtf_3.getText());
                        
                        r = r%256;
                        g = g%256;
                        b = b%256;
                    
                        jtf_1.setText("");
                        jtf_2.setText("");
                        jtf_3.setText("");
                        
                        if (b>=128){
                            b1=b-50;
                            b2=b-100;
                        }
                        else{
                            b1=b+50;
                            b2=b+100;
                        }
                        if (r>=40||g>=40){
                            if (r>=g){
                                mR=-20;
                            }
                            else{
                                mG=-20;
                            }
                        }
                        else{
                            if (r>=g){
                                mG=20;
                            }
                            else{
                                mR=20;
                            }
                        }
                        r1=r+mR;
                        r2=r+2*mR;
                        g1=g+mG;
                        g2=g+2*mG;
                        jp_21.setBackground(new Color(r,g,b));
                        jp_22.setBackground(new Color(r,g,b1));
                        jp_23.setBackground(new Color(r,g,b2));
                        jp_24.setBackground(new Color(r1,g1,b));
                        jp_25.setBackground(new Color(r1,g1,b1));
                        jp_26.setBackground(new Color(r1,g1,b2));
                        jp_27.setBackground(new Color(r2,g2,b));
                        jp_28.setBackground(new Color(r2,g2,b1));
                        jp_29.setBackground(new Color(r2,g2,b2));
                        
            }
        });
        jb_show.addActionListener( new ActionListener() {            
            public void actionPerformed(ActionEvent e){
                  mR=0;mG=0;
                  r = Integer.parseInt(jtf_1.getText());
                  g = Integer.parseInt(jtf_2.getText());
                  b = Integer.parseInt(jtf_3.getText());
                        
                  r = r%256;
                  g = g%256;
                  b = b%256;
                    
                  jtf_1.setText("");
                  jtf_2.setText("");
                  jtf_3.setText("");
                        
                  if (b>=128){
                            b1=b-50;
                            b2=b-100;
                        }
                        else{
                            b1=b+50;
                            b2=b+100;
                        }
                  if (r>=40||g>=40){
                       if (r>=g){
                           mR=-20;
                       }
                       else{
                           mG=-20;
                       }
                  }
                  else{
                       if (r>=g){
                           mG=20;
                       }
                       else{
                           mR=20;
                       }
                  }
                  r1=r+mR;r2=r+2*mR;
                  g1=g+mG;g2=g+2*mG;
                  
                  jp_21.setBackground(new Color(r,g,b));
                  jp_21.setBorder(new TitledBorder(new EtchedBorder(), " "+r+" "+g+" "+" "+b));
                  jp_22.setBackground(new Color(r,g,b1));
                  jp_22.setBorder(new TitledBorder(new EtchedBorder(), " "+r+" "+g+" "+" "+b1));
                  jp_23.setBackground(new Color(r,g,b2));
                  jp_23.setBorder(new TitledBorder(new EtchedBorder(), " "+r+" "+g+" "+" "+b2));
                  jp_24.setBackground(new Color(r1,g1,b));
                  jp_24.setBorder(new TitledBorder(new EtchedBorder(), " "+r1+" "+g1+" "+" "+b));
                  jp_25.setBackground(new Color(r1,g1,b1));
                  jp_25.setBorder(new TitledBorder(new EtchedBorder(), " "+r1+" "+g1+" "+" "+b1));
                  jp_26.setBackground(new Color(r1,g1,b2));
                  jp_26.setBorder(new TitledBorder(new EtchedBorder(), " "+r1+" "+g1+" "+" "+b2));
                  jp_27.setBackground(new Color(r2,g2,b));
                  jp_27.setBorder(new TitledBorder(new EtchedBorder(), " "+r2+" "+g2+" "+" "+b));
                  jp_28.setBackground(new Color(r2,g2,b1));
                  jp_28.setBorder(new TitledBorder(new EtchedBorder(), " "+r2+" "+g2+" "+" "+b1));
                  jp_29.setBackground(new Color(r2,g2,b2));
                  jp_29.setBorder(new TitledBorder(new EtchedBorder(), " "+r2+" "+g2+" "+" "+b2));
            }
        });
    }
    public static void main(String[] args) {
        new ColorRec();
    }
}
