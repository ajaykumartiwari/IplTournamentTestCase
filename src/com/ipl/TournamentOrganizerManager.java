package com.ipl;

import java.util.ArrayList;
import java.util.Scanner;

import com.interfaces.IResult;
import com.interfaces.ImatchManagement;
import com.model.Match;
import com.model.Team;
import com.model.Venue;

public class TournamentOrganizerManager implements ImatchManagement,IResult{

	Match match;
	Venue venue;
	ArrayList<Match> arrayList_match;
	ArrayList arrayList_venue;
	Scanner sc = new Scanner(System.in);
	ArrayList<Team> teamListId = new ArrayList<>();
	Team team = new Team();
	
	@Override
	public void matchDetails() {
		// TODO Auto-generated method stub
		//this.teamListId = teamId;
		arrayList_match = new ArrayList<>();
		match = new Match();
		System.out.println("\n======================== Enter Match Details ==========================\n");
		System.out.print("Enter match id :\t");
		match.setMatchId(sc.nextInt());
		System.out.print("Enter First team id :\t");
		
		//teamListId.add(sc.nextInt());
		match.setTeamIdOfFirstTeam(sc.nextInt());
		System.out.print("Enter Second team id :\t");
		//teamListId.add(sc.nextInt());
		match.setTeamIdOfSecondTeam(sc.nextInt());
		
		System.out.print("Enter Match Type :\t");
		match.setMatchType(sc.next());
		System.out.print("Enter Match Date :\t");
		match.setMatchDate(sc.next());
		arrayList_match.add(match);
	}

	@Override
	public void venueDetails() {
		// TODO Auto-generated method stub
		arrayList_venue = new ArrayList<>();
		venue = new Venue();
		System.out.print("Enter Venue id :\t\t");
		venue.setVenueId(sc.nextInt());
		System.out.print("Enter Venue Name :\t\t");
		venue.setVenueName(sc.next());
		System.out.print("Enter Venue City Name :\t");
		venue.setVenueCity(sc.next());
		System.out.print("Enter Venue Country Name :\t");
		venue.setVenueCountry(sc.next());
		
		arrayList_venue.add(venue);
	}

	@Override
	public void result() {
		// TODO Auto-generated method stub
		
		/*for (int j = 0; j < arrayList1.size(); j++) {
			Venue v =(Venue) new Venue().get();
			System.out.println("Value is "+v.getVenueId()+""+v.getVenueName());
		}*/
	}

	public ArrayList<Match> tournamentMatchVenueDetails() {
		matchDetails();
		System.out.println("========================= Enter Match Venue Details =============================\n");
		venueDetails();
		for (int i = 0; i < arrayList_match.size(); i++) {
			Match m = (Match) arrayList_match.get(i);
			System.out.println("====================== Match Details... ========================\n");
			System.out.println("\tMatch Id:\t"+m.getMatchId()+"\n\tFirst team Id:\t"
					+m.getTeamIdOfFirstTeam()+"\n\tSecond team Id:\t"
					+m.getTeamIdOfSecondTeam()+"\n\tMatch Type"
					+m.getMatchType()+"\n\tMatch Date:\t"+m.getMatchDate());
			System.out.println("====================== Match Venue Details... ======================\n");
			Venue v =(Venue) arrayList_venue.get(i);
			System.out.println("\tMatch Venue Id:\t"+v.getVenueId()+"\n\tMatch Venue Name:\t"
					+v.getVenueName()+"\n\tMatch Venue City:"
					+v.getVenueCity()+"\n\tMatch Venue Country:"
					+v.getVenueCity());
			
		}
		return arrayList_match;
	}
/*	public void sendDataToPlayMtach()
	{
		PlayMatch playMatch=new PlayMatch();
		playMatch.gatherInfoForMatch(arrayList_match);
		
	}*/
}
