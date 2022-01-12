
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer>pq=new PriorityQueue<>((x, y) -> y - x);
        for(int i=0;i<k;i++)
        pq.add(arr[i]);
        for(int i=k;i<arr.length;i++)
        {
            if(arr[i]<pq.peek())
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.poll();
    } 
}


/*
Time Complexity: O(k)+(n-k)log k
Space Complexity: O(k)
*/
