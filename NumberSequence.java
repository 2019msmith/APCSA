public class NumberSequence{
    public int[] cubicSequence(int n){
        int[] numArray = new int[n];
        for (int i=1; i<=n; i++){
            numArray[i-1]=i*i*i;
        }    
        return numArray;
    }
    public int[] triangularSequence(int n){
        int[] numArray = new int[n];
        int t = 0;
        for (int i=1; i<=n; i++){
            numArray[i-1]= i + t;
            t = t + i;
        }
        return numArray;
    }
    public int[] squareSequence(int n){
        int[] numArray = new int[n];
        for (int i=1; i<=n; i++){
            numArray[i-1]=i*i;
        }    
        return numArray;
    }
    //didn't complete fibonacci sequence portion
}