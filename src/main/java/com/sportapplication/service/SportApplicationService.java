package com.sportapplication.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.sportapplication.model.LiveMatchInfoDTO;
import com.sportapplication.model.MatchScheduleDTO;
import com.sportapplication.model.NewsDTO;


@Service
public class SportApplicationService 
{
	private final String LIVEMATCH_INFO_URI="http://mapps.cricbuzz.com/cbzios/match/livematches";
	private final String MATCH_CALENDAR_URI = "https://cricapi.com/api/matchCalendar?apikey=0qcRFgoPS2eyntCHaWYwmHyMvmD3";
	private final String NEWS_URI= "http://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=ace05426d540446a9892145066694ddc";
		
	private final RestTemplate restTemplate;

    public SportApplicationService(RestTemplateBuilder restTemplateBuilder) 
    {
        this.restTemplate = restTemplateBuilder.build();
    }
    
    public  LiveMatchInfoDTO getLiveMatchData() 
    {
        LiveMatchInfoDTO liveMatchData;
        
        try 
        {
            liveMatchData = this.restTemplate.getForObject(LIVEMATCH_INFO_URI,LiveMatchInfoDTO.class);
        }
        catch (HttpClientErrorException e) 
        {
            System.out.println("issue while getting the livematch data : " + e.getMessage());
            return new LiveMatchInfoDTO();
        }
        return liveMatchData;
    }

    public MatchScheduleDTO getMatchScheduleData() 
    {
        MatchScheduleDTO matchScheduleData;
        
        try 
        {
        	matchScheduleData = this.restTemplate.getForObject(MATCH_CALENDAR_URI,MatchScheduleDTO.class);
        }
        catch (HttpClientErrorException e) 
        {
            System.out.println("issue while getting the sportschedule data : " + e.getMessage());
            return new MatchScheduleDTO();
        }
        return matchScheduleData;
    }
    
    public  NewsDTO getNewsData() 
    {
        NewsDTO newsData;
        
        try 
        {
            newsData = this.restTemplate.getForObject(NEWS_URI,NewsDTO.class);
        }
        catch (HttpClientErrorException e) 
        {
            System.out.println("issue while getting the news data : " + e.getMessage());
            return new NewsDTO();
        }
        return newsData;
    }
    
}
