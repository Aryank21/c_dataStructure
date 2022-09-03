#include <stdio.h>
int main(){
  int n;
  scanf("%d",&n);
  if(n==2||n==3||n==5||n==7)
    printf("Prime");
  else if((n%2==0||n%3==0)||(n%5==0||n%7==0))
    printf("Given no %d is not a prime",n);
  else
    printf("Prime");
  return 0;
}
