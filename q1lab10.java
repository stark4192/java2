public class q1lab10 {

	public static void main(String[] args) {
		kiitian k = new kiitian(2005179,67894);
		k.course("CSE");
		k.display();
	}

}
abstract class student
{
	 int roll;
	 int reg;
	abstract void course(String course);

}
class kiitian extends student
{
	String course;
	kiitian(int roll, int reg)
	{
	this.roll = roll;
	this.reg = reg;
	}

	@Override
	void course(String course)
	{
		this.course= course;
	}


void display()
{
System.out.println("Roll no. = " +this.roll);
System.out.println("Reg no. = " +this.reg);
System.out.println("Courses = " +this.course);
}
}
