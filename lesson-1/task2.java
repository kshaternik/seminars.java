public class task2 {

    static int[] moveElementToEnd(int []array,int toMove)
        {
            int i = 0;
            int j = array.length - 1;
        
            while (i < j)
            {
                while (i < j && array[j] == toMove)
                    j--;
        
                if (array[i] == toMove)
                 
                swap(array, i, j);
    
                i++;
            }
            return array;
        }
        
        static int[] swap(int []arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            return arr;
        }
        
        public static void main(String[] args)
        {
            int []arr = { 3, 2, 2, 3 };
            int val = 3;
            int []ans = moveElementToEnd(arr, val);
        
            for(int i = 0; i < arr.length; i++)
            System.out.print(ans[i] + " ");
        }
    }