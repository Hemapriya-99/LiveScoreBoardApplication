package com.sportapplication.model;

import java.util.List;

public class NewsDTO 
{
	private List<NewsArticle>articles;

	public List<NewsArticle> getArticles() {
		return articles;
	}

	public void setArticles(List<NewsArticle> articles) {
		this.articles = articles;
	}
}
