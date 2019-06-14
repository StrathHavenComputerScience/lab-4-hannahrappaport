public class Lab4
{
  public static void turnRight()
  {
    Robot.turnLeft();
    Robot.turnLeft();
    Robot.turnLeft();
  }
  
  public static void turnAround()
  {
    Robot.turnLeft();
    Robot.turnLeft();
  }

  public static void backUp()
  {
    turnAround();
    Robot.move();
    turnAround();
  }
  public static void onerow()
  { Robot.turnLeft();
      while(Robot.onDark() == false) {
          Robot.makeDark();
          Robot.move();}
      turnAround();
      while(Robot.frontIsClear() == true) {
          Robot.move(); }
          Robot.turnLeft();
    
      
    }
  public static void completeBars()
  {
    while(Robot.frontIsClear() == true) {
        onerow();
    Robot.move();}
        onerow();
  }
  
  public static void testCompleteBars1()
  {
    Robot.load("bars1.txt");
    Robot.setDelay(0.025);
    completeBars();
  }
  
  public static void testCompleteBars2()
  {
    Robot.load("bars2.txt");
    Robot.setDelay(0.025);
    completeBars();
  }
  
  public static void combinePiles()
  { while (Robot.onDark()) { 
      oneSquare();
      doitagain();
            } 
      
      if (Robot.frontIsClear()) {
            while (Robot.onDark()) {
                oneSquare();
                doitagain(); }}
      
        }
   
    
  
  public static void doitagain() 
  { turnAround();
      while (Robot.frontIsClear()) {
          Robot.move();}
          Robot.turnLeft();
          Robot.move();
          Robot.turnLeft();
          while (Robot.frontIsClear()) {
              Robot.move();}
               turnAround();
               while (Robot.onDark() == false && Robot.frontIsClear()) {Robot.move();}}
public static void oneSquare()
{ if (Robot.onDark() == true) {
      Robot.makeLight();
      while (Robot.frontIsClear()) {
          Robot.move(); }
          turnRight();
          Robot.move();
          turnRight();
          while (Robot.onDark() == false && Robot.frontIsClear() == true ) {
              Robot.move(); }
              if (Robot.onDark()) {backUp();}
              Robot.makeDark(); }
}
  public static void testCombinePiles1()
  {
    Robot.load("piles1.txt");
    Robot.setDelay(0.05);
    combinePiles();
  }
  
  public static void testCombinePiles2()
  {
    Robot.load("piles2.txt");
    Robot.setDelay(0.05);
    combinePiles();
  }
  
  public static void testCombinePiles1()
  {
    Robot.load("piles1.txt");
    Robot.setDelay(0.025);
    combinePiles();
  }
  
  public static void testCombinePiles2()
  {
    Robot.load("piles2.txt");
    Robot.setDelay(0.025);
    combinePiles();
  }
  
  public static void connectDots()
  {
    //insert instructions below

    
    
  }
  
  public static void testConnectDots1()
  {
    Robot.load("connect1.txt");
    Robot.setDelay(0.025);
    connectDots();
  }
  
  public static void testConnectDots2()
  {
    Robot.load("connect2.txt");
    Robot.setDelay(0.025);
    connectDots();
  }
}
