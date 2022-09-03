#include <stdio.h>
int stack[5];
int n,val,f=-1,choice;
void push();
void pop();
void show();
void push()
{


  if(f==n)
    {
        printf("overflow");
    }
    else
    {
        printf("enter value: ");
        scanf("%d",&val);
         f++;
        stack[f]=val;

    }

}



void pop()
{
    if(f==-1)
    printf("underflow");
    else
        {
            f--;
    }

}
void peek()
{

    printf("peek element are: %d",stack[f]);
}
void show()
{
for(int i=f;i>=0;i--)
{
    printf("element in stack are: %d\n",stack[i]);
}
if(f==-1)
{
    printf("stack are empty");
}
}
void main()
{
printf("enter stack size: ");
scanf("%d",&n);
    while(choice!=4)
    {
    printf("--------\n enter \n 1 for push\n 2 for pop \n 3 for show \n 4 for peek \n 5 for exit \n---------\n ");
    printf("enter choice: ");
    scanf("%d",&choice);

        switch(choice)
    {
    case 1:
        {
            push();
        break;
        }
    case 2:
        {
            pop();
            break;
        }
    case 3:
        {

            show();
            break;
        }
         case 4:
        {
            peek();
            break;
        }
    case 5:
        {
            exit(0);
        }
        default:
        {
            printf("enter valid choice");
            break;
        }

    }
    }



}



