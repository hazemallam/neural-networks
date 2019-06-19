


import java.util.Arrays;
import java.util.Scanner;

public class Neural_Network {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 : ");
        double x1 = input.nextDouble();
        System.out.println("Enter x2 : ");
        double x2 = input.nextDouble();
        int x0 = +1;
        double x []= {x0,x1,x2};
        
        System.out.println("Enter b : ");
        double b = input.nextDouble();
        System.out.println("Enter w1 : ");
        double w1 = input.nextDouble();
        System.out.println("Enter w2 : ");
        double w2 = input.nextDouble();
        double w []={b,w1,w2};
        
        System.out.println("Enter M : ");
        double m = input.nextDouble();
        
        System.out.println("Enter Desired output : ");
        double d = input.nextDouble();
        
        int sgnClass1 = +1; 
        int sgnClass2 = -1;
        
        /*
        double d = +1.0;
        
                int x0 = +1;
                double x []= {x0,114.0,15.2}; 
                double b = -1230.0;
                double w []={b,-30.0,300.0};
                double m = 0.01;
          */    
        
        for (int i = 0; i <= 100; i++ ){
           double Y = 0; 
          for( int n=0; n<3; n++)
               Y += x[n] * w[n];
        
        if (Y > 0) {  // 0 threshold
            Y = +1;
        } else{
            Y = -1;
        }
        
        System.out.println( "Actual output is : "+Y +"   Desired output is : "+d);
            System.out.println("Weights : "+ Arrays.toString(w));
        
        if (d == Y ) {
            if (Y == sgnClass1) {
                System.out.println("This belongs to Class 1 ;");
            } else {
                System.out.println("This belongs to Class 2 ;");
            }
            break;       
        } else{
            for(int k =0; k < 3; k++){
             w[k] = w[k] + ((m *(d - Y)) * x[k]);
            }
            System.out.println("New Weights : " +Arrays.toString(w));
        }
        }
    }
}


    

