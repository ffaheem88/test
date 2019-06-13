/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import org.jsoup.Jsoup;
import java.io.IOException;


/**
 *
 * @author ffahe
 */
public class Scraper {
  
    public static void main(String[] args) throws IOException {
       
        org.jsoup.nodes.Document doc = Jsoup.connect("http://pacra.com.pk/reports/all_entity_corp_fi.php?segment_id=1").get();
        CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\ffahe\\Desktop\\Insurance.csv"));
        
       
        org.jsoup.select.Elements rows = doc.select("tr");
        
        for(org.jsoup.nodes.Element row :rows)
        {
            
            if(row.text().contains("Insurance")){
            org.jsoup.select.Elements columns = row.select("td");
            String[] cname = new String[1];
            cname[0] = row.text();
            writer.writeNext(cname);
            System.out.println(row.text());
            for (org.jsoup.nodes.Element column:columns)
            {
                 org.jsoup.select.Elements links = column.select("a[href]");
                 
                 if(links.attr("href").contains("client_history")){
                    String id = (links.attr("href").split("&")[0].split("=")[1]);
                    org.jsoup.nodes.Document docnew = Jsoup.connect("http://pacra.com.pk/reports/client_history.php?id="+id).get();
                     org.jsoup.select.Elements rowsnew = docnew.select("tr");
                     for(org.jsoup.nodes.Element rownew :rowsnew)
                        {
                             String[] newline = new String[10];
                             
                            org.jsoup.select.Elements columnsnew = rownew.select("td");
                            int x = 1;
                            for (org.jsoup.nodes.Element columnnew:columnsnew)
                         {
                             newline[x] = columnnew.text();
                             x++;
               
                            
                        }
                            writer.writeNext(newline);
                             
                 }
                    
                 //System.out.print(column.text()+" | ");

            }
            System.out.println();
            }
        }

    }
    }
    
    
     
       
}


