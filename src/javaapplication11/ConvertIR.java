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
    String ircode="9156,4437,664,535,689,1605,664,534,665,1629,664,1629,690,508,665,536,664,534,665,533,663,1631,664,536,693,506,636,563,692,508,663,534,661,537,661,537,663,535,663,535,662,536,663,534,663,1627,665,1628,637,562,664,533,664,534,665,534,663,535,661,1630,666,532,664,1631,660,535,662,536,664,1628,663,535,664,19915,659,535,663,535,663,537,691,507,667,532,664,537,663,533,664,535,664,535,663,536,691,507,665,534,663,535,664,1629,666,534,664,537,664,534,665,534,664,534,641,559,661,536,664,536,663,535,664,535,663,536,663,534,665,534,665,532,636,563,662,536,663,535,662,1629,663,";
    
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
    result = result.substring(0,39) + result.substring(72, 128)+result.substring(135,137);
    System.out.println(vals.length);
    System.out.println(result);
    
    }
}
