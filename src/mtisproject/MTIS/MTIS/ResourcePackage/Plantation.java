package mtisproject.MTIS.MTIS.ResourcePackage;
import mtisproject.MTIS.MTIS.IncomePackage.*;
public class Plantation
{
  float fund;
  IncomeDept inc = new IncomeDept();
  public void plantationFund()
  {
    this.fund=inc.forPlantation();
  }
  public void contribute(float prk)
  {
    inc.Bank+=prk;
  }
}