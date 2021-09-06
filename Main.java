class Main {
  public static void main(String[] args) {
    //initialize vars
    int totalMM;
    int sumMM;
    int mmBlue;
    int mmBrown;
    int mmGreen;
    int mmOrange;
    int mmRed;
    int mmYellow;
    System.out.println("M&M Color Counts");
    totalMM = 55*11;
    //Calculations
    mmBlue = Math.round(totalMM * .24f);
    mmBrown = Math.round(totalMM * .10f);
    mmGreen = Math.round(totalMM * .06f);
    mmOrange = Math.round(totalMM * .28f);
    mmRed = Math.round(totalMM * .13f);
    mmYellow = Math.round(totalMM * .19f);
    sumMM = mmBlue + mmBrown + mmGreen + mmOrange + mmRed + mmYellow;
    //Print Calculations
    System.out.println("Blue: " + mmBlue);
    System.out.println("Brown: " + mmBrown);
    System.out.println("Green: " + mmGreen);
    System.out.println("Orange: " + mmOrange);
    System.out.println("Red: " + mmRed);
    System.out.println("Yellow: " + mmYellow);
    System.out.println("Sum: " + sumMM);
    //If Statements
    if(mmBlue > mmBrown && mmRed > mmOrange)
    System.out.println("Blue under Brown and Red over Orange");
    if (mmBrown >= mmGreen)
    System.out.println("Brown is greater than or equal to Green");
    if (sumMM == totalMM)
    System.out.println("Numbers match");
  }
}