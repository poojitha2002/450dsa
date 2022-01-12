 public static void findMinMax(int []arr)
    {
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>max)
           max=arr[i];
           if(arr[i]<min)
           min=arr[i];
       }
       System.out.print("Minimum element: "+min+" Maximum element: "+max);
    }

  /* 
  Time Complexity: O(N)
  Space Complexity: O(1)
  */
