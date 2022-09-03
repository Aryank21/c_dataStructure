#include<stdlib.h>
#include <stdio.h>
struct node
{
  int data;
  struct node *next;

}*head;
void createcyle(int n)
{

    printf("enter number of node");
    scanf("%d",&n);



}
void display (struct node *prt)
{
  printf ("data are");
  while (prt!= NULL)
    {
      printf("%d", prt->data);
      prt = prt->nextnode;
    }

}
void createlist(int n)
{
    struct node *newnode,temp;
    int i;
    head=(struct node*)malloc(sizeof(struct node));
    if(head==NULL)
    {
        printf("unable to alllocate memory");
    }
    else
    {
        printf("enter the data of the nodes 1");
        scanf("%d",&data);
        head->data=data;
        head->next=NULL;
        head=temp;
        for(i=2;i<=n;i++)
        {
            printf("enter the data of the node%i",i);
            scanf("%d",&data);
            newnode->data=data;
            newnode->next=NULL;
            temp->next=newnode;
            temp=temp->next;
        }
        printf("singly list created");
    }

}
void main()
{
    struct node *head;
    printf("");
    return 0;
}

