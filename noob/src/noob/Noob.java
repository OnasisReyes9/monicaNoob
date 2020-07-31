/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noob;

/**
 *
 * @author Onasis Reyes
 */
public class Noob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        x(59);
        
        
    }
    
    public static void x (int n){
        String x = Integer.toString(n);
        String last = x.substring(x.length());
        int c = Integer.parseInt(last);
        switch (c){
            case 2:
            case 4:
            case 6:
            case 8:
            case 0:
                System.out.println("Es par");
                break;
            default:
                System.out.println("Es impar");
                
        }
    }
    
}
