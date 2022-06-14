import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Main {
  public static void main(String str[]) throws IOException {

    System.out.println("1) Array Numerical Selection Sort:");
    
    int[] elements = { 21, 17, 60, 20, 56, 12 };

    System.out.println(" ");
    System.out.println("Printing Unsorted Array");
    System.out.println(" ");

    for (int num : elements) {
      System.out.print(num + " ");
        }

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Printing Each Pass Through the Selection Sort");
    
   // Selection Sort
    
    for (int j = 0; j < elements.length - 1; j++) {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++) {
        if (elements[k] < elements[minIndex]) {
          minIndex = k;
        }
      }
      
      System.out.println(" ");
      
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;

      for (int num : elements) {
      System.out.print(num + " ");
        }
    }

    System.out.println(" ");
    for (int num : elements) {
      System.out.print(num + " ");
    }

      System.out.println(" ");
      System.out.println(" ");
      System.out.println("-----------------------------------------");
      System.out.println(" ");

    
    // Insertion Sort

    System.out.println("Array Numerical Insertion Sort:");
    int[] elements2 = { 21, 17, 60, 20, 56, 12 };
    System.out.println(" ");
    System.out.println("Printing Unsorted Array");
    System.out.println(" ");

    for (int num : elements) {
      System.out.print(num + " ");
        }

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Printing Each Pass Through the Insertion Sort");
    
    for (int j = 1; j < elements2.length; j++) {
      
      System.out.println(" ");
      
      int temp = elements2[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements2[possibleIndex - 1]) {
        elements2[possibleIndex] = elements2[possibleIndex - 1];
        possibleIndex--;

      }
      elements2[possibleIndex] = temp;

      for (int num : elements2) {
      System.out.print(num + " ");
        }
    }
    
    System.out.println(" ");
    for (int num : elements2) {
    System.out.print(num + " ");
      }

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("-----------------------------------------");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("2) Array Alphabetical Selection Sort:");

    String[] elements3 = { "Link", "Revali", "Mipha", "Daruk", "Urbosa"};

    System.out.println(" ");
    System.out.println("Printing Unsorted Array");
    System.out.println(" ");

    for (String x : elements3) {
      System.out.print(x + " ");
        }

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Printing Each Pass Through the Selection Sort");  

      String temp = "" ; 
  for(int i = 0 ; i < elements3.length ; i ++)
      {
        for(int j = i + 1 ; j < elements3.length ; j ++)
          {
            if(elements3[i].compareTo(elements3[j]) > 0) // did you mean to say that we need to use the compareTo method instead of the equals method?
            {
              temp = elements3[i]; 
              elements3[i] = elements3[j] ; 
              elements3[j] = temp ; 

              for(String x : elements3)
                {
                  System.out.print(x + " "); 
                }
              System.out.println();
            }
          }
      }

      System.out.println(" ");
      System.out.println(" ");
      System.out.println("-----------------------------------------");
      System.out.println(" ");
    
    System.out.println("Array Alphabetical Insertion Sort:"); // to be honest, i didn't know how to incorporate this code into the insertion sort, so i just copy and pasted it. 

    String[] elements4 = { "Yeji", "Lia", "Ryujin", "Chaeryeong", "Yuna"};

    System.out.println(" ");
    System.out.println("Printing Unsorted Array");
    System.out.println(" ");

    for (String x : elements4) {
      System.out.print(x + " ");
        }

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Printing Each Pass Through the Insertion Sort");  

      String temp1 = "" ; 
  for(int i = 0 ; i < elements4.length ; i ++)
      {
        for(int j = i + 1 ; j < elements4.length ; j ++)
          {
            if(elements4[i].compareTo(elements4[j]) > 0) 
            {
              temp1 = elements4[i]; 
              elements4[i] = elements4[j] ; 
              elements4[j] = temp1 ; 

              for(String x : elements4)
                {
                  System.out.print(x + " "); 
                }
              System.out.println();
            }
          }
      }

      System.out.println(" ");
      System.out.println(" ");
      System.out.println("-----------------------------------------");
      System.out.println(" ");
    
    System.out.println("3) ArrayList Numerical Selection Sort:");
    
    ArrayList<Integer> elements5 = new ArrayList<Integer>(); 
    elements5.add(355); 
    elements5.add(234); 
    elements5.add(122); 
    elements5.add(577); 
    elements5.add(339); 
    elements5.add(546); 

    System.out.println(" ");
    System.out.println("Printing Unsorted ArrayList");
    System.out.println(" ");

    for (int num : elements5) {
      System.out.print(num + " ");
        }

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Printing Each Pass Through the Selection Sort");
    
   // Selection Sort
    
    for (int j = 0; j < elements5.size() - 1; j++) {
      int minIndex = j;
      for (int k = j + 1; k < elements5.size(); k++) {
        if (elements5.get(k) < elements5.get(minIndex)) {
          minIndex = k;
        }
      }
      
      System.out.println(" ");
      
      int temp2 = elements5.get(j);
      elements5.set(j, elements5.get(minIndex));
      elements5.set(minIndex, temp2);

      
      for (int num : elements5) {
      System.out.print(num + " ");
        }
    }

    System.out.println(" ");
    for (int num : elements5) {
      System.out.print(num + " ");
    }

      System.out.println(" ");
      System.out.println(" ");
      System.out.println("-----------------------------------------");
      System.out.println(" ");
    
    System.out.println("ArrayList Numerical Insertion Sort:");
    ArrayList<Integer> elements6 = new ArrayList<Integer>(); 
    elements6.add(355); 
    elements6.add(234); 
    elements6.add(122); 
    elements6.add(577); 
    elements6.add(339); 
    elements6.add(546);
    
    System.out.println(" ");
    System.out.println("Printing Unsorted ArrayList");
    System.out.println(" ");

    for (int num : elements6) {
      System.out.print(num + " ");
        }

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Printing Each Pass Through the Insertion Sort");
    
    for (int j = 1; j < elements6.size(); j++) {
      
      System.out.println(" ");
      
      int temp3 = elements6.get(j);
      int possibleIndex = j;
      while (possibleIndex > 0 && temp3 < elements6.get(possibleIndex - 1))
        {
        elements6.set(possibleIndex , elements6.get(possibleIndex - 1));
        possibleIndex--;
      }
      
      elements6.set(possibleIndex, temp3);

      for (int num : elements6) {
      System.out.print(num + " ");
        }
    }
    
    System.out.println(" ");
    for (int num : elements6) {
    System.out.print(num + " ");
      }

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("-----------------------------------------");
    System.out.println(" ");
    System.out.println(" ");
    
    System.out.println("ArrayList Alphabetical Selection Sort:");

    ArrayList<String> elements7 = new ArrayList<String>();
    
    elements7.add("Loona"); 
    elements7.add("Itzy"); 
    elements7.add("Kingdom"); 
    elements7.add("ONF"); 
    elements7.add("TXT"); 
    elements7.add("Iz*one"); 

    System.out.println(" ");
    System.out.println("Printing Unsorted ArrayList");
    System.out.println(" ");

    for (String x : elements7) {
      System.out.print(x + " ");
        }

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Printing Each Pass Through the Selection Sort");  

      String temp4 = "" ; 
  for(int i = 0 ; i < elements7.size() ; i ++)
      {
        for(int j = i + 1 ; j < elements7.size() ; j ++)
          {
            if(elements7.get(i).compareTo(elements7.get(j)) > 0) 
            {
            
      temp4 = elements7.get(i);
      elements7.set(i, elements7.get(j));
      elements7.set(j, temp4);
              
              for(String x : elements7)
                {
                  System.out.print(x + " "); 
                }
              System.out.println();
            }
          }
      }

      System.out.println(" ");
      System.out.println(" ");
      System.out.println("-----------------------------------------");
      System.out.println(" ");
    
    System.out.println("ArrayList Alphabetical Insertion Sort:");

    ArrayList<String> elements8 = new ArrayList<String>();
    
    elements8.add("Gowon"); 
    elements8.add("Chiwoo"); 
    elements8.add("Soobin"); 
    elements8.add("Kanghyun"); 
    elements8.add("Dahyun"); 
    elements8.add("Yukika"); 

    System.out.println(" ");
    System.out.println("Printing Unsorted ArrayList");
    System.out.println(" ");

    for (String x : elements8) {
      System.out.print(x + " ");
        }

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Printing Each Pass Through the Selection Sort");  

      String temp5 = "" ; 
  for(int i = 0 ; i < elements8.size() ; i ++)
      {
        for(int j = i + 1 ; j < elements8.size() ; j ++)
          {
            if(elements8.get(i).compareTo(elements8.get(j)) > 0) 
            {
            
      temp5 = elements8.get(i);
      elements8.set(i, elements8.get(j));
      elements8.set(j, temp5);
              
              for(String x : elements8)
                {
                  System.out.print(x + " "); 
                }
              System.out.println();
            }
          }
      }

      System.out.println(" ");
      System.out.println(" ");
      System.out.println("-----------------------------------------");
      System.out.println(" ");
    
    
    
}
}

