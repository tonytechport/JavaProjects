public class HighScore {

    public static void main(String args[]) {
        displayHighScorePosition("Tony", calculateHighScorePos(1500));
        displayHighScorePosition("Luis", calculateHighScorePos(900));
        displayHighScorePosition("Matt", calculateHighScorePos(400));
        displayHighScorePosition("Lauren", calculateHighScorePos(50));
    }

    public static void displayHighScorePosition(String name, int position){

        System.out.println(name + " managed to get into position " +position +".");

    }

    public static int calculateHighScorePos(int score){
        if(score >= 1000){
            return 1;
        }
        else if (score >= 500 && score < 1000){
            return 2;
        }
        else if(score >= 100 && score < 500){
            return 3;
        }
        else{
            return 4;
        }
    }



}
