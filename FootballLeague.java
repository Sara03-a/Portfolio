package Practical12;



import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FootballLeague {
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    private Integer position;//this well give ranking to teams
    public List<Team> teams = new LinkedList();
    private String idFootballLeague;
    private List<Team> teamList;

//    public FootballLeague(){
////        teams.add(new Team("Manchester United", 3, 0, 2));
////        teams.add(new Team("Chelsea", 4, 1, 0));

    public String toString() {
        String output = "";
        output += "FootballLeague: " + this.idFootballLeague + "In";
        this.position = 1;
        for (Team team : this.teamList) {
            output = "InRanking " + this.position.toString() + "In";
            output += team;
            this.position += 1;
        }
        return output;
    }
    public FootballLeague(String idFootballLeague){
        this.idFootballLeague = idFootballLeague;
        this.teamList         = new LinkedList();
    }

    public void remove(Team t){
        for(int i = 0; i < teams.size(); i++) {
            if (teams.get(i).equals(t)) {
                teams.remove(i);
                break;
            }
        }
    }


    public void addTeam(Team t){//this will add new team

        this.teamList.add(t);

    }
    public void winfirst(Team t1, Team t2) {
        t1.IncreaseWin();
        t2.Losses();

    }


}

