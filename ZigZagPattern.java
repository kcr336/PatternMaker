public class ZigZagPattern extends PatternSequence {


    public void generatePattern() {
        for (int a = 1; a <= 2; a++) {
            for (int b = 1; b <= 3; b++) {
                zigZagStitch.generateStitch();}{
                for (int c = 1; c <= 3; c++) {
                    fillStitch.generateStitch();
                }
            }
        }
    }
}
