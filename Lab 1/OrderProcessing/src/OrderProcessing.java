import java.util.*;

/**
 *
 * @author student
 */
public class OrderProcessing {
    public static void main(String[] args) {
        String arr[][] = new String [50][2];
        int count=0,n,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1. Customer 2. Company 3. Admin");
        n = sc.nextInt();
        switch(n)
        {
            case 1 : System.out.println("Enter 1. Sign Up 2. Login ");
                     int i = sc.nextInt();
                     switch(i)
                     {
                         case 1 : System.out.println("Enter Email");
                                  String email = sc.nextLine();
                                  System.out.println("Enter password");
                                  String password = sc.nextLine();
                                  arr[count][0]=email;
                                  arr[count][1]=password;
                                  count++;
                                  break;
                         
                         case 2 : System.out.println("Enter Email");
                                  String testemail = sc.nextLine();
                                  System.out.println("Enter Password");
                                  String testpass = sc.nextLine();
                                  for(int t=0;t<count;t++)
                                  {
                                      if(arr[t][0].equals(testemail) && arr[t][1].equals(testpass))
                                      {
                                          flag=1;
                                          break;
                                      }
                                  }
                                  if (flag==0)
                                  {
                                      System.out.println("Login Unsuccessful");
                                      break;
                                  }
                                  else
                                  {
                                      System.out.println("Login Successful");
                                      break;
                                  }
                         
                     }
        }
        
    }
}
