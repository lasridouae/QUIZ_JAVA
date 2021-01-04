import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.* ;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

public class Quiz {
    public static void main(String[] args) throws InterruptedException {
        
      JFrame window = new JFrame ("Quiz Game") ;  
      window.setSize(800,600);
      window.setLocationRelativeTo(null);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setResizable(false);

    while (true) {  
      
      int nbr =0 , score=0 , m=0 , s=0 ;
      int time = 300;
     //sec  
        
      welcomePage welcome = new welcomePage (window);
      welcome.choose(time);
        
        quiz2 [] qObj = {
            new quiz2("JAVA est un langage","Compilé ","Interprété","Compilé et interpreté","Compilé et interpreté"),
            new quiz2("Toutes les classes héritent de la classe ","Main ","object","AWT","AWT"),
            new quiz2("Par convention une classe  ","est en minuscule","commence par une majuscule ","est en majuscules","commence par une majuscule "),
            new quiz2("Est-ce que on peut avoir plusieurs constructeurs pour la même classe ","oui","non","","oui"),
            new quiz2("Dans la ligne public class A implements B, B est :","Interface","Classe parent","Package","Interfacce")
        };
        
        while (nbr != qObj.length && s<time ) {
            questions quiz = new questions(qObj[nbr], window);
            quiz.getAnswer(time); 
            m = quiz.getTime().M ;
            s = quiz.getTime().S ;
            score = quiz.getScore();
            if (nbr == qObj.length-1 || (s==time)) quiz.Reset();
            nbr++ ;
        }
        
        int nbrQ = qObj.length ;  
        scorePane scorePane = new scorePane (window,score,nbrQ) ;
        scorePane.choose();
     
     }   
    
      
    }    
}