public class RecursiveOne {
    public static void main(String[] args) {
        intRecTest(2);
    }

    //2,12
    //1,123
    //0 123
    public static void integerRecursion(int n, int k){
        if (n==0){
            System.out.println(k);
            return;
        }
        int a = k%10;
        //3
        for (int i = a+1; i <= 9; i++){
            integerRecursion(n-1,k*10+i);
        }
    }

    public static void intRecTest(int n){
      integerRecursion(n,0);
    }

}
