package recursion;

public class practice {
    public static void main(String[] args) {

        int steps = count(14);
        System.out.println(steps);

    }

    static int count(int n){
      return steps(n,0);
    }

    static int steps(int n, int c){
        if(n==0)
            return c;
        if(n%2==0) {
            return steps(n/2, c + 1);
        } else {
            return steps(n-1,c+1);
        }

    }
}
