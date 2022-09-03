#include<stdio.h>
#include<stdlib.h>
struct node{
int data;
struct node *next;

};
struct node *head,*temp;
void push()
{
    struct node*newnode;
    newnode=(struct node*)malloc(sizeof(struct node));
    printf("enter data in stack:   \n");
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
    printf("data inserted\n");



}
void pop()
{
    if(head==NULL)
    {
        printf("empty stack\n");
    }
    else
    {
        temp=head;
        head=head->next;
        free(temp);


    }
}
void display()
{
    struct node *ptr;
    ptr=head;
    while(ptr!=NULL)
    {
        printf("data are %d\n",ptr->data);
        ptr=ptr->next;
    }

}
void main()
{
    int choice;
    while(choice!=10)
    {
        printf("-----------------------------------------------------------------------------\n");
        printf(" enter choice\n ");
        printf("press 1 for insert the data\n press 2 for delete  the data\n press 3 for display  the data\n ");
         printf("------------------------------------------------------------------------------\n");

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
                display();
                break;
            }
        default :
            {
                printf("invalid choice\n");
            }
        }
    }
}

