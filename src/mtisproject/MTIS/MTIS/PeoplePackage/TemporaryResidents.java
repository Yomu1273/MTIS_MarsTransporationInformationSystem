package mtisproject.MTIS.MTIS.PeoplePackage;
import MTIS.PeoplePackage.People.*;
import mtisproject.MTIS.MTIS.IncomePackage.*;
//TemporaryResidents
public class TemporaryResidents extends People 
{
  private static int numOfTemporaryResidents = 0;
  int tempResID;
  int houseNo;
  IncomeDept inc = new IncomeDept();
  public TemporaryResidents(String username, String paswd) 
  {
    super(username, paswd);
    this.numOfTemporaryResidents++;
    this.tempResID = numOfTemporaryResidents;
  }
  //Functions
  public int gettempResID() 
  {
    return tempResID;
  }
  public void updateHouseNo(int num) 
  {
    this.houseNo = num;
  }
  public int getHouseNo() 
  {
    return houseNo;
  }
  public int numOfTemporaryResidents() 
  {
    return numOfTemporaryResidents;
  }
  public void transCost() 
  {
    System.out.println("10,000 Perks");
  }
  public void payTransCost() 
  {
    if (super.perks < 20000) 
    {
      System.out.println("Not enough Perks");
    } 
    else 
    {
      super.perks -= 20000f;
      inc.Bank+=20000f;
    }
  }
  public void leaveMars() 
  {
    this.numOfTemporaryResidents--;
    this.username=" ";
    this.houseNo = 0;
    this.tempResID = 0;
  }
}