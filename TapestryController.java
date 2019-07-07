
public class TapestryController {

    public static void main(String[] args) {
//        CrossStitchPattern csp = new CrossStitchPattern();
//        csp.generatePattern();
//        ZigZagPattern zzp = new ZigZagPattern();
//        zzp.generatePattern();
//        BaublePattern bp = new BaublePattern();
//        bp.generatePattern();
//        BlockyBaublePattern bbp = new BlockyBaublePattern();
//        bbp.generatePattern();

        PatternSequence[] patterns = new PatternSequence[]{
                new CrossStitchPattern(),
                new ZigZagPattern(),
                new BaublePattern(),
                new BlockyBaublePattern()
        };

        for (int x = 0; x < patterns.length; x++)
            for (int r = 1; r <= 3; r++) {
                for (int c = 1; c <= 8; c++) {
                    patterns[x].generatePattern();
                }
                System.out.println();
                System.out.println();
                System.out.println();

                for (int k = 0; k < patterns.length; k++){
                    for (int row = 1; row <= 8; row++) {
                        for (int col = 1; col <= 6; col++) {
                            patterns[k].generatePattern();
                        }
                        System.out.println();
                    }

                }
            }
    }
}

