#include<stdio.h>
#include<stdlib.h>
void insert();
void getfront();
void getrear();
void display();
struct node
{
    int data;

    struct node *next;
};
struct node *front,*rear;
void insert()
{
    struct node *newnode;

    newnode=(struct node*)malloc(sizeof(struct node));
    printf("enter data: \n");
    scanf("%d",&newnode->data);
    if(front==NULL)
    {
        front=newnode;
        rear=newnode;
        rear->next=NULL;
    }
    else
    {
        rear->next=newnode;
        rear=newnode;
        rear->next=front;

    }

}
void getfront()
{
    printf("front data is %d\n",front->data);
}
void getrear()
{
    printf("rear data are %d\n",rear->data);

}
void display()
{
    struct node *ptr;
    ptr=front;
    while(ptr!=rear)
    {
        printf("data are %d\n",ptr->data);
        ptr=ptr->next;
    }
   printf("data are %d\n",ptr->data);
}
void delete()
{
    struct node *temp;
    temp=front;
    if(front==NULL)
    {
        printf("empty queue\n");
    }
    else
        {
      front=temp->next;
rear->next=front;
    free(temp);
    }


}
void main()
{
    int choice;


    while(choice!=10)
    {
    printf("press\n 1 for insert data in queue\n 2 for print front \n 3 for print rear \n 4 for display data\n 5 for delete data in queue\n");

        scanf("%d",&choice);
        switch(choice)
        {
    case 1:
        {
            insert();
            break;
        }
    case 2:
        {
            getfront();
            break;
        }
    case 3:
        {
            getrear();
            break;
        }
    case 4:
        {
            display();
            break;
        }
    case 5:
        {
            delete();
            break;
        }
    default:
        {
            printf("wrong input");
        }

        }
    }
}


