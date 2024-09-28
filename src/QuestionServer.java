import java.util.Scanner;

public class QuestionServer {
    Question[] quest = new Question[2];
    String Select[] = new String[2];

    public QuestionServer(){
        quest[0]= new Question(1, "Qual ano que o Java surgiu?", "1995",
        "2000", "2005", "1993", "1995");
        
        quest[1]= new Question(2, "Qual a espresa que foi responsavel por cria o Java?", "Apple",
         "Microsoft", "linux", "sun microsystems", "Sun Microsystems");

    }

    public void quiz(){
        int i =0;
        for(Question q : quest){
            System.out.println("Question Numero : "+ q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpcion1());
            System.out.println(q.getOpcion2());
            System.out.println(q.getOpcion3());
            System.out.println(q.getOpcion4());
            
            Scanner respost= new Scanner(System.in);
            Select[i++] = respost.nextLine();
        }
    }
    public void printScore(){
        int Score = 0;
        for (int i = 0; i < quest.length; i++) {

            Question que = quest[i];

            String answer = que.getAwnser();

            String userAnswe = Select[i];

            if(answer.equalsIgnoreCase(userAnswe))
            {
                Score++;
            }  
        }
            System.out.println("seu Score é de : " + Score);
            
    }   
        
    
}
