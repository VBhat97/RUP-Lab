import java.util.*;

/**
 *
 * @author student
 */
public class OrderProcessing {
    public static void main(String[] args) {
        String investor_name;
        String investors[] = new String [50];
        String arr[][] = new String [50][2];
        int cart[][] = new int [50][2];
        int count=0,n,flag=0,z=0,k,t,investor_variable=0,option,i;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Enter 1. Customer 2. Company 3. Exit");
        n = sc.nextInt();
        switch(n)
        {
            case 1 : 
                     do{
                     System.out.println("Enter 1. Sign Up 2. Login 3. Exit ");
                     i = sc.nextInt();
                     sc.nextLine();
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
                                  for(t=0;t<count;t++)
                                  {
                                      if(arr[t][0].equals(testemail) && arr[t][1].equals(testpass))
                                      {
                                          flag=1;
                                          z=t;
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
                                    do{
                                      System.out.println("1. Buy Shirt 2. Buy Pant 3. Cart 4. Check personal info 5. Checkout ");
                                      k = sc.nextInt();
                                      sc.nextLine();
                                      switch(k)
                                      {
                                          case 1 : cart[z][0]++;
                                                   System.out.println("Shirt added!");
                                                   break;
                                           
                                          case 2 : cart[z][1]++;
                                                   System.out.println("Pant added!");
                                                   break;
                                                   
                                          case 3 : System.out.println("Shirts : " + cart[z][0]);
                                                   System.out.println("Pants : " + cart[z][1]);
                                                   break;
                                                   
                                          case 4 : System.out.println("Email : "+arr[z][0]);
                                                   System.out.println("Password : "+arr[z][1]);
                                                   break;
                                      }
                                  }while(k!=5);
                         
                     }
        }
                     }while(i!=3);
            case 2 : 
                     do{
                     System.out.println("1. Check orders 2. Add investors 3. Check investors 4. Exit");
                     option = sc.nextInt();
                     sc.nextLine();
                     switch(option)
                     {
                         case 1 : for(int l=0;l<count;l++)
                         {
                             if(cart[l][0]==0 && cart[l][1]==0)
                             {
                                 System.out.println("No orders");
                                 break;
                             }
                             else
                             {
                                 System.out.println("Email : "+ arr[l][0]);
                                 System.out.println("Shirts ordered : "+cart[l][0]);
                                 System.out.println("Pants ordered : "+cart[l][1]);
                                 break;
                             }
                         }
                         case 2 : System.out.println("Enter investor");
                                  investor_name = sc.nextLine();
                                  investors[investor_variable]=investor_name;
                                  investor_variable++;
                                  break;
                         
                         case 3 : for(int vars=0;vars<investor_variable;vars++)
                         {
                             System.out.println(investors[vars]);
                         }
                         break;
                                  
                     }
                     }while(option!=4);
    }
        }while(n!=3);
}
}
