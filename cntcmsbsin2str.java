//n1 is length of 1
//n2 is length of 2
for (int i = 1; i <= n1; i++) {  
           
            for (int j = 1; j <= n2; j++) {  
                  
                ch1 = s.charAt(i - 1); 
                ch2 = t.charAt(j - 1);            
                if (ch1 == ch2)   
                    dp[i][j] = 1 + dp[i][j - 1] + dp[i - 1][j];              
                else 
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j] -   
                                            dp[i - 1][j - 1];              
              }  
            }
