
import static java.lang.System.in;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class MainKuisLuasPermukaanBola1 {
    public static int main(Stringargs[]){
        double phi = 3.14;
        int r = (int) (Math.random()*10);
        int m = 4;
        double persegi = Math.pow(r, 2);    
   int luas = m * persegi * phi;
   return luas;
}    
}
