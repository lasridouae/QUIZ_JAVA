import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.SoftBevelBorder;

class Questions extends JPanel {
    
    JLabel Q ;
    
           JRadioButton option1 ,
            option2,
            option3 ;  
    
    String correct_answer;

    static boolean next = false ;
    static int score = 0 ;
    static int wrongs=0;
    
    static JLabel timer = new JLabel ("00 : 00 : 000") ;
    static counter count = new counter ();
    
    Questions (quiz2 obj , JFrame window) {        
      Q = new JLabel (obj.question);
      Q.setFont(new Font("Tahoma", Font.BOLD, 11));
      Q.setBackground(Color.PINK);
      option1 = new JRadioButton (obj.op1) ;
      option2 = new JRadioButton (obj.op2) ;
      option3 = new JRadioButton (obj.op3) ;
      correct_answer = obj.correct_answer ;
     

      JPanel pan = new JPanel () ;     
      pan.setLayout(null);
      pan.setBorder(BorderFactory.createLineBorder(Color.gray));
      pan.setBackground(Color.GRAY);
      window.setContentPane(pan);
      setLayout(null);
      setBackground(Color.PINK);
      setBounds(76,83,516,375);
      setBorder(BorderFactory.createLineBorder(Color.black));
      pan.add(this);
      
      add(Q); add(option1); add(option2); add(option3);
      
      Q.setBounds(43,11,400,50);
      Q.setHorizontalAlignment(JLabel.CENTER);
      option1.setBounds(23,92,200,40); option1.setBackground(new Color(255,255,255)) ; 
      option2.setBounds(23,183,200,40); option2.setBackground(new Color(255,255,255)) ;
      option3.setBounds(23,274,200,40);  option3.setBackground(new Color(255,255,255)) ;
      option1.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED)); 
      option2.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
      option3.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));

      
      timer.setBounds(124,11,300,50);
      timer.setFont(new Font("Verdana", Font.BOLD, 40));
      timer.setHorizontalAlignment(JLabel.CENTER);
      timer.setBorder(BorderFactory.createLineBorder(Color.white));
      timer.setForeground(Color.white);
      pan.add(timer);
      
      
      
      
            
      window.setVisible(true);              
    }
    
    void getAnswer (int time) throws InterruptedException {
    	
            option1.addActionListener((ActionEvent e) -> {
                if (option1.getText().equals(correct_answer)) {
                	score+=20 ;  
                	System.out.println("score"+score);
                }
                next = true ;
            });

            option2.addActionListener((ActionEvent e) -> {
                if (option2.getText().equals(correct_answer)) {
                	score +=20 ;  
                	System.out.println("score"+score);
                }
                next = true ;
            });

            option3.addActionListener((ActionEvent e) -> {
                if (option3.getText().equals(correct_answer)) {
                	score +=20 ; 
                	System.out.println("score"+score);
                }
                next = true ;
            });

          

        while (next == false ) {
        
            timer.setText(String.format("%02d", count.M)+" : "+String.format("%02d", count.S)+" : "+String.format("%03d", count.Ms)); 
               count.Ms++ ;
               Thread.sleep(1);
               if (count.Ms==999){
                   count.S++ ;
                   count.Ms=0 ;
               }
               if (count.S==59){
                   count.M++ ;
                   count.S=0;
               }
               
               if ((count.S + count.M*60) > time-3 ) {
                   
                   timer.setForeground(Color.red);
                   
                        if ((count.S + count.M*60)==time) { 
                            return ;
                        }
               }
        
        } 
        
        next = false ;
  
    }
    
    int getScore() {return score ;}
    
    counter getTime () {return count ;}
    
    void Reset () {
        
            count.M=0 ; 
            count.Ms=0 ; 
            count.S=0;
            score = 0 ;
    
    }
    
}