#include<stdio.h>
#include<stdlib.h>
void insertlast();
void insertBegining();
void insertAtPoint();
void deleteAtspecific();
void deleteAtBeg();
void deleteAtEnd();
void deleteData();
void display();
void reverse();
 struct node
    {
        int data;
        struct node *next;
    }  ;
    struct node *head,*temp,*newnode;


void main()
{

       int choice;
    while(choice!=11)
       {
printf(" press 1 for insert at last\n press 2 for display\n press 3 for insert at begining"
       "\n press 4 for insert at specific position\n press 5 for delete at specific position\n"
       " press 6 for delete at beg position\n press 7 for delete at end position\n press 8 for delete data\n"
       " press 9 for reverse\n press 10 for make cycle or loop\n press 11 for exit\n press 12 for detect loop\n");
scanf("%d",&choice);


switch(choice)
{


case 1:
    {
        insertlast();

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
        insertAtPoint();
        break;
    }
case 5:
    {
        deleteAtspecific();
        break;
    }
    case 6:
    {
        deleteAtBeg();
        break;
    }
    case 7:
    {
        deleteAtEnd();
        break;
    }
    case 8:
        {

            deleteData();
            break;
        }
    case 9:
        {
            reverse();
            break;
        }
    case 10:
        {

            createcyle();
            break;
        }


    case 11:
    {
        exit(0);
    }
    case 12:
        {
            detectloop();
            break;
        }


default:
    printf("wrong input");
}
}
}
void detectloop()
{
    struct node *slow,*fast;
    int count=1;
    slow=head;
    fast=head;
    if(head==NULL)
    {
        printf("empty linked list\n");
    }
    else
    {


    while(fast!=NULL && fast->next!=NULL)
    {
        slow=slow->next;
        //slow=true;
        fast=fast->next->next;

        if(slow==fast)
        {

            printf("loop found at %d  node\n",count);
            count++;
            break;
        }

    }
    }

}
void createcyle()
{
    int n,c=1,i=1;
    struct node *tail;
    tail=head;
    while(tail->next!=NULL)
    {

        tail=tail->next;
        c++;
    }
    printf("number of node is %d\n",c);
    printf("enter node postion: ");
    scanf("%d",&n);
    temp=head;
   while (i<n)
    {
        temp=temp->next;
        i++;

    }
    tail->next=temp;




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
void reverse()
{
    struct node *prevsnode,*currentnode,*nextnode;

    currentnode=head;
    nextnode=head;
       prevsnode=NULL;
    while(nextnode!=NULL)
    {
        nextnode=nextnode->next;
        currentnode->next=prevsnode;
        prevsnode=currentnode;
        currentnode=nextnode;
    }
    head=prevsnode;
}
void insertlast()
{


   newnode=(struct node *)malloc(sizeof(struct node));
       printf("enter data: ");
    scanf("%d",&newnode->data);

    if(head==NULL)
    {
        head=newnode;
        temp=newnode;
        newnode->next=NULL;

    }
    else
    {

        temp->next=newnode;
        temp=newnode;
        temp->next=NULL;


    }
}
void insertBegining(int n)
{
    newnode=(struct node *)malloc(sizeof(struct node));
    printf("enter data(begining) ");
     scanf("%d",&newnode->data);

    if(head==NULL)
    {
        head=newnode;
        temp=newnode;
        temp->next=NULL;
    }
    else
    {

        newnode->next=head;
        head=newnode;



    }

    }
    void insertAtPoint()
    {
         struct node *c;
        int count=1,pos,i=1;
        c=head;
        while(c->next!=0)
   {
       c=c->next;
       count++;
   }
   printf("total nodes are %d\n",count);
        printf("enter position: ");
        scanf("%d",&pos);
        if(pos>count)
        {
            printf("invalid position");
        }
        else
        {
            temp=head;

              while(i<pos)
        {
            temp=temp->next;
            i++;
        }
        newnode=(struct node *)malloc(sizeof(struct node));
        printf("enter data");

        scanf("%d",&newnode->data);

        newnode->next=temp->next;
        temp->next=newnode;


        }


    }
    void deleteAtspecific()
    {
        struct node *ptr;
        int pos,i=1,k=1;
        printf("enter postion to delete data");
        scanf("%d",&pos);

        temp=head;
        while(i<pos-1)
        {

            temp=temp->next;
            i++;
        }
     ptr=temp->next;
     temp->next=ptr->next;
     free(ptr);

    }
    void deleteAtBeg()
    {
        temp=head;
        head=head->next;
        free(temp);

    }
    void deleteAtEnd()
    {
        struct node *prevnode;
        temp=head;
        while(temp->next!=NULL)
        {
            prevnode=temp;
            temp=temp->next;
        }
        if(temp==head)
        {

            head=0;
            printf("head is Null");
        }
        else
        prevnode->next=0;
        free(temp);
    }






void display()
{
struct node *ptr;
    ptr=head;
    if(ptr==NULL)
    {
        printf("nothing to print\n");
    }
   while(ptr!=NULL)
   {
       printf("Data are: %d\n",ptr->data);
       ptr=ptr->next;
   }
}






