import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
Scanner s = new Scanner(System.in);
int n=s.nextInt();
int[] arr = new int[n];
long answer=1;
for(int i=0;i<n;i++)
 arr[i]=s.nextInt();

for(int i=0;i<n;i++)
{
    answer = (answer*arr[i])%1000000007;
}
System.out.println(answer);
    }
}
