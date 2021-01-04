import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.* ;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

class welcomePage extends JPanel {
    
    JButton play;
    
    static boolean go  = false ;
    
    welcomePage(JFrame window) {
        
    	window.setSize(680,520);
        setLayout(null);
        setBackground(new Color(192, 192, 192));
        window.setContentPane(this);
        
        play = new JButton ("Start");
        play.setBackground(Color.WHITE) ;
        play.setBounds(214,218,200,50);
        add(play);
        
        JLabel lblNewLabel = new JLabel("Welcom to java Quiz");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setBounds(212, 73, 301, 64);
        add(lblNewLabel);
        
        
        window.setVisible(true);
        
    }
    
    void choose (int time) {
        
        play.addActionListener((ActionEvent e) -> {
            go = true ;
            setVisible(false);
        });
        
     
        
        while (!go) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {}
        }
        
        go = false ;
    
    }
}