
import java.util.*;
public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        ArrayList<String> elements = new ArrayList<String>();
        ArrayList<String> eligible_teams = new ArrayList<String>();
        eligible_teams.add("Brazil");
        eligible_teams.add("Argentina");
        eligible_teams.add("France");
        eligible_teams.add("England");
        eligible_teams.add("Germany");
        eligible_teams.add("Spain");
        eligible_teams.add("USA");
        eligible_teams.add("Canada");
        eligible_teams.add("Mexico");
        eligible_teams.add("Japan");
        eligible_teams.add("South Korea");
        eligible_teams.add("Italy");
        eligible_teams.add("Portugal");
        eligible_teams.add("Netherlands");
        eligible_teams.add("Belgium");
        eligible_teams.add("China");

        String confirm = ""; // Used to confirm Teams chosen later in Code
        String Champion = "";// Define Champion Variable
        String SecondPlace = ""; // Define Second Place Variable
        String RunnersUP = ""; // Define RunnersUp Variable **Champion, Second And RunnersUp are used for Final Summary Of World Cup Game**
        int options = 0;
        ArrayList<String> groupA = new ArrayList<String>();
        ArrayList<String> groupB = new ArrayList<String>();

        int end = 0;
        while (options != 3 && end != 1) {  
            System.out.println("Type 0 to add a new World cup team");
            System.out.println("Type 1 to start the world cup");
            System.out.println("Type 2 to see the teams that may be enrolled in the world cup tournament");
            System.out.println("Type 3 if you would like to end the game");
            options = sc.nextInt();
            sc.nextLine();

            if(options == 0){
                //option 0: Allow user to add a new country of their choosing
                System.out.println("Welcome to Customs! Here you may add your own World cup Soccer teams To play with in the World Cup game!!");
                System.out.println("Enter the team You would like to add!");
                String customs = sc.nextLine();
                eligible_teams.add(customs);
                System.out.println("Great Team " + customs + " is now added!!");
            }
            else if(options == 2) {
                // Option 2: Display the eligible teams
                System.out.println("There are " + eligible_teams.size() + " teams you may choose from");
                System.out.println("Eligible Teams:");
                for (int i = 0; i < eligible_teams.size(); i++) {
                    System.out.println((i + 1) + ". " + eligible_teams.get(i));
                }
            } 
            else if(options == 1) {
                // Option 1: Proceed with the world cup team selection
                System.out.println("Welcome to the 2026 world cup hosted in North America!!!! ");
                for (int i = 1; i <= 8; i++) {
                    System.out.println("Enter team " + i);
                    String teams = sc.nextLine();
                    if (eligible_teams.contains(teams)) {
                    	if (elements.contains(teams)) { // Check for duplicates
                            System.out.println("This team has already been added. Please choose a different team.");
                            i--; // Decrease counter to retry the same team
                        } else {
                            elements.add(teams); // Add the team to the list if it's valid and not a duplicate
                        }
                    } else {
                        System.out.println("This team is not eligible to participate in the world cup");
                        System.out.println("If you would like to refer to the teams that are eligible to participate in the world cup, type 2. Otherwise, type 1 to keep entering teams:");
                        options = sc.nextInt();
                        sc.nextLine(); 

                        if (options == 2) {
                            System.out.println("There are " + eligible_teams.size() + " teams you may choose from");
                            System.out.println("Eligible Teams:");
                            for (int x = 0; x < eligible_teams.size(); x++) {
                                System.out.println((x + 1) + ". " + eligible_teams.get(x));
                            }
                        }
                        i--; 
                    }
                }

                for(int i = 0; i < 8; i++) {
                    System.out.println((i + 1) + ". " + elements.get(i));
                }
                // Confirm Teams Chosen
                System.out.println("Is this the teams you're looking for? (yes/no)");
                confirm = sc.nextLine();

                while(!(confirm.equals("no") || confirm.equals("yes"))) {
                    System.out.println("Invalid input, please try again. Is this the teams you're looking for? (yes/no)" );
                    confirm = sc.nextLine();
                }

                if(confirm.equals("no")) {
                    System.out.println("Please restart code to enter correct teams");
                    options = 3;
                }
                if(confirm.equals("yes")) {
                    System.out.println("Starting the World Cup tournament!");

                    // Create arrays for points and goal differences
                    int[] pointsA = new int[4]; // Points for Group A
                    int[] pointsB = new int[4]; // Points for Group B
                    int[] goalDiffA = new int[4]; // Goal difference for Group A
                    int[] goalDiffB = new int[4]; // Goal difference for Group B
                    
                    // Group division
                    groupA.add(elements.get(0));
                    groupA.add(elements.get(1));
                    groupA.add(elements.get(2));
                    groupA.add(elements.get(3));
                    groupB.add(elements.get(4));
                    groupB.add(elements.get(5));
                    groupB.add(elements.get(6));
                    groupB.add(elements.get(7));

                    // Matches in Group A
                    System.out.println("Group A Matches:");
                    for (int i = 0; i < groupA.size(); i++) {
                        for (int j = i + 1; j < groupA.size(); j++) {
                            int score1 = (int) ((Math.random() * (10 - 0 + 1)) + 0); // Random score 0-10
                            int score2 = (int) ((Math.random() * (10 - 0 + 1)) + 0); // Random score 0-10
                            System.out.println(groupA.get(i) + " " + score1 + " - " + score2 + " " + groupA.get(j));
                            if (score1 > score2) {
                                pointsA[i] += 3; // 3 points to the winner 0 for loser
                            } else if (score1 < score2) {
                                pointsA[j] += 3; // 3 points to the winner 0 for loser
                            } else {
                                pointsA[i]++; // 1 point for a draw
                                pointsA[j]++;
                            }

                            goalDiffA[i] += (score1 - score2); // Update goal difference for team i
                            goalDiffA[j] += (score2 - score1); // Update goal difference for team j
                        }
                    }
                    
                    // Add space to make output more visible for user
                    System.out.println("				");

                    // Matches in Group B
                    System.out.println("Group B Matches:");
                    for (int i = 0; i < groupB.size(); i++) {
                        for (int j = i + 1; j < groupB.size(); j++) {
                            int score1 = (int) ((Math.random() * (10 - 0 + 1)) + 0); // Random score 0-10
                            int score2 = (int) ((Math.random() * (10 - 0 + 1)) + 0); // Random score 0-10
                            System.out.println(groupB.get(i) + " " + score1 + " - " + score2 + " " + groupB.get(j));
                            if (score1 > score2) {
                                pointsB[i] += 3; // 3 points to the winner 0 for loser
                            } else if (score1 < score2) {
                                pointsB[j] += 3; // 3 points to the winner 0 for loser
                            } else {
                                pointsB[i]++; // 1 point for a draw
                                pointsB[j]++;
                            }

                            goalDiffB[i] += (score1 - score2); // Update goal difference for team i
                            goalDiffB[j] += (score2 - score1); // Update goal difference for team j
                        }
                    }

                    	System.out.println("Type 1 if you would like to see the statistics of the group stage matches, type 2 if you would like to quit");
                    		int options2 = sc.nextInt();
                    
                    	while (!(options2 == 1 || options2 == 2)) {
                        System.out.println("Invalid input, please try again, type 1 if you would like to continue, type 2 if you would like to quit");
                        options2 = sc.nextInt();
                    }

                    	if (options2 == 1) {
                        // Print Group A Standings
                        System.out.println("Group A Standings:");
                        for (int i = 0; i < groupA.size(); i++) {
                            System.out.println(groupA.get(i) + " - points: " + pointsA[i] + ", goal difference: " + goalDiffA[i]);
                        }

                        // Print Group B Standings
                        System.out.println("				");
                        System.out.println("Group B Standings:");
                        for (int i = 0; i < groupB.size(); i++) {
                            System.out.println(groupB.get(i) + " - points: " + pointsB[i] + ", goal difference: " + goalDiffB[i]);
                        }

                        // Find the top 2 teams from Group A
                        String[] topGroupA = new String[2];
                        for (int i = 0; i < 2; i++) {
                            int maxIndexA = 0;
                            for (int j = 1; j < pointsA.length; j++) {
                                if (pointsA[j] > pointsA[maxIndexA] || (pointsA[j] == pointsA[maxIndexA] && goalDiffA[j] > goalDiffA[maxIndexA])) {
                                    maxIndexA = j;
                                }
                            }
                            topGroupA[i] = groupA.get(maxIndexA);
                            pointsA[maxIndexA] = -1; // Change it so that It is not used again
                        }

                        // Find the top 2 teams from Group B
                        String[] topGroupB = new String[2];
                        for (int i = 0; i < 2; i++) {
                            int maxIndexB = 0;
                            for (int j = 1; j < pointsB.length; j++) {
                                if (pointsB[j] > pointsB[maxIndexB] || (pointsB[j] == pointsB[maxIndexB] && goalDiffB[j] > goalDiffB[maxIndexB])) {
                                    maxIndexB = j;
                                }
                            }
                            topGroupB[i] = groupB.get(maxIndexB);
                            pointsB[maxIndexB] = -1; // Change it so that It is not used again
                        }

                        // Display top 2 teams from both groups
                        System.out.println();
                        System.out.println("Top 2 Teams from Group A: " + Arrays.toString(topGroupA));
                        // Create Space for Readibility
                        System.out.println("										");
                        System.out.println("Top 2 Teams from Group B: " + Arrays.toString(topGroupB));
                        
                        System.out.println();
                        System.out.println("Type 1 if you would like to see the Semi-Finals and continue , type 2 if you would like to quit");
                        int options3 = sc.nextInt();
                        
                        while (!(options3 == 1 || options3 == 2)) {
                            System.out.println("Invalid input, please try again, type 1 if you would like to continue, type 2 if you would like to quit");
                            options3 = sc.nextInt();
                        }
                        
                        if(options3 == 2) {
                        	break;
                        }
                        
                        System.out.println();
                        System.out.println("Semi-finals:");
                        System.out.println();
                        System.out.println(topGroupA[0] + " vs " + topGroupA[1]);
                        System.out.println();
                        System.out.println(topGroupB[0] + " vs " + topGroupB[1]);

                        int semiAScore1 = (int) ((Math.random() * (10 - 0 + 1)) + 0); // Random Score 0-10
                        int semiAScore2 = (int) ((Math.random() * (10 - 0 + 1)) + 0);
                        int semiBScore1 = (int) ((Math.random() * (10 - 0 + 1)) + 0);
                        int semiBScore2 = (int) ((Math.random() * (10 - 0 + 1)) + 0);
                        
                        System.out.println();
                        System.out.println(topGroupA[0] + " " + semiAScore1 + " - " + semiAScore2 + " " + topGroupA[1]);
                        System.out.println();
                        System.out.println(topGroupB[0] + " " + semiBScore1 + " - " + semiBScore2 + " " + topGroupB[1]);
                        
                        String finalist1 = ""; // Introduce Finalist1 Strings 
                        String finalist2 = "";	// Introduce Finalist2 Strings
                        
                        if (semiAScore1 == semiAScore2) { // This would mean Semi-Final Game A Has gone to Penalties
                            System.out.println("Penalty shootout for " + topGroupA[0] + " vs " + topGroupA[1]);
                            while (semiAScore1 == semiAScore2) { // Sudden Death Penalty ShootOut, When A team Gets more goals It will Stop And Crown a Semi-Final winner for Group A!!!
                                semiAScore1 += (int) ((Math.random() * (1-0+1)) + 0);//Penalty Score
                                semiAScore2 += (int) ((Math.random() * (1-0+1)) + 0);
                            }
                            System.out.println("Penalty result: " + topGroupA[0] + " " + semiAScore1 + " - " + semiAScore2 + " " + topGroupA[1]);
                            if(semiAScore1>semiAScore2) {
                            	System.out.println(topGroupA[0]+ " are the first finalists and the best team on the group A side!! ");
                           	    finalist1 = topGroupA[0];
                           	    RunnersUP += topGroupA[1] + " and ";
                            }
                            else if (semiAScore2>semiAScore1) {
                            	System.out.println(topGroupA[1]+ " are the first finalists and the best team on the group A side!! ");
                           	    finalist1 = topGroupA[1];
                           	 RunnersUP += topGroupA[0] + " and ";
                            }
                        }
                        else if(semiAScore1>semiAScore2) { // This would mean Semi-finalist 1 has won their semi-final game A
                        	System.out.println(topGroupA[0]+ " are the first finalists and the best team on the group A side!! ");
                        	 finalist1 = topGroupA[0];
                        	 RunnersUP += topGroupA[1] + " and ";
                        	
                        }	else {	// This would mean Semi-finalist 2 has won their semi-final game A
                        	System.out.println(topGroupA[1]+ " are the first finalists and the best team on the group A side!! ");
                        	 finalist1 = topGroupA[1];
                        	 RunnersUP += topGroupA[0] + " and ";
                        	
                        	}
                        if (semiBScore1 == semiBScore2) {	// This would mean Semi-Final Game B Has gone to Penalties
                            System.out.println("Penalty shootout for " + topGroupB[0] + " vs " + topGroupB[1]);
                            while (semiBScore1 == semiBScore2) { // Sudden Death Penalty ShootOut, When A team Gets more goals It will Stop And Crown a Semi-Final winner for Group B!!!
                                semiBScore1 += (int) (Math.random() * (1 - 0 + 1));
                                semiBScore2 += (int) (Math.random() * (1 - 0 + 1));
                            }
                            System.out.println("Penalty result: " + topGroupB[0] + " " + semiBScore1 + " - " + semiBScore2 + " " + topGroupB[1]);
                            if(semiBScore1>semiBScore2) {
                            	System.out.println();
                            	System.out.println(topGroupB[0]+ " are the Second finalists and the best team on the group B side!! ");
                           	    finalist2 = topGroupB[0];
                           	 RunnersUP += topGroupB[1];
                            }
                            else if (semiBScore2>semiBScore1) {
                            	System.out.println();
                            	System.out.println(topGroupB[1]+ " are the Second finalists and the best team on the group B side!! ");
                           	    finalist2 = topGroupB[1];
                           	 RunnersUP += topGroupB[0] ;
                            }
                        }
                    
                    		else if(semiBScore1>semiBScore2) { // This would mean Semi-finalist 1 has won their semi-final game B
                    			System.out.println();
                    			System.out.println(topGroupB[0]+ " are the second finalists and the best team on the group B side!! ");
                    			finalist2 = topGroupB[0];
                    			RunnersUP += topGroupB[1] ;
                    	
                    	}
                    		else {	// This would mean Semi-finalist 2 has won their semi-final game B
                    			System.out.println();
                    			System.out.println(topGroupB[1]+ " are the second finalists and the best team on the group B side!! ");
                    			finalist2 = topGroupB[1];
                    			RunnersUP += topGroupB[0] ;
                    	
                    	}
                        
                        		System.out.println("Type 1 if you would like to see the FINAL!! , type 2 if you would like to quit");
                        		
                        		int options4 = sc.nextInt();
                        
                        while (!(options4 == 1 || options4 == 2)) {
                            System.out.println("Invalid input, please try again, type 1 if you would like to continue, type 2 if you would like to quit");
                            options4 = sc.nextInt();
                        }
                        	if(options4 == 2) { // End Game if they would like
                        		break;
                        }
                        // Final match
                        	System.out.println("Final: " + finalist1 + " vs " + finalist2);
                        	System.out.println();
                        		int finalScore1 = (int) ((Math.random() * (10 - 0 + 1)) + 0);
                        		int finalScore2 = (int) ((Math.random() * (10 - 0 + 1)) + 0);
                        	System.out.println(finalist1 + " " + finalScore1 + " - " + finalScore2 + " " + finalist2);

                        if (finalScore1 == finalScore2) { // This Means their is a final Penalty Shootout!!
                            System.out.println("Penalty shootout for the final!");
                            while (finalScore1 == finalScore2) {
                                finalScore1 += (int) (Math.random() * (1 - 0 + 1));
                                finalScore2 += (int) (Math.random() * (1 - 0 + 1));
                            }
                            System.out.println("Penalty result: " + finalist1 + " " + finalScore1 + " - " + finalScore2 + " " + finalist2);
                            if(finalScore1>finalScore2) {
                            	System.out.println("Congratulations to Team " + finalist1 + ", They are the 2026 World Cup Winners!!!!!");
                            	Champion = finalist1;
                            	SecondPlace = finalist2;
                            	end = 1; // Crown Winner + End Game
                            }
                            else if (finalScore2>finalScore1) {
                            	System.out.println("Congratulations to Team " + finalist2 + ", They are the 2026 World Cup Winners!!!!!");
                            	Champion = finalist2;
                            	SecondPlace = finalist1;
                            	end = 1; // Crown The winner + End Game
                            }
                        }
                        	else if(finalScore1 > finalScore2) {
                        		System.out.println("Congratulations to Team " + finalist1 + ", They are the 2026 World Cup Winners!!!!!");
                        		Champion = finalist1;
                        		SecondPlace = finalist2;
                        		end = 1; //End Game
                        }
                        	else {
                        		System.out.println("Congratulations to Team " + finalist2 + ", They are the 2026 World Cup Winners!!!!!");
                        		Champion = finalist2;
                        		SecondPlace = finalist1;
                        		end = 1; //End Game
                        }
                        // Create A top 3 Team Table to summarize Top Three Teams
                        String[] columnNames = {"TeamName", "		Final Position"};

                        // Define data for the table (rows and columns)
                        String[][] data = {
                            {Champion, "			1"},
                            {SecondPlace, "			2"},
                            {RunnersUP, "	Runners UP"}
                        };

                        // Print table headers
                        for (String columnName : columnNames) {
                            System.out.print(columnName);
                        }
                        System.out.println();  // Move to the next line after headers

                        // Print table data
                        for (int i = 0; i < data.length; i++) {
                            for (int j = 0; j < data[i].length; j++) {
                                System.out.print(data[i][j]);
                            }
                            System.out.println();  // Move to the next line after each row
                        }
                    }
                }
                   }
                }
        System.out.println();
        System.out.println("Thanks for playing!");
    }
}
