import javax.swing.JFrame;

public class FinalQuiz{
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
        
    
        
      Quiz2 [] qObj = {
            new Quiz2("calculerSalaire(int) calculerSalaire(int, double)La m�thode calculerSalaire est :","aucun des choix ","surcharg�e","red�finie",".JAVA"),
            new Quiz2("Une classe qui contient au moins une m�thode abstraite doit �tre d�clar�e abstraite.","faux","vrai","","vrai"),
            new Quiz2("Est-ce qu�une classe peut impl�menter plusieurs interfaces ?","vrai","faux ","","faux "),
            new Quiz2("La d�claration d'une m�thode suivante : public void traitement() throws IOException pr�cise que la m�thode propage une exception contr�l�e","vrai","faux","",""),
            new Quiz2("class Test{\r\n"
            		+ "public static void main (String[] args) {\r\n"
            		+ "try {\r\n"
            		+ "int a =10;\r\n"
            		+ "System.out.println (\"a = \" + a );\r\n"
            		+ "int b = 0 / a;\r\n"
            		+ "System.out.println (\"b = \" + b);\r\n"
            		+ "}\r\n"
            		+ "catch(ArithmeticException e)\r\n"
            		+ "{System.out.println (\"diviser par 0!\"); }finally\r\n"
            		+ "{System.out.println (\"je suis � l�int�rieur de finally\");}}","aucun des choix","a=10 ; b=0 Je suis � l�int�rieur de finally","a=10 ;b=0 diviser par 0! je suis � l�int�rieur de finally","")
        };
        
        while (nbr != qObj.length && s<time ) {
            Questions quiz = new Questions(qObj[nbr], window);
            quiz.getAnswer(time); 
            m = quiz.getTime().M ;
            s = quiz.getTime().S ;
            score = quiz.getScore();
           if (nbr == qObj.length-1 || (s==time)) quiz.Reset();
            
            nbr++ ;
        }
        
        int nbrQ = qObj.length ;  
        ScorePanel ScorePanel = new ScorePanel (window,score,nbrQ) ;
        
        ScorePanel.choose();
     
     }   
    
      
    }    
}