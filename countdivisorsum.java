package DSARevision;

public class countdivisorsum {

    public static int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int num : nums){
            int count = 0 ;
            int localsum=0;
            for(int i = 1; i*i <= num;i++){
                if(num % i == 0){
                    count++;
                    localsum = localsum + i;
                    if (i != num / i) {
                        count++;
                        localsum += num / i;
                    }
                }
            }
            if(count==4){
                sum= sum + localsum  ;
            }
        }
        return sum ;
        
    }
    public static void main(String[] args) {
        int[] res = {21,21};
        System.out.println(sumFourDivisors(res));
    }
}
