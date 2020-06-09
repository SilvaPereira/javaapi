package com.homeproject.rating;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {

	//Request the rating history for a player
	@GetMapping(" https://aoe2.net/api/player/ratinghistory?game=aoe2de&leaderboard_id=3&steam_id={id}&count=10")
	public List<Rating> getPlayerRatingHistory(@PathVariable int id){
		return null;
	}
}
