package com.gourav.myproject;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class FetchAParticularYear {

	public static void main( String args[] ){
	      
		 // To connect to mongodb server
	         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	         // Now connect to your databases
	         DB db = mongoClient.getDB( "MovieData" );
	         DBCollection coll = db.getCollection("MovieCollection");
	         
	    
	    
	   	    
	    BasicDBObject whereQuery = new BasicDBObject();
		//whereQuery.put("number", 5);
	    whereQuery.put("Year", 2007);
		DBCursor cursor = coll.find(whereQuery);
	    
	   
	    
	    while (cursor.hasNext()) {
	        System.out.println(cursor.next());
	    }
	      

	}
}