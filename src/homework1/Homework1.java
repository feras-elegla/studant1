/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Studant st1=new Itstudant(120181543,"feras", " development ",95, 80, 90);
        Studant st2=new Itstudant(120181712,"mohamed", "computer science",90, 70, 85);
        Studant st3=new Itstudant(2201418,"Hazem ", " computer science",75, 0, 75);
        Studant st4=new Artstudant(120167879,"fares", "Multimedea",67, 50, 90);
        Studant st5=new Artstudant(2201714,"foad", "web developer",99, 70, 95);
          
        Studant studantarray[]={st1,st2,st3,st4,st5};
         Studant studantarraytemp[]=new Studant[studantarray.length];
           System.out.println("the maeke befor sorted\n");
          for (int i = 0; i < studantarray.length; i++) {
            System.out.println("grate "+(i+1)+" : "+studantarray[i].grate());
            
        }
          System.out.println("\n");
           Studant temp;
          for (int j = 0; j < studantarray.length; j++) {
             for (int i = 0; i <studantarray.length-1; i++) {
                
            if (studantarray[i].grate()>studantarray[i+1].grate()) {
                temp= studantarray[i];
                studantarray[i]=studantarray[i+1];
                studantarray[i+1]=temp;
            }
           
        }
        }
       
        
        System.out.println("the maeke after sorted\n");
        for (int i = 0; i < studantarray.length; i++) {
            System.out.println("grate "+(i+1)+" : "+studantarray[i].grate());
            
        }
          File file = new File("data.txt");
        PrintWriter output = new PrintWriter(file);
        for (int i = 0; i < studantarray.length; i++) {
        output.print(" name "+studantarray[i].getName());
        output.print(" id "+studantarray[i].getId());
        output.print(" major "+studantarray[i].getMajor());
        output.print(" grad "+studantarray[i].grate()+"\n");
        }
          output.close();
        
        
        Scanner input = new Scanner(file);
        while(input.hasNext())
            
        System.out.print(input.nextLine()+"\n");
        System.out.println("");
        
        input.close();

        
    }
    
}
