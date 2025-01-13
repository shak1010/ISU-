package bruh;
import java.util.*;
public class question6 {
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
        eligible_teams.add("Morocco");

        String confirm = "";
        int options = 0;

        while (options != 3) {  
            System.out.println("Type 1 to start the world cup");
            System.out.println("Type 2 to see the teams that may be enrolled in the world cup tournament");
            System.out.println("Type 3 if you would like to end the game");
            options = sc.nextInt();
            sc.nextLine();

            if(options == 2) {
                // Option 2: Display the eligible teams
                System.out.println("There are 16 teams you may choose from");
                System.out.println("Eligible Teams:");
                for (int i = 0; i < eligible_teams.size(); i++) {
                    System.out.println((i + 1) + ". " + eligible_teams.get(i));
                }
            } else if(options == 1) {
                // Option 1: Proceed with the world cup team selection
                System.out.println("Welcome to the 2026 world cup hosted in North America!!!! ");
                for (int i = 1; i <= 8; i++) {
                    System.out.println("Enter team " + i);
                    String teams = sc.nextLine();
                    if (eligible_teams.contains(teams)) {
                        elements.add(teams);
                    } else {
                        System.out.println("This team is not eligible to participate in the world cup");
                        System.out.println("If you would like to refer to the teams that are eligible to participate in the world cup, type 2. Otherwise, type 1 to keep entering teams:");
                        options = sc.nextInt();
                        sc.nextLine(); 

                        if (options == 2) {
                            System.out.println("There are 16 teams you may choose from.");
                            System.out.println("Eligible Teams:");
                            for (int x = 0; x < eligible_teams.size(); x++) {
                                System.out.println((x + 1) + ". " + eligible_teams.get(x));
                            }
                        }
                        i--; 
                    }
                }

                for(int i = 0; i<8; i++) {
                    System.out.println((i + 1) + ". " + elements.get(i));
                }
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
                    
                	ArrayList<String> groupA = new ArrayList<>();
                	ArrayList<String> groupB = new ArrayList<>();
                	int[] pointsA = new int[4];
                    int[] pointsB = new int[4];

                	// Assign teams to groups
                	for (int i = 0; i < elements.size(); i++) {
                		if (i < 4) {
                			groupA.add(elements.get(i));
                		} else {
                			groupB.add(elements.get(i));
                		}
                	}

                	// Groups
                	System.out.println("Group A: " + groupA);
                	System.out.println("					");
                	System.out.println("Group B: " + groupB);
                	
                	System.out.println("Type 1 if you would like to see the results of the group stage matches, type 2 if you would like to quit");
                	options = sc.nextInt();
                	while(!(options!= 1 || options != 2)) {
                        System.out.println("Invalid input, please try again.Type 1 if you would like to continue, type 2 if you would like to quit " );
                        options = sc.nextInt();
                    }
                	if(options == 1) {
                	
                	
                	// Matches in Group A
                	System.out.println("Group A Matches:");
                	for (int i = 0; i < groupA.size(); i++) {
                		for (int j = i + 1; j < groupA.size(); j++) {
                			int score1 = (int) ((Math.random() * (10 - 0 + 1)) + 0); // Random score 0-10
                			int score2 = (int) ((Math.random() * (10 - 0 + 1)) + 0); // Random score 0-10
                			System.out.println(groupA.get(i) + " " + score1 + " - " + score2 + " " + groupA.get(j));
                			 if (score1 > score2) {
                                 pointsA[i] += 3;
                             } else if (score1 < score2) {
                                 pointsA[j] += 3;
                             } else {
                                 pointsA[i]++;
                                 pointsA[j]++;
                             }
                			 
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
                                 pointsB[i] += 3;
                             } else if (score1 < score2) {
                                 pointsB[j] += 3;
                             } else {
                                 pointsB[i]++;
                                 pointsB[j]++;
                             }
                		}
                	}

                	System.out.println("Type 1 if you would like to see the statistics of the group stage matches, type 2 if you would like to quit");
                	int options2 = sc.nextInt();
                	while(!(options2!= 1 || options2 != 2)) {
                        System.out.println("Invalid input, please try again, type 1 if you would like to continue, type 2 if you would like to quit" );
                        options2 = sc.nextInt();
                	}
                	if(options2 == 1) {
                        System.out.println("Group A Standings");
                            int goalA = pointsA[0];
                        for (int i =0; i<groupA.size();i++) {
                            System.out.println(groupA.get(i) + " - points " + pointsA[i]);
                           // Used to determine  max goal for record now need to figure out how to find team... int maxgoalA = Math.max(goalA,pointsA[i]);
                        }
                        System.out.println("				");
                        System.out.println("Group B Standings");
                            int goalB = pointsB[0];
                        for (int i =0; i<groupB.size();i++) {
                            System.out.println(groupB.get(i) + " - points " + pointsB[i]);
                            // Used to determine  max goal for record now need to figure out how to find team... int maxgoalB = Math.max(goalB,pointsB[i]);
                        }                
                	// Group Stage points + Semi + Finals 
                    
                    
                    
                    
                    
                    
                    }
                	else if(options==2) {
                		options = 3;
                		break;
                }
                	else if(options2==2) {
                		options = 3;
                		break;
                	}
                }
              }
            }
            if(options == 3 && !(confirm.equals("no"))) {
                System.out.println("Thanks for playing!");
            }
    }
}
}