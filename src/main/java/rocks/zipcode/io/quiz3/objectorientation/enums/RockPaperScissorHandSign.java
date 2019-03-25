package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {

   ROCK("PAPER", "SCISSOR"),
    PAPER("SCISSOR","ROCK"),
    SCISSOR("ROCK","PAPER");

    private final String winner;
    private final String loser;

    RockPaperScissorHandSign(String winner, String loser) {
        this.winner = winner;
        this.loser = loser;
    }

    public RockPaperScissorHandSign getWinner() {

        return this.valueOf(winner);
    }

    public RockPaperScissorHandSign getLoser() {
        return this.valueOf(loser);
    }
}
