package com.gourav.myproject;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
//import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class FetchAParticularMovieByName {

	      
		public static void main (String args[]){
			
			String MovieName="Trumbo (2007)";
		 // To connect to mongodb server
	         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	         // Now connect to your databases
	         DB db = mongoClient.getDB( "MovieData" );
	         DBCollection coll = db.getCollection("MovieCollection");  
	   	    
	    BasicDBObject whereQuery = new BasicDBObject();
	    whereQuery.put("Movie Name", MovieName);
		DBCursor cursor = coll.find(whereQuery);
		System.out.println(cursor.next());
			}
}