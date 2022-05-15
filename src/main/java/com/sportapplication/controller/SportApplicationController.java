package com.sportapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sportapplication.model.LiveMatchInfoDTO;
import com.sportapplication.model.MatchScheduleDTO;
import com.sportapplication.model.NewsDTO;
import com.sportapplication.service.SportApplicationService;

@Controller
public class SportApplicationController
{
	 @Autowired
	 private SportApplicationService sportApplicationService;
	 
	    @GetMapping("/Home")
		 public String getHome(Model model)
		 {
			 return "Home";
		 }
	    
	    @GetMapping("/LiveMatchInfo")
	    public String getliveMatchData(Model model) {
	        LiveMatchInfoDTO liveMatchInfoDTO = sportApplicationService.getLiveMatchData();
	        model.addAttribute("matches", liveMatchInfoDTO.getMatches());
	        return "LiveMatchInfo";
	    }
	 
	    @GetMapping("/Schedule")
	    public String getMatchScheduleData(Model model) 
	    {
	        MatchScheduleDTO sportDTO = sportApplicationService.getMatchScheduleData();
	        model.addAttribute("data", sportDTO.getData());
	        return "Schedule";
	    }
	    
	    @GetMapping("/SportNews")
	    public String getNewsData(Model model) {
	        NewsDTO newsDTO = sportApplicationService.getNewsData();
	        model.addAttribute("articles", newsDTO.getArticles());
	        return "SportNews";
	    }

}
