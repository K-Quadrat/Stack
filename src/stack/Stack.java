package stack;
import java.io.*;
import java.util.Scanner;

public class Stack {
    private int pointer;
    private int[] stack;
    
    

    public Stack(int laenge){
        this.stack = new int [laenge];
        this.pointer = -1;
    }
    
    
    


    public static void main(String[] args) throws IOException {
        
        //try {}catch (Exception e);
        System.out.print("Bitte geben Sie die gewünschte Array Größe an: \n");
        Scanner in = new Scanner (System.in);
        int inputArrayLaenge = in.nextInt();
        Stack MeinStackObjekt = new Stack(inputArrayLaenge);
        
        int ende = 0;
        while(ende == 0){
        System.out.print("1 für push \n2 für pop \n3 für print \n9 für Ende \n");
        int inputMenue = in.nextInt();
  
        
        switch(inputMenue){
            
            case 1:
                System.out.println("Zahl eingeben! Wird auf den Stack geschrieben.\n");
                int inputPush = in.nextInt();
                MeinStackObjekt.push(inputPush);
                System.out.println("Push Operation ausgeführt.\n");
                break;
                
            case 2:
                int rueckgabeWertPop = MeinStackObjekt.pop();
                if (rueckgabeWertPop == -1){
                    System.out.println("Stack ist leer!");
                }
                else {
                System.out.println("Pop ausgeführt Pop = " + rueckgabeWertPop);
                }
                break;
                
            case 3:
                MeinStackObjekt.print();
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
        if (pointer < stack.length){
            pointer++;
            stack[pointer] = wert;
            System.out.println("In der Push Methode" +pointer +wert);
            return 0;           
        } else
            return -1;
    }
    
    public int pop(){
        int wert;
        if (pointer >= 0){
            wert = stack[pointer];
            stack[pointer] = 0;
            pointer--;
            return wert;
        } else
            return -1;
    }
    
    public void print(){
        for (int i=0; i<=pointer; i++){
            System.out.println(stack[i]);
        }
    }
    
  
    
    
}
