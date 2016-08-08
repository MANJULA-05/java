int main()
{
int n,m,k=0,sum[10],t=1,a;
scanf("%d",&n);
a=n;
while(n!=0)
{
    sum[k++]=n%10;
    n=n/10;
}
for(i=0;i<k;i++)
{
    t=t*sum[i];
}
printf("%d",t*a);
    return 0;
}