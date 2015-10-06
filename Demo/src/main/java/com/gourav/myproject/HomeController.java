package com.gourav.myproject;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	 MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
     // Now connect to your databases
     DB db = mongoClient.getDB("MovieData");
     DBCollection coll = db.getCollection("MovieCollection");  
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/")
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "SearchPage";	
	}
	
	
	@RequestMapping (value = "/displayMovie.htm")
	protected ModelAndView placeOrder(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		String movieName = request.getParameter("mname");
		HashMap<String, String> hm=new HashMap<String ,String>();
			
	System.out.println("MOVIENAME>>>>" + movieName);
	String movie_Name,year,genre;
	 BasicDBObject whereQuery = new BasicDBObject();		
	    whereQuery.put("Movie Name", movieName);
		DBCursor cursor = coll.find(whereQuery);
		System.out.println(cursor.next());
		movie_Name=cursor.curr().get("Movie Name").toString();
		genre=cursor.curr().get("Genre").toString();
		
		System.out.println(">>>>>"+ movie_Name );
		System.out.println(">>>>>"+ genre);
		
		hm.put("MovieName", movie_Name);
		hm.put("MovieGenre", genre);
		return new ModelAndView("displayMovie","hm",hm);
	}
}

