public class methods{
	public static void main(String [] args){
        // methods
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        finalScore(gameOver,score,levelCompleted,bonus);
        finalScore(true,10000,8,200);

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
		
		
		
		
