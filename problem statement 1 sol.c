#include <stdio.h>

int main(){
	int num=1,i,N;
	scanf("%d", &N);              	                  // Reading input from STDIN
	  for (i = 1; i <= N; i++)
    num = num * i;
	  
	printf("%d", num);     // Writing output to STDOUT
}
