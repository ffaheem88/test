/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author Faisal
 */
public class ConvertIR {
    
    
    public static void main(String[] args) {
    String ircode="8992,4475,638,1669,695,512,722,483,666,1643,723,484,665,1642,666,1643,664,542,666,1641,665,540,666,540,696,512,720,485,667,540,665,539,668,539,696,511,721,485,664,542,666,541,666,540,666,1642,666,1640,667,540,724,482,693,513,694,514,666,539,667,1641,694,513,665,1641,668,539,694,512,667,1640,696,511,666,19984,742,1555,668,537,666,540,666,540,693,514,667,540,665,541,722,484,664,543,668,537,665,541,724,483,666,540,666,541,666,1642,725,482,665,541,694,512,724,483,666,540,694,513,665,541,666,540,666,540,696,510,696,510,668,539,667,538,694,513,664,542,666,541,667,1640,694,";
    
    String result="";
    String[] vals = ircode.split(",");
    
    
    
    for(int i = 0; i < vals.length; i++){
               int x =  Integer.parseInt(vals[i]);
               if(x>900){
                   result=result+"1";
               }else{
                   result=result+"0";
               }
        }
    
    //result = "11111100010100010000000001000000000001000101000100000000010000000000000000000001000000000000000100000001000000000100000000010101010001011";
    //result = result.substring(0,39) + result.substring(72, 128)+result.substring(135,137);
    System.out.println(vals.length);
    System.out.println(result);
    
    }
}
