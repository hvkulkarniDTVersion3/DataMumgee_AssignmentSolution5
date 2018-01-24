## Seed code - Boilerplate for step 5 - DataMungee Assignment(PLEASE CHANGE THIS README POST CLONING - SAVE THE INSTRUCTIONS SEPERATELY)

### Problem Statement

In this assignment step 5, we will perform the following task:

    1. Filter the data based on the query with multiple where conditions.
         For Example: where season >= 2013 or toss_decision!=bat and city=Bangalore;
    
    2. Filter the data based on selected fields.
        For Example : select city,winner,team1,team2 from ipl.csv;
    
    3. Store the filtered data in a json file.

### Expected solution

A JSON file containing the filtered result set.

### Following are the broad tasks:

- Read the query from the user
- parse the query
- forward the object of query parameter to CsvQueryProcessor
- filter out rows basis on the conditions mentioned in the where clause
- write the result set into a JSON file

### Project structure

The folders and files you see in this repositories, is how it is expected to be in projects, which are submitted for automated evaluation by Hobbes

	Project
	|
	├── resources 			                    // If project needs any data file, it can be found here/placed here, if data is huge they can be mounted, no need put it in your repository
	|
	├── com.stackroute.datamunger	            // all your java file will be stored in this package
	|	└── query
	|		└──parser
	|			└── AggregateFunction.java             // This class is used to store Aggregate Function
	|			└── QueryParameter.java                // This class contains the parameters and accessor/mutator methods of QueryParameter
	|			└── QueryParser.java                    // This class will parse the queryString and return an object of QueryParameter class
	|			└── Restriction.java	                // This class is for storing Restriction object
	|		└── DataSet.java 		                    // This class will be acting as the DataSet containing multiple rows
	|		└── DataTypeDefinitions.java                // This class contains methods to find the column data types
	|		└── Filter.java 		                    // This class contains methods to evaluate expressions
	|		└── Header.java                             // This class implements the getHeader method to return a Header object which contains a String array for containing headers.
	|		└── Query.java                              // This class selects the appropriate processor based on the type of query
	|		└── Row.java                                //This class contains the row object as ColumnName/Value 
	|		└── RowDataTypeDefinitions.java             // This class will be used to store the column data types as columnIndex/DataType
	|	└── reader
	|		└── CsvQueryProcessor.java                  // This class is used to read data from CSV file
	|		└── QueryProcessingEngine.java              //abstract class containing three abstract methods that should be implemented in CsvQueryProcessor class
	|	└── test                                        // all your test cases are written using JUnit, these test cases can be run by selecting Run As -> JUnit Test 
	|	└── writer
	|		└── JsonWriter.java                         // This class writes the result in a JSON file
	|	└── DataMunger.java	                            // This is the main file, all your logic is written in this file only
	|
	├── .classpath			                            // This file is generated automatically while creating the project in eclipse
	├── .hobbes   			                    // Hobbes specific config options, such as type of evaluation schema, type of tech stack etc., Have saved a default values for convenience
	├── .project			                    // This is automatically generated by eclipse, if this file is removed your eclipse will not recognize this as your eclipse project. 
	├── pom.xml 			                    // This is a default file generated by maven, if this file is removed your project will not get recognised in hobbes.
	└── PROBLEM.md  		                    // This files describes the problem of the assignment/project, you can provide as much as information and clarification you want about the project in this file

> PS: All lint rule files are by default copied during the evaluation process, however if need to be customizing, you should copy from this repo and modify in your project repo


#### To use this as a boilerplate for your new project, you can follow these steps

1. Clone the base boilerplate in the folder **assignment-solution-step5** of your local machine
     
    `git clone https://gitlab.training.com/stack_java_datamunging/datamungee-step5-boilerplate.git assignment-solution-step5`

2. Navigate to assignment-solution-step5 folder

    `cd assignment-solution-step5`

3. Remove its remote or original reference

     `git remote rm origin`

4. Create a new repo in gitlab named `assignment-solution-step5` as private repo

5. Add your new repository reference as remote

     `git remote add origin https://gitlab.training.com/{{yourusername}}/assignment-solution-step5.git`

     **Note: {{yourusername}} should be replaced by your username from gitlab**

6. Check the status of your repo 
     
     `git status`

7. Use the following command to update the index using the current content found in the working tree, to prepare the content staged for the next commit.

     `git add .`
 
8. Commit and Push the project to git

     `git commit -a -m "Initial commit | or place your comments according to your need"`

     `git push -u origin master`

9. Check on the git repo online, if the files have been pushed


### Important instructions for Participants
> - We expect you to write the assignment on your own by following through the guidelines, learning plan, and the practice exercises
> - The code must not be plagirized, the mentors will randomly pick the submissions and may ask you to explain the solution
> - The code must be properly indented, code structure maintained as per the boilerplate and properly commented
> - Follow through the problem statement and stories shared with you

### Further Instructions on Release

*** Release 0.1.0 ***

- Right click on the Assignment select Run As -> Java Application to run your Assignment.
- Right click on the Assignment select Run As -> JUnit Test to run your Assignment.