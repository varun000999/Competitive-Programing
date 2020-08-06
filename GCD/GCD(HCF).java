Public int GCD(int a,int b)
{
	a=Math.max(a,b);
	b=Math.min(a,b);
	if(a%b==0)
	{
		return b;
	}
	else
	{
		return GCD(b,a%b);
	}	
}