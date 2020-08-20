class BuddyPairs {
  
  public static long properSum(long x) {
    long sum = 1;
    for(long i = 2; i <= Math.sqrt(x); i++) {
      if(x%i == 0) {
        sum += i;
        if(i != x/i)
          sum += x/i;
      }
      
    }
    return sum;
  }
 
  
    public static String buddy(long start, long limit) {
      long properSumOfn; 
      
      for(long i = start; i <= limit; i++) {
        properSumOfn = properSum(i);
          if(properSumOfn - 1 > i) {
            if(properSum(properSumOfn - 1) -1 == i) {
              properSumOfn--;
              return "(" + i + " " + properSumOfn + ")";
            }
          }
        }

      return "Nothing";
    }
}