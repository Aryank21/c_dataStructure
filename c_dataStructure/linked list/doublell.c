#include<stdlib.h>
#include<stdio.h>

struct node
{
    int data;
    struct node *previous;
    struct node *next;
};
struct node *head,*newnode,*temp,*tail;
void insert()
{
    newnode=(struct node*)malloc(sizeof(struct node));
       printf("enter data: ");
    scanf("%d",&newnode->data);
    newnode->previous=NULL;
        newnode->next=NULL;
    if(head==NULL)
    {
        head=newnode;
        //temp=newnode;
        tail=newnode;



    }
    else
        {
         tail->next=newnode;

         newnode->previous=tail;
         tail=newnode;
         tail->next=NULL;
}
}
void insertBegining()
{

         newnode=(struct node*)malloc(sizeof(struct node));
       printf("enter data: ");
    scanf("%d",&newnode->data);
    newnode->next=NULL;
        newnode->previous=NULL;
    if(head==NULL)
    {

        tail=newnode;
        head=newnode;
        temp=newnode;




    }
    else
    {

        newnode->next=head;
        head=newnode;
        head->previous=NULL;
        temp->previous=newnode;
        temp=newnode;

    }


}
void reverse()
{
    struct node *ptr;
    ptr=tail;
    while(ptr!=NULL)
    {
        printf("data are %d\n ",ptr->data);
        ptr=ptr->previous;
    }


}
  void display()
  {
      temp=head;
while(temp!=NULL)
{
printf("data are: %d\n",temp->data);
temp=temp->next;
}
  }




    void main()
{

       int choice;
    while(choice!=10)
       {
printf(" press 1 for insert at last\n press 2 for display\n press 3 for insert at begining"
       "\n press 4 for print reverse\n press 5 for delete at specific position\n"
       " press 6 for delete at beg position\n press 7 for delete at end position\n press 10 for exit\n");
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
        insertBegining();
        break;
    }
case 4:
    {
       reverse();
        break;
    }
case 5:
    {
       // deleteAtspecific();
        break;
    }
    case 6:
    {
      //  deleteAtBeg();
        break;
    }
    case 7:
    {
        //deleteAtEnd();
        break;
    }
    case 8:
        {

        //displayrev();
            break;
        }

    case 10:
    {
        exit(0);
    }


default:
    printf("wrong input");
}
}
}



