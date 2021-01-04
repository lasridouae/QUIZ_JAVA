import javax.swing.JFrame;

public class Quiz3 {
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
        
      quiz2[] qObj1 = {
            new quiz2("Après la compilation, un programme écrit en JAVA, il se transforme en programme en bytecode Quelle est l’extension du programme en bytecode ?","aucun des choix ",".JAVA ",".Class",".JAVA"),
            new quiz2("Class Test{ Public Test () { System.out.println(”Bonjour”);} public Test (int i) {this();"
            		+ "System.out.println(”Nous sommes en ”+i+ ” !”);}; qu’affichera l’instruction suivante? Test t1=new Test (2018); ","aucun des choix","Bonjour Nous sommes en 2018 !","Nous sommes en 2018 !","Nous sommes en 2018 !"),
            new quiz2("Voici un constructeur de la classe Employee, y-at'il un problème ? Public void Employe(String n){ Nom=n;","vrai","faux ","","commence par une majuscule "),
            new quiz2("Pour spécifier que la variable ne pourra plus être modifiée et doit être initialisée dès sa déclaration,on la déclare comme une constante avec le mot réservé","aucun des choix","final","const","const"),
            new quiz2("Dans une classe, on accède à ses variables grâce au mot clé","aucun des choix","this","super","this")
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