package mtisproject.MTIS.MTIS.PeoplePackage;
import MTIS.PeoplePackage.People.*;
import mtisproject.MTIS.MTIS.IncomePackage.*;
import java.util.*;
//Workers
public class Workers extends People
{
  static private int numOfWorkers=0;
  int workerID;
  String stayRange;
  int stayTime;
  IncomeDept inc = new IncomeDept();
  public Workers(String username,String paswd,String stayRange,int stayTime)
  {
    super(username,paswd);
    this.numOfWorkers++;
    this.workerID=numOfWorkers;
    this.stayRange=stayRange;
    this.stayTime=stayTime;
  }
  //Functions
  public int getworkerID()
  {
      return workerID;
  }
  public void choosePack()
  {
    /*System.out.println("\n<============FOR WORKERS==============>");
    System.out.println("5000 Perks for each day");
    System.out.println("20,000 Perks for each month");
    System.out.println("250,000 Perks for 1 year");
    System.out.println("Addtional 275,000 Perks for every extra year");
    System.out.println("<=======================>\n");
    System.out.println("Enter the StayDay number: ");*/
    //Yearly, monthly and day wise Credit allocation
    //Year wise
    if(this.stayRange.equals("years")||this.stayRange.equals("year"))
    {
      super.perks+=250000f;
      inc.Bank-=250000f;
      for(int i=1;i<stayTime;i++)
      {
        super.perks+=275000f;
        inc.Bank-=275000f;
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
            super.perks+=20000f;
            inc.Bank-=20000f;
          }
        }
        //ifyear
        else if(stayTime>=12)
        {
          this.stayTime/=12;
          super.perks+=250000f;
          for(int i=1;i<stayTime;i++)
          {
            super.perks+=275000f;
            inc.Bank-=275000f;
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
            super.perks+=500f;
            inc.Bank-=500f;
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
  public int numOfWorkers()
  {
      return this.numOfWorkers;
  }
  public void checkOut()
  {
    this.numOfWorkers--;
    this.stayTime=0;
  }  
}