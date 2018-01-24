package com.stackroute.datamunger.query;

import java.util.HashMap;

import com.stackroute.datamunger.query.parser.QueryParameter;
import com.stackroute.datamunger.query.parser.QueryParser;
import com.stackroute.datamunger.reader.CsvQueryProcessor;

public class Query {

	public HashMap executeQuery(String queryString) {

		// checking type of Query
		QueryParameter queryParameter = new QueryParser().parseQuery(queryString);
		// queries without aggregate functions, order by clause or group by
		// clause
		CsvQueryProcessor csvQueryProcessor = new CsvQueryProcessor();
		DataSet dataSet = csvQueryProcessor.getResultSet(queryParameter);
		return dataSet;
	}
}