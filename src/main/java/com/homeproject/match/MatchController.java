package com.homeproject.match;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchController {

	//Request the last match the player started playing, this will be the current match if they are still in game
	@GetMapping("https://aoe2.net/api/player/lastmatch?game=aoe2de&steam_id={id}")
	public Match getPlayerLastMatch(@PathVariable int id){
		return null;
	}
	
	//Request the match history for a player
	@GetMapping("https://aoe2.net/api/player/matches?game=aoe2de&steam_id={id}&count=10")
	public List<Match> getPlayerMatchHistory(@PathVariable int id){
		return null;
	}
	
}
