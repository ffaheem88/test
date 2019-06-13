/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Faisal
 */
public class UpdateCSV {
    public static void main(String[] args) {
        
        CSVReader reader = null;
        
        try {
            reader = new CSVReader(new FileReader("C:\\Users\\ffahe\\Desktop\\Brand13.csv"));
        } catch (FileNotFoundException ex) {
           System.out.println(ex.toString());
        }
     String [] nextLine;
     String[] newline = new String[10];
        try {
         CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\ffahe\\Desktop\\NewBin13.csv"));
            while ((nextLine = reader.readNext()) != null) {
               // nextLine[] is an array of values from the line
               System.out.println(nextLine[7]);
               
               String result="";
            String[] vals = nextLine[7].trim().split(",");
    for(int i = 0; i < vals.length; i++){
               int x =  Integer.parseInt(vals[i]);
               if(x>900){
                   result=result+"1";
               }else{
                   result=result+"0";
               }
        }
                newline[0] = "\\N";
                newline[1]=nextLine[0];
                newline[2]=nextLine[1];
                newline[3]=nextLine[2];
                newline[4]=nextLine[3];
                newline[5]=nextLine[4];
                newline[6]=nextLine[5];
                newline[7]=nextLine[6];
               newline[8] = nextLine[7];
               newline[9] = result;
               
               writer.writeNext(newline);
	
               
            }
             writer.close();  
        } catch (IOException ex) {
        }
       
      
    }
}
