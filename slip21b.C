//Slip21 B
 /*program for the implement the linear search using function*/
	#include<stdio.h>
	#include<conio.h>
	int a[10];
	int linearsearch(int num,int position)
	{
		if(num==a[position])
		{
		return position;
		}
		else
		{
		position++;
		return linearsearch(num,position);
		}
	}
	void main()
	{
		int i,n,result,number;
		clrscr();
		printf("entre the array limit:=");
		scanf("%d",&n);
		printf("Enter the numbers:\n");
		for(i=0;i<n;i++)
		{
		scanf("%d",&a[i]);
		}
		printf("Enter the number which u want to search:=");
		scanf("%d",&number);
		result=linearsearch(number,0);
			if(result<=n)
			{
				printf("Number (%d) found at %d position",number,result+1);
			}
			else
			{
				printf("Number(%d)is not found",number);
				exit(0);
			}
			getch();
			}                                                                