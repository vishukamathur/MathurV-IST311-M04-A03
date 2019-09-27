package presidio;

public class Survey {

    private String[] questionList;
    private String[] answerList;
    private int currentQuestion;
    private boolean needsAlert;

    public Survey(String[] questionList, String[] answerList) {
        this.questionList = questionList;
        this.answerList = answerList;
    }

    /**
     * @return the questionList
     */
    public String[] getQuestionList() {
        return questionList;
    }

    /**
     * @param questionList the questionList to set
     */
    public void setQuestionList(String[] questionList) {
        this.questionList = questionList;
    }

    /**
     * @return the answerList
     */
    public String[] getAnswerList() {
        return answerList;
    }

    /**
     * @param answerList the answerList to set
     */
    public void setAnswerList(String[] answerList) {
        this.answerList = answerList;
    }

    public String askQuestion() {
        return questionList[currentQuestion];

    }

    public void retrieveAnswer(String answer) {
        this.answerList[currentQuestion] = answer;

    }

    public boolean makeConclusion() {
        
        
      return true;  

    }
    

}
