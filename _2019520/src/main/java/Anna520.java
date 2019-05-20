/**
 * created by xwz 2019/5/20
 */

public class Anna520 {

    private static final float X_DIVIDED_BY_Y = 0.4f;
    private static final float MAX_X = 35f / X_DIVIDED_BY_Y;
    private static final float MAX_Y = 35f;
    private static final float THRESHOLD = 0.5f;
    private static final float A = 13;
    private static final String LOVE_SENTENCE = "Dear anna: Happy Valen" +
            "tine's Day. Unknowingly we have known for six" +
            " years, this is the 2174th **" +
            " Valentine's Day we spent together. In the past days,  we shared joy and sorrow,  success and failure, and we went hand in hand because we love each other" +
            ". Now thatwe are creating our **lives, we face many difficulties," +
            "but I promise that I can solve them in the near future. I love you not *" +
            "just 3000 times, but every moment, even when I write code or*debug. This *" +
            "app is a Valentine's gift I gave you, andI guarantee *that the cost*does not exceed 100 RMB. I*hope you canlike it like you like my big neck. " +
            "***Today is also the 117th **anniversary *of Nanjing **University. I think we ***should go back to school *to have a big meal to celebrate this Valentine's Day, *" +
            "so that I can be hit by you *on the ground. *When I write ***these words,I feel that I love and miss you more strongly. No words can describe my mood but I think you can feel it. I love you, I love every day with you." +
            " Wish you be healthy *and happy every day. My love!^__^";
    private static int sentenceIndex = 0;

    private static char getSentenceChar() {
        while(true) {
            if (sentenceIndex >= LOVE_SENTENCE.length()) {
                sentenceIndex = 0;
            }
            char c = LOVE_SENTENCE.charAt(sentenceIndex++);
            return c;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println();
        for(int i = 0;i<20;i++){
            System.out.print("- ");
            Thread.sleep(100);
        }
        System.out.print("-START-");
        Thread.sleep(200);
        for(int i = 0;i<20;i++){
            System.out.print(" -");
            Thread.sleep(100);
        }
        System.out.println();
        Thread.sleep(200);
        System.out.println();
        Thread.sleep(200);
        for (int y = 2; y <= MAX_Y-3; y++) {
            for (int x = 0; x <= MAX_X; x++) {
                if(func2(getY(y-7), getX(x))){
                    System.out.print("@");
                    Thread.sleep(50);
                }else if(func1(getY(y-4), getX(x))){
                    System.out.print(".");
                    Thread.sleep(50);
                }else {
                    System.out.print(func(getY(y), getX(x)) ? getSentenceChar() : ' ');
                    Thread.sleep(func(getY(y), getX(x)) ? 100 : 0);
                }
            }
            System.out.println();
            Thread.sleep(200);

        }
        for(int i = 0;i<60;i++){
            System.out.print(" ");
            Thread.sleep(10);
        }
        System.out.println("--Xia xiaozhi 2019.5.20");
        for(int i = 0;i<21;i++){
            System.out.print("- ");
            Thread.sleep(100);
        }
        System.out.print("-END-");
        Thread.sleep(200);
        for(int i = 0;i<21;i++){
            System.out.print(" -");
            Thread.sleep(100);
        }
        System.out.println();
    }

    public static final float getX(float x) {
        return (x - MAX_X / 2) * X_DIVIDED_BY_Y;
    }

    public static final float getY(float y) {
        return MAX_Y / 7f - y;
    }

    public static boolean func(float x, float y) {
        return (Math.pow(x, 2) + Math.pow(y, 2) + A * x - A * Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))) < THRESHOLD;
    }

    public static boolean func1(float x, float y) {
        return (Math.pow(x, 2) + Math.pow(y, 2) + 9 * x - 9 * Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))) < THRESHOLD;
    }
    public static boolean func2(float x, float y) {
        return (Math.pow(x, 2) + Math.pow(y, 2) + 5 * x - 5 * Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))) < THRESHOLD;
    }
}

