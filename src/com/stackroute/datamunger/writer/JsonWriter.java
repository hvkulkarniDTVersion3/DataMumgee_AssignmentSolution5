package com.stackroute.datamunger.writer;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonWriter {
	// this method will write the resultSet into a JSON file
	public boolean writeToJson(Map resultSet) {

		// Gson is a third party library to convert Java object to JSON
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String result = gson.toJson(resultSet);
		BufferedWriter bufferedWriter=null;
		try {
			bufferedWriter = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream("data/result.json")));
			bufferedWriter.write(result);			
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		// write result to rerouces/result.json file using BufferedWriter

		// return true if file writing is successful

		// return false if file writing is failed

		// close BufferedWriter object
		finally{
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}
}