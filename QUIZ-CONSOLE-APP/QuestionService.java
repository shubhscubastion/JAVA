import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Size of int", "Java", "CPP", "Python", "JS", "Java is the right answer");
        questions[1] = new Question(2, "Size of double", "Java", "CPP", "Python", "JS", "Java is the right answer");
        questions[2] = new Question(3, "Size of char", "Java", "CPP", "Python", "JS", "Java is the right answer");
        questions[3] = new Question(4, "Size of long", "Java", "CPP", "Python", "JS", "Java is the right answer");
        questions[4] = new Question(5, "Size of boolean", "Java", "CPP", "Python", "JS", "Java is the right answer");
    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            // System.out.println(q.getQuestion());
            // System.out.println(q);

            System.out.println("Question no.: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();

            i++;
        }

        for (String s : selection) {
            System.out.println(s);
        }

    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();

            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer)) {
                score++;
            }

        }
        System.out.println("Your score is : " + score);
    }
}
