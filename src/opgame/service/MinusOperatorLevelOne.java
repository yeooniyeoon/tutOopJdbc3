package opgame.service;

public class MinusOperatorLevelOne implements IOperator {
    int a, b;

    @Override
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void generateQuestion(int max) {
        int a = (int)(Math.random() * max);
        int b = (int)(Math.random() * max);
        if (a < b) {
            int tmp = 0;
            a = b;
            b = tmp;
        }
    }

    @Override
    public String getQuestionMsg() {
        return String.format("%d - %d = ", a, b);
    }

    @Override
    public boolean isEqueals(int answer) {
        return (a - b) == answer;
    }
}
