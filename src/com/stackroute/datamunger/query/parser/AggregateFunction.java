package com.stackroute.datamunger.query.parser;

public class AggregateFunction {
	private String field, function;
	private int result;
	private int aggregateFieldIndex;

	public AggregateFunction() {
	}

	public AggregateFunction(String field, String function, int result) {
		this.field = field;
		this.function = function;
		this.result = result;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public int getAggregateFieldIndex() {
		return aggregateFieldIndex;
	}

	public void setAggregateFieldIndex(int aggregateFieldIndex) {
		this.aggregateFieldIndex = aggregateFieldIndex;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}