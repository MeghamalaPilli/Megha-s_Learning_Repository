#include<stdio.h>
#include<stdlib.h>
int*twoSum(int*nums,int numsSize,int target,int*returnSize)
{
  int*result=(int*)malloc(2*sizeof(int));
  *returnSize=2;
  for(int i=0;i<numsSize;i++)
  {
   for(int j=i+1;j<numsSize;j++)
    {
     if(nums[i]+nums[j]==target)
     {
       result[0]=i;
       result[1]=j;
       return result;
     }
    }
  }
return result;
}
int main()
{
  int nums[10000],numsSize;
  scanf("%d",&numsSize);
  for(int i=0;i<numsSize;i++)
  {
    scanf("%d",&nums[i]);
  }
  int target;
  scanf("%d",&target);
  int returnSize;
  int*result=twoSum(nums,numsSize,target,&returnSize);
  printf("[%d,%d]\n",result[0],result[1]);
  free(result);
  return 0;
}