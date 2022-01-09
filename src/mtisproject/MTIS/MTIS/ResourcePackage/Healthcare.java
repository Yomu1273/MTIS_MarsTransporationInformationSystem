package mtisproject.MTIS.MTIS.ResourcePackage;
import MTIS.ResourcePackage.Requirement.*;
import mtisproject.MTIS.MTIS.IncomePackage.*;
public class Healthcare implements SupplyDemand
{
  int numOfPackages;
  IncomeDept inc = new IncomeDept();
  public Healthcare(int numOfPackages)
  {
    this.numOfPackages=numOfPackages;
  }
  //Function
  public void necessary()
  {
    for(int i=0;i<numOfPackages;i++)
    {
      inc.Bank+=20f;
    }
  }
  public void urgent()
  {
    for(int i=0;i<numOfPackages;i++)
    {
      inc.Bank+=10f;
    }
  }
  public void outOfStock()
  {
    for(int i=0;i<numOfPackages;i++)
    {
      inc.Bank+=5f;
    }
  }
  public void transCostDisplay()
  {
    System.out.println("\n<======MEDICINE CHARGE======>");
    System.out.println("TYPE\tCOST(IN PERKS)");
    System.out.println("Necessary\t20");
    System.out.println("Urgent\t10");
    System.out.println("Out Of Stock\t5");
  }
}