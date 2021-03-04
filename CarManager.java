package CarSales;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.io.*;
//import java.util.Scanner;  
class CarManager{
     
    
    public List<Car> giveCar(String path){
    
        List<Car> caravailable = new ArrayList<Car>();
        String line = "";
        
       
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine())!=null){
                String[] data = line.split(",");
                   
                   Car f = new Car(data[0], data[1],data[2],data[3]);
                   caravailable.add(f);                    
            } 
            }
        catch (FileNotFoundException fe) {
            System.out.println("Error1");
        }
        catch (IOException ioe){
            System.out.println("Error2");
        }
        
       return caravailable; 
    }


public static void main(String args[])//throws Exception
{
       CarManager cm = new CarManager();
       String path;
       path = "Car_Sales.csv";
       
            List<Car> getCar= new ArrayList<Car>();
            getCar = cm.giveCar(path);
            for(int i=0;i<getCar.size();i++)
            {
            System.out.print((getCar.get(i)).getCarName()+"\t");
            System.out.print((getCar.get(i)).getCarType()+"\t");
            System.out.print((getCar.get(i)).getPrice()+"\t");
            System.out.println((getCar.get(i)).getFuel());
            }
            
            
            /*Scanner sc = new Scanner(new File("Car_Sales.csv"));  
            sc.useDelimiter(",");   //sets the delimiter pattern  
            while (sc.hasNext())  //returns a boolean value  
            {  
                    System.out.print(sc.next());  //find and returns the next complete token from this scanner  
               }*/
        }
}