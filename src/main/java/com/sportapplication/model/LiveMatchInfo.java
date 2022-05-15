package com.sportapplication.model;

import java.util.List;

public class LiveMatchInfo {
	private String series_name;
	private String data_path;
	private MatchData header;
	private Venue venue;
	private BattingTeam bat_team;
	private BowlingTeam bow_team;
	private List<BatsmanDetails>batsman;
	private List<BowlerDetails>bowler;
	private Team1Details team1;
	private Team2Details team2;
	public String getSeries_name() {
		return series_name;
	}
	public void setSeries_name(String series_name) {
		this.series_name = series_name;
	}
	public String getData_path() {
		return data_path;
	}
	public void setData_path(String data_path) {
		this.data_path = data_path;
	}
	public MatchData getHeader() {
		return header;
	}
	public void setHeader(MatchData header) {
		this.header = header;
	}
	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	public BattingTeam getBat_team() {
		return bat_team;
	}
	public void setBat_team(BattingTeam bat_team) {
		this.bat_team = bat_team;
	}
	public BowlingTeam getBow_team() {
		return bow_team;
	}
	public void setBow_team(BowlingTeam bow_team) {
		this.bow_team = bow_team;
	}
	public List<BatsmanDetails> getBatsman() {
		return batsman;
	}
	public void setBatsman(List<BatsmanDetails> batsman) {
		this.batsman = batsman;
	}
	public List<BowlerDetails> getBowler() {
		return bowler;
	}
	public void setBowler(List<BowlerDetails> bowler) {
		this.bowler = bowler;
	}
	public Team1Details getTeam1() {
		return team1;
	}
	public void setTeam1(Team1Details team1) {
		this.team1 = team1;
	}
	public Team2Details getTeam2() {
		return team2;
	}
	public void setTeam2(Team2Details team2) {
		this.team2 = team2;
	}
	
	

}
