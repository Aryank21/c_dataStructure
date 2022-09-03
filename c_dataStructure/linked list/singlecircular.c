#include<stdio.h>
#include<stdlib.h>
void insert();
void display();
struct node
{
    int data;
    struct node *next;
};
struct node *head,*newnode,*temp;


void insert()
{

newnode=(struct node*)malloc(sizeof(struct node));
    printf("enter data");
    scanf("%d",&newnode->data);


    if(head==NULL)
    {
        head=newnode;
        temp=newnode;
        newnode->next=head;
    }
    else
    {

        temp->next=newnode;
        temp=newnode;
        newnode->next=head;


    }
}
void deleteData()
{
    struct node *ptr;
    int d;
    printf("enter data: ");
    scanf("%d",&d);
    temp=head;
    ptr=head;


    while(temp->next!=NULL)
    {

        if(temp->data==d)
        {


            ptr->next=temp->next;
            free(temp);
            break;
        }
        ptr=temp;
        temp=temp->next;
    }
}
void display( )
{

   struct node *ptr;
    ptr=head;

        printf("\n printing values ... \n");

        while(ptr -> next != head)
        {

            printf("%d\n", ptr -> data);
            ptr = ptr -> next;
        }
       printf("%d\n", ptr -> data);
    }

void main()
{
    int choice;

    while(choice!=10)
    {
        printf("enter choice: ");
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
                display();
                break;
            }
        case 3:
            {
                deleteData();
                break;
            }
            case 10:
                {
                    exit(0);
                }
            default:
                {
                    printf("Invalid Number");
                }

        }


    }
}
