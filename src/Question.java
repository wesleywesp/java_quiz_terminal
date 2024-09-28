public class Question {
   private int id;
   private String Question;
   private String opcion1;
   private String opcion2;
   private String opcion3;
   private String opcion4;
   private String awnser;
   

    public Question(int id, String question, String opcion1, String opcion2, String opcion3, String opcion4,
        String awnser) {
    this.id = id;
    Question = question;
    this.opcion1 = opcion1;
    this.opcion2 = opcion2;
    this.opcion3 = opcion3;
    this.opcion4 = opcion4;
    this.awnser = awnser;
        }
    @Override
    public String toString() {
        return "Question [id=" + id + ", Question=" + Question + ", opcion1=" + opcion1 + ", opcion2=" + opcion2
                + ", opcion3=" + opcion3 + ", opcion4=" + opcion4 + ", awnser=" + awnser + "]";
    }
    public String getAwnser() {
        return awnser;
    }
    public int getId() {
        return id;
    }
    public String getOpcion1() {
        return opcion1;
    }
    public String getOpcion2() {
        return opcion2;
    }
    public String getOpcion3() {
        return opcion3;
    }
    public String getOpcion4() {
        return opcion4;
    }
    public String getQuestion() {
        return Question;
    }
    public void setQuestion(String question) {
        Question = question;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }
    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }
    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }
    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }
    public void setAwnser(String awnser) {
        this.awnser = awnser;
    }
}
