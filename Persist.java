import java.io.*;
public class Persist{
    public static void main(String args[]);
    java.util.scanner; 
    {
        Check c1= new Check(1001, 46.78, "Texas", "Ranger");
        Check c2= new Check(1002, 95.58, "Matrix", "Server");
        Check c3= new Check(1003, 653.58, "William", "Wallace");
        Check c4= new Check(1004, 6.57, "Sigma", "Phi Epsilon");
        Check c5= new Check(1005, 6.49, "New", "Order");
        try {
            FileOutputStream f = new FileOutputStream("ObjectKeeper.txt", true);
            ObjectOutputStream out = new ObjectOutputStream(f);
            
            out.writeObject(c1);
            out.flush();
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("Unable to serialize the object");
        }
        
    }
}