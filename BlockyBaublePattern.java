public class BlockyBaublePattern extends PatternSequence {


    public void generatePattern(){
       for(int a=1; a<=3;a++){
           for(int b=1; b<=1; b++){
               blockStitch.generateStitch();{
                   for(int c=1; c<=2; c++){
                       shortLineStich.generateStitch();
                   }
                        for(int d=1; d<=1; d++){
                            circleStitch.generateStitch();
                        }
                            for(int e=1; e<=2; e++){
                                shortLineStich.generateStitch();
                            }
               }
           }
       }

    }
}
