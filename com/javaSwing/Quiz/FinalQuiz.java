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
        
      welcomePage welcome = new welcomePage (window);
      welcome.choose(time);
        
      quiz2 [] qObj1 = {
            new quiz2("calculerSalaire(int) calculerSalaire(int, double)La m�thode calculerSalaire est :","aucun des choix ","surcharg�e","red�finie",".JAVA"),
            new quiz2("Une classe qui contient au moins une m�thode abstraite doit �tre d�clar�e abstraite.","faux","vrai","","vrai"),
            new quiz2("Est-ce qu�une classe peut impl�menter plusieurs interfaces ?","vrai","faux ","","faux "),
            new quiz2("La d�claration d'une m�thode suivante : public void traitement() throws IOException pr�cise que la m�thode propage une exception contr�l�e","vrai","faux","",""),
            new quiz2("class Test{\r\n"
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
        
        while (nbr != qObj1.length && s<time ) {
            questions N2 = new questions(qObj1[nbr], window);
            N2.getAnswer(time); 
            m = N2.getTime().M ;
            s = N2.getTime().S ;
            score = N2.getScore();
            if (nbr == qObj1.length-1 || (s==time)) N2.Reset();
            nbr++ ;
        }
        
        int nbrQ = qObj1.length ;  
        scorePane scorePane = new scorePane (window,score,nbrQ) ;
        scorePane.choose();
     
     }   
    
      
    }    
}