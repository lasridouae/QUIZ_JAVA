import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.* ;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

class scorePane extends JPanel {
    
    JButton //secLevel , 
    exit ;
    
    JLabel scoreLabel ;
    
    static boolean again =false;
    
    scorePane (JFrame window , int score , int nbrQ) {
        
        setSize(window.getSize().width,window.getSize().height);
        setLayout(null);
        setBackground(Color.DARK_GRAY);
        window.setContentPane(this);
        
      /*  secLevel = new JButton ("niveau 2");
        secLevel.setBackground(new Color(255,255,255)) ;
        secLevel.setBounds(300,250,200,50);
        add(secLevel);
        
        exit = new JButton ("Exit");
        exit.setBackground(new Color(255,255,255)) ;
        exit.setBounds(300,350,200,50);
        add(exit);
        */
        scoreLabel = new JLabel ("You Got : "+((score+nbrQ)/score*100)+"%");
        scoreLabel.setHorizontalAlignment(JLabel.CENTER);
        scoreLabel.setFont(new Font("Verdana", Font.BOLD, 40));
        scoreLabel.setForeground(Color.white);
        scoreLabel.setBorder(new LineBorder(Color.white, 2, true));
        scoreLabel.setBounds(200,100,400,100);
        add(scoreLabel);
        
        window.setVisible(true);
        
    }
    
    void choose () {
        
    	/*secLevel.addActionListener((ActionEvent e) -> {
            again= true ;
        });
        */
        exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
      /*  while (!again) {
            try {        
                Thread.sleep(0);
            } catch (InterruptedException ex) {}
        }
        
        again = false ;
        */
    }
    
}