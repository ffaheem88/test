/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Faisal
 */
public class InttoImage {
    public static void main(String[] args) {
        String code = "4588,4268,704,1456,700,376,696,1460,684,1476,668,408,660,420,648,1508,644,436,640,436,640,1516,644,436,640,440,636,1520,636,1520,636,444,636,1520,636,440,632,448,628,1528,632,1544,604,1556,600,1556,608,1548,596,1564,596,1560,592,1564,592,488,588,488,588,492,588,492,584,492,588,492,584,496,580,496,580,500,576,500,572,508,572,508,568,508,568,512,564,1592,564,1592,568,1588,564,1592,564,1592,568,1588,568,1592,564,1592,564,5196,4424,4412,560,1596,560,540,540,1616,540,1616,540,540,536,540,540,1620,536,540,540,540,536,1620,540,540,536,540,540,1616,540,1616,540,540,540,1616,540,540,536,540,540,1616,540,1620,536,1620,536,1620,540,1616,540,1616,540,1616,544,1612,544,536,544,536,540,536,544,536,540,536,540,540,540,540,540,536,540,540,536,540,540,540,536,544,536,540,540,540,536,1620,540,1616,536,1620,540,1616,540,1616,544,1612,540,1616,548,1612,540,";
       System.out.println(code);
        String[] vals = code.trim().split(",");
       System.out.println(vals.length);
        String update = "";
        for(int i = 0; i < 100; i++){
        update = update + vals[i] +",";
               
        }
        
        
System.out.println(update);
     String[] vals2 = update.trim().split(",");
   System.out.println(vals2.length);
    
    }
}
