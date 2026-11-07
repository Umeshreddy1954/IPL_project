public class Pattern3 {
    public static void patter(){
        int n=4;
        int maxVal=61;
        int row=maxVal/n+1;
        int[][] arr=new int[row][n];
        int tmp=maxVal;
        for(int i=0;i<row;i++){
            if(i%2==0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j]=tmp--;
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    arr[i][j]=tmp--;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]>0){
                    if(arr[i][j]>9) {
                        System.out.print(arr[i][j] + " ");
                    }
                    else{
                        System.out.print("0"+arr[i][j]+" ");
                    }
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
