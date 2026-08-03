import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }

    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        RockPaperScissors game = new RockPaperScissors();
        String[] moves = {"Rock", "Paper", "Scissors"};

        int rounds = 5;
        int wins = 0;
        int losses = 0;
        int draws = 0;

        String[] playerMoves = new String[rounds];
        String[] computerMoves = new String[rounds];
        String[] results = new String[rounds];

        // Playing the Game
        for (int i = 0; i < rounds; i++) {
            System.out.print("Round " + (i + 1) + " - Enter your move (Rock/Paper/Scissors): ");

            playerMoves[i] = sc.next();
            computerMoves[i] = moves[random.nextInt(3)];
            results[i] = game.playRound(playerMoves[i], computerMoves[i]);

            System.out.println("Computer Move: " + computerMoves[i]);
            System.out.println(results[i]);
            System.out.println();

            if (results[i].equals("Player Wins")) wins++;
            else if (results[i].equals("Computer Wins")) losses++;
            else draws++;
        }

        // Displaying Final Summary
        System.out.println("\n----------- Final Summary -----------");
        System.out.println("Round\tPlayer\t\tComputer\tResult");

        for (int i = 0; i < rounds; i++) {
            System.out.println((i + 1) + "\t" + playerMoves[i] + "/t\t" +
                    computerMoves[i] + "/t\t" + results[i]);
        }
        double winPercentage = (wins * 100.0) / rounds;

        System.out.println("\nWins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.printf("Win %: \n", winPercentage);
        sc.close();
    }
}