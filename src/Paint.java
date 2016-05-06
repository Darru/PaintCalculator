
public class Paint
{
	String paintName;
	int areaCoverage;
	int litresPaint;
	double pricePaint;
	
	public Paint (String name, int area, int paint, double price)
	{
		paintName = name;
		areaCoverage = area;
		litresPaint = paint;
		pricePaint = price;
	}
	
	public int totalCoverage()
	{
		return areaCoverage * litresPaint;
	}
}
