public class HelloWorldAgain{
    public static void main(String args[]){
        NumberSequence ns = new NumberSequence();
        int[] returnedArray1 = ns.squareSequence(4);
        int[] returnedArray2 = ns.cubicSequence(4);
        int[] returnedArray3 = ns.triangularSequence(4);
        for (int i=0; i<returnedArray1.length; i++){
            System.out.println(returnedArray1[i]);
        }
        for (int i=0; i<returnedArray2.length; i++){
            System.out.println(returnedArray2[i]);
        }
        for (int i=0; i<returnedArray3.length; i++){
            System.out.println(returnedArray3[i]);
        }
    }
}