package org.openweathermap.parse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class JSONParseTest {

    public static void main ( String[] args )
    {

       JSONParseTest app = new JSONParseTest();
       app.demo();
    }
   
    	private void demo( )
    {
        //Creating a JSONParser object
        JSONParser jsonParser = new JSONParser();
        try
        {
    
        	String key = "b1b15e88fa797225412429c1c50c122a1";
            URL url = new URL( "https://samples.openweathermap.org/data/2.5/history/city?q=London,UK&appid=b1b15e88fa797225412429c1c50c122a1" + key ); // 79843 = US postal Zip Code for Marfa, Texas."
            URLConnection conn = url.openConnection();
            BufferedReader reader = new BufferedReader( new InputStreamReader(conn.getInputStream()) );


            // Parse JSON
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            System.out.println("jsonObject = " + jsonObject);

            JSONArray list = (JSONArray) jsonObject.get("list");
            System.out.println("list = " + list);

            // Loop through each item
            for (Object obj : list)
            {
            	
                JSONObject forecast = (JSONObject) obj;
                JSONObject main = (JSONObject) forecast.get("main");
                System.out.println("main = " + main);
                Double temp = (Double) main.get("temp");  
                System.out.println("temp = " + temp);
                Double temp_min = (Double) main.get("temp_min");  
                System.out.println("temp_min = " + temp_min);
                Double temp_max = (Double) main.get("temp_max");  
                System.out.println("temp_max = " + temp_max);
                Object pressure =  main.get("pressure");  
                System.out.println("pressure = " + pressure);
                Object humidity =  main.get("humidity");  
                System.out.println("humidity = " + humidity);
                
                JSONObject wind = (JSONObject) forecast.get("wind");
                System.out.println("wind = " + wind);
                Object deg = wind.get("deg");  
                System.out.println("deg = " + deg);
                Object speed = wind.get("speed"); 
                System.out.println("speed = " + speed);
                
                JSONObject clouds = (JSONObject) forecast.get("clouds");
                System.out.println("clouds = " + clouds);   
                JSONObject rain = (JSONObject) forecast.get("rain");
                System.out.println("rain = " + rain);
                System.out.println("\n");
            }
            
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }
}
