public class Search {

    int arr[][]=new int[n][n];

    public void searchEle(int[][]arr,int target){

        int row=0;
        int col=arr[0].length-1;

        while(row<arr.length && col>=0){
            if(arr[row][col] == target){
                System.out.println("element found");
            }
            else if(arr[row][col]>target){
                col--;
            }
            else{
                row++;
            }

        }
    }



}
