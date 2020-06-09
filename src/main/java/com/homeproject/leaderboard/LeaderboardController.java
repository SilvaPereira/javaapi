package com.homeproject.leaderboard;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaderboardController {
	
	//GET TOP20 Random Map
	@GetMapping("https://aoe2.net/api/leaderboard?game=aoe2de&leaderboard_id=3&start=1&count=20")
	public List<Leaderboard> getTop20RandomMap(){
		List<Leaderboard> leaderboard = new ArrayList<>();
		return leaderboard;
	}
	
	//GET TOP20 Team Random Map
	@GetMapping("https://aoe2.net/api/leaderboard?game=aoe2de&leaderboard_id=4&start=1&count=20")
	public List<Leaderboard> getTop20TeamGameRandomMap(){
		List<Leaderboard> leaderboard = new ArrayList<>();
		return leaderboard;	}
	
	//GET TOP20 Deathmatch
	@GetMapping("https://aoe2.net/api/leaderboard?game=aoe2de&leaderboard_id=1&start=1&count=20")
	public List<Leaderboard> getTop20Deathmatch(){
		List<Leaderboard> leaderboard = new ArrayList<>();
		return leaderboard;
	}
	
	//GET TOP20 Team Deathmatch
	@GetMapping("https://aoe2.net/api/leaderboard?game=aoe2de&leaderboard_id=2&start=1&count=20")
	public List<Leaderboard> getTop20TeamGameDeathmatch(){
		List<Leaderboard> leaderboard = new ArrayList<>();
		return leaderboard;
	}
	
	//CUSTOMIZED LEADERBOARD
}
