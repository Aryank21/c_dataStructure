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
void insertrear()
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
        rear->next=NULL;

    }

}
void insertfront()
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
        newnode->next=front;
        front=newnode;

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
    while(ptr!=NULL)
    {
        printf("data are %d\n",ptr->data);
        ptr=ptr->next;
    }
}
void deletefront()
{
    struct node *temp,*ptr;
    temp=front;
    if(front==NULL)
    {
        printf("empty queue\n");
    }
    else
        {
      front=temp->next;

    free(temp);
    }


}
void deleterear()
{
    struct node *temp,*ptr;
    temp=front;
    if(front==NULL)
    {
        printf("empty queue\n");
    }
    else
        {
            while(temp->next!=NULL)
            {
                ptr=temp;
                temp=temp->next;
            }
            rear=ptr;
            rear->next=NULL;
            free(temp);

    }


}
void main()
{
    int choice;


    while(choice!=10)
    {
    printf("press\n 1 for insert data from rear\n 2 for print front \n"
           "3 for print rear \n 4 for display data\n 5 for delete data from front\n 6 for delete data from rear\n"
           "7 for insert data from front\n");

        scanf("%d",&choice);
        switch(choice)
        {
    case 1:
        {
            insertrear();
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
            deletefront();
            break;
        }
    case 6:
        {
            deleterear();
            break;
        }
    case 7:
        {
            insertfront();
            break;
        }
    default:
        {
            printf("wrong input");
        }

        }
    }
}


