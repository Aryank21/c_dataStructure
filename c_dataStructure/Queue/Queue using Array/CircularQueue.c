# include<stdio.h>
#define max 3

int queue[max],front=-1,rear=-1;
void enqueue(int x)
{

   if(front==-1&& rear==-1)
    {
        front=0;
        rear=0;
        queue[rear]=x;
    }
    else if((rear+1)%max==front)
    {
        printf("overflow");
    }
    else
    {
        rear=(rear+1)%max;
        queue[rear]=x;

    }
}

int dequeue()
{
    if(front==-1&rear==-1)
    {
        printf("underflow");
    }
    else if(front==rear)
    {
       front=-1;
       rear=-1;
    }
    else
    {
        printf("deleted element are: %d \n",queue[front]);
        front=(front+1)%max;
    }
}
void display()
{
    int i=front;
    if(front==-1&& rear==-1)
    {
        printf("queue is empty");

    }
    else
    {
        while( i<=rear)
    {
        printf("element are:  %d\n",queue[i]);
         i=(i+1)%max;
    }
    }

}
int main()
{
    int choice=1,x;   // variables declaration

    while(choice<4 && choice!=0)   // while loop
    {
    printf("\n Press 1: Insert an element");
    printf("\nPress 2: Delete an element");
    printf("\nPress 3: Display the element");
    printf("\nEnter your choice");
    scanf("%d", &choice);

    switch(choice)
    {

        case 1:

        printf("Enter the element which is to be inserted");
        scanf("%d", &x);
        enqueue(x);
        break;
        case 2:
        dequeue();
        break;
        case 3:
        display();

    }}
    return 0;
}
