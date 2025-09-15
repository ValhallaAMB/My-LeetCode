/*

number of sessions

In this question, you are asked to return the number of sessions from all user. 

timeout Integer
timespread List
userId List

Example: 
timeout = 10
timespread = [1, 10, 21, 1, 20, 26]
userId = ["u1", "u1", "u1", "u2", "u2", "u3"]

Solution:
u1 = [[1, 10], 21] = 2
u2 = [1, 20] = 2
u3 = [26] = 1

output: 2 + 2 + 1 = 5

Example: 
timeout = 10
timespread = [1, 10, 21, 37, 49]
userId = ["u1", "u1", "u1", "u1", "u1"]

Solution:
u1 = [[1, 10], 21, 37, 49] = 4

output: 4

*/

public class Main {
    private static int Solution(int timeout, int[] timespread, String[] userId){
        Boolean afterTimeout = false, beforeTimeout = false;
        int sessionCounter = 0;
        String currentUser = userId[0];
        
        for (int i = 1; i < userId.length; i++){
            if (currentUser != userId[i]){
                currentUser = userId[i];
                if (afterTimeout || beforeTimeout){
                    sessionCounter++;
                    beforeTimeout = false;
                    afterTimeout = false;
                }
            }
        
            if (Math.abs(timespread[i] - timespread[i-1]) > timeout && currentUser == userId[i-1]){
                sessionCounter++;
                beforeTimeout = false;
                afterTimeout = true;
                
            } else {
                beforeTimeout = true;
                afterTimeout = false;
            }
        }
        
        if (beforeTimeout || afterTimeout) 
            sessionCounter++;
        
        return sessionCounter;
    }
    
    public static void main(String[] args) {
        int timeout = 10;
        int[] timespread = {1, 10, 21, 37, 49};
        String[] userId = {"u1", "u1", "u1", "u1", "u1"};
        
        System.out.println(Solution(timeout, timespread, userId));
    }
}
