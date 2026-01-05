package DSARevision;

public class Maxmatrixsum {
    public long maxMatrixSum(int[][] matrix) {
        int i = 0;
        int j = 0;
        int count = 0;
        int n = matrix.length;
        int low = Integer.MAX_VALUE;
        long sum = 0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(matrix[i][j] < 0){
                    count++;                
                }
            low = Math.min(low,Math.abs(matrix[i][j]));
            sum+= Math.abs(matrix[i][j]);
            }
        }
        if(count % 2 == 0){
            return sum ;
        } 
        else{
            return (sum - 2*low) ;
        }
        
        
    }
    
}
