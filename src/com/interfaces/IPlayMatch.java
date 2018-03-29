package com.interfaces;

import java.util.ArrayList;

import com.model.Match;
import com.model.Team;

public interface IPlayMatch {
	public void gatherInfoForMatch(ArrayList<Team> teamIdList,ArrayList<Match> matchIdList);
}
