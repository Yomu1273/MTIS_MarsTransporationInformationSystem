package mtisproject.MTIS.MTIS.ResourcePackage;
import MTIS.ResourcePackage.Requirement.*;
import mtisproject.MTIS.MTIS.IncomePackage.*;
//Food
public class Food implements SupplyDemand
{
  int numOfPackages;
  IncomeDept inc = new IncomeDept();
  public Food(int numOfPackages)
  {
    this.numOfPackages=numOfPackages;
  }
  //Function
  public void necessary()
  {
    for(int i=0;i<numOfPackages;i++)
    {
      inc.Bank+=50f;
    }
  }
  public void urgent()
  {
    for(int i=0;i<numOfPackages;i++)
    {
      inc.Bank+=45f;
    }
  }
  public void outOfStock()
  {
    for(int i=0;i<numOfPackages;i++)
    {
      inc.Bank+=40f;
    }
  }
  public void transCostDisplay()
  {
    System.out.println("\n<======FOOD CHARGE======>");
    System.out.println("TYPE\tCOST(IN PERKS)");
    System.out.println("Necessary\t50");
    System.out.println("Urgent\t45");
    System.out.println("Out Of Stock\t40");
  }
}