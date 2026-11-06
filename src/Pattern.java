public class Pattern {
    public static void pat(){
        int n=3;
        int max_value=58;
        int x=1;
        int m=(max_value/n)+1;
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    arr[i][j]=x;
//                    System.out.print(x+" ");
                    x++;
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    arr[i][j]=x;
//                    System.out.print(x+" ");
                    x++;
                }
            }
//            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (arr[j][i] <= max_value) {
                    System.out.print(arr[j][i]+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
