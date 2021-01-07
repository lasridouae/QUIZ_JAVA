import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.* ;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

class scorePane extends JPanel {
    
    JButton exit ;
    
    JLabel scoreLabel ;
    
    static boolean again =false;
    
    scorePane (JFrame window , int score , int nbrQ) {
        
        setSize(window.getSize().width,window.getSize().height);
        setLayout(null);
        setBackground(Color.DARK_GRAY);
        window.setContentPane(this);
        
     
        scoreLabel = new JLabel ("You Got : "+score+"%");
        scoreLabel.setHorizontalAlignment(JLabel.CENTER);
        scoreLabel.setFont(new Font("Verdana", Font.BOLD, 40));
        scoreLabel.setForeground(Color.white);
        scoreLabel.setBorder(new LineBorder(Color.white, 2, true));
        scoreLabel.setBounds(200,100,400,100);
        add(scoreLabel);
        
        window.setVisible(true);
        
    }
    
    void choose () {
    	
    	new Niveau2();
  
       // exit.addActionListener((ActionEvent e) -> {
         //   System.exit(0);
               
       // });
        
    
    }
    
}