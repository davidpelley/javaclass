public class more_methods{
	public static void main(String[]args){
		
        // more methods
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

       int highScore =  finalScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);
        finalScore(true,10000,8,200);

        // challenge section
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy",highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Henry",highScorePosition);
    }
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    }
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else
            return 4;

    }
    public static int finalScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver) {   // if (gameOver == true)
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        else
            return -1;
    }
}