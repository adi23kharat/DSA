/* SLIP NO-17B
Program for Linear Search method */
#include<stdio.h>
#include<conio.h>
struct city
{
char cname[30];
};
void linearsearch(struct city[],int, char[]);
void main()
{
struct city s[30];
int i,n;
char key[20];
clrscr();
printf("\n Enter the number of elements :");
scanf("%d",&n);
printf("\n\n\t Enter the array elements in string format:");
for(i=0;i<n;i++)
scanf("%s",&s[i].cname);
printf("\n\n\t Enter the search key:");
scanf("%s",&key);
linearsearch(s,n,key);
getch();
}
void linearsearch(struct city s[20],int n,char key[20])
{
int i;
for(i=0;i<n;i++)
{
if(strcmp(s[i].cname,key)==0)
{
printf("\n\n\t sname found at %d position",i+1);
break;
}
else
{
printf("\n student is not found");
break;
}
}
}