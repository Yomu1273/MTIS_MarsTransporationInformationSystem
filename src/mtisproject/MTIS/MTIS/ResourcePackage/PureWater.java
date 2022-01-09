package mtisproject.MTIS.MTIS.ResourcePackage;
import MTIS.ResourcePackage.Requirement.*;
import mtisproject.MTIS.MTIS.IncomePackage.*;
public class PureWater implements SupplyDemand
{
  int numOfPackages;
  IncomeDept inc = new IncomeDept();
  public PureWater(int numOfPackages)
  {
    this.numOfPackages=numOfPackages;
  }
  //Function
  public void necessary()
  {
    for(int i=0;i<numOfPackages;i++)
    {
      inc.Bank+=5f;
    }
  }
  public void urgent()
  {
    for(int i=0;i<numOfPackages;i++)
    {
      inc.Bank+=2f;
    }
  }
  public void outOfStock()
  {
    for(int i=0;i<numOfPackages;i++)
    {
      inc.Bank+=0f;
    }
  }
  public void transCostDisplay()
  {
    System.out.println("\n<======PURE WATER CHARGE======>");
    System.out.println("TYPE\tCOST(IN PERKS)");
    System.out.println("Necessary\t5");
    System.out.println("Urgent\t2");
    System.out.println("Out Of Stock\tFree");
  }
}