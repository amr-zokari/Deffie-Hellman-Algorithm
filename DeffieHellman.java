import java.util.*;
public class DeffieHellman {
    public static void main(String[] args){
        
        Scanner k = new Scanner(System.in);
        
        System.out.println();
        
        System.out.print("Please enter the value for p: ");
        int valueOfp = k.nextInt();
       
        
        System.out.print("Please enter the value for g: ");
        int valueOfg = k.nextInt();
        
        System.out.println();
        
        DiffieHellman(valueOfp, valueOfg);
        
        
        
        
    }
    
    public static void DiffieHellman(int p, int g){
        Random random = new Random();
        
        
        int SA = random.nextInt(19)+1;
        int SB = random.nextInt(19)+1;
        
        System.out.println("The value of SA is: " + SA);
        System.out.println("The value of SB is: " + SB);
        System.out.println();
        
        
        
        /***********  Compute TA  ************/
        int TA = 1;
        int temp = 0;
        
        //use this loop to do the calculations of the mod and display it as it does it
        for (int i = 1; i <= SA; i++){
            temp = g % p;
            TA = (TA * temp) % p;
            System.out.println(g + "^" + i + " mod " + p + " = " + TA % p);
            
        }
        
        
        //display the final result
        TA = TA % p;
        System.out.println("TA is " + TA);
        System.out.println();
        
        
        
        
        
        /***********  Compute TB  ************/
        int TB = 1;
        int temp2 = 0;
        
        //use this loop to do the calculations of the mod and display it as it does it
        for (int j = 1; j <= SB; j++){
            temp2 = g % p;
            TB = (TB * temp2) % p;
            System.out.println(g + "^" + j + " mod " + p + " = " + TB % p);
            
        }
        
        
        //display the final result
        TB = TB % p;
        System.out.println("TB is " + TB);
        System.out.println();
        
        
        /***********  Compute first key  ************/        
        int key1 = 1;
        int temp3 = 0;
        
        //use this loop to do the calculations of the mod and display it as it does it
        for (int x = 1; x <= SA; x++){
            temp3 = TB % p;
            key1 = (key1 * temp3) % p;
            System.out.println(TB + "^" + x + " mod " + p + " = " + key1 % p);
            
        }
        
        
        //display the final result
        key1 = key1 % p;
        System.out.println("Key is " + key1);
        System.out.println();
        
        /***********  Compute second key  ************/
        int key2 = 1;
        int temp4 = 0;
        
        //use this loop to do the calculations of the mod and display it as it does it
        for (int y = 1; y <= SB; y++){
            temp4 = TA % p;
            key2 = (key2 * temp4) % p;
            System.out.println(TA + "^" + y + " mod " + p + " = " + key2 % p);
            
        }
        
        
        //display the final result
        key2 = key2 % p;
        System.out.println("Key is " + key2);
        System.out.println();
        
        System.out.println();
        
        
    }
}