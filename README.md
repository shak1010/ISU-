# ISU-shakeel Read Me file
Introduction: 

This project is a world cup simulator program that firstly provides the user with an easy to understand menu with 4 options. The menu provides options to add new teams, view eligible teams, start the world cup tournament or lastly exit the program. This allows for a lot of creativity for the user as they can make as many teams as they would like and still be able to proceed to the group stage matches, the semi-finals and the finals. The program also has 16 default teams overall appealing to more users.


Main Variables Used: 

eligible_teams: An ArrayList of Strings representing the eligible that may participate in the world cup

elements: An ArrayList of Strings representing the 8 teams selected by the user

groupA/B: ArrayList of Strings representing the teams in each group

pointsA/B: Arrays of integers representing the points earned by each team in each respective groups (group A or B)

goalDiffA/B: Arrays of integers representing the goal difference for each team in each group 

topGroupA/B: Arrays of Strings representing the top two teams from each group helping with determining the 4 Semi finalists from both groups
 
Finalists 1/2: Strings representing the 2 finalists

Champion, SecondPlace and RunnersUP: Strings allowing for the code summary of the Champion, the second place and the runner up teams 
 
Confirm: A String confirming the teams chosen by the user
 
Options (option1,option2…): An integer used to store the user’s menu selection and give the user the option to continue playing or quitting the game


Logic and Structure: 

Menu Selection: The User is presented with a menu to select an option 
Team Selection: The User may add new teams to the eligible_teams Array List or they may view the existing 16 teams 
 
Group Stage: The 8 Teams are then divided into two groups of 4 to where they would play each other. The total points based on their wins, losses and ties are calculated as well as their goal differential. They are stored in pointsA/B and goalDiffA/B respectively
 
Semi-Finals: The top two teams based on points with goal differential being the tiebreaker will be chosen from each group and stored in the topGroupA and topGroupB Arrays.The semi-final Matches are simulated by random goals and will turn into Sudden death penalties if scores result in a tie. The two winning teams are stored as finalists 1/2
 
Finals: The finalists that have been determined will play each other again going to sudden death penalties if resulting in a tie. The champion, second place and runners up are determined and shown in the summary ending portion of my code. 


Additional Important Information: 

Sudden Death Penalties Portion Explanation: 

	Sudden death penalties are a series of one on one penalty kicks in a penalty shootout that continues until one team scores and the other team misses.
 To implement this in my code I used the random function only giving the option of either 0 or 1. If 1 was chosen this would add into the semi final or final teams scores 
 and if 0 was given no extra point was given. This is placed in a while loop that will keep going until one team gets 1 and the other gets 0.




