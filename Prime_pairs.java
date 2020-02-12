public class Prime_pairs
{
    // this method is to check if n is a prime number
    public static boolean is_prime (int n) {
        if (n < 2 ){
            return false;
        }
        for (int i = 2 ; i < n ; i++){
            
            if ( n % i == 0 ){
                return false;
            }
        }
        return true;
    }
    
    /* this method is to find a pairs of prime number that their sum is equal n 
     * n is even number and assuming it will always be */
    
    public static void find_pairs(int n){
        
        int odd_number = n-1 ;
        boolean status = true;
        
        while (status){
            if (is_prime(odd_number)){
                if (is_prime(n - odd_number)){
                    status = false ;
                }
                else{
                    odd_number = odd_number -2 ;
                }
            }else{
                odd_number = odd_number -2 ;
            }
        }
        System.out.println(n - odd_number + " "+ odd_number);
        
    }
	public static void main(String[] args) {
	    find_pairs(74);
	    find_pairs(1024);
	    find_pairs(24);
		  find_pairs(8);
		  find_pairs(9990);
	}
}
