//Slip16B

/*programe name:accept no of user ,search no in the list single link list*/
#include<stdio.h>
#include<conio.h>
#define NA (struct node*)malloc(sizeof(struct node))
struct node
{
int data;
struct node *next;
};
typedef struct node *NP;
NP create();
void display(NP list);
NP searchanddelete(NP list);
void main()
{
int ch;
NP list=NULL;
clrscr();
do
{
printf("\n\n\t1:create");
printf("\n\n\t2:display");
printf("\n\n\t3:search");
printf("\n\n\t4:exit");
printf("\n\n\t enter your choice");
scanf("%d",&ch);
switch(ch)
{
case 1:
      list=create();
      break;
case 2:
     printf("\n\n linked list=");
     display(list);
     break;
case 3:
     list=searchanddelete(list);
     break;
case 4:  exit();
     //break;
     }
     }
     while(ch!=4);
     }
   NP create()
     {
     int i,n;
     NP nn, temp, list=NULL;
     printf("\n\n\thow many nodes=");
     scanf("%d",&n);
     printf("\n\n\tenter linked list data=");
     for(i=0;i<n;i++)
     {
     nn=NA;
     nn->next=NULL;
     scanf("%d",&nn->data);
     if(list==NULL)
     temp=list=nn;
     else
     {
     temp->next=nn;
     temp=nn;
     }
     }
     return list;
     }
     void display(NP list)
     {
     NP temp;
     temp=list;
     while(temp!=NULL)
     {
     printf("%d\t",temp->data);
     temp=temp->next;
     }
     }
     NP searchanddelete(NP list)
     {
     NP temp,temp1;
     int key,pos=0,i;
     printf("\n\n\t enter the searching number=");
     scanf("%d",&key);
     for(temp=list;temp!=NULL;temp=temp->next)
     {
     pos++;
     if (temp->data==key)
     {
     printf("\n\nnumber %d found at %d posiotion=",key,pos);
     break;
     }

     }

	/*  else
     {
     printf("\Element is not found:");
     }    */

     if(pos==1)
     {
     temp=list;
     list=list->next;
     free(temp);
     return list;
     }
     for(i=1,temp=list;i<pos-1&& temp!=NULL;i++)
     temp=temp->next;
     temp1=temp->next;
     temp->next=temp1->next;
     free(temp1);
     return list;
     }

