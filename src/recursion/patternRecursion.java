package recursion;

public class patternRecursion {
    public static void main(String[] args) {
        p(5,0);
    }

    static void p(int r,int c){
        if(r==0 && c==0)
            return;
        if(r>c) {
            System.out.print("*" + " ");
            p(r, c + 1);
        } else {
            System.out.println();
            p(r - 1, 0);
        }
    }
}
