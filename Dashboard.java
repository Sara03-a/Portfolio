package Practical12;

public class Dashboard {
    public static void main(String[] args){
        Team t1= new Team("Sara FC");
        Team t2= new Team("Sahil FC");
        Team t3= new Team("Masif FC");

        FootballLeague league1= new FootballLeague("Series A");
        league1.addTeam(t1);
        league1.addTeam(t2);
        league1.addTeam(t3);
        league1.winfirst(t1,t2);


    }
}