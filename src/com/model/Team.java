package com.model;

import java.util.ArrayList;

public class Team {
	
	private ArrayList teamId;
	public void setTeamId(ArrayList teamId) {
		this.teamId = teamId;
	}
	private String teamName;
	private String teamOwner;
	//private ArrayList<Player> playerDetails;
	
	/*public ArrayList<Player> getPlayerDetails() {
		return playerDetails;
	}
	public void setPlayerDetails(ArrayList<Player> playerDetails) {
		this.playerDetails = playerDetails;
	}*/
	
	public ArrayList getTeamId() {
		return teamId;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamOwner() {
		return teamOwner;
	}
	public void setTeamOwner(String teamOwner) {
		this.teamOwner = teamOwner;
	}
}
