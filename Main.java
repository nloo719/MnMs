import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input;

    int numDays = 0;
    int numStress = -1;
    int numFreq = -1;
    int cscDays = 0;
    double eventRoll;
    int days = 0;
    int examDiff = 3; // Default difficulty
    long examTime = 60; // Default time

    // Exam values

    System.out.println("Welcome to Minds & Matter!");

    System.out.print("Please input amount of days: "); // Default 20
    System.out.println();
    input = new Scanner(System.in);

    // Put a try-catch here later
    try{
      numDays = input.nextInt();
      if (numDays <=0) throw new Exception();
    }
    catch(Exception e){
      while(numDays <= 0){
        try{
          numDays = input.nextInt();
          if (numDays <=0) throw new Exception();
        }
        catch(Exception m){
           System.out.println("Incorrect input. Please input amount of days: ");
           input = new Scanner(System.in);
        }
      }
    }

    // System.out.println("Your days is " + numDays);
    System.out.print("Please input amount of initial stress. Max = 100"); // Default 0
    System.out.println(); 
    input = new Scanner(System.in);

    // Put a try-catch here later
    try{
      numStress = input.nextInt();
      if (numStress < 0) throw new Exception();
    }
    catch(Exception f){
      while(numStress < 0){
        try{
          numStress = input.nextInt();
          if(numStress < 0) throw new Exception();
        }
        catch(Exception n){
          System.out.println("Please enter a number >= 0: ");
          input = new Scanner(System.in);
        }
      }
    }

    // System.out.println("Your stress is " + numStress);
    

    System.out.print("Please input how often tests occur. Default: 7");
    System.out.println();
    input = new Scanner(System.in);

    // Put a try-catch here later
    try{
      numFreq = input.nextInt();
      if(numFreq < 0) throw new Exception();
    }
    catch(Exception a){
      while(numFreq < 0){
        try{
          numFreq = input.nextInt();
          if(numFreq < 0) throw new Exception();
        }
        catch(Exception n){
          System.out.println("Please enter a number >= 0: ");
          input = new Scanner(System.in);
        }
      }
    }

    input.close();

    // Main program
    do{
      if(numStress >= 100) break;
      days += 1;
      System.out.println("Day " + days + ". Your stress is " + numStress + ".");
      eventRoll = Math.random();

      // High Stress Mode
      if(numStress >= 70){
        System.out.println("You are in High Stress mode. Bad events are more likely to occur.");
        cscDays ++;

        // Check for consecutive days of High Stress
        if (cscDays >=2){
          System.out.println("CAUTION: You have been in High Stress for " + cscDays + "days. Good events are disabled.");
          System.out.println("The chance of a bad event has been increased by " + 5*cscDays + ".");
        }
        
        // Roll for event
        
        // Test takes the ENTIRE day if it's test day. Skip over choices if this happens


        // Present choices


        

      }

      // Low Stress
      else{
        // Roll for event

        // Test takes the ENTIRE day if it's test day. Skip over choices if this happens

        // Present choices

      }
    }
    while(days < numDays);

    if(numStress >= 100 && days == 0){
      System.out.println("You haven't even started the game and yet you already lost. You lose!");
    }
    else if(numStress >= 100 && days > 0 && days != numDays){
      System.out.println("You can't seem to find a way to manage your stress levels. You burn out, losing your motivation and your sense of time. By the time you recover, you have failed the year.");
    }
    else{
      System.out.println("Despite the turbulent year, you manage to keep your stress levels low enough to get through your exams. You pass your classes and welcome a well-deserved break. You win!");
    }
  }
}