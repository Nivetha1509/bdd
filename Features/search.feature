Feature: searching for filghts in gobibo 
Scenario Outline: Checking ticket availability 
	Given User enter <from> place and <to> place 
	When 	User select <dateDeparture> the date for departure 
	And     User select <dateReturn> the date for arrival 
	Then user click on the search button 
	Examples: 
		|from     |to    |dateDeparture|dateReturn|
		|Bangalore|Mumbai| 20210912	   |20210914  |