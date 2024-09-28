public class App {
    public static void main(String[] args) throws Exception {
        QuestionServer question= new QuestionServer();

        question.quiz();
        question.printScore();
    }
}
