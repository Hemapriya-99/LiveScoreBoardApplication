package com.sportapplication.model;

import java.util.List;

//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class MatchData {
	
	private String start_time;
	private String end_time;
	private String state;
	private String match_desc;
	private String type;
	private String state_title;
	private String toss;
	private String status;
	private List<String>momNames;
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMatch_desc() {
		return match_desc;
	}
	public void setMatch_desc(String match_desc) {
		this.match_desc = match_desc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getState_title() {
		return state_title;
	}
	public void setState_title(String state_title) {
		this.state_title = state_title;
	}
	public String getToss() {
		return toss;
	}
	public void setToss(String toss) {
		this.toss = toss;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<String> getMomNames() {
		return momNames;
	}
	public void setMomNames(List<String> momNames) {
		this.momNames = momNames;
	}
}