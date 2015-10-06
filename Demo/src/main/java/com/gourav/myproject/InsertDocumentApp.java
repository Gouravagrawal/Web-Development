package com.gourav.myproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
public class InsertDocumentApp {
  public static void main(String[] args) throws FileNotFoundException {	  
	 
	  InsertDocumentApp insertDoc=new InsertDocumentApp();
	  insertDoc.insertMovieDataSet();
	  insertDoc.insertTagsDataset();
	  insertDoc.insertRatingsDataSet();
	 
	   }
  
  public void insertMovieDataSet() throws FileNotFoundException{
	  FileReader file =new 
			  FileReader("C://Users//Gourav//Desktop//BigDataAsignment_2_GouravAgrawal//ml-10m//ml-10M100K//movies.dat");
			try{
		    BufferedReader in = new BufferedReader(file);
		    String s;
		    MongoClient mongoClient = new MongoClient("localhost", 27017);
	        DB db = mongoClient.getDB("MovieData");
			DBCollection collection = db.getCollection("MovieCollection");
			int count=0;
			   while((s = in.readLine()) != null){
		        String[] var = s.split("::");
		         BasicDBObject basicDBObject = new BasicDBObject();
		         
                   basicDBObject.put("Movie Name", var[1]);
                   int length =var[1].length();
  		 		   int year=Integer.parseInt(var[1].substring((length-5),(length-1)));
	                basicDBObject.put("Year", year);
	                basicDBObject.put("Genre", var[2]);
	                collection.insert(basicDBObject);
			     	        count++;
		    }
			   System.out.println("Count for the Movie Records" + count);
		}catch(Exception e){
		    e.printStackTrace();
		}
  }
  
  public void insertRatingsDataSet() throws FileNotFoundException{
	  FileReader file =new 
			  FileReader("C://Users//Gourav//Desktop//BigDataAsignment_2_GouravAgrawal//ml-10m//ml-10M100K//ratings.dat");
			try{
		    BufferedReader in = new BufferedReader(file);
		    String s;
		    MongoClient mongoClient = new MongoClient("localhost", 27017);
	        DB db = mongoClient.getDB("RatingsData");
			DBCollection collection = db.getCollection("RatingsCollection");
			int count=0;
			   while((s = in.readLine()) != null){
		        String[] var = s.split("::");
		         BasicDBObject basicDBObject = new BasicDBObject();
		         
                   basicDBObject.put("UserID", var[0]);
  	                basicDBObject.put("MovieID", var[1]);
	                basicDBObject.put("Ratings", var[2]);
	                basicDBObject.put("TiemStamp", var[3]);
	                collection.insert(basicDBObject);
			     	      count++;  
		    }
			   System.out.println("Count for the Ratings Records" + count);
		}catch(Exception e){
		    e.printStackTrace();
		}
  }
  
  public void insertTagsDataset() throws FileNotFoundException{
	  FileReader file =new 
			  FileReader("C://Users//Gourav//Desktop//BigDataAsignment_2_GouravAgrawal//ml-10m//ml-10M100K//tags.dat");
			try{
		    BufferedReader in = new BufferedReader(file);
		    String s;
		    MongoClient mongoClient = new MongoClient("localhost", 27017);
	        DB db = mongoClient.getDB("TagsData");
			DBCollection collection = db.getCollection("TagsCollection");
			int count = 0;
			
			   while((s = in.readLine()) != null){
		        String[] var = s.split("::");
		         BasicDBObject basicDBObject = new BasicDBObject();
		         
                    basicDBObject.put("UserID", var[0]);
   	                basicDBObject.put("MovieID", var[1]);
   	                basicDBObject.put("Tags", var[2]);
	                basicDBObject.put("TimeStamp", var[3]);
	                collection.insert(basicDBObject);
			     	     count++;
		    }
			   System.out.println("Count for the tags Records" + count);  
		}catch(Exception e){
		    e.printStackTrace();
		}
  }
}

