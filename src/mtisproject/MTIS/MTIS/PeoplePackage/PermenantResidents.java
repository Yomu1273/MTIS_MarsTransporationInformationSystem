package mtisproject.MTIS.MTIS.PeoplePackage;
import MTIS.PeoplePackage.People.*;
import mtisproject.MTIS.MTIS.IncomePackage.*;
//PermenantResidents
public class PermenantResidents extends People
{
  private static int numOfPermenantResidents=0;
  int ResID;
  int houseNo;
  IncomeDept inc = new IncomeDept();
  public PermenantResidents(String username,String paswd)
  {
    super(username,paswd);
    this.numOfPermenantResidents++;
    this.ResID=numOfPermenantResidents;
  }
  //Functions
  public int getResID()
  {
    return ResID;
  }
  public void updateHouseNo(int num)
  {
    this.houseNo=num;
  }
  public int getHouseNo()
  {
    return houseNo;
  }
  public int numOfPermenantResidents()
  {
    return numOfPermenantResidents;
  }
  public void transCost()
  {
    System.out.println("10,000 Perks");
  }
  public void payTransCost()
  {
    if(super.perks<10000)
    {
      System.out.println("Not enough Perks");
    }
    else
    {
      super.perks-=10000f;
      inc.Bank+=10000f;
    }
  }
  public void terminate()
  {
    this.numOfPermenantResidents--;
    this.username=" ";
    this.houseNo=0;
    this.ResID=0;
  }
}