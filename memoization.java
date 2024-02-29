import java.util.*;

public class memoization{

    //memoization
    public static int countwaysMem(int n , int ways[]){
        if (n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        
        //already calculated
        if(ways[n] != -1){
            return ways[n];
        }

        ways[n] = countwaysMem(n-1, ways) + countwaysMem(n-2, ways);
        
        return ways[n];
    }

    public static void main(String args[]){
        int n = 5; // n->8
        int ways[] = new int [n+1];
        Arrays.fill(ways , -1);
        System.out.println(countwaysMem(n , ways));
    }
}