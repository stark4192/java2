public class q2lab9 {

	public static void main(String[] args) {
		ICICI c = new ICICI(120);
		HDFC h = new HDFC(120);
		bank b = new bank();
		b.roi=120;
		System.out.println("Bank roi : "+b.find_ROI());
		
		System.out.println("HDFC Bank roi : "+h.find_ROI());
		
		System.out.println("ICICI Bank roi : "+c.find_ROI());
		
	}

}
class bank
{
	int roi;
	int find_ROI()
	{
		return roi;
	}
}
class HDFC extends bank
{
	int lastYrProfit;//in crore
	HDFC(int lastYrProfit)
	{
		this.lastYrProfit = lastYrProfit; 
	}
	@Override
	int find_ROI()
	{
		int roi = (int) (lastYrProfit/1.5);
		return roi;
	}
}
class ICICI extends bank
{
	int fund;//in crore
	ICICI(int fund)
	{
		this.fund = fund;
	}
	@Override
	int find_ROI()
	{
		int roi = (int) (fund/1.5);
		return roi;
	}
}
