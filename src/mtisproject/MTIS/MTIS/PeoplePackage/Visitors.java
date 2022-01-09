package mtisproject.MTIS.MTIS.PeoplePackage;
import MTIS.PeoplePackage.People.*;
import mtisproject.MTIS.MTIS.IncomePackage.*;
import java.util.*;
//Visitors
public class Visitors extends People
{
  static private int numOfVisitors=0;
  public int stayDays;
  public int VIGSA;
  IncomeDept inc = new IncomeDept();
  public Visitors(String username,String paswd,int VIGSA)
  {
    super(username,paswd);
    this.numOfVisitors++;
    this.VIGSA=VIGSA;
  }
  //Functions
  public int numOfVisitors()
  {
      return this.numOfVisitors;
  }
  public int getVIGSA()
  {
      return VIGSA;
  }
  public void choosePack()
  {
    System.out.println("\n<=======================>");
    System.out.println("StayDay7: 7 Days for 5,000 Perks");
    System.out.println("StayDay10: 10 Days for 7,000 Perks");
    System.out.println("StayDay14: 14 Days for 16,000 Perks");
    System.out.println("StayDay20: 20 Days for 20,000 Perks");
    System.out.println("StayDay30: 30 Days for 30,000 Perks");
    System.out.println("<=======================>\n");
    System.out.println("Enter the StayDay number: ");
    Scanner inp = new Scanner(System.in);
    this.stayDays=inp.nextInt();
    if(this.stayDays==7)
    {
      super.perks-=5000f;
      inc.Bank+=5000f;
    }
    else if(this.stayDays==10)
    {
      super.perks-=7000f;
      inc.Bank+=7000f;
    }
    else if(this.stayDays==14)
    {
      super.perks-=16000f;
      inc.Bank+=16000f;
    }
    else if(this.stayDays==20)
    {
      super.perks-=20000f;
      inc.Bank+=20000f;
    }
    else if(this.stayDays==30)
    {
      super.perks-=30000f;
      inc.Bank+=30000f;
    }
    else
    {
      System.out.println("\nThis pack is not available.");
    }
  }
  public void checkOut()
  {
    this.numOfVisitors--;
    this.stayDays=0;
  }  
}