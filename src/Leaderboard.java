import java.util.ArrayList;
import java.util.List;

public class Leaderboard {
    private List<PlayerScore> scores;

    public Leaderboard() {
        scores = new ArrayList<>();
        }
    public void addScore(String playerName, int score) {
        PlayerScore playerScore = new PlayerScore(playerName, score);
        scores.add(playerScore);
    }
    public List<PlayerScore> getScores() {
        return new ArrayList<>(scores);
    }
    public static class PlayerScore {
        private String playerName;
        private int score;

        public PlayerScore(String playerName, int score) {
            this.playerName = playerName;
            this.score = score;
        }
        public String getPlayerName() {
            return playerName;
        }
        public int getScore() {
            return score;
        }
        @Override
        public String toString() {
            return playerName + ": " + score;
        }
    }
}
