package com.valtech.training.ratingui;

import java.util.List;

import com.valtech.training.mobile.ranking.MobileRankingService;

public class RatingHelper {
	private MobileRankingService mobileRankingService;
	public int getRanking(String mobile) {
		
		return mobileRankingService.rankMobile(mobile);
		
	}
	

}
