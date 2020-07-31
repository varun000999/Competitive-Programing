class Solution {
    public void transpose(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int temp=0;
                temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public void inverse(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<(arr[0].length/2);j++)
            {
                int temp=0;
                temp=arr[i][j];
                arr[i][j]=arr[i][arr[0].length-(j+1)];
                arr[i][arr[0].length-(j+1)]=temp;
            }
        }
    }
    public void rotate(int[][] matrix) {
         transpose(matrix);
         inverse(matrix);
        
    }
}