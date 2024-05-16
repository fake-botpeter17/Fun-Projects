#include <stdio.h>
#include <conio.h>
int sum(int,int);

int main()
    {
        int n =1;
        while (n==1){
        printf("Enter the first Number:");
        int a,b;
        scanf("%d",&a);
        printf("\nEnter the Second Number:");
        scanf("%d",&b);
        printf(sum(a,b));
        }
    }

int sum(int x,int y){
    return x+y;
}