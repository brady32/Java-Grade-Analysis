 //Programmer: Emma Brady.
//Student ID: B00100648.
//Date Written: 20th Febuary 2018.
//Function: Grade analysis program for class tests using Arrays.
//Note: ITB lecurers require a simple analysis program for analyzing class tests.

import java.util.Scanner;	//importing scanner class.

public class Ass1B00100648
{	//Opening of class.

	static int arraysize = 0;	//Defining array size to 0 for all classes.
	static double grades[];		//Defining grades for all classes.
	static String names[];		//Defining names for all classes.
	static String key;			//Defining key for all classes.


		// ****** Welcome Message ******

		public static void main (String args[])
			{
				String name;	//Defining variable name.
				double grade;	//Defining variable grade.
				Scanner myinput = new Scanner(System.in); //

				System.out.println("************************************************************************************");
				System.out.println("Welcome to ITB College :) ");
				System.out.println("All Lecturers see the below our new grade analysis program for analzying grades!!!! ");
				System.out.println("Enjoy your day :) ");
				System.out.println("************************************************************************************");

				System.out.println("Please enter the number of students you wish to process: ");
				arraysize = myinput.nextInt();	//Getting input from user.

					while ((arraysize <2) || (arraysize >25))	//Implementation of While Loop.
					{
					System.out.println("!!Please choose another value greater then 2 & less then 25!! ");
					arraysize = myinput.nextInt();	//Getting input from user.
					}

				System.out.println("************************************************************************************");

				names = new String[arraysize];	//Passing names into the array.
				grades = new double[arraysize];	//Passing grades into the array.

				System.out.println("Please enter the names of the students: ");

					for (int i = 0; i < names.length; i++ )	//Implementation of For Loop.
						{
							System.out.println("Please enter the name of student: " + (i+1));
							names[i] = myinput.next();	//Getting input from user.

							System.out.println("Please enter the grades for: " +(names[i]));
							grades[i] = myinput.nextDouble();	//Getting input from user..
						}

				System.out.println("************************************************************************************");

				menu(); //Call the menu.

			}	//End main method.

		// ****** Main menu ******

		public static void menu()
			{
				int option = 0; // For the menu numbers
				Scanner myinput = new Scanner(System.in);


				// ****** Message prompting the customer input ******

				System.out.println("Please select one of the following method options: ");

				System.out.println("1. Average");
				System.out.println("2. Highest");
				System.out.println("3. Lowest");
				System.out.println("4. Sort");
				System.out.println("5. Search");
				System.out.println("6. Exit");

				System.out.println("************************************************************************************");


				option = myinput.nextInt();	//Getting input from user.

					switch(option)	//Implementation of Switch statement.
						{
							case 1: average(grades); break;
							case 2: highest(grades); break;
							case 3: lowest(grades); break;
							case 4: sort(names); break;
							case 5: search(names, key); break;
							case 6: exit(); break;
							default: System.out.println("1 to 6 only!");
						}
			}	//End main method.

		// ****** Methods ******

		// ****** Average Method ******

		public static void average(double average[])
			{
				double total = 0;	//Defining variable total = 0.
				double avr = 0;	//Defining variable = 0.

					for (int i = 0; i < average.length; i++ )	//Implementation of For Loop.
					{
						total += average[i];
					}
						avr = ((total)/(average.length));
						System.out.println("The Average Grade is: "+avr);	//Returning average grade.
						System.out.println("************************************************************************************");
						menu();	//Call the menu.
			}	//End main method.

			// ****** Highest Method ******

		public static void highest(double highest[])
			{
				double highGrade = highest[0];	//Defining variable highGrade to highest.

					for (int i = 0; i < highest.length; i++ )	//Implementation of For Loop.
					{
						if	(highest[i] > highGrade )	//Implementation of If Statement.
						{
						highGrade = highest[i];
						}
					}
				System.out.println("The Highest Grade is: "+highGrade);	//Returning highest grade.
				System.out.println("************************************************************************************");
				menu();	//Call the menu.
			}	//End main method.

		public static void lowest(double lowest[])
			{
				double lowGrade = lowest[0];	//Defining variable lowGrade to lowest.

					for (int i = 0; i < lowest.length; i++)	//Implementation of For Loop.
					{
						if (lowest[i] < lowGrade )	//Implementation of If Statement.
						lowGrade = lowest[i];
					}
				System.out.println("The Lowest Grade is: "+lowGrade);	//Returning lowest grade.
				System.out.println("************************************************************************************");
				menu();	//Call the menu.
			}	//End main method.

		public static void sort(String students[])
			{
				double hold;	//Defining variable hold.
				String studentname;	//Defining variable studentname.

					for(int pass = 1; pass < grades.length; pass++)	//Implementation of For Loop.
						for(int i = 0; i < grades.length-1; i++)

							if(grades[i] > grades[i+1]) //Implementation of If Statement.
							{
								hold = grades[i];
								grades[i] = grades[i+1];
								grades[i+1] = hold;

								studentname = students[i];
								students[i] = students[i+1];
								students[i+1] = studentname;
							}
					System.out.println("Grades in asscending order: ");
					for(int i = 0; i < students.length; i++)	//Implementation of For Loop.
					{
						System.out.println(students[i]+", "+grades[i]);
					}
				System.out.println("************************************************************************************");
				menu();	//Call the menu.
			}	//End main method.

		public static void search(String names[], String key)
			{
				Scanner input = new Scanner(System.in);
				System.out.println("Search by student name: ");
				key = input.next();	//Defining variable key.
				int hook = 0;	//Defining variable hook = 0.

				for(int i = 0; i < names.length; i++)	//Implementation of For Loop.
					{

					if(names[i].equalsIgnoreCase(key))	//Implementation of If Statement.
						{
							hook=1;
							break;
						}
					}
					if(hook == 0)	//Implementation of If/Else Statement.
						{
							System.out.println("Name not Found ");
						}
					else
						{
							System.out.println("Name Found ");
						}
				System.out.println("************************************************************************************");
				menu();	//Call the menu.
			}	//End main method.

		public static void exit()
			{
				Scanner myinput = new Scanner(System.in);
				System.out.println("You have chosen exit. Goodbye! ");
				System.out.println("************************************************************************************");
				System.exit(0);
			}	//End main method.


	} //End of class.