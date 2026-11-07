public class Pattern2 {
    public static void rec(){
        int n=5;
        int m=(n*2)-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
//                int num=Math.max(Math.abs(n-1-i),Math.abs(n-1-j));
                int num=n-Math.max(Math.abs(n-1-i),Math.abs(n-1-j));
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

}
