/*
 * Luke Higginbotham
 * 899568628
 */
package avl;

import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*; 
import java.util.*;

public class AVL 
{
    public static void main(String[] args) throws Exception 
    {
        File input = new File("input.txt");
        BufferedReader scanner = new BufferedReader(new FileReader(input));
        String n = scanner.readLine();
        String str[] = new String[Integer.parseInt(n)];
        int instructions = 0;
        String string;
        while((string = scanner.readLine()) != null)
        {
            str[instructions] = string;
            instructions++;
        }
        
        int key = 0;
        int data = 0;
        for(int i = 0; i < str.length; i++)
        {
            String key1[] = str[i].split(" ");
            int p = Integer.parseInt(key1[1]);
            int k = Integer.parseInt(key1[2]);
            if(key1[0].equals("RM"))
            {
                key = p;
                data = k;
            }
        }
        int st[] = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < str.length; i++)
        {
            String key1[] = str[i].split(" ");
            int h = st.length;
            int p = Integer.parseInt(key1[1]);
            int k = Integer.parseInt(key1[2]);
            if(key1[0].equals("IN"))
            {
                if(p >= key && k <= data)
                {
                    System.out.println("(" + p + ", " + k + ")");
                    Arrays.fill(st, p);
                    Arrays.fill(st, k);
                    int rangeMinumum[] = new int[rangeMin(st,h)];
                    System.out.print("Range Minimum: \n" + rangeMin(st,h) + "\n\n");
                }
                
            }     
            
        }
    }
    public static int rangeMin(int[] a, int total)
    {
        int temp;  
            for (int i = 0; i < total; i++)   
                    {  
                        for (int j = i + 1; j < total; j++)   
                        {  
                            if (a[i] > a[j])   
                            {  
                                temp = a[i];  
                                a[i] = a[j];  
                                a[j] = temp;  
                            }  
                        }  
                    }  
                   return a[0];  
    }
}
