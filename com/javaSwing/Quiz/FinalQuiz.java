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
            new Quiz2("calculerSalaire(int) calculerSalaire(int, double)La méthode calculerSalaire est :","aucun des choix ","surchargée","redéfinie",".JAVA"),
            new Quiz2("Une classe qui contient au moins une méthode abstraite doit être déclarée abstraite.","faux","vrai","","vrai"),
            new Quiz2("Est-ce qu’une classe peut implémenter plusieurs interfaces ?","vrai","faux ","","faux "),
            new Quiz2("La déclaration d'une méthode suivante : public void traitement() throws IOException précise que la méthode propage une exception contrôlée","vrai","faux","",""),
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
            		+ "{System.out.println (\"je suis à l’intérieur de finally\");}}","aucun des choix","a=10 ; b=0 Je suis à l’intérieur de finally","a=10 ;b=0 diviser par 0! je suis à l’intérieur de finally","")
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