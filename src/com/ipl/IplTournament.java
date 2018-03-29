package com.ipl;

import java.util.ArrayList;
import java.util.Scanner;

import com.model.Match;
import com.model.Player;
import com.model.Team;

public class IplTournament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        TeamManager teamManager=new TeamManager();
        TournamentOrganizerManager tm = new TournamentOrganizerManager();
        System.out.println("=========Enter Number Of Teams============");
        int team_no=sc.nextInt();
        ArrayList<Team> teamInfoList=new ArrayList();
        ArrayList<Player> playerInfoList=new ArrayList();
        ArrayList<Match> matchInfoList = new ArrayList<>();
        for (int i = 0; i < team_no; i++) {
            teamInfoList=teamManager.displayTeam();
            playerInfoList=teamManager.displayPlayer();
        }
        
        matchInfoList = tm.tournamentMatchVenueDetails();
	
		PlayMatch playmatch=new PlayMatch();
		
		playmatch.gatherInfoForMatch(teamInfoList,matchInfoList);
		//tm.sendDataToPlayMtach();

	}
	
	public static void gatherInfoForMatch(ArrayList<Team> teamInfoList)
	{
		
		for (int i = 0; i < teamInfoList.size(); i++) {
			Team team1=(Team) teamInfoList.get(i);
			System.out.println(">== Team Wala Id=>\t"+team1.getTeamId());
		}
		
		
	}
}
