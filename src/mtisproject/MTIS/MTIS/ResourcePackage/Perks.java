package mtisproject.MTIS.MTIS.ResourcePackage;
public class Perks
{
  public float earthmoney;
  public float perks;
  public float toPerks(float earthmoney)
  {
    this.earthmoney=earthmoney;
    perks=0.1f*earthmoney;
    return perks;
  }
}