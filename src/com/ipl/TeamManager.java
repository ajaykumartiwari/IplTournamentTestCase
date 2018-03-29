package com.ipl;

import java.util.ArrayList;
import java.util.Scanner;

import com.interfaces.TeamManagement;
import com.model.Player;
import com.model.Team;

public class TeamManager implements TeamManagement{
    Team team;
    Player player;
    ArrayList tid=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    ArrayList<Player> player_info;
    ArrayList<Team> team_info  = new ArrayList<>();
    static int k = 0;
    @Override
    public void playerDetails() {
        // TODO Auto-generated method stub
    	ArrayList arrListPlayer = new ArrayList<>();
    	
    	System.out.println("\n============== Enter Players Details Team ============\n");  
        for (int i = 0; i < 1 ; i++) {
            player_info = new ArrayList<Player>();
            player=new Player();
            System.out.print("Enter "+(i+1)+"st Player Id:\t");
            arrListPlayer.add(sc.nextInt());
            player.setPlayerId(arrListPlayer);
            System.out.print("Enter "+(i+1)+"st Player Name:\t");
            player.setPlayerName(sc.next());
            System.out.print("Enter "+(i+1)+"st Player Roll:\t");
            player.setPlayerRoll(sc.next());
            player_info.add(player);

        }
    }

    @Override
    public void teamDetails() {
        // TODO Auto-generated method stub
        team=new Team();
        System.out.println("\n");
        System.out.print("Enter Team Id  =>\t\t");
        tid.add(sc.nextInt());
        team.setTeamId(tid);
        System.out.print("Enter Team Name =>\t\t");
        team.setTeamName(sc.next());
        System.out.print("Enter Team Owner Name =>\t");
        team.setTeamOwner(sc.next());
        team_info.add(team);
    }

    public ArrayList<Team> displayTeam() {
    	
        teamDetails();
        System.out.println("=======================================================\n");
        for (int i = 0; i < team_info.size(); i++) {
            team = team_info.get(i);
            System.out.println("");
            System.out.println("\t"+(i+1)+"st Team Details..");
            System.out.println("\tTeam Id:\t\t"+team.getTeamId()+"\n\tTeam Name:\t\t"
                    +team.getTeamName()+"\n\tTeam Owner Name:\t"+team.getTeamOwner());
        }
        return team_info;
    }
    
    public ArrayList<Player> displayPlayer() {
    	
        playerDetails();
        System.out.println("=========================================================\n");
        for (int i = 0; i < player_info.size(); i++) {
        	
            Player p = player_info.get(i);
            System.out.println("");
            System.out.println("\t Player Id:\t\t"+p.getPlayerId()+"\n\t Player Name:\t\t"
                    +p.getPlayerName()+"\n\t Player Roll:\t\t"+p.getPlayerRoll());
        }
        return player_info;
    }

}
