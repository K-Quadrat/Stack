package stack;
import java.io.*;
import java.util.Scanner;

public class Stack {
    int pointer;
    int stack[];
    
    

    public Stack(int laenge){
        stack = new int [laenge];
        pointer = -1;
    }
    


    public static void main(String[] args) throws IOException {
        
        //try {}catch (Exception e);
        System.out.print("Bitte geben Sie die gewünschte Array Größe an: \n");
        Scanner in = new Scanner (System.in);
        int inputA = in.nextInt();
        Stack StackObjekt = new Stack(inputA);
        
        int ende = 0;
        while(ende == 0){
        System.out.print("1 für push \n2 für pop \n3 für print \n9 für Ende \n");
        int inputB = in.nextInt();
  
        
        switch(inputB){
            
            case 1:
                System.out.println("Zahl eingeben! Wird auf den Stack geschrieben.\n");
                int inputC = in.nextInt();
                StackObjekt.push(inputC);
                System.out.println("Speichern Erfolgreich.\n");
                break;
                
            case 2:
                StackObjekt.pop();
                System.out.println("Pop");
                break;
                
            case 3:
                StackObjekt.print();
                System.out.println("Print");
                break;
                
            case 9:
                ende = 1;
                break;
                
            default:
                System.out.println("Taste ohne Funktion! \n");
        }
        }
        
        
        
    }
    
    
    public int push(int wert){
        if (pointer < 50){
            stack[pointer+1] = wert;
            pointer = pointer+1;
            return 0;           
        } else
            return -1;
    }
    
    public int pop(){
        int wert;
        if (pointer >= 0){
            wert = stack[pointer];
            stack[pointer] = 0;
            pointer = pointer-1;
            return wert;
        } else
            return -1;
    }
    
    public void print(){
        for (int i=0; i>=pointer; i++){
            System.out.println("stack[i]");
        }
    }
    
  
    
    
}
