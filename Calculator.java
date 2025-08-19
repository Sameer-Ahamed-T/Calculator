import java.util.Scanner; 
class Calculator 
{
        public static void main(String[] args)
        {
                Scanner sc=new Scanner(System.in); 
                System.out.println("You can do operation in the calculator \nIf you want to exit the program enter the q Button!!!"); 
                int i=1;
                int temp=0; 
				char c='+';int n;
                 while(true) 
                 { 
                   if(i==1)
                   {
                           n=sc.nextInt(); 
                           c=sc.next().charAt(0); 
                           temp=sc.nextInt();
						   i++;
                   } 
                   else
							n=sc.nextInt();
                   int t=temp;
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
                   char ch;
                   ch=sc.next().charAt(0);
					if(ch=='=')
					{
							System.out.println(""+  n + c + t +"="+temp);
							char e;
							e=sc.next().charAt(0);
							if(e=='q')
								break;
							else if(e=='+'||e=='-'||e=='*'||e=='/'||e=='%')
							{
								c=e;	
								continue;
							}
							else
							{
								System.out.println("Sorry!!!You Entered a unexpected input.");
								break;
							}
					}
					else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%')
					{
							c=ch;
							continue;
					}
					else
					{
							System.out.println("Sorry!!!You Entered a unexpected input.");
							break;
					}
                 }
        } 
}
