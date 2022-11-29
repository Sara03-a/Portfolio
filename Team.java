package Practical12;

public class Team implements Comparable<Team>{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getDraws() {
        return draws;
    }

    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    private Integer wins;
    private Integer draws;

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    private  Integer losses;

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    private  Integer points;

    /**
     * This constructor initialises the fields of the class*/
    public Team(String name) {
        this.name = name;
        this.wins = 0;
        this.draws = 0;
        this.losses = 0;
        this.points = 0;

    }
    public void IncreaseWin(){
        this.wins+=1;
        Updatewin();
    }
    public void Updatewin(){
        this.points+=2;
    }
    public void Losses(){
        this.losses+=1;
    }


    public String toString(){
        return "Team: " + this.name
                + "\nWins: " + this.wins
                + "\nDraws; " + this.draws
                + "\nLosses: " + this.losses
                + "\nPoints: " + this.points;
        return output;
    }
    @Override

    public int compareTo(Team t){
        return this.points.compareTo(t.points);
    }

}