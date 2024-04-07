package bai4;

public class Run {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberGenerator numberGenerator2 = new NumberGenerator();
        numberGenerator2.start();
        numberGenerator.start();
    }
}
