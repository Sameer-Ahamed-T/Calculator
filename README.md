import java.util.Scanner;
class Calculator
{
      public static void main(Stirng[] args)
      {
             Scanner sc=new Scanner(System.in);
             int n;
             int temp;
             System.out.println("You can do operation in the calculator \n If you want to exit the program enter the ENTER Button!!!");
             int i=1;
             int temp;
             while(true)
             {
                         char c;int n,t;
                         if(i==1)
                         {
                              n=sc.nextInt();
                              c=sc.next().charAt(0);
                              temp=sc.nextInt();
                         }
                         else
                         {
                              c=sc.next().charAt(0);
                              n=sc.nextInt();
                         }
                         t=temp;
                         switch(c)
                         {
                                case '+':
                                         temp=n+temp;
                                         break;
                                case '-':
                                         temp=n-temp;
                                         break;
                                case '*':
                                         temp=n*temp;
                                         break;
                                case '/':
                                         temp=n/temp;
                                         break;
                                case '%':
                                         temp=n%temp;
                                         break;
                                default:
                                         break;
                          }
                          char ch='=';
                          System.out.println(n+c+t+ch+temp);
                          char c1;
                          c1=sc.next().charAt(0);
                          if(c1=='+'||c1=='-'||c1=='*'||c1=='/'||c1=='%')
                                continue;
                          else
                                break;
                }
}
