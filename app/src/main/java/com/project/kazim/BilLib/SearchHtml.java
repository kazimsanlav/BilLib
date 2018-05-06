package com.project.kazim.BilLib;

import java.io.IOException;
import java.util.ArrayList;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class SearchHtml {
	public static ArrayList<Book> getBook(String s)
	{
		ArrayList<Book> b = new ArrayList<Book>();
		
		String name;
		String callNum;
		String auther;
		String location;
		
		String search=s;
		Document doc=null;
		try {
			doc = Jsoup.connect("http://librarycatalog.bilkent.edu.tr/client/en_US/university/search/results/?ln=en_US&lm=UNIVERSITY&q="+search+"&rw=0").get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(doc.toString().contains("No results found in Search Result"))//return null if search result is empty
			return null;
		boolean notFound = false;
		for(int i=0; i<12 && !notFound; i++)
		{
			try{
				Elements newsHeadlines = doc.select("#results_bio"+i);
				callNum = (newsHeadlines.select(".PREFERRED_CALLNUMBER").select(".highlightMe").html().toString());
				auther = (newsHeadlines.select(".INITIAL_AUTHOR_SRCH").select(".highlightMe").html().toString());
				location = (newsHeadlines.select(".LOCATION_C").select(".highlightMe").html().toString());
				name = (newsHeadlines.select(".displayDetailLink").html().toString());
				name = name.substring(name.indexOf(" title=")+" title=".length()+1);
				name = name.substring(0,name.indexOf("\""));
				b.add(new Book(name,callNum,auther,location)) ;
			}catch (Exception e){
				notFound = true;
			}
		}
		return b;

	}

}
