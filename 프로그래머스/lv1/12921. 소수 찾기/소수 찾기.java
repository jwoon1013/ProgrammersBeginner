class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n+1];
            prime[0] = true;
            prime[1] = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if ( prime[i] == true){ continue;}
            for (int j = i * i ; j < prime.length; j = j+i){
                prime[j] = true;
            }
        }
        for (int k = 0; k < prime.length; k++){
            if (prime[k] == false){
                answer +=1;
            }
        }
                                             
        
        
        return answer;
    }
}