public class SingleElement {

    public static void solve(int arr[]){

        for(int i=0;i<arr.length;i+=2){
            if(arr[i]!=arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }


    public static void solve2(int []arr){
        int xor=0;

        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        System.out.println(xor);

    }
}

