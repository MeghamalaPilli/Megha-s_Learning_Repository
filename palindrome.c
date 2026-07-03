#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
int pal(int x);

int main()
{
    int x;
    scanf("%d",&x);
    if(pal(x))
    {
        printf("True\n");
    } 
    else
    {
        printf("False\n");
    }
}
int pal(int x)
{
    if(x<0)
        return false;
    int n=x;
    int rev=0;
    while(x!=0)
    {
      int n1=x%10;
      rev=rev*10+n1;
      x=x/10;
    }
    return n==rev;
}