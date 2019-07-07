public class BaublePattern extends PatternSequence {


    public void generatePattern(){
        for(int a=0; a<=4; a++){
            for (int b=1; b<=2; b++){
                shortLineStich.generateStitch(); }
            for(int c=1;c<=1;c++){
                circleStitch.generateStitch();
            }
        }
    }
}
