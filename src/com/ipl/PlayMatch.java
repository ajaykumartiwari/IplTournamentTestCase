package com.ipl;

import java.util.ArrayList;
import java.util.Scanner;

import com.interfaces.IPlayMatch;
import com.interfaces.IResult;
import com.model.Match;
import com.model.Team;

public class PlayMatch implements IPlayMatch, IResult{
	
	Team team;
	Match match;
	ArrayList<Integer> team1;
	ArrayList<String> team2;
	int matchTeam1,matchTeam2;
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void gatherInfoForMatch(ArrayList<Team> teamIdList, ArrayList<Match> matchIdList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < teamIdList.size(); i++) {
			team=(Team)teamIdList.get(i);
			team1 = team.getTeamId();
			//team2 = team.getTeamId();
			//System.out.println("==>"+team1.get(0)+"\t==>"+team1.get(1));
		}
		for (int j = 0; j < matchIdList.size(); j++) {
			match = matchIdList.get(j);
			matchTeam1 = match.getTeamIdOfFirstTeam();
			matchTeam2 = match.getTeamIdOfSecondTeam();
			//System.out.println("==<"+matchTeam1+"\t==<"+matchTeam2);
		}
		
		if((team1.get(0) == matchTeam1 && team1.get(1) == matchTeam2))
		{
			System.out.println("\n\n");
			System.out.println("=========Match begain between Team id \t"+ team1.get(0)+" and Team Id \t"+team1.get(1)+"===========");
			System.out.println("\tCoin Toss!!!");
			
			System.out.print("\t\tEnter head or tail...\t");
			String t1 = "head";
			if(t1 == sc.next()) {
				System.out.println("\t\t\tTeam  "+team1.get(0)+" win the toss !!!");
				System.out.println("\t\t\tElected to boll first....");
				System.out.println("\t\t=======>Match Begain<========");
				result();
			}
			else {
				System.out.println("\t\t Team  "+team1.get(1)+" win the toss");
				System.out.println("\t\t Elected to bat first....");
				System.out.println("\t =======>Match Begain<========");
				result();
			}
		}
		
	}

	@Override
	public void result() {
		// TODO Auto-generated method stub
		System.out.print("\tEnter Final Score Of The First Team :\t");
		int score1 = sc.nextInt();
		
		System.out.print("\tEnter Final Score Of The Second Team :\t");
		int score2 = sc.nextInt();
		
		if(score1 > score2) {
			System.out.println("WoW!!!....Team  "+match.getTeamIdOfFirstTeam()+"  is Winner");
		}
		else if(score1 == score2) {
			System.out.println("Match Draw !!!!!!");
		}
		else {
			System.out.println("\t WoW!!!....Team "+match.getTeamIdOfSecondTeam()+"  is Winner");
		}
	}
}
