package MTIS.PeoplePackage.People;
import mtisproject.MTIS.MTIS.ResourcePackage.Perks;
//People
public abstract class People
{
  public String name;
  public String username;
  private String paswd;
  public float perks;
  Perks upd = new Perks();
  //Constructor
  public People(String username,String paswd)
  {
    this.username=username;
    this.paswd=paswd;
  }
  //Functions
  public void setName(String name)
  {
    this.name=name;
  }
  public String getname()
  {
    return name;
  }
  public void setPaswd(String paswd)
  {
    this.paswd=paswd;
  }
  public void changePaswd(String paswd)
  {
    setPaswd(paswd);
  }
  public String getpaswd()
  {
    return paswd;
  }
  public void refillPerks(float earthmoney)
  {
    this.perks+=upd.toPerks(earthmoney);
  }
  public float perkBalance()
  {
    return perks;
  }
}