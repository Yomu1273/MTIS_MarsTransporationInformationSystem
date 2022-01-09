package mtisproject.MTIS.MTIS.ResourcePackage;
import mtisproject.MTIS.MTIS.IncomePackage.*;
import java.util.*;
//Fuel
public class Fuel
{
  String type;
  int solarPannels;
  int otherParts;
  float req;
  IncomeDept inc = new IncomeDept();
  Scanner inp = new Scanner(System.in);
  public Fuel(String type)
  {
    this.type=type;
  }
  public void forPeople()
  {
    if(this.type.equals("Solar pannels"))
    {
      this.solarPannels=inp.nextInt();
      for(int i=0;i<solarPannels;i++)
      {
        inc.Bank+=30f;
      }
    }
    else if(this.type.equals("Others")) 
    {
      this.otherParts=inp.nextInt();
      for(int i=0;i<otherParts;i++)
      {
        inc.Bank+=15f;
      } 
    }
  }
  public void fuelRequired(float req)
  {
    this.req=req;
    inc.Bank-=req;
  }
}