package com.homeproject.leaderboard;

import javax.persistence.Entity;

@Entity
public class Leaderboard {

	private int profile_id;
	private int rank;
	private int rating;
	private String steam_id;
	//private int icon;
	private String name;
	private String clan;
	private String country;
	private int previous_rating;
	private int highest_rating;
	private int streak;
	private int lowest_streak;
	private int highest_streak;
	private int games;
	private int wins;
	private int losses;
	private int drops;
	private int last_match;
	private int last_match_time;
	public int getProfile_id() {
		return profile_id;
	}
	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getSteam_id() {
		return steam_id;
	}
	public void setSteam_id(String steam_id) {
		this.steam_id = steam_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClan() {
		return clan;
	}
	public void setClan(String clan) {
		this.clan = clan;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPrevious_rating() {
		return previous_rating;
	}
	public void setPrevious_rating(int previous_rating) {
		this.previous_rating = previous_rating;
	}
	public int getHighest_rating() {
		return highest_rating;
	}
	public void setHighest_rating(int highest_rating) {
		this.highest_rating = highest_rating;
	}
	public int getStreak() {
		return streak;
	}
	public void setStreak(int streak) {
		this.streak = streak;
	}
	public int getLowest_streak() {
		return lowest_streak;
	}
	public void setLowest_streak(int lowest_streak) {
		this.lowest_streak = lowest_streak;
	}
	public int getHighest_streak() {
		return highest_streak;
	}
	public void setHighest_streak(int highest_streak) {
		this.highest_streak = highest_streak;
	}
	public int getGames() {
		return games;
	}
	public void setGames(int games) {
		this.games = games;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public int getDrops() {
		return drops;
	}
	public void setDrops(int drops) {
		this.drops = drops;
	}
	public int getLast_match() {
		return last_match;
	}
	public void setLast_match(int last_match) {
		this.last_match = last_match;
	}
	public int getLast_match_time() {
		return last_match_time;
	}
	public void setLast_match_time(int last_match_time) {
		this.last_match_time = last_match_time;
	}
	public Leaderboard(int profile_id, int rank, int rating, String steam_id, String name, String clan, String country,
			int previous_rating, int highest_rating, int streak, int lowest_streak, int highest_streak, int games,
			int wins, int losses, int drops, int last_match, int last_match_time) {
		super();
		this.profile_id = profile_id;
		this.rank = rank;
		this.rating = rating;
		this.steam_id = steam_id;
		this.name = name;
		this.clan = clan;
		this.country = country;
		this.previous_rating = previous_rating;
		this.highest_rating = highest_rating;
		this.streak = streak;
		this.lowest_streak = lowest_streak;
		this.highest_streak = highest_streak;
		this.games = games;
		this.wins = wins;
		this.losses = losses;
		this.drops = drops;
		this.last_match = last_match;
		this.last_match_time = last_match_time;
	}
	
	 
	
	
}
