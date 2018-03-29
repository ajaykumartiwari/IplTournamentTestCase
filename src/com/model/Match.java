package com.model;

import java.util.ArrayList;
import java.util.Date;

public class Match {

	private int matchId;
	private int teamIdOfFirstTeam;
	private int teamIdOfSecondTeam;
	private String matchType;
	private String matchDate;
	//private String matchResult;
	
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getTeamIdOfFirstTeam() {
		return teamIdOfFirstTeam;
	}
	public void setTeamIdOfFirstTeam(int teamIdOfFirstTeam) {
		this.teamIdOfFirstTeam = teamIdOfFirstTeam;
	}
	public int getTeamIdOfSecondTeam() {
		return teamIdOfSecondTeam;
	}
	public void setTeamIdOfSecondTeam(int teamIdOfSecondTeam) {
		this.teamIdOfSecondTeam = teamIdOfSecondTeam;
	}
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public String getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}
	/*public String getMatchResult() {
		return matchResult;
	}
	public void setMatchResult(String matchResult) {
		this.matchResult = matchResult;
	}*/
	
}
