public class RecursiveTwo {
    public static void main(String[] args) {
        System.out.println(summationRecursion(3,2)); // 1+3+6=10
        System.out.println(summationRecursion(3,1)); // 1+2+3=6
        System.out.println(summationRecursion(3,0)); // 3 (n)
        System.out.println(summationRecursion(0,3)); // 0
    }

    public static int summationRecursion(int n, int m){
        if (m==0){
            return n;
        }
        if (n==0){
            return 0;
        }
        //System.out.println(summationRecursion(n-1,m));
        return summationRecursion(n-1,m)+summationRecursion(n,m-1);
    }

}
