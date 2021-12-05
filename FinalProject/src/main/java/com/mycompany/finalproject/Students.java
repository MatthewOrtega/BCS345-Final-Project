package com.mycompany.finalproject;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.parser.JSONParser;
import org.json.parser.ParseException;
       
public class Students
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) 
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("students.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray studentList = (JSONArray) obj;
            System.out.println(studentList);
             
            //Iterate over employee array
            studentList.forEach( emp -> parseStudentObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
