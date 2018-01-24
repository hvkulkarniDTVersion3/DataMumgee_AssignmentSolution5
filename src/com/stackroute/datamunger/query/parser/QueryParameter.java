package com.stackroute.datamunger.query.parser;

import java.util.List;

//this class contains the parameters and accessor/mutator methods of QueryParameter
public class QueryParameter {

	private String file;
	private String baseQuery;
	private String queryString;
	private List<Restriction> restrictions;
	private List<String> fields;
	private List<String> logicalOperators;
	private List<String> groupByFields;
	private List<String> orderByFields;
	private List<AggregateFunction> aggregateFunctions;
	private String QUERY_TYPE = "SELECT * FROM Match.csv";
	public String getFile() {
		return file;
	}
	public String getQUERY_TYPE() {
		return QUERY_TYPE;
	}
	public void setQUERY_TYPE(String qUERY_TYPE) {
		QUERY_TYPE = qUERY_TYPE;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getBaseQuery() {
		return baseQuery;
	}
	public void setBaseQuery(String baseQuery) {
		this.baseQuery = baseQuery;
	}
	public String getQueryString() {
		return queryString;
	}
	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}
	public List<Restriction> getRestrictions() {
		return restrictions;
	}
	public void setRestrictions(List<Restriction> restrictions) {
		this.restrictions = restrictions;
	}
	public List<String> getFields() {
		return fields;
	}
	public void setFields(List<String> fields) {
		this.fields = fields;
	}
	public List<String> getLogicalOperators() {
		return logicalOperators;
	}
	public void setLogicalOperators(List<String> logicalOperators) {
		this.logicalOperators = logicalOperators;
	}
	public List<String> getGroupByFields() {
		return groupByFields;
	}
	public void setGroupByFields(List<String> groupByField) {
		this.groupByFields = groupByField;
	}
	public List<String> getOrderByFields() {
		return orderByFields;
	}
	public void setOrderByFields(List<String> orderByFields) {
		this.orderByFields = orderByFields;
	}
	public List<AggregateFunction> getAggregateFunctions() {
		return aggregateFunctions;
	}
	public void setAggregateFunctions(List<AggregateFunction> aggregateFunction) {
		this.aggregateFunctions = aggregateFunction;
	}	
}