package mtisproject.MTIS;
import java.io.*;
import java.util.*;
import mtisproject.MTIS.MTIS.PeoplePackage.*;
import java.util.*;
public class MTISforum
{
  public static PermenantResidents[] arr1=new PermenantResidents[1000];
  public static TemporaryResidents[] arr2=new TemporaryResidents[1000];
  public static Visitors[] arr3=new Visitors[1000];
  public static Workers[] arr4=new Workers[1000];
  public static int i1=0,i2=0,i3=0,i4=0;
  public static Stack<PermenantResidents> s1= new Stack<PermenantResidents>();
  public static Stack<TemporaryResidents> s2= new Stack<TemporaryResidents>();
  public static Stack<Visitors> s3= new Stack<Visitors>();
  public static Stack<Workers> s4= new Stack<Workers>();
  public static LinkedList<String> p1= new LinkedList<String>();
  public static LinkedList<String> p2= new LinkedList<String>();
  public static LinkedList<String> p3= new LinkedList<String>();
  public static LinkedList<String> p4= new LinkedList<String>();
  public static void main(String[] args)
  {
    File f = new File("Database");
    try {
        FileWriter fwrite = new FileWriter("Database");  
        FileOutputStream fileOut = new FileOutputStream("Database");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        for(PermenantResidents x : arr1){
            objectOut.writeObject(x);
        }
        for(TemporaryResidents x : arr2){
            objectOut.writeObject(x);
        }
        for(Visitors x : arr3){
            objectOut.writeObject(x);
        }
        for(Workers x : arr4){
            objectOut.writeObject(x);
        }
        for(String x: p1){
            fwrite.write(x);
        }
        for(String x: p2){
            fwrite.write(x);
        }
        for(String x: p3){
            fwrite.write(x);
        }
        for(String x: p4){
            fwrite.write(x);
        }
        objectOut.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
  }
}