int main()
{
	int a,b,c;
	int hash[10000]={0},k;
	scanf("%d",&a);
	c=-32767;
	for(k=0;k<a;k++)
	{
		scanf("%d",&b);
		hash[b]++;
		if(c<b)
		c=b;
	}
	
	for(k=0;k<=c;k++)
	{
	if(hash[k]>1)
	{
	printf("%d ",k);
	break;
	}
	}