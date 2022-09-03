# include<stdio.h>

int queue[10],front=-1,rear=-1;
void enquee(int X)
{

   if(front==-1&& rear==-1)
    {
        front=0;
        rear=0;
        queue[rear]=X;
    }
    else if(rear==9)
    {
        printf("queue is full\n");
    }
    else
    {
        rear++;
        queue[rear]=X;

    }
}

void dequee()
{
    if(front==-1&rear==-1)
    {
        printf("queue is empty  \n");
    }
    else if(front==rear)
    {
       front=-1;
       rear=-1;
    }
    else
    {
        printf("deleted element are: %d \n",queue[front]);
        front++;
    }
}
void display()
{
    for(int i=front;i<=rear;i++)
    {
        printf("element are:  %d\n",queue[i]);
    }
}
void main()
{
    enquee(2);
    enquee(8);
    enquee(7);
    enquee(6);
        enquee(2);
    enquee(8);
    enquee(7);
    enquee(6);
        enquee(2);
    enquee(8);
    enquee(7);
    enquee(6);
     display();
    dequee();

    display();



}
