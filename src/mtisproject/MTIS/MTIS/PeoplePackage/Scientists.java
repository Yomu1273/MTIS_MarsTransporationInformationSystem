package mtisproject.MTIS.MTIS.PeoplePackage;
import MTIS.PeoplePackage.People.*;
import mtisproject.MTIS.MTIS.IncomePackage.*;
import java.util.*;
//Scientists
public class Scientists extends People
{
  static private int numOfScientists=0;
  int sciID;
  String stayRange;
  int stayTime;
  IncomeDept inc = new IncomeDept();
  public Scientists(String username,String paswd,int sciID,String stayRange,int stayTime)
  {
    super(username,paswd);
    this.numOfScientists++;
    this.sciID=sciID;
    this.stayRange=stayRange;
    this.stayTime=stayTime;
  }
  //Functions
  public void travelStayCredit()
  {
    System.out.println("\n<==========FOR SCIENTISTS===========>");
    System.out.println("1,000 Perks for each day");
    System.out.println("40,000 Perks for each month");
    System.out.println("500,000 Perks for 1 year");
    System.out.println("Addtional 550,000 Perks for every extra year");
    System.out.println("<=======================>\n");
    System.out.println("Enter the StayDay number: ");
    //Yearly, monthly and day wise Credit allocation
    //Year wise
    if(this.stayRange.equals("years")||this.stayRange.equals("year"))
    {
      super.perks+=500000f;
      inc.Bank-=500000f;
      for(int i=1;i<stayTime;i++)
      {
        super.perks+=550000f;
        inc.Bank-=550000f;
      }
    }
    else
    {
      //Month wise
      if(this.stayRange.equals("months")||this.stayRange.equals("month"))
      {
        //ifnotyear
        if(stayTime>=1&&stayTime<12)
        {
          for(int i=0;i<stayTime;i++)
          {
            super.perks+=40000f;
            inc.Bank-=40000f;
          }
        }
        //ifyear
        else if(stayTime>=12)
        {
          this.stayTime/=12;
          super.perks+=500000f;
          inc.Bank-=500000f;
          for(int i=1;i<stayTime;i++)
          {
            super.perks+=550000f;
            inc.Bank-=550000f;
          }
        }
      }
      //Day wise
      else if(this.stayRange.equals("days")||this.stayRange.equals("day"))
      {
        //ifnotmonth
        if(stayTime>=1&&stayTime<=31)
        {
          for(int i=0;i<stayTime;i++)
          {
            super.perks+=1000f;
            inc.Bank-=1000f;
          }
        }
        //ifmonth
        else
        {
          System.out.println("<--Please enter the stayRange in months-->");
        }
      }
    }
  }
  public void checkout()
  {
    this.numOfScientists--;
    this.stayTime=0;
  }
}