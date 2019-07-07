public class CrossStitchPattern extends PatternSequence {

    public void generatePattern() {
        for (int b=1; b<=5; b++){
            for (int c=1; c<=5; c++);
            smallCrossStitch.generateStitch();
            largeCrossStitch.generateStitch();
        }


    }
}